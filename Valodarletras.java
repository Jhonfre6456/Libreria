
package Controlador;

import java.awt.event.KeyEvent;



public class Valodarletras {
    Character c;
    
    public void sololetras(KeyEvent evt){
        c = evt.getKeyChar();
        if(!Character.isLetter(c) && c !=KeyEvent.VK_SPACE){
            evt.consume();
        }
    }
    
}
