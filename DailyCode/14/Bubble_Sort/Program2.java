// Bubble Sort
// if Array is Sorted

class BubbleSort{

	static int count=0;
	static void bubbleSort(int arr[]){
	
		for(int i =0;i<arr.length-1;i++){
		boolean swap= false;
			for(int j=0;j<arr.length-i-1;j++){
			   if(arr[j]>arr[j+1]){
			   
				   int temp = arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
				   swap= true;
			   }
			}
			System.out.println(++count);
			if(swap==false)
				break;
		
		}
	}
	public static void main(String[] args){
		//int arr[] = new int[]{9,7,8,4,1,3,6,2};
		int arr[] = new int[]{1,2,3,4,6,7,8,9};
		for(int i =0;i<arr.length;i++){
		
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	       bubbleSort(arr);
                 for(int i=0;i<arr.length;i++){
                           System.out.print(arr[i]+" ");

                 }
		 System.out.println();
	}

}
