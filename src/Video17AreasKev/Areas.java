
package Video17AreasKev;

import java.util.*;
import javax.swing.JOptionPane;

public class Areas {
    
    public void calcular(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Opción: \n1: Cuadrado \n2: Rectángulo \n3: Triangulo \n4: Circulo ");
        int opcion = entrada.nextInt();
        
        switch(opcion){
           case 1: 
                
            int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado: "));
            //Se eleva al cuadrado el lado para obtener la base del cuadrado
            System.out.println("El area del cuadrado es: " + Math.pow(lado,2));
            
            break;
            
            case 2:
                
            int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));   
            int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
            
            System.out.println("El área del rectángulo es: " + base*altura);
                
            break;
            
            case 3:
            
            base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
            altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
 
            System.out.println("El área del triángulo es: " + (base*altura)/2);
            
            break;
            
            case 4: 
            
            int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
            
            System.out.print("El área del circulo es: ");
                                //?
            System.out.println(Math.PI*(Math.pow(radio,2)));
            
            break;
            
            default:
                
            System.out.println("LA OPCION NO ES LA CORRECTA");
                
        }
        
    }
}
