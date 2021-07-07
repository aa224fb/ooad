package BlackJack.model.rules;

public class PlayerWinStrategy implements IWinStrategy {

	@Override
	public boolean isDealerWinning(int dealerScore, int playerScore, int maxScore) {
		
		if (dealerScore > maxScore) {
			
		      return false;
		      
		    } else if (playerScore > maxScore) {
		    	
		      return true;
		    }
		return dealerScore > playerScore;
	}
}
