/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EDWARD
 */
public class Conexion {
    public static Connection Cadena() throws ClassNotFoundException, SQLException
    {
        //nombre del controlador
        Class.forName("com.mysql.jdbc.Driver");
        //url de la conexion, le agregamos usuario y contraseña
        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnissei","root","1234");
        return cn;
    }
}
