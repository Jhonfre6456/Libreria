
package Controlador;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionVentas {
    Connection cnn=null;
    
     public Connection Conexiondb(){
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
        cnn=DriverManager.getConnection("jdbc:mysql://localhost/ventacsql","root","1234");
        //base de datos , usuario de mysql,contraseña de mysql
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.print(e);
        }
 
        return cnn;
    }
    
     public static void main (String args[]){
         ConexionVentas con=new ConexionVentas();
         con.Conexiondb();
     }
    
    
    
}
