package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.PlayController;
import sas.mastermind.console.views.Message;

public class RedoCommand extends Command {
    public RedoCommand(PlayController playController) {
        super(Message.REDO_COMMAND.toString(), playController);
    }

    @Override
    public void execute() {
        ((PlayController) this.acceptorController).redo();
    }

    @Override
    public boolean isActive() {
        return ((PlayController) this.acceptorController).isRedoable();
    }
}