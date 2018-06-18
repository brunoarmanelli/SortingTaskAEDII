class Counter {
    long swaps;
    long comparisons;
    long time;
    int typeOfSort;
    int sortingMethod;
    int lineLimit;
    
    // String[] sortingTypes = {"Random", "Ascending", "Descending"};
    // String[] sortingMethods = {"BubbleSort", "InsertionSort", "MergeSort", "PatrunoSort", "QuickSort", "SelectionSort"}

    public Counter() {
        this.swaps = 0;
        this.comparisons = 0;
        this.time = 0;
        this.typeOfSort = -1;
        this.sortingMethod = -1;
        this.lineLimit = 0;
    }

    public Counter(int method, int type, int lineLimit) {
        this.sortingMethod = method;
        this.typeOfSort = type;
        this.lineLimit = lineLimit;
        this.swaps = 0;
        this.comparisons = 0;
        this.time = 0;
    }

    public String getType() {
        String[] sortingTypes = {"Random", "Ascending", "Descending"};
        return sortingTypes[this.typeOfSort];
    }

    public String getMethod() {
        String[] sortingMethods = {"BubbleSort", "InsertionSort", "MergeSort", "PatrunoSort", "QuickSort", "SelectionSort"};
        return sortingMethods[this.sortingMethod];
    }
}