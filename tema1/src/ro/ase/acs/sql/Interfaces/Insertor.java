package ro.ase.acs.sql.Interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface Insertor {
    public void insertData(Connection connection) throws SQLException;
}
