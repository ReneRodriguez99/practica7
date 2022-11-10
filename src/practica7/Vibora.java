/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

public class Vibora extends Animal {
    
    public Vibora(int numPatas)
    {
        super(numPatas);
        hablar();
        trabajar();
    }
    
    @Override
    public void hablar()
    {
        System.out.println("La vibora hace sssss");
        
    }

    @Override
    public void trabajar()
    {
        System.out.println("La vibora produce veneno, tiene " + getNumPatas() + " Patas");
        
    }

    
    
}
