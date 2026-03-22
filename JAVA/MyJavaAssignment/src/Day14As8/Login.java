package Day14As8;

class LoginSystem {

    //Username and Password
    void login(String username, String password) {
        System.out.println("Login using Username & Password");
        System.out.println("Username: " + username);
    }

    //Email and Password
    void login(String email, String password, boolean isEmail) {
        System.out.println("Login using Email & Password");
        System.out.println("Email: " + email);
    }

    //Mobile Number and OTP
    void login(long mobileNumber, int otp) {
        System.out.println("Login using Mobile Number & OTP");
        System.out.println("Mobile: " + mobileNumber);
    }
}

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginSystem ls = new LoginSystem();

        ls.login("bs_user", "1234");                 
        ls.login("bs@email.com", "abcd", true);      
        ls.login(9876543210L, 4567);      
	}

}
