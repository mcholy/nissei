/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodato;


import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author EDWARD
 */
public class ADNUsuario {
    private static boolean Nuevo(Usuario item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="insert into usuario values(null,?,?,?,?,true)";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setString(1,item.getNombre());
            ps.setString(2,item.getContrasenia());
            ps.setString(3,item.getDni());
            ps.setString(4,item.getTipo());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static boolean Actualizar(Usuario item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="update usuario set nombre=?,contrasenia=?,dni=?, tipo=? where id=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setString(1,item.getNombre());
            ps.setString(2,item.getContrasenia());
            ps.setString(3,item.getDni());
            ps.setString(4,item.getTipo());
            ps.setInt(5,item.getId());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static boolean Existe(Usuario item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="select ifnull(count(id),0) from usuario where id=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,item.getId());
            try (ResultSet rs= ps.executeQuery()){
                rs.next();
                r=rs.getInt(1);
            }
        }
        return r>0?true:false;
    }
    private static boolean DarBaja(Usuario item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="delete from usuario where id=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,item.getId());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static LinkedList<Usuario> Lista() throws ClassNotFoundException, SQLException
    {
        int r=0;
        LinkedList<Usuario> Lista = new LinkedList<>();
        String sql="select * from usuario";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            try (ResultSet rs= ps.executeQuery()){
               while(rs.next())
               {
                   Lista.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getBoolean(6)));
               }
            }
        }
        return Lista;
    }
    private static int Ingreso(Usuario item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="select ifnull(count(id),0) from usuario where nombre=? and contrasenia=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setString(1,item.getNombre());
            ps.setString(2,item.getContrasenia());
            try (ResultSet rs= ps.executeQuery()){
                rs.next();
                r=rs.getInt(1);
            }
        }
        return r;
    }
    public static boolean Guardar(Usuario item) throws ClassNotFoundException, SQLException
    {
        if (Existe(item)) {
            return Actualizar(item);
        }else
        {
            return Nuevo(item);
        }
    }
    public static boolean Eliminar(Usuario item) throws ClassNotFoundException, SQLException
    {
        return DarBaja(item);
    }
    
    public static LinkedList<Usuario> ListaUsuarios() throws ClassNotFoundException, SQLException
    {
        return Lista();
    }
    public static int IngresoLogin(Usuario item) throws ClassNotFoundException, SQLException
    {
        return Ingreso(item);
    }
}
