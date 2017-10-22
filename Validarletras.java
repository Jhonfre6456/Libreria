
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;



public class Validarletras {
    Character c;
    
    public void sololetras(KeyEvent evt){
        c = evt.getKeyChar();
        if(!Character.isLetter(c) && c !=KeyEvent.VK_SPACE){
            evt.consume();
        }
    }

    public void sololetras(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
