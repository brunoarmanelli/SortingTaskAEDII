class SecondStepRunner {
    public static void bubbleSort (int lineLimit, String randomFile, String ascFile, String descFile) {
        // Bubble Sort Random
        long bubbleStartTime = System.currentTimeMillis();
        BubbleSort bubbleRandom = new BubbleSort();
        bubbleRandom.sort(RoomIO.read(randomFile, lineLimit, false));
        long bubbleEndTime = System.currentTimeMillis();
        long bubbleElapsedTimeRandom = bubbleEndTime - bubbleStartTime;

        // Bubble Sort Ascending
        bubbleStartTime = System.currentTimeMillis();
        BubbleSort bubbleAsc = new BubbleSort();
        bubbleAsc.sort(RoomIO.read(ascFile, lineLimit, false));
        bubbleEndTime = System.currentTimeMillis();
        long bubbleElapsedTimeAscending = bubbleEndTime - bubbleStartTime;

        // Bubble Sort Descending
        bubbleStartTime = System.currentTimeMillis();
        BubbleSort bubbleDesc = new BubbleSort();
        bubbleDesc.sort(RoomIO.read(descFile, lineLimit, false));
        bubbleEndTime = System.currentTimeMillis();
        long bubbleElapsedTimeDescending = bubbleEndTime - bubbleStartTime;

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