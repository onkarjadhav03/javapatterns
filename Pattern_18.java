
public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=7;
			int nst = 1;
	        int nsp=n-1;
			int row=1;
			int val=1;
			
			while(row<=n) {
	            int csp=1;
	            while(csp<=nsp){
	                System.out.print("    ");
					csp++;
	            }
	            int cval=val;
				int cst=1;
				while(cst<=nst) {
					System.out.print(cval+" ");
					cst++;
					
				}
	            if(row<=n/2){
	                nst+=4;
	                nsp--;
	                val++;
	            }
	            else{
	                nst-=4;
	                nsp++;
	                val--;
	            }
	            row++;
				
	          
				System.out.println();
			}
		
	}
}
