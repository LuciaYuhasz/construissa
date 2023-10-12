/*
 Desde el método main de un nuevo proyecto Java de nombre construirSA:

Cargar el driver MariaDB.
Establecer la conexión a la base de datos previamente creada.
Insertar 3 empleados.
Insertar 2 herramientas.
Listar todas las herramientas con stock superior a 10.
Dar de baja al primer empleado ingresado a la base de datos.
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
//         String sql="insert into empleado (dni,apellido,nombre,acceso,estado)"
//                    +"values(26584125,'Fernandez','Camila','1',true)";
//           PreparedStatement ps= con.prepareStatement(sql);
//           
//           int filas= ps.executeUpdate();
//           if(filas>0){
//           JOptionPane.showMessageDialog(null,"Empleado agregado");}
           
           
//       2)
//            String sql="insert into alumno (dni,apellido,nombre,fechaDeNacimiento,estado)"
//                    +"values(22456879,'Guitierrez','Roberto','1860-08-24',true)";

//        //3)  
//         String sql="insert into empleado (dni,apellido,nombre,acceso,estado)"
//                    +"values(26584125,'Fernandez','Camila','1',true)";

//           PreparedStatement ps= con.prepareStatement(sql);
//           
//           int filas= ps.executeUpdate();
//           if(filas>0){

//           JOptionPane.showMessageDialog(null,"Empleado agregado");}


//
// String sql="insert into empleado (dni,apellido,nombre,acceso,estado)"
//                    +"values(29584125,'Lopez','Carla','1',true)";
//           PreparedStatement ps= con.prepareStatement(sql);
//           
//           int filas= ps.executeUpdate();
//           if(filas>0){
//           JOptionPane.showMessageDialog(null,"Empleado agregado");}
//         
//      }catch (ClassNotFoundException ex) {

//           JOptionPane.showMessageDialog(null,"Empleado agregado");}

//     INGRESO DE LAS 2 HERRAMIENTAS      
           
//             String sql = "insert into herramienta (nombre,descripcion,stock,estado)"
//                     + "values('Soldadora','soldadora punta diamante Steel','10',true)";
//             PreparedStatement ps = con.prepareStatement(sql);
//
//             int filas = ps.executeUpdate();
//             if (filas > 0) {
//                 JOptionPane.showMessageDialog(null, "Herramienta agregada");
//             }
//             
//              String sql1 = "insert into herramienta (nombre,descripcion,stock,estado)"
//                     + "values('motosierra','motosierra 500 wts','5',true)";
//             PreparedStatement ps1 = con.prepareStatement(sql1);
//
//             int filas1 = ps1.executeUpdate();
//             if (filas > 0) {
//                 JOptionPane.showMessageDialog(null, "Herramienta agregada");
//             }
//

 //               LISTAS TODAS LAS HERRAMIENTAS CON STOCK SUPERIOR A 10
 
//             String sql = "SELECT `idHerramienta`, `nombre`, `descripcion`, `stock`, `estado` FROM `herramienta`"
//                     + "WHERE stock > 10";
//             PreparedStatement ps = con.prepareStatement(sql);
//
//           
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//               
//                int id = rs.getInt("idherramienta");
//                String nombre = rs.getString("nombre");
//                String descripcion = rs.getString("descripcion");
//                int stock = rs.getInt("stock");
//                boolean estado = rs.getBoolean("estado");
//                System.out.println("-----------------------");
//                System.out.println("id :" + id);
//                System.out.println("Nombre:" + nombre);
//                System.out.println("Descripcion :" + descripcion);
//                System.out.println("Stock :" + stock );
//                System.out.println("Estado : " + estado);
//                System.out.println("-----------------------");
//            } 
//         Dar de baja al primer empleado cargado en la base 

             String sql = " UPDATE empleado set estado = 0  WHERE idEmpleado = 1";
             PreparedStatement ps = con.prepareStatement(sql);
             int filas = ps.executeUpdate();
             if (filas > 0) {
                 JOptionPane.showMessageDialog(null, "Empleado dado de baja");
             }

         } catch (ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "Error de carga de base de datos " + ex.getMessage());
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexion" + ex.getMessage());
        }
    }
    //ultimo intento
}