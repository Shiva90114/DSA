// Insertion Sort
// While loop
// Shift Technic

class InsertionSort{

     
        static void insertionSort(int arr[]){

                for(int i =1;i<arr.length;i++){
                int key=arr[i];
                int j=i-1;
                       while(j>=0 && arr[j]>key){
		       
		       			arr[j+1]=arr[j];
                                      j--;
				}	
		arr[j+1]=key;
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

