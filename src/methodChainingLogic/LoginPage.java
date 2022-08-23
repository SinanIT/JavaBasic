package methodChainingLogic;

public class LoginPage {
	
	public HomePage doLogin() {
		System.out.println("You are logged in");
		return new HomePage();
	}

}
