package BlackJack.controller;

import BlackJack.view.IView;
import BlackJack.model.Game;
import BlackJack.model.IObserver;

public class PlayGame implements IObserver {
	
	private Game a_game;
	private IView a_view;
	
	//Constructor
	public PlayGame(Game a_game, IView a_view) {
		 this.a_game = a_game;
		 this.a_view = a_view;
		 a_game.Observe(this);
	}

	public boolean Play() {
		a_view.DisplayWelcomeMessage();
		
		if (a_game.IsGameOver()) {
			
			a_view.DisplayGameOver(a_game.IsDealerWinner());
		}
		
		int input = a_view.GetInput();
		    
		//Remove p, h, s and q
		if (a_view.isNewGame(input) == true ) {
			
			a_game.NewGame();
		}
		else if (a_view.isHit(input) == true) {
			
		    a_game.Hit();
		}
		else if (a_view.isStand(input) == true) {
			
			a_game.Stand();
		}
		else if(a_view.isQuit(input) == true) {
			
		    return false;
		}   
		return true;
	  }

	@Override
	public void NewCardHanded() {
		
		a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
		a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());
		
		//Thread sleep
		try {
			
			Thread.sleep(2000);
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}