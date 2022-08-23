package methodChainingLogic;

public class FBScript {

	public static void main(String[] args) {
		
		LoginPage loginPage = new LoginPage();
//		loginPage.doLogin();
//		
//		HomePage homePage = new HomePage();
//		homePage.sendMessage();
//		homePage.senFriendRequest();
		
		loginPage.doLogin().senFriendRequest().sendMessage();
	
	}

}
