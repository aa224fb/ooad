package BlackJack.view;

public interface IView
{
  void DisplayWelcomeMessage();
  
  int GetInput();
  
  void DisplayCard(BlackJack.model.Card a_card);
  
  void DisplayPlayerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  
  void DisplayDealerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  
  void DisplayGameOver(boolean a_dealerIsWinner);
  
  boolean isNewGame(int input);
  
  boolean isHit(int input);
  
  boolean isStand(int input);
  
  boolean isQuit(int input);
}