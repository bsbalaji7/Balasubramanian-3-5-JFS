package Pattern2;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 2*n; j++) {
                if(j == i || j == 2*n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}

}
