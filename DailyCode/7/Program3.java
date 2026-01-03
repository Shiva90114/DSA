/*Code - 3
 *
 * Give an Array of Size N
 * Return the count of Pairs(i,j) with
 * arr[i]+arr[j]= k
 * Arr :[3,5,2,1,-3,7,8,15,6,13]
 * N:10
 * K:10
 *
 * Note : - i! = j
 *
 * Output : 6
 *
 */
class Pair{
 
	static int pairK(int arr[],int K){
	int count =0;
	for(int i =0;i<arr.length;i++){
	     for(int j =0;j<arr.length;j++){
		     if(i!=j){
		        if(arr[i] + arr[j] == K){
			
			count++;
			}
		     }

                }
            } 
	return count;
	}

	public static void main(String[] args){
	int arr[] = new int[]{3,5,2,1,-3,7,8,15,6,13};
	int k =10;
	System.out.println(pairK(arr,k));
	}
}
