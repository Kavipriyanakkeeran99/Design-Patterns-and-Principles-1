
public interface IChatMediator {
	void addUser(IUser user);
	void SendMessage(String message, IUser sender);
}
