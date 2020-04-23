
public class Main {
	public static void main(String[] args) {
		int[] ar = {1,2,1,2,1,3,2};
		int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int l = ar.length;
		//System.out.println("Number of pairs: "+sockMerchant(l, arr));
		String s = "UDDDUDUU";
		int lenS = s.length();
		System.out.println("Counting vallys: "+countingValleys(lenS, s));
		
	}
	
	
	
	static int sockMerchant(int n, int[] ar) {
		int max =0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > max) {
				max =ar[i];
			}
		}
		int[] freq= new int[max+1];
		
        for (int i=0;i<ar.length; i++){
            freq[ar[i]]++ ;
        }
        System.out.print("Freq ARRay: \n");
        for (int i : freq) {
        	
        	System.out.print(" "+i);
        }
        System.out.println("//");
        
        int countPairs=0;
        for (int j=0; j<freq.length ; j++){
            if(freq[j] > 1){
            	System.out.println("ff "+freq[j]);
            	int c = freq[j]/2;
            	System.out.println("modulo: "+c);
            	
            countPairs = countPairs + c;
           System.out.println(countPairs);
        }
    }
		
		
		
		
		
		return countPairs;
	}
	
	static int countingValleys(int n, String s) {

	        int c=0;
	        int countValleys =-1;
	        for(int i =0;i<s.length();i++){
	            if(s.charAt(i) == 'U'){
	                c=c+1;
	            }
	            if(s.charAt(i) == 'D'){
	                c=c-1;
	            }
	            if(c == 0){
	                countValleys++;
	            }
	    
	        
	        }
	        return countValleys;
	   }
}
