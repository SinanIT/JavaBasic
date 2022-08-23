package methodChainingLogic;

public class HomePage {
	
	
	public HomePage senFriendRequest() {
		System.out.println("Sent friend Request");
		return this;
	}

	public HomePage sendMessage() {
		System.out.println("Meesage sent");
		return this;
	}
}
