class SortingPerformance {

    public static void firstStep(String fileName) {
        // Read all lines from first file
        Room[] allData = RoomIO.read("data/airbnb.txt", 128000, true);

        // Make a new file with random data
        RoomIO.write("data/random.txt", allData);

        // Order data ascending and make a new file named "ascending.txt"
        QuickSort sorter = new QuickSort();
        sorter.sort(allData, 0, allData.length - 1);
        RoomIO.write("data/ascending.txt", allData);

        // Order data descending and make a new file named "descending.txt"
        int size = allData.length - 1;
        Room[] descData = new Room[size + 1];

        for(int i = 0; i <= size; i++)
            descData[i] = allData[size - i];

        RoomIO.write("data/descending.txt", descData);
        
    }

    public static void secondStep(String path) {
        int[] orderValues = {2000, 4000, 8000, 16000, 32000, 64000, 128000};
        
        for(int i = 0; i < orderValues.length - 1; i++) {
            // Execute sorting for each line limit and file
            
            // Bubble Sort
            SecondStepRunner.bubbleSort(orderValues[i], path + "random.txt", path + "ascending.txt", path + "descending.txt");

            // Insertion Sort
            SecondStepRunner.insertionSort(orderValues[i], path + "random.txt", path + "ascending.txt", path + "descending.txt");

            // Merge Sort
            SecondStepRunner.mergeSort(orderValues[i], path + "random.txt", path + "ascending.txt", path + "descending.txt");

            // Patruno Sort
            SecondStepRunner.patrunoSort(orderValues[i], path + "random.txt", path + "ascending.txt", path + "descending.txt");

            // Quick Sort
            SecondStepRunner.quickSort(orderValues[i], path + "random.txt", path + "ascending.txt", path + "descending.txt");
            
            // Selection Sort
            SecondStepRunner.selectionSort(orderValues[i], path + "random.txt", path + "ascending.txt", path + "descending.txt");
        }
    }

    public static void main(String[] args) {

        // Initial Step
        firstStep("data/airbnb.txt");

        // Second Step
        secondStep("data/");

    }
}