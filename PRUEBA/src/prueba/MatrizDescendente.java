package prueba;
import java.util.*;
import javax.swing.*;
public class MatrizDescendente
{
    
    public static void main(String[] args) 
    {
        int a = 1, res;
        String Preguntas, Cadena ="";
        Preguntas = JOptionPane.showInputDialog("Ingresa cuantas filas necesitas immprimir: ");
        res = Integer.parseInt(Preguntas);
        for(int i =0; i<res; i++)
        {
            for (int j = 0; j<=i; j++)
            {
                Cadena+= a+" ";
                a++;
            }
            Cadena+= "\n";
        }
        JOptionPane.showMessageDialog(null, Cadena);
    }
    
}
