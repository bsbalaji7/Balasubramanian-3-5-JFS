package Pattern2;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int n = 6;

		        for(int i = 1; i <= n; i++) {
		            for(int j = 1; j <= n; j++) {
		                if(i <= 2 || i > n-2 || j <= 2 || j > n-2)
		                    System.out.print("* ");
		                else
		                    System.out.print("  ");
		            }
		            System.out.println();
		        }
	}

}
