
package Controlador;

import java.awt.event.KeyEvent;


public class Validarnumeros {
   public void solonumeros(KeyEvent evt){
       if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != ','){
           evt.consume();
       }
   }
    
}
