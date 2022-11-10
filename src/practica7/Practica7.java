package practica7;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author rene yahir
 */

public class Practica7{

    public static void main(String[] args) 
    {
       ArrayList<Object> animal = new ArrayList<Object>();
       Animales tipoAnimal = null;
       
       
       for(int i = 0; i<15;i++)
       {
        Random num = new Random();
        int casoAnimal = num.nextInt(4) + 0;
       
        switch(casoAnimal)
        {
            case 0:
                    tipoAnimal = Animales.PATO;
            break;
            case 1:
                    tipoAnimal = Animales.VACA;
            break;    
            case 2:
                    tipoAnimal = Animales.POLLO;
            break;
            case 3:
                    tipoAnimal = Animales.VIBORA;
           break;
           
           default:
        }
       
        switch(tipoAnimal)
        {
            case PATO:
                animal.add(new Pato(2));
            break;
            case VACA:
                animal.add(new Vaca(4));
            break;    
            case VIBORA:
                animal.add(new Vibora(0));
            break;
            case POLLO:
                animal.add(new Pollo(2));
            break;
           
            default:
        }
       }
    
    }
    
}
