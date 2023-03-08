package ro.ase.acs.sql.Interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface Creator {
    public  void createTable(Connection connection) throws SQLException;
}
