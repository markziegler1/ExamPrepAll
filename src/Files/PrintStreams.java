package Files;

import java.io.PrintStream;

public class PrintStreams {
    public static void main(String[] args) {
        String data = "This is a text inside the file.";
        try {
            PrintStream output = new PrintStream("output.txt");
            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
}}
