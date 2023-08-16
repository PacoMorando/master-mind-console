package sas.mastermind.console.views.models;

import sas.mastermind.core.controllers.PlayController;
import sas.mastermind.core.models.ProposedCombination;
import sas.mastermind.console.utils.Console;

public class ResultView {
    PlayController playController;

    public ResultView(PlayController playController) {
        this.playController = playController;
    }

    public void showProposedCombinationsResults() {
        for (int i = 0; i < playController.getCurrentAttempt(); i++) {
            this.showResult(this.playController.getProposeCombinations().get(i));
        }
    }

    public void showResult(ProposedCombination proposedCombination) {
        Console.instance().writeln(proposedCombination.toString() + " <--- "
                + playController.calculateBlacks(proposedCombination) + " Blacks, "
                + playController.calculateWhites(proposedCombination) + " Whites");
    }
}