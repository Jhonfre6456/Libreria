
package Controlador;

import Interfaz.Acceso;


public class Basededatosventas {

   
    public static void main(String[] args) {
     ConexionVentas con=new ConexionVentas();
     con.Conexiondb();
     
     Acceso acc=new Acceso();
     acc.setVisible(true);
    acc.setLocationRelativeTo(null);
     
    }
    
}
