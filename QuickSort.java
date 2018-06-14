class QuickSort {
      Counter counter;

      public QuickSort() {
            this.counter = new Counter();
      }

      public QuickSort(Counter counter) {
            this.counter = counter;
      }

      public void sort(Room[] allData) {
            sortInside(allData, 0, allData.length - 1);
      }

      public void sortInside(Room[] allData, int inicio, int fim) {
            if (inicio < fim) {
                  int posicaoPivo = separar(allData, inicio, fim);
                  sortInside(allData, inicio, posicaoPivo - 1);
                  sortInside(allData, posicaoPivo + 1, fim);
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
                        counter.comparisons++;
                        counter.swaps++; // Count Swaps
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