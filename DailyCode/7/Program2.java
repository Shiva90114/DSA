// Code - 2
// Given an Integer Array of Size N
//Count No. of Elements Having atlest 1 Element greater than itself
//Arr: [2,5,1,4,8,0,8,1,3,8]
//N= 10(Size)
//Output : 7
class CountElement{

	static int countEle(int arr[]){
	
		int count = 0;
		for(int i = 0;i<arr.length;i++){
		
			for(int j =0;j<arr.length;j++){
			if(arr[i]<arr[j]){
			count++;
			break;
			}
		   }
		}
		return count;
	}
	public static void main(String[] args){
	int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
	System.out.println(countEle(arr));
	}
}


