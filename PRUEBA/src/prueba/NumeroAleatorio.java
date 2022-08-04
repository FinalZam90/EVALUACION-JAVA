package prueba;
import java.util.*;
import javax.swing.*;
public class NumeroAleatorio
{

    public static void main(String[] args) 
    {
        int a, res, b=5;
        String Preguntas;
        a  = (int) ((Math.random()*((100-1)+1))+1);
        do
        {
            Preguntas = JOptionPane.showInputDialog("BIENVENIDO AL JUEGO ADIVINA EL NUMERO. \n Tu objetivo es adivinar el número que estoy pensando del 1 al 100. Tienes 5 intentos para ganar \n # Intentos Restantes= "+b);
            res = Integer.parseInt(Preguntas);
            if(res > a)
            {
                b--;
                JOptionPane.showMessageDialog(null, "Upps... El número que ingresaste es mayor al que pienso, Intenta Nuevamente. \n Intentos Restantes= "+b);
            }
            if(res < a)
            {
                b--;
                JOptionPane.showMessageDialog(null, "Upps... El número que ingresaste es menor al que pienso, Intenta Nuevamente. \n Intentos Restantes= "+b);
            }
            if(res == a)
            {
                JOptionPane.showMessageDialog(null, "WOOOW!! Que adivino, felicidades, has Ganado ");
            }
        }while(b>0 && res!=a);
        
        
    }
    
}
