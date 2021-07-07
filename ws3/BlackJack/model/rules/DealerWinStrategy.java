package BlackJack.model.rules;

public class DealerWinStrategy implements IWinStrategy {

	@Override
	public boolean isDealerWinning(int dealerScore, int playerScore, int maxScore) {
		
		if (playerScore > maxScore) {
			
		      return true;
		      
		    } else if (dealerScore > maxScore) {
		    	
		      return false;
		    }
		    return dealerScore >= playerScore;
	}

}
