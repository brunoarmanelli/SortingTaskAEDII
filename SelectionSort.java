class SelectionSort {
    Counter counter;
    long startTime, endTime;

    public SelectionSort(Counter counter) {
        this.counter = counter;
    }

    public Counter sort(Room[] allData) {
        this.startTime = System.currentTimeMillis();

        runSort(allData);

        endTime = System.currentTimeMillis();
        counter.time = endTime - startTime;

        return this.counter;
    }

    public void runSort (Room[] allData) {
        int n = allData.length;
 
        for (int i = 0; i < n - 1; i++) {
            
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                counter.comparisons++;
                if (allData[j].roomID < allData[min_idx].roomID) {
                    // Count Comparisons
                    min_idx = j;
                }
            }

            Room temp = allData[min_idx];
            allData[min_idx] = allData[i];
            allData[i] = temp;
            counter.swaps++; // Count Swaps
        }
    }
}