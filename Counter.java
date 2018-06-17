class Counter {
    int lineLimit;
    long swaps;
    long comparisons;
    int typeSorting;
    int sortingMethod;
    long time;

    // String[] sortingTypes = {"Random", "Ascending", "Descending"};
    // String[] sortingMethods = {"BubbleSort", "InsertionSort", "MergeSort", "PatrunoSort", "QuickSort", "SelectionSort"}

    public Counter() {
        this.swaps = 0;
        this.comparisons = 0;
        this.time = 0;
        this.typeSorting = -1;
        this.sortingMethod = -1;
        this.lineLimit = 0;
    }

    public Counter(int method, int type, int lineLimit) {
        this.sortingMethod = method;
        this.lineLimit = lineLimit;
        this.typeSorting = type;
        this.swaps = 0;
        this.comparisons = 0;
        this.time = 0;
    }
}