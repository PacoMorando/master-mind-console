package sas.mastermind.console;

import sas.mastermind.console.views.models.ConsoleView;
import sas.mastermind.core.MasterMind;
import sas.mastermind.core.controllers.Logic;
import sas.mastermind.core.controllers.implementation.LogicImplementation;
import sas.mastermind.core.models.DAO.SessionImplementationDAO;
import sas.mastermind.core.views.View;

public class ConsoleMasterMind extends MasterMind {
    @Override
    protected Logic createLogic() {
        return new LogicImplementation(new SessionImplementationDAO());
    }

    @Override
    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new ConsoleMasterMind().play();
    }
}