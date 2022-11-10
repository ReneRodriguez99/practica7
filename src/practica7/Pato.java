/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

public class Pato extends Animal{
    
  
    public Pato(int numPatas)
    {
        super(numPatas);
        hablar();
        trabajar();
    }
    
    @Override
    public void hablar()
    {
        System.out.println("El pato hace Cuac-Cuac");
        
    }

    @Override
    public void trabajar()
    {
        System.out.println("El pato se cria para el consumo de su carne, tiene " + getNumPatas() + " Patas");
        
    }
    
    
    
    
}
