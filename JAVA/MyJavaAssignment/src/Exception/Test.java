package Exception;

public class Test {
	 static int check() {
	        try {
	            System.out.println("Inside try");
	            return 10;
	        } finally {
	            System.out.println("Inside finally");
	            return 20;
	        }
	    }

	    public static void main(String[] args) {
	        int result = check();
	        System.out.println("Returned value: " + result);
	}

}
