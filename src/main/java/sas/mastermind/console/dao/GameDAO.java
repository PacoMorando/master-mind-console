package sas.mastermind.console.dao;

import sas.mastermind.core.models.Game;
import sas.mastermind.core.models.ProposedCombination;
import sas.mastermind.core.models.SecretCombination;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class GameDAO {

    private final SecretCombinationDAO secretCombinationDAO;
    private final ProposedCombinationDAO proposedCombinationsDAO;

    public GameDAO(SecretCombination secretCombination, ArrayList<ProposedCombination> proposedCombinations) {
        this.secretCombinationDAO = new SecretCombinationDAO(secretCombination);
        this.proposedCombinationsDAO = new ProposedCombinationDAO(proposedCombinations);
    }

    public void save(FileWriter fileWriter) {
        this.secretCombinationDAO.save(fileWriter);
        this.proposedCombinationsDAO.save(fileWriter);
    }

    public Game load(BufferedReader bufferedReader) {
        return new Game(this.secretCombinationDAO.load(bufferedReader), this.proposedCombinationsDAO.load(bufferedReader));
    }
}