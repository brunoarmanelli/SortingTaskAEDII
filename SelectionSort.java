class SelectionSort {
    public void sort (Room[] allData, Counter counter) {
        int n = allData.length;
 
        for (int i = 0; i < n - 1; i++) {
            
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (allData[j].roomID < allData[min_idx].roomID) {
                    counter.comparisons++; // Count Comparisons
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