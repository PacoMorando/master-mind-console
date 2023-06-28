package sas.mastermind.console.utils;

public class YesNoDialog {
    private static final char AFFIRMATIVE = 'y';

    private static final char NEGATIVE = 'n';

    private static final String QUESTION = "? ("+YesNoDialog.AFFIRMATIVE +"/"+YesNoDialog.NEGATIVE+"): ";

    private static final String MESSAGE = "The value must be '" + YesNoDialog.AFFIRMATIVE + "' or '"
            + YesNoDialog.NEGATIVE + "'";

    public boolean read(String title) {
        assert title != null;
        char answer;
        boolean ok;
        do {
            answer = Console.instance().readChar(title + YesNoDialog.QUESTION);
            ok = YesNoDialog.isAffirmative(answer) || YesNoDialog.isNegative(answer);
            if (!ok) {
                Console.instance().writeln(YesNoDialog.MESSAGE);
            }
        } while (!ok);
        return YesNoDialog.isAffirmative(answer);
    }

    private static boolean isAffirmative(char answer) {
        return Character.toLowerCase(answer) == YesNoDialog.AFFIRMATIVE;
    }

    private static boolean isNegative(char answer) {
        return Character.toLowerCase(answer) == YesNoDialog.NEGATIVE;
    }
}
