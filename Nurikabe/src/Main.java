
public class Main {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{20,20,1,20,3},
				{20,20,20,20,20},
				{20,20,20,20,20},
				{20,20,20,20,20},
				{6,20,3,20,20},
				};
		int[][] p = new int[5][5];
		
		//
		
		// magic 
		for (int i = 0; i < arr.length; i++) {
			  
            
            for (int j = 0; j < arr[i].length; j++) { 
                if(arr[i][j] !=20) {
            	p[i][j] =  arr[i][j];
            }
                }
            
        }
		// magic ends
		
		print(p);
		int[][] res = markBlacks(p, arr);
		System.out.println("==============");
		print(res);
		
		////////
		
		// separating closest
		
		for(int i =0;i< res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				if(p[i][j] !=0 && p[i][j] != 20 ) {
					
						if(i==0)
						
						if(p[i+1][j+1] ==0 ) { p[i+1][j+1] = 20; }
						
						if(p[i-1][j-1] ==0 ) { p[i-1][j-1] = 20; }
						
						if(p[i-1][j+1] ==0 ) { p[i+1][j+1] = 20; }
						
						if(p[i+1][j-1] ==0 ) { p[i+1][j+1] = 20; }
				
					
				}
					
					
						
					}
					
					
				}
			}
			
			
		
		}
		
		////////
		
		
	}
	
	
	static int[][] markBlacks(int[][] p, int[][] arr ) {
		
		for(int i =0;i< p.length; i++) {
			for(int j=0;j<p.length;j++) {
				if(arr[i][j] == 1) {
					
					if(i==0) {
						p[i][j+1] = 20;
						if(j>0) {// not the first col
							p[i][j-1]=20;
						}
						p[i+1][j]=20;
						
					}
					if(i==p.length-1) {
						p[i][j+1] = 20;
						if(j>0) {// not the first col
							p[i][j-1]=20;
						}
						p[i-1][j]=20;
					}
					
				}
				
			}
		}
		return p;
	}
	
	
	
	
	public static void print(int mat[][]) 
    { 
         
        for (int i = 0; i < mat.length; i++) {
  
             
            for (int j = 0; j < mat[i].length; j++) { 
                System.out.print(mat[i][j] + " "); 
            }
            System.out.println("");
        }
    
    } 
	
  
}

