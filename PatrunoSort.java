class PatrunoSort {
    public void sort(Room[] allData, Counter counter) {
        for(int i = allData.length; i >= 1; i--) {
            for(int j = 1; j < i; j++) {
                counter.comparisons++;
                if(allData[j - 1].roomID > allData[j].roomID) {
                    counter.swaps++;
                    Room aux = allData[j];
                    allData[j] = allData[j - 1];
                    allData[j - 1] = aux;
                }
            }
        }
    }
}