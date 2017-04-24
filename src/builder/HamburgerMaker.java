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
public class HamburgerMaker {
    
    private HamburgerBuilder burgerBuilder;

    public void setBurgerBuilder(HamburgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }
    
    public Object getBurger(){
        if(this.burgerBuilder == null) return null;
        
        return this.burgerBuilder.getBurger();
    }
    
    public void makeBurger(){
        if(this.burgerBuilder == null) return;
        
        this.burgerBuilder.createBurger();
        this.burgerBuilder.addBun();
        this.burgerBuilder.addCheese();
        this.burgerBuilder.addPatty();
        this.burgerBuilder.addSalad();
        this.burgerBuilder.addSauce();
        this.burgerBuilder.addSpecial();
        
    }
}
