
public class GamesManager {
	public Games addGame(int id, String name, String producer, double price) {
		Games game =new Games();
		game.setId(id);
		game.setName(name);
		game.setProducer(producer);
		game.setPrice(price);
		
		System.out.println("Game Added");
		
		return game;
	}
	
	public void addCampaign(Games game, String campaign) {
		
		game.setCampaign(campaign);
		
		System.out.println("Campaign Added");
		
	}	
	public void updateCampaign(Games game, String campaign) {
		
		game.setCampaign(campaign);
		
		System.out.println("Campaign updated");
		
	}
	public void deleteCampaign(Games game) {
		
		game.setCampaign("");
		
		System.out.println("Campaign deleted");
		
	}
	
	
	
	
}
