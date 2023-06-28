package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.StartController;
import sas.mastermind.console.views.Message;

public class NewGameCommand extends Command {

    public NewGameCommand(StartController startController) {
        super(Message.NEW_GAME_COMMAND.toString(), startController);
    }

    @Override
    public void execute() {
        ((StartController) this.acceptorController).start();
    }

    @Override
    public boolean isActive() {
        return true;
    }
}