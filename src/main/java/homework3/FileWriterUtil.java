package homework3;

import java.io.*;

public class FileWriterUtil {
    public static void writeToFile(String filename, String data) throws IOException {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(data + "\n");
        }
    }
}

