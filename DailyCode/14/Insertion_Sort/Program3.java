// Insertion Sort
// For loop
// Swap Technic

class InsertionSort{


        static void insertionSort(int arr[]){

                for(int i =1;i<arr.length;i++){
                    for(int j=i;j>0 ;j--){
			    if(arr[j]<arr[j-1]){
			    
			    int temp = arr[j];
			    arr[j] = arr[j-1];
			    arr[j-1] =temp;
			    }

                                
                }

        }
	}
        public static void main(String[] args){
                int arr[] = new int[]{9,7,8,4,1,3,6,2};

                for(int i =0;i<arr.length;i++){

                        System.out.print(arr[i]+" ");
                }
                System.out.println();

               insertionSort(arr);
                 for(int i=0;i<arr.length;i++){
                           System.out.print(arr[i]+" ");

                 }
                 System.out.println();
        }

}
