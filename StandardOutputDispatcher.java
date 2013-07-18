import java.io.*;

public class StandardOutputDispatcher implements OutputDispatcher {
    private final PrintStream outputStream = System.out;

    public PrintStream openStreamForSheet(String sheetName) {
      return outputStream;
    }

    public void closeStreamForSheet(PrintStream stream, String sheetName) {
        // Do nothing as stream is re-used
    }
}