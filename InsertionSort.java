class InsertionSort {
    public void sort(Room[] allData, Counter counter) {
        int n = allData.length;

        for (int i = 1; i < n; ++i) {
            Room key = allData[i];
            int j = i - 1;
 
            counter.comparisons++;
            while (j >= 0 && allData[j].roomID > key.roomID) {
                allData[j + 1] = allData[j];
                j = j - 1;
                counter.swaps++;
            }
            allData[j+1] = key;
        }
    }
}