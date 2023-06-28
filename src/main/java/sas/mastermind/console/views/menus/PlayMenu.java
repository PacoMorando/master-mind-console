package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.PlayController;
import sas.mastermind.console.utils.Menu;

public class PlayMenu extends Menu {
    public PlayMenu(PlayController playController) {
        this.addCommand(new ProposeCommand(playController));
        this.addCommand(new UndoCommand(playController));
        this.addCommand(new RedoCommand(playController));
        this.addCommand(new ExitCommand(playController));
    }
}