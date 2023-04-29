package functionalinterface;

@FunctionalInterface
interface Login{
	boolean authenticate(String username,String password);
}
public class Functionalinterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login = (String username, String password) -> username.contentEquals("lokesh") && password.contentEquals("padamata");
		System.out.println(login.authenticate("lokesh","padamata"));
		//System.out.println(login.authenticate("lokesh","lokesh"));

	}

}
