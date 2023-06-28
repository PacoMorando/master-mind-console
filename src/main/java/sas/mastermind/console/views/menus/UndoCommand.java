package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.PlayController;
import sas.mastermind.console.views.Message;

public class UndoCommand extends Command {
    public UndoCommand(PlayController playController) {
        super(Message.UNDO_COMMAND.toString(), playController);
    }

    @Override
    public void execute() {
        ((PlayController) this.acceptorController).undo();
    }

    @Override
    public boolean isActive() {
        return ((PlayController) this.acceptorController).isUndoable();
    }
}