
public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst = n;
        int nsp=0;
		int row=1;
		
		while(row<=n) {
            int csp=1;
            while(csp<=nsp){
                System.out.print("  ");
				csp++;
            }
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
            row++;
			nst--;
            nsp++;
			System.out.println();
		}

	}

}
