package sas.mastermind.console.views;

import sas.mastermind.core.controllers.PlayController;
import sas.mastermind.console.views.menus.PlayMenu;
import sas.mastermind.console.views.models.BoardView;

public class PlayView {
    public PlayView() {
    }

    public void interact(PlayController playController) {
        BoardView boardView = new BoardView();
        if (!playController.isFinished()) {
            boardView.showBoard(playController);
            new PlayMenu(playController).execute();
        } else {
            boardView.showGameResult(playController);
        }
    }
}