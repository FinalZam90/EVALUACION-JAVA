package prueba;
import java.util.*;
import static java.lang.System.out;
import java.util.stream.*;
import javax.swing.*;

public class ListaNumerosPares
{

    public static void main(String[] args)
    {
        List <Integer> Numeros = Arrays.asList(1,8,5,2,33,54,22,6,88,13);
        List pares =  Numeros.stream().filter(n->n%2==0).collect(Collectors.toList());
        JOptionPane.showMessageDialog(null,pares);
    }
    
}
