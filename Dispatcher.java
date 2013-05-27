import org.apache.poi.openxml4j.opc.*;
import java.io.PrintStream;
import java.io.File;

public class Dispatcher {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Use:");
            System.err.println("  Excel2Csv <xls/xlsx file> <csv file> [min columns]");
            return;
        }

        String fileName = args[0];
        File inputFile = new File(fileName);
        if (!inputFile.exists()) {
            System.err.println("Not found or not a file: " + inputFile.getPath());
            return;
        }

        PrintStream outStream = null;

        if (args.length >= 2) {
            File csvFile = new File(args[1]);
            outStream = new PrintStream(csvFile);
        } else {
            outStream = System.out;
        }

        int minColumns = -1;
        if (args.length >= 3)
            minColumns = Integer.parseInt(args[1]);

        if (fileName.endsWith("xlsx")) {
            // The package open is instantaneous, as it should be.
            OPCPackage p = OPCPackage.open(inputFile.getPath(), PackageAccess.READ);
            XlsxToCsv xlsx2csv = new XlsxToCsv(p, outStream, minColumns);
            xlsx2csv.process();

        } else if (fileName.endsWith("xls")) {
            XlsToCsv xls2csv = new XlsToCsv(fileName, outStream, minColumns);
            xls2csv.process();
        } else {
            throw new Exception("Unrecognized file type");
        }
    }
}