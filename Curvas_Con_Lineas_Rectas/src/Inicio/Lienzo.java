package Inicio;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class Lienzo implements GLEventListener{
    public GL gl;
    public GLU glu;
    public int[][] puntos1;
    public int[][] puntos2;
    public int Au=0;
    public Lienzo(int[][] puntos1,int[][] puntos2){
        this.puntos1=puntos1;
        this.puntos2=puntos2;
        
    }
      
    @Override
    public void init(GLAutoDrawable drawable) {
        glu=new GLU();
        gl= drawable.getGL();
        gl.glClearColor(0, 0, 0, 0);
        gl.glMatrixMode(gl.GL_PROJECTION);
        glu.gluOrtho2D(-100, 100, -100, 100);
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        gl.glLineWidth(1);
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        Au=0;
        for(int i=0;i<puntos1.length/8;i++){
            gl.glBegin(GL.GL_LINE_LOOP);
                gl.glColor3d(1, 0, 0);
                gl.glVertex2d(puntos1[Au+i][0],puntos1[Au+i][1]);
                gl.glColor3d(0, 1, 0);
                gl.glVertex2d(puntos2[Au+i][0],puntos2[Au+i][1]);
            gl.glEnd();
        }
        Au+=puntos1.length/8;
        for(int i=0;i<puntos1.length/8;i++){
            gl.glBegin(GL.GL_LINE_LOOP);
                gl.glColor3d(0, 0, 1);
                gl.glVertex2d(puntos1[Au+i][0],puntos1[Au+i][1]);
                System.out.println("Valor:"+(Au+i));
                gl.glColor3d(1, 1, 0);
                gl.glVertex2d(puntos2[Au+i][0],puntos2[Au+i][1]);
            gl.glEnd();
        }
        Au+=puntos1.length/8;
        for(int i=0;i<puntos1.length/8;i++){
            gl.glBegin(GL.GL_LINE_LOOP);
                gl.glColor3d(0, 1, 1);
                gl.glVertex2d(puntos1[Au+i][0],puntos1[Au+i][1]);
                System.out.println("Valor:"+(Au+i));
                gl.glColor3d(1, 0, 1);
                gl.glVertex2d(puntos2[Au+i][0],puntos2[Au+i][1]);
            gl.glEnd();
        }
        Au+=puntos1.length/8;
        for(int i=0;i<puntos1.length/8;i++){
            gl.glBegin(GL.GL_LINE_LOOP);
                gl.glColor3d(1, 0, 0);
                gl.glVertex2d(puntos1[Au+i][0],puntos1[Au+i][1]);
                System.out.println("Valor:"+(Au+i));
                gl.glColor3d(1, 1, 1);
                gl.glVertex2d(puntos2[Au+i][0],puntos2[Au+i][1]);
            gl.glEnd();
        }
        Au+=puntos1.length/8;
        for(int i=0;i<puntos1.length/8;i++){
            gl.glBegin(GL.GL_LINE_LOOP);
                gl.glColor3d(1, 0, 0);
                gl.glVertex2d(puntos1[Au+i][0],puntos1[Au+i][1]);
                gl.glColor3d(0, 1, 0);
                gl.glVertex2d(puntos2[Au+i][0],puntos2[Au+i][1]);
            gl.glEnd();
        }
        Au+=puntos1.length/8;
        for(int i=0;i<puntos1.length/8;i++){
            gl.glBegin(GL.GL_LINE_LOOP);
                gl.glColor3d(0, 0, 1);
                gl.glVertex2d(puntos1[Au+i][0],puntos1[Au+i][1]);
                System.out.println("Valor:"+(Au+i));
                gl.glColor3d(1, 1, 0);
                gl.glVertex2d(puntos2[Au+i][0],puntos2[Au+i][1]);
            gl.glEnd();
        }
        Au+=puntos1.length/8;
        for(int i=0;i<puntos1.length/8;i++){
            gl.glBegin(GL.GL_LINE_LOOP);
                gl.glColor3d(0, 1, 1);
                gl.glVertex2d(puntos1[Au+i][0],puntos1[Au+i][1]);
                System.out.println("Valor:"+(Au+i));
                gl.glColor3d(1, 0, 1);
                gl.glVertex2d(puntos2[Au+i][0],puntos2[Au+i][1]);
            gl.glEnd();
        }
        Au+=puntos1.length/8;
        for(int i=0;i<puntos1.length/8;i++){
            gl.glBegin(GL.GL_LINE_LOOP);
                gl.glColor3d(1, 0, 0);
                gl.glVertex2d(puntos1[Au+i][0],puntos1[Au+i][1]);
                System.out.println("Valor:"+(Au+i));
                gl.glColor3d(1, 1, 1);
                gl.glVertex2d(puntos2[Au+i][0],puntos2[Au+i][1]);
            gl.glEnd();
        }
        gl.glFlush();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {}

    @Override
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {}
    
}
