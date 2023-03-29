import java.util.*;
public class App {
	public int userLogin(String user,String pwd) {
		ResourceBundle rb = new ResourceBundle.getBundle("config");
		String userName = rb.getString("username");
		String password = rb.getString("password");
		
		if(user.equals(userName) && pwd.equals(password)) {
			return 1;
		}
		else return 0;
	}
}
