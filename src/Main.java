
public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager();
		
		User kerimCan=userManager.addUser(1, "Kerim", "Can","1994", "00000000000001");

		System.out.println(kerimCan.getUserName());
		userManager.updateUser(kerimCan,"Umur");
		System.out.println(kerimCan.getFirstName());
		
		GamesManager gameManager=new GamesManager();
		Games halfLife = gameManager.addGame(1,"Half-life","Valve",10);
		Games counter = gameManager.addGame(2,"Counter","counter",10);
		Games fifa = gameManager.addGame(3,"FIFA","EA Games",15);
		
		
		userManager.buyGame(kerimCan,halfLife);
		userManager.buyGame(kerimCan,counter);
		userManager.buyGame(kerimCan,fifa);
		
		for(Games a:kerimCan.getGames()) {
			
			System.out.println(a.getName());
			}
		
		gameManager.addCampaign(counter, "%10 indirim");
		gameManager.updateCampaign(counter, "%20 indirim");
		gameManager.deleteCampaign(counter);
		
		
	}
}
