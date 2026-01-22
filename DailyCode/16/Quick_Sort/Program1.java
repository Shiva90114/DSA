// Quick Sort
// Code

class QuickSort {
	static int partition(int arr[],int start,int end){
	
		int pivot = arr[end];
		int pivotIndex= start-1;
		for(int j= start;j<end;j++){
		
			if(arr[j] < pivot){
				pivotIndex++;
				
				int temp  = arr[j];
				arr[j] = arr[pivotIndex];
				arr[pivotIndex] = temp;
			
			}
		
		}
		pivotIndex++;
		int temp  = arr[end];
                arr[end] = arr[pivotIndex];
                arr[pivotIndex] = temp;

		return pivotIndex;

	}
	static  void quickSort(int arr[],int start,int end) {
	
		if(start >= end)
			return;
		int pivotIndex = partition(arr,start,end);

		quickSort(arr,start,pivotIndex-1);
		quickSort(arr,pivotIndex+1,end);
	
	}

	public static void main(String[] args) {
	
		int arr[] = new int[]{7,2,1,4,6,5,3};
		for(int i =0;i<arr.length;i++) {
		
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		quickSort(arr,0,arr.length-1);
                for(int i =0;i<arr.length;i++) {

                        System.out.print(arr[i]+" ");
                }
                System.out.println();
	}
}


