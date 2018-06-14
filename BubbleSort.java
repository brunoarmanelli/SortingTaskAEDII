class BubbleSort {
    public void sort(Room[] allData) {
        for(int i = allData.length; i >= 1; i--) {
            for(int j = 1; j < i; j++) {
                if(allData[j - 1].roomID > allData[j].roomID) {
                    Room aux = allData[j];
                    allData[j] = allData[j - 1];
                    allData[j - 1] = aux;
                }
            }
        }
    }
}