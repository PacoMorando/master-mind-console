package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.StartController;
import sas.mastermind.console.views.Message;

public class OpenGameCommand extends Command {
    public OpenGameCommand(StartController startController) {
        super(Message.OPEN_GAME_COMMAND.toString(), startController);
    }

    @Override
    public void execute() {
        new GameSelectMenu((StartController) this.acceptorController).execute();
    }

    @Override
    public boolean isActive() {
        return true;
    }
}