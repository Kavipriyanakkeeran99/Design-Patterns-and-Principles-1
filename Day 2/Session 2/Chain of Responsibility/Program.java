
public class Program {
	public static void main(String[] args) {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployee("Pavithra");
		leaveRequest.setLeaveDays(3);
		
		ILeaveRequestHandler supervisor = new Supervisor();
		ILeaveRequestHandler projectManager = new ProjectManager();
		ILeaveRequestHandler hr = new HR();
		
		supervisor.nextHandler(projectManager);
		projectManager.nextHandler(hr);
		
		supervisor.HandleRequest(leaveRequest);
		
		leaveRequest.setLeaveDays(5);
		supervisor.HandleRequest(leaveRequest);
		
		leaveRequest.setLeaveDays(15);
		supervisor.HandleRequest(leaveRequest);
		
		
	}

}
