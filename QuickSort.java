class QuickSort {
      Counter quickCount = new Counter();

      public void sort(Room[] allData, int inicio, int fim) {
            if (inicio < fim) {
                  int posicaoPivo = separar(allData, inicio, fim);
                  sort(allData, inicio, posicaoPivo - 1);
                  sort(allData, posicaoPivo + 1, fim);
            }
      }

      private int separar(Room[] allData, int inicio, int fim) {
            int pivo = allData[inicio].roomID;
            int i = inicio + 1, f = fim;
            while (i <= f) {
                  if (allData[i].roomID <= pivo)
                        i++;
                  else if (pivo < allData[f].roomID)
                        f--;
                  else {
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