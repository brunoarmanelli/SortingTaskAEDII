import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

class StatsIO {

    public static void write(Counter results) {
        String[] sortingTypes = {"Random", "Ascending", "Descending"};
        String[] sortingMethods = {"BubbleSort", "InsertionSort", "MergeSort", "PatrunoSort", "QuickSort", "SelectionSort"};

        try (FileWriter fileWriter = new FileWriter("results/" + sortingMethods[results.sortingMethod] + sortingTypes[results.typeSorting] + ".txt", true)) {
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(sortingTypes[results.typeSorting] + "\t");
            printWriter.print(results.lineLimit + "\t");
            printWriter.print(results.swaps + "\t");
            printWriter.print(results.comparisons + "\t");
            printWriter.print(results.time + "\n");
            
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}