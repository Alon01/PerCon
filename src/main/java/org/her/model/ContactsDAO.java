package org.her.model;

import org.her.util.ConnectionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactsDAO {
    private final ConnectionSQL consql;

    public ContactsDAO(){
        this.consql = new ConnectionSQL();
    }

    /**
     * Recibe datos y los usa para agregarlos a la db.
     * @param contacto  Recibe parametro de tipo contacto con los datos a agregar.
     * @return  Devuelve un booleano con la
     */
    public boolean newContact(Contacts contacto) {
        String sql = "INSERT INTO alonso.contacts (fName, lName, pNumber) VALUES (?, ?, ?)";
        try (Connection conn = consql.connectionON();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, contacto.getfName());
            pstmt.setString(2, contacto.getlName());
            pstmt.setString(3, contacto.getpNumber());
            return pstmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
