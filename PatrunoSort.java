class PatrunoSort {
    Counter counter;
    long startTime, endTime;

    public PatrunoSort(Counter counter) {
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
            int last = i - 1;
            boolean isOrdered = true;
            
            for(int j = 1; j < i; j++) {
                this.counter.comparisons++;

                if(allData[j - 1].roomID > allData[j].roomID) {
                    isOrdered = false;
                    this.counter.swaps++;
                    Room aux = allData[j];
                    allData[j] = allData[j - 1];
                    allData[j - 1] = aux;

                    if(last > j) {
                        this.counter.swaps++;
						aux = allData[j];
						allData[j] = allData[last];
						allData[last] = aux;
                        last--;
					}
                }
            }

            if(isOrdered) {
                break;
            }
        }
    }
}