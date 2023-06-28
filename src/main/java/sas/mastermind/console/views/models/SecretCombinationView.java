package sas.mastermind.console.views.models;

import sas.mastermind.core.models.Combination;
import sas.mastermind.core.models.SecretCombination;
import sas.mastermind.console.utils.Console;

public class SecretCombinationView {

    private final SecretCombination secretCombination;

    public SecretCombinationView(SecretCombination secretCombination) {
        this.secretCombination = secretCombination;
    }

    public void showUnrevealed() {
        for (int i = 0; i < Combination.MAX_COLORS_NUM; i++) {
            Console.instance().write("*");
        }
        Console.instance().writeln("");
    }

    public void showRevealed() {
        Console.instance().write(this.secretCombination.toString());
    }
}