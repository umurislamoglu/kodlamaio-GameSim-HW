import java.util.*;


public class UserManager {

	public User addUser(int id,String firstName, String lastName, String birthYear, String tckn) {
		
	
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setId(id);
		user.setGames(new Games[] {});
		user.setUserName();
		user.setBirthYear(birthYear);
		user.setTckn(tckn);

		System.out.println("User Added");
		
		EdevletVerifier eDevletVerifier = new EdevletVerifier();
		eDevletVerifier.verify(firstName,lastName,birthYear,tckn);
		
		return user;
	}
	
	public void deleteUser(int id) {
		//id'ye g�re kay�d� bulup silme.
		System.out.println("User deleted");
		
	}
	
	public void updateUser(User user,String firstName) {
		//user nesnesi al�narak update edilir.
		
		
		
		user.setFirstName(firstName);
		

	}
	
	public void buyGame(User user,Games game) {
	
		Games[] gamesHave = user.getGames();
		
		ArrayList<Games> gamesArrayList = new ArrayList<Games>(Arrays.asList(gamesHave));  
		gamesArrayList.add(game);  
		gamesHave = gamesArrayList.toArray(gamesHave);  
		
		user.setGames(gamesHave);
		
		
		
		for(Games a:gamesHave) {
		
		System.out.println(a.getName());
		}
		
		
		
		
	}
	
	
	
	
	
}
