// Bubble Sort

class BubbleSort{

	static int count=0;
	static void bubbleSort(int arr[]){
	
		for(int i =0;i<arr.length-1;i++){
		
			for(int j=0;j<arr.length-i-1;j++){
			   if(arr[j]>arr[j+1]){
			   
				   int temp = arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
			}
			System.out.println(++count);
		
		}
	}
	public static void main(String[] args){
		int arr[] = new int[]{9,7,8,4,1,3,6,2};
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
