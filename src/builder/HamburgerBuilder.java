/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author aleksandrpasharin
 */
public abstract class HamburgerBuilder {
    
    public abstract Object getBurger();
    
    public abstract void createBurger();
    
    public abstract void addBun();
    public abstract void addPatty();
    public abstract void addCheese();
    public abstract void addSalad();
    public abstract void addSauce();
    public abstract void addSpecial();
    
}
