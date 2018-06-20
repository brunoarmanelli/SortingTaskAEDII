class QuickSort {
    Counter counter;
    long startTime, endTime;

    public QuickSort() {
        this.counter = new Counter();
    }

    public QuickSort(Counter counter) {
        this.counter = counter;
    }

    public Counter sort(Room[] allData) {
        this.startTime = System.currentTimeMillis();

        runSort(allData, 0, (allData.length - 1));

        endTime = System.currentTimeMillis();
        counter.time = endTime - startTime;

        return this.counter;
    }

    void runSort(Room[] arr, int low, int high) {
        if (arr == null || arr.length == 0) 
            return;
        if (low >= high)
            return;

        // Pick Pivot
        int middle = low + (high - low) / 2;
        Room pivot = arr[middle];

        // Make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while(arr[i].roomID < pivot.roomID) {
                i++;
                this.counter.comparisons++;
            }
            while(arr[j].roomID > pivot.roomID) {
                j--;
                this.counter.comparisons++;
            }

            if (i <= j) {
                this.counter.swaps++;
                Room temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // Sort two subparts
        if(low < j) {
            runSort(arr, low, j);
        }

        if(high > i) {
            runSort(arr, i, high);
        }
    }
}