// Selection sort

class SelectionSort{

	static void selectionSort(int arr[]){	
		
		for(int i=0;i<arr.length-1;i++){
		
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++){
			   if(arr[j]<arr[minIndex]){
			         minIndex = j;
			   }
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	
	}
	 public static void main(String[] args){
                 int arr[] = new int[]{9,7,8,4,1,3,6,2,5,10};	 
		 for(int i=0;i<arr.length;i++){
		 System.out.print(arr[i]+" ");
		 
		 }
		 System.out.println();
		 selectionSort(arr);
		 for(int i=0;i<arr.length;i++){
                           System.out.print(arr[i]+" ");

                 }
	 }
}
