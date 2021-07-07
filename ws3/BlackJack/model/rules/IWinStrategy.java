package BlackJack.model.rules;

public interface IWinStrategy {

		boolean isDealerWinning(int dealerScore, int playerScore, int maxScore);
}
