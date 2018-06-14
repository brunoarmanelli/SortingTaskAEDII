class MergeSort {
    public void sort(Room[] allData) {
        sortInside(allData, 0, allData.length  - 1);
    }

    public void sortInside(Room[] allData, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
 
            // Sort first and second halves
            sortInside(allData, l, m);
            sortInside(allData , m + 1, r);
 
            // Merge the sorted halves
            merge(allData, l, m, r);
        }
    }

    void merge(Room[] allData, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        Room L[] = new Room [n1];
        Room R[] = new Room [n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = allData[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = allData[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].roomID <= R[j].roomID) {
                allData[k] = L[i];
                i++;
            } else {
                allData[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            allData[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            allData[k] = R[j];
            j++;
            k++;
        }
    }
}