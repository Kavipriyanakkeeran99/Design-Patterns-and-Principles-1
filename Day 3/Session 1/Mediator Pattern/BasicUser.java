
public class BasicUser implements IUser {
	
	private IChatMediator chatMediator;
	private String name;
	
	public BasicUser(IChatMediator chatMediator,String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}

	@Override
	public void SendMessage(String message) {
		chatMediator.SendMessage(message, this);
	}
	
	@Override
	public void ReceiveMessage(String message) {
		System.out.println(name + ", (Basic User)" + " has received a message -  " + message);
	}

}
