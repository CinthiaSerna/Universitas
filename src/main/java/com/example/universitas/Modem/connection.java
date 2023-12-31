package com.example.universitas.Modem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class connection {
    // Librería de MySQL
    public String driver = "com.mysql.jdbc.Driver"; //cadena de conexión

    // Nombre de la base de datos
    public String database = "bdces3";

    // Host
    public String hostname = "localhost";

    // Puerto
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "";

    private Connection conn= null;
    public connection(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
