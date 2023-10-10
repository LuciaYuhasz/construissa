/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construissa;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Construissa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            Class.forName("org.mariadb.jdbc.Driver");
            String URL = "jdbc:mariadb://localhost:3306/construissa";
            String usuario = "root";
            String password = "";
            Connection con = DriverManager.getConnection(URL, usuario, password);
            
            
//      INGRESO DE TRES EMPLEADOS 
        //1)
 //           String sql="insert into empleado (dni,apellido,nombre,acceso,estado)"
 //                   +"values(66588423,'Lopez','Roberto','1',true)";
 //          PreparedStatement ps= con.prepareStatement(sql);
//           
 //          int filas= ps.executeUpdate();
 //          if(filas>0){
 //          JOptionPane.showMessageDialog(null,"Empleado agregado");}
    //     2)  
//           
//            String sql="insert into empleado (dni,apellido,nombre,acceso,estado)"
//                    +"values(35688421,'Gutierrez','Gabriel','1',true)";
//           PreparedStatement ps= con.prepareStatement(sql);
//           
//           int filas= ps.executeUpdate();
//           if(filas>0){
//           JOptionPane.showMessageDialog(null,"Empleado agregado");}
           
        //3)  
         String sql="insert into empleado (dni,apellido,nombre,acceso,estado)"
                    +"values(26584125,'Fernandez','Camila','1',true)";
           PreparedStatement ps= con.prepareStatement(sql);
           
           int filas= ps.executeUpdate();
           if(filas>0){
           JOptionPane.showMessageDialog(null,"Empleado agregado");}
           
           
//       2)
//            String sql="insert into alumno (dni,apellido,nombre,fechaDeNacimiento,estado)"
//                    +"values(22456879,'Guitierrez','Roberto','1860-08-24',true)";
//           PreparedStatement ps= con.prepareStatement(sql);
//            int filas= ps.executeUpdate();
//          if(filas>0){
//           JOptionPane.showMessageDialog(null,"Alumno agregado");}
//       3)
//
//                 String sql="insert into alumno (dni,apellido,nombre,fechaDeNacimiento,estado)"
//                   +"values(56988421,'Fonseca','Andrea','1863-12-05',true)";
//          PreparedStatement ps= con.prepareStatement(sql);
//           
//           int filas= ps.executeUpdate();
//           if(filas>0){
//           JOptionPane.showMessageDialog(null,"Alumno agregado");}
         
      }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de carga de base de datos " + ex.getMessage());
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexion" + ex.getMessage());
        }
    }
    //veo si puedo sacar este!!
}