class SecondStepRunner {
    public static void bubbleSort (int lineLimit, String randomFile, String ascFile, String descFile) {
        // Bubble Sort Random
        Counter bubbleRandomCounter = new Counter(0, 0, lineLimit);

        long bubbleStartTime = System.currentTimeMillis();
        BubbleSort bubbleRandom = new BubbleSort();
        bubbleRandom.sort(RoomIO.read(randomFile, lineLimit, false), bubbleRandomCounter);
        long bubbleEndTime = System.currentTimeMillis();
        long bubbleElapsedTimeRandom = bubbleEndTime - bubbleStartTime;

        bubbleRandomCounter.time = bubbleElapsedTimeRandom;
        StatsIO.write(bubbleRandomCounter); // Save data in file

        // Bubble Sort Ascending
        Counter bubbleAscCounter = new Counter(0, 1, lineLimit);

        bubbleStartTime = System.currentTimeMillis();
        BubbleSort bubbleAsc = new BubbleSort();
        bubbleAsc.sort(RoomIO.read(ascFile, lineLimit, false), bubbleAscCounter);
        bubbleEndTime = System.currentTimeMillis();
        long bubbleElapsedTimeAscending = bubbleEndTime - bubbleStartTime;

        bubbleAscCounter.time = bubbleElapsedTimeAscending;
        StatsIO.write(bubbleAscCounter);

        // Bubble Sort Descending
        Counter bubbleDescCounter = new Counter(0, 2, lineLimit);

        bubbleStartTime = System.currentTimeMillis();
        BubbleSort bubbleDesc = new BubbleSort();
        bubbleDesc.sort(RoomIO.read(descFile, lineLimit, false), bubbleDescCounter);
        bubbleEndTime = System.currentTimeMillis();
        long bubbleElapsedTimeDescending = bubbleEndTime - bubbleStartTime;

        bubbleDescCounter.time = bubbleElapsedTimeDescending;
        StatsIO.write(bubbleDescCounter);

        // Print data
        System.out.println("Bubble Sort took " + bubbleElapsedTimeRandom + " ms to sort a Random Array of " + lineLimit + " elements.");
        System.out.println("Bubble Sort took " + bubbleElapsedTimeAscending + " ms to sort an Ascending Array of " + lineLimit + " elements.");
        System.out.println("Bubble Sort took " + bubbleElapsedTimeDescending + " ms to sort a Descending Array of " + lineLimit + " elements.");
    }

    public static void insertionSort(int lineLimit, String randomFile, String ascFile, String descFile) {

    }

    public static void mergeSort(int lineLimit, String randomFile, String ascFile, String descFile) {

    }

    public static void patrunoSort(int lineLimit, String randomFile, String ascFile, String descFile) {

    }

    public static void quickSort(int lineLimit, String randomFile, String ascFile, String descFile) {

    }

    public static void selectionSort(int lineLimit, String randomFile, String ascFile, String descFile) {

    }
}