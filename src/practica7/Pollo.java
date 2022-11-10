/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

public class Pollo extends Animal
{
    
    public Pollo(int numPatas)
    {
        super(numPatas);
        hablar();
        trabajar();
    }
    
    @Override
    public void hablar()
    {
        System.out.println("El pollo cacarea");
        
    }

    @Override
    public void trabajar()
    {
        System.out.println("El pollo pone huevos, tiene " + getNumPatas() + " Patas");
        
    }
    

}


  