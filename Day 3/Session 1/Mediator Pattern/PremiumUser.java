
public class PremiumUser implements IUser {
	private IChatMediator chatMediator;
	private String name;

	PremiumUser(IChatMediator chatMediator, String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}
	
	@Override
	public void ReceiveMessage(String message) {
		System.out.println(name + ", (Premimum User)" + " has received a message - " + message);
	}

	@Override
	public void SendMessage(String message) {
		chatMediator.SendMessage(message,this);
	}

}
