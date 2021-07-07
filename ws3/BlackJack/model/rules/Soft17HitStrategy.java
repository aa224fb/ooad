package BlackJack.model.rules;

import BlackJack.model.Card;
import BlackJack.model.Player;

public class Soft17HitStrategy implements IHitStrategy {
	
    private final int g_hitLimit = 17;

	@Override
	public boolean DoHit(Player a_dealer) {
		
		int score = a_dealer.CalcScore();
		
		//Check for soft 17 - ace = 11. Ex. ace + 3 + 3, when dealer has 17
		//Only one ace in hand
		if(score == g_hitLimit) {
			
			for(Card c : a_dealer.GetHand()) {
				
				//Ace + 6
				if(c.GetValue() == Card.Value.Ace && score - 11 == 6 ) {
					
					return true;
				}
			}	
		}
		return a_dealer.CalcScore() < g_hitLimit;  
	}
}
