package prueba;
import java.util.*;
import static java.lang.System.out;
import java.util.stream.*;
import javax.swing.*;
public class Multiplicacion 
{

    public static void main(String[] args) 
    {
        int res, res2=0;
        String Preguntas, Cadena = "";
        Preguntas = JOptionPane.showInputDialog("Bienvenido a este programa que calcula la multiplicación de una 2 Matrices Cuadradas N X N. \n Ingresa el Valor de N");
        res = Integer.parseInt(Preguntas);
        int [][] m1= new int [res][res];
        int [][] m2= new int [res][res];
        int [][] mr= new int [res][res];
        for (int i = 0; i<2; i++)
        {
            for (int j = 0; j<res; j++)
            {
                for (int k =0; k<res; k++)
                {
                    if (i==0)
                    {
                        Preguntas = JOptionPane.showInputDialog("MATRIZ #"+(i+1)+": Ingresa el Valor de la Fila #"+(j+1)+", Columna #"+(k+1));
                        m1[j][k] = Integer.parseInt(Preguntas);
                    }
                    if (i==1)
                    {
                        Preguntas = JOptionPane.showInputDialog("MATRIZ #"+(i+1)+": Ingresa el Valor de la Fila #"+(j+1)+", Columna #"+(k+1));
                        m2[j][k] = Integer.parseInt(Preguntas);
                    }
                }
            }
        }
        
        for(int i =0; i<res; i++)
        {
            for(int j =0; j<res; j++)
            {
                for(int k =0; k<res; k++)
                {
                    
                    res2 += (m1[i][k]*m2[k][j]);
                    if(k==res-1)
                    {
                        mr[i][j]= res2;
                        Cadena+= mr[i][j]+" ";
                        res2 =0;
                    }
                }
                
            }
            res2 = 0;
            Cadena+= "\n";
        }
        JOptionPane.showMessageDialog(null, "El resultado es: \n\n "+Cadena);
        
        
    }
    
}
