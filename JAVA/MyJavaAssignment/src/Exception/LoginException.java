package Exception;

class InvaildUserNameException extends Exception{
	InvaildUserNameException(String msg){
		super(msg);
	}
}

class InvaildPasswordException extends Exception{
	InvaildPasswordException(String msg){
		super(msg);
	}
}

public class LoginException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String crtUserName = "Leo";
		String crtPassWord = "1234";
		
		String UserName = "leo";
		String Password = "1243";
		
		int attempts = 0;
		
		
		while(attempts < 3) {
		try {
			if (!UserName.equals(crtUserName)) {
                throw new InvaildUserNameException("Invalid Username");
            }

            if (!Password.equals(crtPassWord)) {
                throw new InvaildPasswordException("Invalid Password");
            }

            System.out.println("Login Successful!");
            break;

        } catch (InvaildUserNameException | InvaildPasswordException e) {
            attempts++;
            System.out.println(e.getMessage());
            System.out.println("Attempts left: " + (3 - attempts));
        }
	}


    if (attempts == 3) {
        System.out.println("Account locked! Program terminated.");
    }

	}


}
