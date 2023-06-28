package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.PlayController;
import sas.mastermind.console.views.Message;

public class ProposeCommand extends Command {

    private final ProposedCombinationView proposedCombinationView;

    public ProposeCommand(PlayController playController) {
        super(Message.PLAY_COMMAND.toString(), playController);
        this.proposedCombinationView = new ProposedCombinationView();
    }

    @Override
    public void execute() {
        ((PlayController) this.acceptorController).addProposedCombination(this.proposedCombinationView.colorsProposed());
    }

    @Override
    public boolean isActive() {
        return true;
    }
}