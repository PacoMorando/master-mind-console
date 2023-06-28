package sas.mastermind.console.views;

import sas.mastermind.core.controllers.StartController;
import sas.mastermind.console.views.menus.StartMenu;

public class StartView {

    public void interact(StartController startController) {
        Message.TITLE.write();
        new StartMenu(startController).execute();
    }
}