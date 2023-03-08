package ro.ase.acs.sql.main;

import ro.ase.acs.sql.Interfaces.Creator;
import ro.ase.acs.sql.Interfaces.Insertor;
import ro.ase.acs.sql.Interfaces.Reader;
import ro.ase.acs.sql.classes.TableCreator;
import ro.ase.acs.sql.classes.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            connection.setAutoCommit(false);

            Creator tableCreator=new TableCreator();
            tableCreator.createTable(connection);
            Insertor dataInsertor=new DataInsertor();
            dataInsertor.insertData(connection);
            Reader dataReader=new DataReader();
            dataReader.readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}