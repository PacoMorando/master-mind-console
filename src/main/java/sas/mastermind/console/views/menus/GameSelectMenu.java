package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.StartController;
import sas.mastermind.console.utils.Menu;

public class GameSelectMenu extends Menu {

    public GameSelectMenu(StartController startController) {
        String[] gamesNames = startController.getGamesNames();
        for (String title : gamesNames) {
            this.addCommand(new GameSelectCommand(title, startController));
        }
    }
}