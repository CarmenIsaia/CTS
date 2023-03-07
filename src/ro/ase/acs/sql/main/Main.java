package ro.ase.acs.sql.main;

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

            TableCreator tableCreator=new TableCreator();
            tableCreator.createTable(connection);
            DataInsertor dataInsertor=new DataInsertor();
            dataInsertor.insertData(connection);
            DataReader dataReader=new DataReader();
            dataReader.readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}