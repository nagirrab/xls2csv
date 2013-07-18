import java.io.*;

public interface OutputDispatcher {
    public PrintStream openStreamForSheet(String sheetName) throws FileNotFoundException;
    public void closeStreamForSheet(PrintStream stream, String sheetName);
}