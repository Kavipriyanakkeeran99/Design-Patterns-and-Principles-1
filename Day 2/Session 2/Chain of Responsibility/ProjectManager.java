
public class ProjectManager implements ILeaveRequestHandler {
	ILeaveRequestHandler nextHandler;
	
	@Override
	public void nextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
		
	}
	
	@Override
	public void HandleRequest(LeaveRequest leaveDays) {
		if(leaveDays.getLeaveDays() <= 5) {
			System.out.println(leaveDays.getLeaveDays() + " days leave request for " 
		            + leaveDays.getEmployee() + " has been approved by Project Manager");
			
		} else {
			nextHandler.HandleRequest(leaveDays);
		}
	}

}
