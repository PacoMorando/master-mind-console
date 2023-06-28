package sas.mastermind.console.views;

import sas.mastermind.console.utils.Console;

public enum Message {
    TITLE("--- MASTER MIND ---"),
    ATTEMPT_TITLE("Attempt: "),
    PROPOSE_COMBINATION("Propose a combination:"),
    PROPOSED_LENGTH_ERROR("Wrong proposed combination length"),
    PROPOSED_COLORS_ERROR("Wrong colors, they must be: "),
    WINNER("You've won!!! ;-)"),
    LOSER("You've lost!!! :-("),
    ANSWER(" Was the secret combination"),
    RESUME("Do you want to continue "),
    PLAY_COMMAND("Propose combination"),
    UNDO_COMMAND("Undo"),
    REDO_COMMAND("Redo"),
    NEW_GAME_COMMAND("New Game"),
    OPEN_GAME_COMMAND("Open a saved game"),
    EXIT_COMMAND("Exit"),
    SAVE("Do you want to save?"),
    NAME("Name: "),
    ALREADY_EXIST("The proposed name already exists");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public void write() {
        Console.instance().writeln(this.message);
    }

    public void write(String s) {
        Console.instance().writeln(this.message + s);
    }

    @Override
    public String toString() {
        return this.message;
    }
}
