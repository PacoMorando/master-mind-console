package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.StartController;
import sas.mastermind.console.utils.Console;

public class GameSelectCommand extends Command {

    public GameSelectCommand(String title, StartController startController) {
        super(title, startController);
    }

    @Override
    public void execute() {
        Console.instance().writeln(this.title);
        ((StartController) this.acceptorController).start(this.title);
    }

    @Override
    public boolean isActive() {
        return true;
    }
}