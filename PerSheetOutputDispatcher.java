import java.io.*;

public class PerSheetOutputDispatcher implements OutputDispatcher {
    private String basePath;

    public PerSheetOutputDispatcher(String basePath) {
        this.basePath = basePath;
    }

    public PrintStream openStreamForSheet(String sheetName) throws FileNotFoundException {
        return new PrintStream(new File(basePath, sheetName + ".csv"));
    }

    public void closeStreamForSheet(PrintStream stream, String sheetName) {
        stream.close();
    }
}