package org.her.util;

import org.her.Main;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionSQL {
    private String URL, USR, PASS;

    /**
     * Crea una conexión con la base de datos.
     */
    public ConnectionSQL() {
        llenaDatos();
    }

    public Connection connectionON() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USR, PASS);
        } catch(ClassNotFoundException e){
            throw new SQLException("Driver no encontraso.", e);
        }
    }

    /**
     * Obtiene los datos de ingreso para la base de datos y los llena.
     */
    private void llenaDatos(){
        Properties prop = new Properties();
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("No se pudo encontrar el archivo config.properties");
                return;
            }
            prop.load(input);
            URL = prop.getProperty("DB.URL");
            USR = prop.getProperty("DB.USER");
            PASS = prop.getProperty("DB.PASS");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
