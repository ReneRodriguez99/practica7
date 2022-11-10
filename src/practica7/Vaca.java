/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

public class Vaca extends Animal
{
    public Vaca(int numPatas)
    {
        super(numPatas);
        hablar();
        trabajar();
    }
    
    @Override
    public void hablar()
    {
        System.out.println("La vaca hace Muuu");
        
    }

    @Override
    public void trabajar()
    {
        System.out.println("La Vaca produce Leche, tiene " + getNumPatas() + " Patas");
        
    }
    
}
