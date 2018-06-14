class InsertionSort {
    public void sort(Room[] allData) {
        int n = allData.length;

        for (int i = 1; i < n; ++i) {
            Room key = allData[i];
            int j = i - 1;
 
            while (j >= 0 && allData[j].roomID > key.roomID) {
                allData[j+1] = allData[j];
                j = j - 1;
            }
            allData[j+1] = key;
        }
    }
}