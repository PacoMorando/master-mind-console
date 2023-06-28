package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.StartController;
import sas.mastermind.console.utils.Menu;

public class StartMenu extends Menu {
    public StartMenu(StartController startController) {
        this.addCommand(new NewGameCommand(startController));
        this.addCommand(new OpenGameCommand(startController));
    }
}