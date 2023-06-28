package sas.mastermind.console.views.menus;

import sas.mastermind.core.controllers.AcceptorController;

public abstract class Command extends sas.mastermind.console.utils.Command {

    protected AcceptorController acceptorController;

    public Command(String title, AcceptorController acceptorController) {
        super(title);
        this.acceptorController = acceptorController;
    }
}