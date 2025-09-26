class PrimeNum{

	static int countFactor(int num){
                int count =0;	
		for(int i =1;i*i<=num;i++){
		
			if(num%i==0){
			
				if(i==num/i){
					count++;
				}else{
					count=count+2;
			}
			}	
		}
		return count;
	} 
	static boolean primeCheck(int num){
	
		if(countFactor(num) == 2){
		
			return true;
		} else{
		        return false;
		}

	}
	public static void main(String[] args){
	
		System.out.println(primeCheck(13));
		System.out.println(primeCheck(15));
		System.out.println(primeCheck(13));

	}
}

