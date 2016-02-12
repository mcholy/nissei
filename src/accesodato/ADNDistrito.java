/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodato;

import entidades.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author EDWARD
 */
public class ADNDistrito {
    private static boolean Nuevo(Distrito item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="insert into Distrito values(null,?,?)";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setString(1,item.getNombre());
            ps.setBoolean(2,item.getEstado());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static boolean Actualizar(Distrito item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="update Distrito set nombre=? where id=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setString(1,item.getNombre());
            ps.setInt(2,item.getId());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static boolean Existe(Distrito item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="select ifnull(count( id),0) from distrito where id=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,item.getId());
            try (ResultSet rs= ps.executeQuery()){
                rs.next();
                r=rs.getInt(1);
            }
        }
        return r==1?true:false;
    }
    private static boolean DarBaja(Distrito item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="delete from distrito where id=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,item.getId());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static LinkedList<Distrito> Lista() throws ClassNotFoundException, SQLException
    {
        int r=0;
        LinkedList<Distrito> Lista = new LinkedList<>();
        String sql="select * from distrito";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            try (ResultSet rs= ps.executeQuery()){
               while(rs.next())
               {
                   Lista.add(new Distrito(rs.getInt(1), rs.getString(2), rs.getBoolean(3)));
               }
            }
        }
        return Lista;
    }
    private static LinkedList<Distrito> Combo() throws ClassNotFoundException, SQLException
    {
        int r=0;
        LinkedList<Distrito> Lista = new LinkedList<>();
        String sql="select id,nombre from distrito";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            try (ResultSet rs= ps.executeQuery()){
               while(rs.next())
               {
                   Lista.add(new Distrito(rs.getInt(1), rs.getString(2)));
               }
            }
        }
        return Lista;
    }
    private static int ObtenerId(Distrito item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="select id from distrito where nombre=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setString(1,item.getNombre());
            try (ResultSet rs= ps.executeQuery()){
                rs.next();
                r=rs.getInt(1);
            }
        }
        return r;
    }
    public static boolean Guardar(Distrito item) throws ClassNotFoundException, SQLException
    {
        if (Existe(item)) {
            return Actualizar(item);
        }else
        {
            return Nuevo(item);
        }
    }
    public static boolean Eliminar(Distrito item) throws ClassNotFoundException, SQLException
    {
        return DarBaja(item);
    }
    public static LinkedList<Distrito> ListaDistrito() throws ClassNotFoundException, SQLException
    {
       return Lista();
    }
    public static LinkedList<Distrito> CargarCombo() throws ClassNotFoundException, SQLException
    {
        return Combo();
    }
    public static int ObtenerIdDistrito(Distrito item) throws ClassNotFoundException, SQLException
    {
        return ObtenerId(item);
    }
}
