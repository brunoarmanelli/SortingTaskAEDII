class BubbleSort {
    Counter counter;
    long startTime, endTime;

    public BubbleSort(Counter counter) {
        this.counter = counter;
    }

    public Counter sort(Room[] allData) {
        this.startTime = System.currentTimeMillis();

        runSort(allData);

        endTime = System.currentTimeMillis();
        counter.time = endTime - startTime;

        return this.counter;
    }

    public void runSort(Room[] allData) {
        for(int i = allData.length; i >= 1; i--) {
            for(int j = 1; j < i; j++) {
                counter.comparisons++;
                if(allData[j - 1].roomID > allData[j].roomID) {
                    Room aux = allData[j];
                    allData[j] = allData[j - 1];
                    allData[j - 1] = aux;
                    counter.swaps++;
                }
            }
        }
    }
}