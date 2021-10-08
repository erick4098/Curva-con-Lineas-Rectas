package Inicio;

import javax.swing.JFrame;

public class Bezier extends JFrame{
    public Panel panel;
    public Bezier(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Curva con Lineas Rectas");
        setSize(500, 500);
         setLocationRelativeTo(null);
        componentes();
    }  
    
    public void componentes(){
        setLayout(null);
        panel=new Panel();
        panel.setBounds(0, 0,getWidth(),getHeight() );
        add(panel);
    }
    
    public static void main(String[] args) {
        Bezier bezier = new Bezier();
    }
}

