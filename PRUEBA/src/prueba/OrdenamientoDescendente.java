package prueba;
import java.util.Scanner;
import javax.swing.*;

public class OrdenamientoDescendente 
{
    
    public static void main(String[] args) 
    {
        int a, b, c;
        int [] num = new int [3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa El 1er Numero: ");
        a = sc.nextInt();
        System.out.print("Ingresa el 2do Número: ");
        b = sc.nextInt();
        System.out.print("Ingresa el 3er número: ");
        c = sc.nextInt();
        if (a>b)
        {
            if(a>c)
            {
                if(b>c)
                {
                    num[0]= a;
                    num[1]=b;
                    num[2]=c;
                            
                }
                else
                {
                    num[0]= b;
                    num[1]=c;
                    num[2]=a;
                }
                
            }
            else
            {
                num[0]= c;
                    num[1]=a;
                    num[2]=b;
            }
        }
        else
        {
            if(b>c)
            {
                if(a>c)
                {
                    num[0]= b;
                    num[1]=a;
                    num[2]=c;
                }
                else
                {
                    num[0]= b;
                    num[1]=c;
                    num[2]=a;
                }
            }
            else
            {
                num[0]= c;
                    num[1]=b;
                    num[2]=a;
            }
        }
        
        for(int i =0; i<3; i++)
        {
            System.out.println("El Orden descendente es el siguiente: #"+(i+1)+":  "+num[i]);
        }
             
    }
    
}
