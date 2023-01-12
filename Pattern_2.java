
public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst = 1;
		int row=1;
		int val=1;
		
		while(row<=n) {
			int cst=1;
			int cval=val;
			while(cst<=nst) {
				System.out.print(cval+" ");
				cst++;
				cval++;
			}
            row++;
			nst++;
			val=cval;
			System.out.println();
		}

	}

}
