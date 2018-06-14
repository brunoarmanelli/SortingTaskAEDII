class SecondStepRunner {
    public static void bubbleSortRandom (int lineLimit, String file) {
        // Bubble Sort Random
        Counter bubbleRandomCounter = new Counter(0, 0, lineLimit);

        long bubbleStartTime = System.currentTimeMillis();
        BubbleSort bubbleRandom = new BubbleSort();
        bubbleRandom.sort(RoomIO.read(file, lineLimit, false), bubbleRandomCounter);
        long bubbleEndTime = System.currentTimeMillis();
        long bubbleElapsedTimeRandom = bubbleEndTime - bubbleStartTime;

        bubbleRandomCounter.time = bubbleElapsedTimeRandom;
        StatsIO.write(bubbleRandomCounter); // Save data in file

        // Print data
        System.out.println("Bubble Sort took " + bubbleElapsedTimeRandom + " ms and " + bubbleRandomCounter.swaps + " swaps to sort a Random Array of " + lineLimit + " elements.");
    }
    public static void bubbleSortAsc (int lineLimit, String file) {
        // Bubble Sort Ascending
        Counter bubbleAscCounter = new Counter(0, 1, lineLimit);

        long bubbleStartTime = System.currentTimeMillis();
        BubbleSort bubbleAsc = new BubbleSort();
        bubbleAsc.sort(RoomIO.read(file, lineLimit, false), bubbleAscCounter);
        long bubbleEndTime = System.currentTimeMillis();
        long bubbleElapsedTimeAscending = bubbleEndTime - bubbleStartTime;

        bubbleAscCounter.time = bubbleElapsedTimeAscending;
        StatsIO.write(bubbleAscCounter);

        // Print data
        System.out.println("Bubble Sort took " + bubbleElapsedTimeAscending + " ms and " + bubbleAscCounter.swaps + " swaps to sort an Ascending Array of " + lineLimit + " elements.");
    }
    public static void bubbleSortDesc (int lineLimit, String file) {
        // Bubble Sort Descending
        Counter bubbleDescCounter = new Counter(0, 2, lineLimit);

        long bubbleStartTime = System.currentTimeMillis();
        BubbleSort bubbleDesc = new BubbleSort();
        bubbleDesc.sort(RoomIO.read(file, lineLimit, false), bubbleDescCounter);
        long bubbleEndTime = System.currentTimeMillis();
        long bubbleElapsedTimeDescending = bubbleEndTime - bubbleStartTime;

        bubbleDescCounter.time = bubbleElapsedTimeDescending;
        StatsIO.write(bubbleDescCounter);

        // Print data
        System.out.println("Bubble Sort took " + bubbleElapsedTimeDescending + " ms and " + bubbleDescCounter.swaps + " swaps to sort a Descending Array of " + lineLimit + " elements.");
    }

    public static void insertionSortRandom (int lineLimit, String file) {
        // Insertion Sort Random
        Counter insertionRandomCounter = new Counter(1, 0, lineLimit);

        long insertionStartTime = System.currentTimeMillis();
        InsertionSort insertionRandom = new InsertionSort();
        insertionRandom.sort(RoomIO.read(file, lineLimit, false), insertionRandomCounter);
        long insertionEndTime = System.currentTimeMillis();
        long insertionElapsedTimeRandom = insertionEndTime - insertionStartTime;

        insertionRandomCounter.time = insertionElapsedTimeRandom;
        StatsIO.write(insertionRandomCounter); // Save data in file

        // Print data
        System.out.println("Insertion Sort took " + insertionElapsedTimeRandom + " ms and " + insertionRandomCounter.swaps + " swaps to sort a Random Array of " + lineLimit + " elements.");
    }
    public static void insertionSortAsc (int lineLimit, String file) {
        // Insertion Sort Ascending
        Counter insertionAscCounter = new Counter(1, 1, lineLimit);

        long insertionStartTime = System.currentTimeMillis();
        InsertionSort insertionAsc = new InsertionSort();
        insertionAsc.sort(RoomIO.read(file, lineLimit, false), insertionAscCounter);
        long insertionEndTime = System.currentTimeMillis();
        long insertionElapsedTimeAscending = insertionEndTime - insertionStartTime;

        insertionAscCounter.time = insertionElapsedTimeAscending;
        StatsIO.write(insertionAscCounter);

        // Print data
        System.out.println("Insertion Sort took " + insertionElapsedTimeAscending + " ms and " + insertionAscCounter.swaps + " swaps to sort an Ascending Array of " + lineLimit + " elements.");
    }
    public static void insertionSortDesc (int lineLimit, String file) {

        // Insertion Sort Descending
        Counter insertionDescCounter = new Counter(1, 2, lineLimit);

        long insertionStartTime = System.currentTimeMillis();
        InsertionSort insertionDesc = new InsertionSort();
        insertionDesc.sort(RoomIO.read(file, lineLimit, false), insertionDescCounter);
        long insertionEndTime = System.currentTimeMillis();
        long insertionElapsedTimeDescending = insertionEndTime - insertionStartTime;

        insertionDescCounter.time = insertionElapsedTimeDescending;
        StatsIO.write(insertionDescCounter);

        // Print data
        System.out.println("Insertion Sort took " + insertionElapsedTimeDescending + " ms and " + insertionDescCounter.swaps + " swaps to sort a Descending Array of " + lineLimit + " elements.");
    }

    public static void mergeSortRandom(int lineLimit, String file) {
        // Merge Sort Random
        Counter mergeRandomCounter = new Counter(2, 0, lineLimit);

        long mergeStartTime = System.currentTimeMillis();
        MergeSort mergeRandom = new MergeSort();
        mergeRandom.sort(RoomIO.read(file, lineLimit, false), mergeRandomCounter);
        long mergeEndTime = System.currentTimeMillis();
        long mergeElapsedTimeRandom = mergeEndTime - mergeStartTime;

        mergeRandomCounter.time = mergeElapsedTimeRandom;
        StatsIO.write(mergeRandomCounter); // Save data in file

        // Print data
        System.out.println("Merge Sort took " + mergeElapsedTimeRandom + " ms and " + mergeRandomCounter.swaps + " swaps to sort a Random Array of " + lineLimit + " elements.");
    }
    public static void mergeSortAsc(int lineLimit, String file) {
        // Merge Sort Ascending
        Counter mergeAscCounter = new Counter(2, 1, lineLimit);

        long mergeStartTime = System.currentTimeMillis();
        MergeSort mergeAsc = new MergeSort();
        mergeAsc.sort(RoomIO.read(file, lineLimit, false), mergeAscCounter);
        long mergeEndTime = System.currentTimeMillis();
        long mergeElapsedTimeAsc = mergeEndTime - mergeStartTime;

        mergeAscCounter.time = mergeElapsedTimeAsc;
        StatsIO.write(mergeAscCounter); // Save data in file

        // Print data
        System.out.println("Merge Sort took " + mergeElapsedTimeAsc + " ms and " + mergeAscCounter.swaps + " swaps to sort an Ascending Array of " + lineLimit + " elements.");
    }
    public static void mergeSortDesc(int lineLimit, String file) {
        // Merge Sort Descending
        Counter mergeDescCounter = new Counter(2, 2, lineLimit);

        long mergeStartTime = System.currentTimeMillis();
        MergeSort mergeDesc = new MergeSort();
        mergeDesc.sort(RoomIO.read(file, lineLimit, false), mergeDescCounter);
        long mergeEndTime = System.currentTimeMillis();
        long mergeElapsedTimeDesc = mergeEndTime - mergeStartTime;

        mergeDescCounter.time = mergeElapsedTimeDesc;
        StatsIO.write(mergeDescCounter); // Save data in file

        // Print data
        System.out.println("Merge Sort took " + mergeElapsedTimeDesc + " ms and " + mergeDescCounter.swaps + " swaps to sort an Descending Array of " + lineLimit + " elements.");
    }

    public static void patrunoSortRandom(int lineLimit, String file) {
        // Patruno Sort Random
        Counter patrunoRandomCounter = new Counter(3, 0, lineLimit);

        long patrunoStartTime = System.currentTimeMillis();
        PatrunoSort patrunoRandom = new PatrunoSort();
        patrunoRandom.sort(RoomIO.read(file, lineLimit, false), patrunoRandomCounter);
        long patrunoEndTime = System.currentTimeMillis();
        long patrunoElapsedTimeRandom = patrunoEndTime - patrunoStartTime;

        patrunoRandomCounter.time = patrunoElapsedTimeRandom;
        StatsIO.write(patrunoRandomCounter); // Save data in file

        // Print data
        System.out.println("Patruno Sort took " + patrunoElapsedTimeRandom + " ms and " + patrunoRandomCounter.swaps + " swaps to sort a Random Array of " + lineLimit + " elements.");
    }
    public static void patrunoSortAsc(int lineLimit, String file) {
        // Patruno Sort Ascending
        Counter patrunoAscCounter = new Counter(3, 1, lineLimit);

        long patrunoStartTime = System.currentTimeMillis();
        PatrunoSort patrunoAsc = new PatrunoSort();
        patrunoAsc.sort(RoomIO.read(file, lineLimit, false), patrunoAscCounter);
        long patrunoEndTime = System.currentTimeMillis();
        long patrunoElapsedTimeAsc = patrunoEndTime - patrunoStartTime;

        patrunoAscCounter.time = patrunoElapsedTimeAsc;
        StatsIO.write(patrunoAscCounter); // Save data in file

        // Print data
        System.out.println("Patruno Sort took " + patrunoElapsedTimeAsc + " ms and " + patrunoAscCounter.swaps + " swaps to sort a Ascending Array of " + lineLimit + " elements.");
    }
    public static void patrunoSortDesc(int lineLimit, String file) {
        // Patruno Sort Descending
        Counter patrunoDescCounter = new Counter(3, 2, lineLimit);

        long patrunoStartTime = System.currentTimeMillis();
        PatrunoSort patrunoDesc = new PatrunoSort();
        patrunoDesc.sort(RoomIO.read(file, lineLimit, false), patrunoDescCounter);
        long patrunoEndTime = System.currentTimeMillis();
        long patrunoElapsedTimeDesc = patrunoEndTime - patrunoStartTime;

        patrunoDescCounter.time = patrunoElapsedTimeDesc;
        StatsIO.write(patrunoDescCounter); // Save data in file

        // Print data
        System.out.println("Patruno Sort took " + patrunoElapsedTimeDesc + " ms and " + patrunoDescCounter.swaps + " swaps to sort a Descending Array of " + lineLimit + " elements.");
    }

    public static void quickSortRandom(int lineLimit, String file) {
        // Quick Sort Random
        Counter quickRandomCounter = new Counter(4, 0, lineLimit);

        long quickStartTime = System.currentTimeMillis();
        QuickSort quickRandom = new QuickSort(quickRandomCounter);
        quickRandom.sort(RoomIO.read(file, lineLimit, false), 0, lineLimit - 1);
        long quickEndTime = System.currentTimeMillis();
        long quickElapsedTimeRandom = quickEndTime - quickStartTime;

        quickRandomCounter.time = quickElapsedTimeRandom;
        StatsIO.write(quickRandomCounter); // Save data in file

        // Print data
        System.out.println("Quick Sort took " + quickElapsedTimeRandom + " ms and " + quickRandomCounter.swaps + " swaps to sort a Random Array of " + lineLimit + " elements.");
    }
    public static void quickSortAsc(int lineLimit, String file) {
        // Quick Sort Ascending
        Counter quickAscCounter = new Counter(4, 1, lineLimit);

        long quickStartTime = System.currentTimeMillis();
        QuickSort quickAsc = new QuickSort(quickAscCounter);
        quickAsc.sort(RoomIO.read(file, lineLimit, false), 0, lineLimit - 1);
        long quickEndTime = System.currentTimeMillis();
        long quickElapsedTimeAsc = quickEndTime - quickStartTime;

        quickAscCounter.time = quickElapsedTimeAsc;
        StatsIO.write(quickAscCounter); // Save data in file

        // Print data
        System.out.println("Quick Sort took " + quickElapsedTimeAsc + " ms and " + quickAscCounter.swaps + " swaps to sort a Ascending Array of " + lineLimit + " elements.");
    }
    public static void quickSortDesc(int lineLimit, String file) {
        // quick Sort Descending
        Counter quickDescCounter = new Counter(4, 2, lineLimit);

        long quickStartTime = System.currentTimeMillis();
        QuickSort quickDesc = new QuickSort(quickDescCounter);
        quickDesc.sort(RoomIO.read(file, lineLimit, false), 0, lineLimit - 1);
        long quickEndTime = System.currentTimeMillis();
        long quickElapsedTimeDesc = quickEndTime - quickStartTime;

        quickDescCounter.time = quickElapsedTimeDesc;
        StatsIO.write(quickDescCounter); // Save data in file

        // Print data
        System.out.println("Quick Sort took " + quickElapsedTimeDesc + " ms and " + quickDescCounter.swaps + " swaps to sort a Descending Array of " + lineLimit + " elements.");
    }

    public static void selectionSortRandom(int lineLimit, String file) {
        // Selection Sort Random
        Counter selectionRandomCounter = new Counter(5, 0, lineLimit);

        long selectionStartTime = System.currentTimeMillis();
        SelectionSort selectionRandom = new SelectionSort();
        selectionRandom.sort(RoomIO.read(file, lineLimit, false), selectionRandomCounter);
        long selectionEndTime = System.currentTimeMillis();
        long selectionElapsedTimeRandom = selectionEndTime - selectionStartTime;

        selectionRandomCounter.time = selectionElapsedTimeRandom;
        StatsIO.write(selectionRandomCounter); // Save data in file

        // Print data
        System.out.println("Selection Sort took " + selectionElapsedTimeRandom + " ms and " + selectionRandomCounter.swaps + " swaps to sort a Random Array of " + lineLimit + " elements.");
    }
    public static void selectionSortAsc(int lineLimit, String file) {
        // Selection Sort Ascending
        Counter selectionAscCounter = new Counter(5, 1, lineLimit);

        long selectionStartTime = System.currentTimeMillis();
        SelectionSort selectionAsc = new SelectionSort();
        selectionAsc.sort(RoomIO.read(file, lineLimit, false), selectionAscCounter);
        long selectionEndTime = System.currentTimeMillis();
        long selectionElapsedTimeAsc = selectionEndTime - selectionStartTime;

        selectionAscCounter.time = selectionElapsedTimeAsc;
        StatsIO.write(selectionAscCounter); // Save data in file

        // Print data
        System.out.println("Selection Sort took " + selectionElapsedTimeAsc + " ms and " + selectionAscCounter.swaps + " swaps to sort a Ascending Array of " + lineLimit + " elements.");
    }
    public static void selectionSortDesc(int lineLimit, String file) {
        // Selection Sort Descending
        Counter selectionDescCounter = new Counter(5, 2, lineLimit);

        long selectionStartTime = System.currentTimeMillis();
        SelectionSort selectionDesc = new SelectionSort();
        selectionDesc.sort(RoomIO.read(file, lineLimit, false), selectionDescCounter);
        long selectionEndTime = System.currentTimeMillis();
        long selectionElapsedTimeDesc = selectionEndTime - selectionStartTime;

        selectionDescCounter.time = selectionElapsedTimeDesc;
        StatsIO.write(selectionDescCounter); // Save data in file

        // Print data
        System.out.println("Selection Sort took " + selectionElapsedTimeDesc + " ms and " + selectionDescCounter.swaps + " swaps to sort a Descending Array of " + lineLimit + " elements.");
    }
}