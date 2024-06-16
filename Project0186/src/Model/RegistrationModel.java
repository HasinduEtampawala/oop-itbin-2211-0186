package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationModel {
    private Connection conn;

    public RegistrationModel(Connection conn) {
        this.conn = conn;
    }

    public boolean insertRegistration(String fname, String lname, String email) {
        try {
            String sql = "INSERT INTO reg (fname, lname, email) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, email);
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
