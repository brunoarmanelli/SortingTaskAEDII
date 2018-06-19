import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;

class StatsIO {

    public static void write(Counter results) {
        // Make files for each ordering method and type of sorting order
        File resultsFile = new File("results/" + SortingPerformance.RESULTS_FOLDER + "/" + results.getMethod() + results.getType() + ".txt");
        Boolean resultsFileExists = resultsFile.exists();

        try (FileWriter fileWriter = new FileWriter("results/" + SortingPerformance.RESULTS_FOLDER + "/" + results.getMethod() + results.getType() + ".txt", true)) {

            PrintWriter printWriter = new PrintWriter(fileWriter);

            if(!resultsFileExists) {
                printWriter.print("SotingType\t");
                printWriter.print("LineLimit\t");
                printWriter.print("Swaps\t");
                printWriter.print("Comparisons\t");
                printWriter.print("Time" + "\n");
            }

            printWriter.print(results.getType() + "\t");
            printWriter.print(results.lineLimit + "\t");
            printWriter.print(results.swaps + "\t");
            printWriter.print(results.comparisons + "\t");
            printWriter.print(results.time + "\n");
            
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Make a .csv file with all results

        File fullResults = new File("results/" + SortingPerformance.RESULTS_FOLDER + "/" + "FullResults.csv");
        Boolean fullFileExists = fullResults.exists();

        try (FileWriter fileWriter = new FileWriter("results/" + SortingPerformance.RESULTS_FOLDER + "/" + "FullResults.csv", true)) {

            PrintWriter printWriter = new PrintWriter(fileWriter);

            if(!fullFileExists) {
                printWriter.print("Method; ");
                printWriter.print("SotingType; ");
                printWriter.print("LineLimit; ");
                printWriter.print("Swaps; ");
                printWriter.print("Comparisons; ");
                printWriter.print("Time" + "\n");
            }

            printWriter.print(results.getMethod() + "; ");
            printWriter.print(results.getType() + "; ");
            printWriter.print(results.lineLimit + "; ");
            printWriter.print(results.swaps + "; ");
            printWriter.print(results.comparisons + "; ");
            printWriter.print(results.time + "\n");
            
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}