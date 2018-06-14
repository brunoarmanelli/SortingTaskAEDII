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

            // Read data for each value and file
            Room[] randomData = RoomIO.read(path + "random.txt", orderValues[i], false);
            Room[] ascData = RoomIO.read(path + "ascending.txt", orderValues[i], false);
            Room[] descData = RoomIO.read(path + "descending.txt", orderValues[i], false);

            // Temporary values
            Room[] tempRandom, tempAsc, tempDesc;

            // Execute ordering for each algorithm and reassociate data
            
        }
    }

    public static void main(String[] args) {

        // Initial Step
        firstStep("data/airbnb.txt");

        // Second Step
        firstStep("data");
    }
}