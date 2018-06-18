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
    
            runSort(allData, 0, allData.length - 1);
    
            endTime = System.currentTimeMillis();
            counter.time = endTime - startTime;
    
            return this.counter;
      }

      public void runSort(Room[] allData, int inicio, int fim) {
            if (inicio < fim) {
                  int posicaoPivo = separar(allData, inicio, fim);
                  runSort(allData, inicio, posicaoPivo - 1);
                  runSort(allData, posicaoPivo + 1, fim);
            }
      }

      private int separar(Room[] allData, int inicio, int fim) {
            int pivo = allData[inicio].roomID;
            int i = inicio + 1, f = fim;
            while (i <= f) {
                  counter.comparisons++;
                  if (allData[i].roomID <= pivo) {
                        i++;
                  } else if (pivo < allData[f].roomID) {
                        counter.comparisons++;
                        f--;
                  } else {
                        counter.swaps++;
                        int troca = allData[i].roomID;
                        allData[i].roomID = allData[f].roomID;
                        allData[f].roomID = troca;
                        i++;
                        f--;
                  }
            }
            allData[inicio].roomID = allData[f].roomID;
            allData[f].roomID = pivo;
            return f;
      }
}