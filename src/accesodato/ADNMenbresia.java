/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodato;

import entidades.Socio;
import entidades.Menbresia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author EDWARD
 */
public class ADNMenbresia {

    private static boolean Nuevo(Menbresia item) throws ClassNotFoundException, SQLException {
        int r = 0;
        String sql = "insert into menbresia values(null,?,?,?,?,?)";
        try (Connection cn = Conexion.Cadena();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, item.getNombre());
            ps.setFloat(2, item.getInicial());
            ps.setFloat(3, item.getMensualidad());
            ps.setString(4, item.getDescripcion());
            ps.setBoolean(5,item.isEstado());
            r = ps.executeUpdate();
        }
        return r == 1 ? true : false;
    }

    private static boolean Actualizar(Menbresia item) throws ClassNotFoundException, SQLException {
        int r = 0;
        String sql = "update menbresia set nombre=?,inicial=?,mensualidad=?,descripcion=? where id=?";
        try (Connection cn = Conexion.Cadena();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, item.getNombre());
            ps.setFloat(3, item.getInicial());
            ps.setFloat(3, item.getMensualidad());
            ps.setString(1, item.getDescripcion());
            ps.setInt(4, item.getId());
            r = ps.executeUpdate();
        }
        return r == 1 ? true : false;
    }

    private static boolean Existe(Menbresia item) throws ClassNotFoundException, SQLException {
        int r = 0;
        String sql = "select ifnull(count( id),0) from menbresia where id=?";
        try (Connection cn = Conexion.Cadena();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, item.getId());
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                r = rs.getInt(1);
            }
        }
        return r == 1 ? true : false;
    }

    private static boolean DarBaja(Menbresia item) throws ClassNotFoundException, SQLException {
        int r = 0;
        String sql = "delete from menbresia where id=?";
        try (Connection cn = Conexion.Cadena();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, item.getId());
            r = ps.executeUpdate();
        }
        return r == 1 ? true : false;
    }

    private static LinkedList<Menbresia> Lista() throws ClassNotFoundException, SQLException {
        int r = 0;
        LinkedList<Menbresia> Lista = new LinkedList<>();
        String sql = "select * from menbresia";
        try (Connection cn = Conexion.Cadena();
                PreparedStatement ps = cn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Lista.add(new Menbresia(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getFloat(4), rs.getString(5),rs.getBoolean(6)));
                }
            }
        }
        return Lista;
    }

//    private static LinkedList<Menbresia> Lista2(int idmat) throws ClassNotFoundException, SQLException {
//        int r = 0;
//        LinkedList<Menbresia> Lista = new LinkedList<>();
//        String sql = "select * from menbresia where id not in(select c.id\n"
//                + "from menbresia c inner join detallepagos dp on ditem.id=c.id\n"
//                + "inner join pagos p on item.idpago=ditem.idpago\n"
//                + "inner join matriculas m on m.idmatricula=item.idmatricula where m.idmatricula=?)";
//        try (Connection cn = Conexion.Cadena();
//                PreparedStatement ps = cn.prepareStatement(sql)) {
//            ps.setInt(1, idmat);
//            try (ResultSet rs = ps.executeQuery()) {
//                while (rs.next()) {
//                  Lista.add(new Menbresia(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getFloat(4), rs.getString(5),rs.getBoolean(6)));
//                }
//            }
//        }
//        return Lista;
//    }

    public static boolean Guardar(Menbresia item) throws ClassNotFoundException, SQLException {
        if (Existe(item)) {
            return Actualizar(item);
        } else {
            return Nuevo(item);
        }
    }

    public static boolean Eliminar(Menbresia item) throws ClassNotFoundException, SQLException {
        return DarBaja(item);
    }

    public static LinkedList<Menbresia> ListaMenbresias() throws ClassNotFoundException, SQLException {
        return Lista();
    }
//    public static LinkedList<Menbresia> ListaMenbresiaPendientes(int idmat) throws ClassNotFoundException, SQLException {
//        return Lista2(idmat);
//    }
}
