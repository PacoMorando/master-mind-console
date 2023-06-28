package sas.mastermind.console.utils;


import java.util.ArrayList;

public abstract class Menu {
    private static final String OPTION = "----- Choose one option -----";

    private final ArrayList<Command> commandList;

    public Menu() {
        this.commandList = new ArrayList<>();
    }

    public void execute() {
        ArrayList<Command> commands = this.getActiveCommands();
        assert commands.size() > 0;
        int option;
        boolean error;
        do {
            error = false;
            Console.instance().writeln(Menu.OPTION);
            for (int i = 0; i < commands.size(); i++) {
                Console.instance().writeln((i + 1) + ") " + commands.get(i).getTitle());
            }
            option = Console.instance().readInt() - 1;
            if (!new ClosedInterval(0, commands.size() - 1).isIncluded(option)) {
                error = true;
            }
        } while (error);
        commands.get(option).execute();
    }

    private ArrayList<Command> getActiveCommands() {
        ArrayList<Command> commands = new ArrayList<>();
        for (int i = 0; i < this.commandList.size(); i++) {
            if (this.commandList.get(i).isActive()) {
                commands.add(this.commandList.get(i));
            }
        }
        return commands;
    }

    protected void addCommand(Command command) {
        this.commandList.add(command);
    }
}
