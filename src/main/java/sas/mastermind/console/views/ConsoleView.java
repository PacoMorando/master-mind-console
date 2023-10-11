package sas.mastermind.console.views;

import sas.mastermind.core.controllers.*;
import sas.mastermind.core.views.View;

public class ConsoleView extends View {
    private final StartView startView;
    private final PlayView playView;
    private final SaveView saveView;
    private final ResumeView resumeView;

    public ConsoleView() {
        this.startView = new StartView();
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
        this.saveView = new SaveView();
    }

    @Override
    public void visit(StartController startController) {
        this.startView.interact(startController);
    }

    @Override
    public void visit(PlayController playController) {
        this.playView.interact(playController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }

    @Override
    public void visit(SaveController saveController) {
        this.saveView.interact(saveController);
    }
}