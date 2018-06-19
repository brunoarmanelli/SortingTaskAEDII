class SecondStepRunner {

    // Table of colours
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void printOnScreen(Counter taskCounter) {
        String osName = System.getProperty("os.name");

        if(osName.contains("windows")) {
            System.out.println(
                "[" + taskCounter.getMethod() + "]\t" 
                + "[" + taskCounter.getType() + "]\t"
                + "[" + taskCounter.lineLimit + "]\t"
                + "[" + taskCounter.time + " ms]\t"
                + "[" + taskCounter.swaps + " swaps]\t"
                + "[" + taskCounter.comparisons + " comparisons]\t" 
                );
        } else {
            System.out.println(
                ANSI_PURPLE + "[" + taskCounter.getMethod() + "]" + ANSI_RESET + "\t" 
                + ANSI_YELLOW + "[" + taskCounter.getType() + "]" + ANSI_RESET 
                + "\t" + ANSI_RED + "[" + taskCounter.lineLimit + "]" + ANSI_RESET
                + ANSI_CYAN + "\t[" + taskCounter.time + " ms]" + ANSI_RESET 
                + ANSI_CYAN + " [" + taskCounter.swaps + " swaps]" + ANSI_RESET 
                + ANSI_CYAN + " [" + taskCounter.comparisons + " comparisons]\t" + ANSI_RESET 
                );
        }
    }

    public static void bubbleSortTask(int typeOfSort, int lineLimit, String file) {
        Counter taskCounter = new Counter(0, typeOfSort, lineLimit);
        BubbleSort sortingTask = new BubbleSort(taskCounter);
        taskCounter = sortingTask.sort(RoomIO.read(file, lineLimit, false));

        StatsIO.write(taskCounter); // Save data in file

        // Print data
        printOnScreen(taskCounter);
    }

    public static void insertionTask(int typeOfSort, int lineLimit, String file) {
        Counter taskCounter = new Counter(1, typeOfSort, lineLimit);
        InsertionSort sortingTask = new InsertionSort(taskCounter);
        taskCounter = sortingTask.sort(RoomIO.read(file, lineLimit, false));

        StatsIO.write(taskCounter); // Save data in file

        // Print data
        printOnScreen(taskCounter);
    }

    public static void mergeTask(int typeOfSort, int lineLimit, String file) {
        Counter taskCounter = new Counter(2, typeOfSort, lineLimit);
        MergeSort sortingTask = new MergeSort(taskCounter);
        taskCounter = sortingTask.sort(RoomIO.read(file, lineLimit, false));

        StatsIO.write(taskCounter); // Save data in file

        // Print data
        printOnScreen(taskCounter);
    }

    public static void patrunoTask(int typeOfSort, int lineLimit, String file) {
        Counter taskCounter = new Counter(3, typeOfSort, lineLimit);
        PatrunoSort sortingTask = new PatrunoSort(taskCounter);
        taskCounter = sortingTask.sort(RoomIO.read(file, lineLimit, false));

        StatsIO.write(taskCounter); // Save data in file

        // Print data
        printOnScreen(taskCounter);
    }

    public static void quickTask(int typeOfSort, int lineLimit, String file) {
        Counter taskCounter = new Counter(4, typeOfSort, lineLimit);
        QuickSort sortingTask = new QuickSort(taskCounter);
        taskCounter = sortingTask.sort(RoomIO.read(file, lineLimit, false));

        StatsIO.write(taskCounter); // Save data in file

        // Print data
        printOnScreen(taskCounter);
    }

    public static void selectionTask(int typeOfSort, int lineLimit, String file) {
        Counter taskCounter = new Counter(5, typeOfSort, lineLimit);
        SelectionSort sortingTask = new SelectionSort(taskCounter);
        taskCounter = sortingTask.sort(RoomIO.read(file, lineLimit, false));

        StatsIO.write(taskCounter); // Save data in file

        // Print data
        printOnScreen(taskCounter);
    }
}