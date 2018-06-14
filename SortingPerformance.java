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
            SecondStepRunner.bubbleSortRandom(orderValues[i], path + fileName[0]);
            SecondStepRunner.bubbleSortAsc(orderValues[i], path + fileName[1]);
            SecondStepRunner.bubbleSortDesc(orderValues[i], path + fileName[2]);
            
            // Insertion Sort
            SecondStepRunner.insertionSortRandom(orderValues[i], path + fileName[0]);
            SecondStepRunner.insertionSortAsc(orderValues[i], path + fileName[1]);
            SecondStepRunner.insertionSortDesc(orderValues[i], path + fileName[2]);

            // Merge Sort
            SecondStepRunner.mergeSortRandom(orderValues[i], path + fileName[0]);
            SecondStepRunner.mergeSortAsc(orderValues[i], path + fileName[1]);
            SecondStepRunner.mergeSortDesc(orderValues[i], path + fileName[2]);

            // Patruno Sort
            SecondStepRunner.patrunoSortRandom(orderValues[i], path + fileName[0]);
            SecondStepRunner.patrunoSortAsc(orderValues[i], path + fileName[1]);
            SecondStepRunner.patrunoSortDesc(orderValues[i], path + fileName[2]);

            // Quick Sort
            SecondStepRunner.quickSortRandom(orderValues[i], path + fileName[0]);
            SecondStepRunner.quickSortAsc(orderValues[i], path + fileName[1]);
            SecondStepRunner.quickSortDesc(orderValues[i], path + fileName[2]);

            // Selection Sort
            SecondStepRunner.selectionSortRandom(orderValues[i], path + fileName[0]);
            SecondStepRunner.selectionSortAsc(orderValues[i], path + fileName[1]);
            SecondStepRunner.selectionSortDesc(orderValues[i], path + fileName[2]);
        }
    }

    public static void main(String[] args) {

        // Initial Step
        firstStep("data/airbnb.txt");

        // Second Step
        secondStep("data/");

    }
}