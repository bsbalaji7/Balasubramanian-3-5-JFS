package Pattern2;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;

        for(int i = 1; i <= 2*n-1; i++) {

            int row = (i <= n) ? i : 2*n - i;

            for(int s = 1; s <= n - row; s++)
                System.out.print(" ");

            for(int j = 1; j <= 2*row - 1; j++) {
                if(j == 1 || j == 2*row - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
	}

}
