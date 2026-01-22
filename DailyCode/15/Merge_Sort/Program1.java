// Merge Sort
// Logic

// Step -1
// Divide
   if (start >= end) {
            return;
        }

        int mid =(start+end)/2;

        mergeSort(arr, start, mid);      // left half
        mergeSort(arr, mid + 1, end);    // right half
        merge(arr, start, mid, end);     // merge halves
    }

// Step - 2
// Merge two sorted Block
    void merge(int arr[], int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
      	int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
            j++;
            }
            k++;
        }
           while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
       while (j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

/////////////////////////////////////////////////////
