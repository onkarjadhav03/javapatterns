
public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst = n;
        int nsp=-1;
		int row=1;
		
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}

            int csp=1;
            
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }

            cst=1;
           
            if(row==1){
                cst=2;
            }
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            if(row<=n){
                nst--;
                nsp+=2;
            }
            else{
                nst+=1;
                nsp-=1;
            }

           row++;
		
			System.out.println();
		}

	}

}
