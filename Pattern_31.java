
public class Pattern_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=n;
		int row=1;
		int val=n;
		int c=n;
		while(row<=n) {
		int cst=1;
		int cval=val;
        while(cst<=nst){
        	if(cst==c)
        		System.out.print("* ");
        	else 
			System.out.print(cval+" ");
			cst++;
			cval--;
		}
		row++;
		c--;											
		System.out.println();
        }
	}

}
