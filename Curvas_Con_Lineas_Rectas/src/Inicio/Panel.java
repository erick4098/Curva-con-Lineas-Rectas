
package Inicio;

import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.swing.JPanel;

public class Panel extends JPanel{
    public int intcre=20;
    public int[][] puntos1=new int[intcre*8][2];
    public int[][] puntos2=new int[intcre*8][2];
    public Panel() {
        setLayout(null);
        comenzar();
        Lienzo lienzo=new Lienzo(puntos1,puntos2);
        GLCanvas canvas=new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(lienzo);
        canvas.setBounds(0, 0, 484,461);
        add(canvas);
    }
    public void comenzar(){
        int valor=0;
        int maximo=100;
        int division=maximo/intcre;
        int incremento=0;
        for(int i=0;i<intcre;i++){
            valor=(i+1)*division;
            puntos1[incremento+i][0]=valor;
            puntos1[incremento+i][1]=0;
            puntos2[incremento+i][0]=0;
            puntos2[incremento+i][1]=maximo-valor;
        }
        incremento+=intcre;
        for(int i=0;i<intcre;i++){
            valor=(i+1)*division;
            puntos1[incremento+i][0]=-valor;
            puntos1[incremento+i][1]=0;
            puntos2[incremento+i][0]=0;
            puntos2[incremento+i][1]=-maximo+valor;
        }
        incremento+=intcre;
        for(int i=0;i<intcre;i++){
            valor=(i+1)*division;
            puntos1[incremento+i][0]=0;
            puntos1[incremento+i][1]=maximo-valor;
            puntos2[incremento+i][0]=-valor;
            puntos2[incremento+i][1]=0;
        }
        incremento+=intcre;
        for(int i=0;i<intcre;i++){
            valor=(i+1)*division;
            puntos1[incremento+i][0]=0;
            puntos1[incremento+i][1]=-maximo+valor;
            puntos2[incremento+i][0]=valor;
            puntos2[incremento+i][1]=0;
        }
        incremento+=intcre;
        for(int i=0;i<intcre;i++){
            valor=(i+1)*division;
            puntos1[incremento+i][0]=100;
            puntos1[incremento+i][1]=maximo-valor;
            puntos2[incremento+i][0]=valor;
            puntos2[incremento+i][1]=100;
        }
        incremento+=intcre;
        for(int i=0;i<intcre;i++){
            valor=(i+1)*division;
            puntos1[incremento+i][0]=-maximo+valor;
            puntos1[incremento+i][1]=100;
            puntos2[incremento+i][0]=-100;
            puntos2[incremento+i][1]=valor;
        }
        incremento+=intcre;
        for(int i=0;i<intcre;i++){
            valor=(i+1)*division;
            puntos1[incremento+i][0]=-maximo+valor;
            puntos1[incremento+i][1]=-100;
            puntos2[incremento+i][0]=-100;
            puntos2[incremento+i][1]=-valor;
        }
        incremento+=intcre;
        for(int i=0;i<intcre;i++){
            valor=(i+1)*division;
            puntos1[incremento+i][0]=valor;
            puntos1[incremento+i][1]=-100;
            puntos2[incremento+i][0]=100;
            puntos2[incremento+i][1]=-maximo+valor;
        }
    }
    
}
