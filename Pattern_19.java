
public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst = 2*n/2;
        int nsp=-1;
		int row=1;
		
		while(row<=2*n-1) {
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
            if(row==1||row==n||row==2*n-1)
                cst=2;  
            
            
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            if(row<2*n/2){
                nst--;
                nsp+=2;
            }
            else{
                nst+=1;
                nsp-=2;
            }
            row++;
		
			System.out.println();
		}
	}

}
