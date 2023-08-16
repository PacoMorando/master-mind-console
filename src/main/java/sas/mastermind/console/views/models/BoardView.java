package sas.mastermind.console.views.models;

import sas.mastermind.core.controllers.PlayController;
import sas.mastermind.console.views.Message;

public class BoardView {

    public void showBoard(PlayController playController) {
        Message.ATTEMPT_TITLE.write(String.valueOf(playController.getCurrentAttempt()));
        new SecretCombinationView(playController.getSecretCombination()).showUnrevealed();
        new ResultView(playController).showProposedCombinationsResults();
    }

    public void showGameResult(PlayController playController) {
        if (playController.isWinner()) {
            Message.WINNER.write();
        } else {
            new SecretCombinationView(playController.getSecretCombination()).showRevealed();
            Message.ANSWER.write();
            Message.LOSER.write();
        }
        playController.next();
    }
}