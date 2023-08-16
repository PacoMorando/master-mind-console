package sas.mastermind.console.views;

import sas.mastermind.core.controllers.ResumeController;
import sas.mastermind.console.utils.YesNoDialog;
import sas.mastermind.console.views.Message;

public class ResumeView {

    public void interact(ResumeController resumeController) {
        resumeController.resume(new YesNoDialog().read(Message.RESUME.toString()));
    }
}