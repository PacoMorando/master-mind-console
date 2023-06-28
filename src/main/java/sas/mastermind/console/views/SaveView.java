package sas.mastermind.console.views;

import sas.mastermind.core.controllers.SaveController;
import sas.mastermind.console.utils.Console;
import sas.mastermind.console.utils.YesNoDialog;

public class SaveView {

    public void interact(SaveController saveController) {
        String name;
        if (new YesNoDialog().read(Message.SAVE.toString())) {
            if (saveController.hasName()) {
                saveController.save();
            } else {
                boolean exists;
                do {
                    name = Console.instance().readString(Message.NAME.toString());
                    exists = saveController.exists(name);
                    if (exists) {
                        Console.instance().writeln(Message.ALREADY_EXIST.toString());
                    }
                } while (exists);
                saveController.save(name);
            }
        }
        saveController.next();
    }
}