/*Code - 4
 * Give an Array of Size N
 * Reverse the array without using extra space(using while loop)
 * Space Complexity : O(1)
 *Arr :[8,4,1,3,9,2,6,7]
 *N : 8
 *Output :
 *Arr:[7,6,2,9,3,1,4,8]
 * 
 */
class ReverseArray{
	static void reverse(int arr[]){
	int left = 0
	}

	public static void main(String[] args){
	int arr[] = {8,4,1,3,9,2,6,7};
	int num = arr.length
	}
}i

public class ReverseArray {
    public static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int i = 0;
        int j = n - 1;
        while (i < n) {
            result[j] = arr[i];
            i++;
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 3, 9, 2, 6, 7};
        int[] reversed = reverse(arr);
        System.out.print("Arr:[");
        for (int k = 0; k < reversed.length; k++) {
            System.out.print(reversed[k]);
            if (k != reversed.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}

