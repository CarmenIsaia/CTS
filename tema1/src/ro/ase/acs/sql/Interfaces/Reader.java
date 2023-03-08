package ro.ase.acs.sql.Interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface Reader {
    public void readData(Connection connection) throws SQLException;
}
