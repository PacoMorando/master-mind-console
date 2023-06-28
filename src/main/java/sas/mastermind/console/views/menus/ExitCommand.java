package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.PlayController;
import sas.mastermind.console.views.Message;

public class ExitCommand extends Command {

    public ExitCommand(PlayController playController) {
        super(Message.EXIT_COMMAND.toString(), playController);
    }

    @Override
    public void execute() {
        ((PlayController) this.acceptorController).next();
    }

    @Override
    public boolean isActive() {
        return true;
    }
}