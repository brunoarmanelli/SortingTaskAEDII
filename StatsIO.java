import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

class StatsIO {

    public static void write(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println();
            
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}