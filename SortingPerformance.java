import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

class SortingPerformance {

    public static final String RESULTS_FOLDER = getTimeNameToFolder();

    public static String getTimeNameToFolder() {
        // Name for a new folder -> DateTime
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH-mm-ss");
        String time = dateFormat.format(now);
        return time;
    }

    public static void firstStep(String fileName) {
        // Read all lines from first file
        Room[] allData = RoomIO.read("data/airbnb.txt", 128000, true);

        // Make a new file with random data named "Random.txt"
        RoomIO.write("data/Random.txt", allData);

        // Order data ascending and make a new file named "Ascending.txt"
        QuickSort sorter = new QuickSort();
        sorter.sort(allData);
        RoomIO.write("data/Ascending.txt", allData);

        // Order data descending and make a new file named "Descending.txt"
        int size = allData.length - 1;
        Room[] descData = new Room[size + 1];

        for(int i = 0; i <= size; i++)
            descData[i] = allData[size - i];

        RoomIO.write("data/Descending.txt", descData);
        
    }

    public static void secondStep(String path) {
        int[] orderValues = {2000, 4000, 8000, 16000, 32000, 64000, 128000};
        
        for(int i = 0; i < orderValues.length; i++) {
            // Execute sorting for each line limit and file
            String[] fileName = {"Random.txt", "Ascending.txt", "Descending.txt"};

            // 1 means Random; 2 means Ascending; 3 means Descending;

            // Patruno Sort
            SecondStepRunner.patrunoTask(0, orderValues[i], path + fileName[0]);
            SecondStepRunner.patrunoTask(1, orderValues[i], path + fileName[1]);
            SecondStepRunner.patrunoTask(2, orderValues[i], path + fileName[2]);
            System.out.println();

            // Bubble Sort
            SecondStepRunner.bubbleSortTask(0, orderValues[i], path + fileName[0]);
            SecondStepRunner.bubbleSortTask(1, orderValues[i], path + fileName[1]);
            SecondStepRunner.bubbleSortTask(2, orderValues[i], path + fileName[2]);
            System.out.println();
            
            // Insertion Sort
            SecondStepRunner.insertionTask(0, orderValues[i], path + fileName[0]);
            SecondStepRunner.insertionTask(1, orderValues[i], path + fileName[1]);
            SecondStepRunner.insertionTask(2, orderValues[i], path + fileName[2]);
            System.out.println();

            // Merge Sort
            SecondStepRunner.mergeTask(0, orderValues[i], path + fileName[0]);
            SecondStepRunner.mergeTask(1, orderValues[i], path + fileName[1]);
            SecondStepRunner.mergeTask(2, orderValues[i], path + fileName[2]);
            System.out.println();

            // Quick Sort
            SecondStepRunner.quickTask(0, orderValues[i], path + fileName[0]);
            SecondStepRunner.quickTask(1, orderValues[i], path + fileName[1]);
            SecondStepRunner.quickTask(2, orderValues[i], path + fileName[2]);
            System.out.println();

            // Selection Sort
            SecondStepRunner.selectionTask(0, orderValues[i], path + fileName[0]);
            SecondStepRunner.selectionTask(1, orderValues[i], path + fileName[1]);
            SecondStepRunner.selectionTask(2, orderValues[i], path + fileName[2]);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Initial Step
        firstStep("data/airbnb.txt");

        // Prepare directory
        new File("results/" + RESULTS_FOLDER).mkdirs();

        // Second Step
        secondStep("data/");

    }
}