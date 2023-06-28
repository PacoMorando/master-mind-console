package sas.mastermind.console.views.menus;

import sas.mastermind.core.models.Colors;
import sas.mastermind.core.models.Combination;
import sas.mastermind.console.utils.Console;
import sas.mastermind.console.views.Message;

public class ProposedCombinationView {

    public String colorsProposed() {
        return this.readProposedCombination();
    }

    private String readProposedCombination() {
        String answer;
        do {
            answer = Console.instance().readString(Message.PROPOSE_COMBINATION.toString());
        } while (!this.validateProposedCombination(answer));
        return answer;
    }

    private boolean validateProposedCombination(String answer) {
        if (answer.length() != Combination.MAX_COLORS_NUM) {
            Message.PROPOSED_LENGTH_ERROR.write();
            return false;
        }
        if (!this.validateColor(answer)) {
            Message.PROPOSED_COLORS_ERROR.write(Colors.POSSIBLE_COLORS);
            return false;
        }
        return true;
    }

    private boolean validateColor(String answer) {
        String validColors = Colors.POSSIBLE_COLORS;
        int isValid = 0;
        for (int i = 0; i < answer.length(); i++) {
            for (int j = 0; j < validColors.length(); j++) {
                if (answer.charAt(i) == validColors.charAt(j)) {
                    isValid++;
                    break; // cambiar por un while o por un return
                }
            }
        }
        return isValid == Combination.MAX_COLORS_NUM;
    }
}