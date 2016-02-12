/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodato;
import entidades.Socio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author EDWARD
 */
public class ADNSocio {
    
    
    private static boolean Nuevo(Socio item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="insert into socio values(null,?,?,?,?,?,?,?,?,?,?,?,?);";
        try (Connection cn= Conexion.Cadena();
            PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,item.getIddistrito());
            ps.setString(2,item.getNombre());
            ps.setString(3,item.getApellido());
            ps.setString(4,item.getDni());
            ps.setBoolean(5,item.isSexo());
            ps.setDate(6,(Date)item.getFechanacimiento());
            ps.setString(7,item.getTipoapoderado());
            ps.setString(8, item.getNombreapoderado());
            ps.setString(9,item.getTelefono());
            ps.setString(10,item.getCelular());
            ps.setString(11,item.getDireccion());
            ps.setBoolean(12,item.isEstado());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static boolean Actualizar(Socio item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="update socio set iddistrito=?,nombre=?,apellido=?,dni=?,sexo=?,fechanacimiento=?,"
                + "tipoapoderado=?,nombreapoderado=?,telefono=?,celular=?,direccion=?,estado=?"
                + " where id=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,item.getIddistrito());
            ps.setString(2,item.getNombre());
            ps.setString(3,item.getApellido());
            ps.setString(4,item.getDni());
            ps.setBoolean(5,item.isSexo());
            ps.setDate(6,(Date)item.getFechanacimiento());
            ps.setString(7,item.getTipoapoderado());
            ps.setString(8,item.getNombreapoderado());
            ps.setString(9,item.getTelefono());
            ps.setString(10,item.getCelular());
            ps.setString(11,item.getDireccion());
            ps.setBoolean(12,item.isEstado());
            ps.setInt(13,item.getId());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static boolean Existe(Socio item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        //aca habia un problema
        String sql="select ifnull(count(id),0) from socio where id=?";
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
    private static boolean DarBaja(Socio item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        String sql="delete from socio where id=?";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setInt(1,item.getId());
            r=ps.executeUpdate();
        }
        return r==1?true:false;
    }
    private static LinkedList<Socio> Lista(Socio item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        LinkedList<Socio> Lista = new LinkedList<>();
  
        String sql="select * from socio where apellido like concat(?,'%')";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setString(1,item.getApellido());
            try (ResultSet rs= ps.executeQuery()){
               while(rs.next())
               {
                   Lista.add(new Socio(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getBoolean(13)));
               }
            }
        }
        return Lista;
    }
    private static LinkedList<Socio> Lista2(Socio item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        LinkedList<Socio> Lista = new LinkedList<>();
        String sql="select * from socio where apellido like concat(?,'%') and id not in (select idsocio from inscripcion)";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setString(1,item.getApellido());
            try (ResultSet rs= ps.executeQuery()){
               while(rs.next())
               {
                   Lista.add(new Socio(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getBoolean(13)));
               }
            }
        }
        return Lista;
    }
    private static LinkedList<Socio> Lista3(Socio item) throws ClassNotFoundException, SQLException
    {
        int r=0;
        LinkedList<Socio> Lista = new LinkedList<>();
        String sql="select * from socio where apellido like concat(?,'%') and id in (select idsocio from inscripcion)";
        try (Connection cn= Conexion.Cadena();
                PreparedStatement ps= cn.prepareStatement(sql)){
            ps.setString(1,item.getApellido());
            try (ResultSet rs= ps.executeQuery()){
               while(rs.next())
               {
                   Lista.add(new Socio(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getBoolean(13)));
               }
            }
        }
        return Lista;
    }
    public static boolean Guardar(Socio item) throws ClassNotFoundException, SQLException
    {
        if (Existe(item)) {
            return Actualizar(item);
        }else
        {
            return Nuevo(item);
        }
    }
    public static boolean Eliminar(Socio item) throws ClassNotFoundException, SQLException
    {
        return DarBaja(item);
    }
    public static LinkedList<Socio> ListaSocio(Socio item) throws ClassNotFoundException, SQLException
    {
        return Lista(item);
    }
    public static LinkedList<Socio> ListaSocionoInscripcion(Socio item) throws ClassNotFoundException, SQLException
    {
        return Lista2(item);
    }
    public static LinkedList<Socio> ListaSociosiInscripcion(Socio item) throws ClassNotFoundException, SQLException
    {
        return Lista3(item);
    }
}
