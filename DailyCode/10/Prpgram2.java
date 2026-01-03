// Q. 1(a
/*
 * Given a Character array(Lower case)
 * Return the count of pair(i,j) such that,
 *
 *  a)i<j
 *  b) arr[i] = 'a'
 *     arr[j] = 'g'
 * Arr : [a,b,e,g,a,g]
 * Output: 3
 *
 * Arr:[a,a,a,g,g,g]
 * Output: 9
 *
 */
class PairCount{

	public static void main(String[] args){
	
		int count=0;
		int itr=0;
		char arr[] = new char[]{'a','b','e','g','a','g'};
		for(int i=0;i<arr.length;i++){
		 
		     if(arr[i] =='a'){
		     	     for(int j=i+1;j<arr.length;j++){
		    
		         	itr++;
		                if(arr[j] == 'g'){
		             count++;
		     }
			     }
		    }
		}
		System.out.println(count);
		System.out.println(itr);
	}
}
