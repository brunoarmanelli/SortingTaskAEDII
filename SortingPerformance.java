class SortingPerformance {

    public static void firstStep(String fileName) {
        // Read all lines from first file
        Room[] allData = RoomIO.read("data/airbnb.txt", 128000, true);

        // Make a new file with random data
        RoomIO.write("data/Random.txt", allData);

        // Order data ascending and make a new file named "ascending.txt"
        QuickSort sorter = new QuickSort();
        sorter.sort(allData, 0, allData.length - 1);
        RoomIO.write("data/Ascending.txt", allData);

        // Order data descending and make a new file named "descending.txt"
        int size = allData.length - 1;
        Room[] descData = new Room[size + 1];

        for(int i = 0; i <= size; i++)
            descData[i] = allData[size - i];

        RoomIO.write("data/Descending.txt", descData);
        
    }

    public static void secondStep(String path) {
        int[] orderValues = {2000, 4000, 8000, 16000, 32000, 64000, 128000};
        
        for(int i = 0; i < orderValues.length - 1; i++) {
            // Execute sorting for each line limit and file

            String[] fileName = {"Random.txt", "Ascending.txt", "Descending.txt"};
            
            // Bubble Sort
            SecondStepRunner.bubbleSort(orderValues[i], path + fileName[0], path + fileName[1], path + fileName[1]);

            // Insertion Sort
            SecondStepRunner.insertionSort(orderValues[i], path + fileName[0], path + fileName[1], path + fileName[1]);

            // Merge Sort
            SecondStepRunner.mergeSort(orderValues[i], path + fileName[0], path + fileName[1], path + fileName[1]);

            // Patruno Sort
            SecondStepRunner.patrunoSort(orderValues[i], path + fileName[0], path + fileName[1], path + fileName[1]);

            // Quick Sort
            SecondStepRunner.quickSort(orderValues[i], path + fileName[0], path + fileName[1], path + fileName[1]);
            
            // Selection Sort
            SecondStepRunner.selectionSort(orderValues[i], path + fileName[0], path + fileName[1], path + fileName[1]);
        }
    }

    public static void main(String[] args) {

        // Initial Step
        firstStep("data/airbnb.txt");

        // Second Step
        secondStep("data/");

    }
}