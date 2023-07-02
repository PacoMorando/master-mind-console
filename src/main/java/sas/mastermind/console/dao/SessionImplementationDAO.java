package sas.mastermind.console.dao;

import sas.mastermind.core.dao.SessionDAO;
import sas.mastermind.core.models.Session;

import java.io.*;

public class SessionImplementationDAO extends SessionDAO {

    public static final String EXTENSION = ".txt";
    public static final String DIRECTORY = "/home/pacomorando/FileClassTest/";
    private static File directory;
    private GameDAO gameDAO;

    static {
        SessionImplementationDAO.directory = new File(SessionImplementationDAO.DIRECTORY);
    }

    @Override
    public void associate(Session session) {
        super.associate(session);
        this.gameDAO = new GameDAO(this.sessionDTO.getSecretCombination(), this.sessionDTO.getProposeCombinations());
    }

    @Override
    public void load(String name) {
        this.sessionDTO.setName(name);
        File file = new File(SessionImplementationDAO.directory, name);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            this.sessionDTO.loadGame(this.gameDAO.load(bufferedReader));
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(String name) {
        if (name.endsWith(SessionImplementationDAO.EXTENSION)) {
            name = name.replace(SessionImplementationDAO.EXTENSION, "");
        }
        File file = new File(SessionImplementationDAO.directory, name + SessionImplementationDAO.EXTENSION);
        try {
            FileWriter fileWriter = new FileWriter(file);
            this.gameDAO.save(fileWriter);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String[] getGamesNames() {
        return SessionImplementationDAO.directory.list();
    }

    @Override
    public boolean exist(String name) {
        for (String auxName : this.getGamesNames()) {
            if (auxName.equals(name + SessionImplementationDAO.EXTENSION)) {
                return true;
            }
        }
        return false;
    }
}