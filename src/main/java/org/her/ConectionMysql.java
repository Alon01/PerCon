package org.her;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class ConectionMysql {
    String url = System.getenv("DB_URL");
            //"jdbc:mysql://localhost:3306/alonso";
    String usr = System.getenv("DB_USER");
                    //"admin";
    String pass = System.getenv("DB_PASS");
                            //"Alonso";

    /**
     * Crea una conexión con la base de datos.
     */
    ConectionMysql() {
        Connection con;
        System.out.println("Conectando..............");
        try {
            con = getConnection(url, usr, pass);
            System.out.println("Conexión establecida.");
            NewContact nc = new NewContact();
            String sql = "INSERT INTO alonso.contacts (fName, lName, pNumber) VALUES (?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nc.getfName());
            st.setString(2, nc.getlName());
            st.setLong(3, nc.getpNumber());
            int filasInsertadas = st.executeUpdate();
            if(filasInsertadas > 0) {
                System.out.println("Datos insertados correctamente!");
            }
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error, entró a catch.");
            throw new RuntimeException(e);
        } finally {
            System.out.println("Fin query.");
        }
    }


}
