import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
	private List<IUser> users;
	
	public ChatMediator() {
		users = new ArrayList<>();
	}
	
	@Override
	public void addUser(IUser user) {
		users.add(user);
	}


	@Override
	public void SendMessage(String message, IUser sender) {
		for(IUser user: users) {
			
			//sender will not receive message
			if(user != sender)
				user.ReceiveMessage(message);
		}
	}

	
	
	
}
