package Grafico;
import javax.swing.*;
public class CreandoMarcos {

    public static void main(String[] args) {
      
        miMarco marco1 = new miMarco();
        
        marco1.setVisible(true);
        
        marco1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
    }
    
}
class miMarco extends  JFrame{
    
    public miMarco(){
        setSize(500,300);
    }
    
}