/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleksandrpasharin
 */
public class HesburgerKerrosHampurilainenBuilder extends HamburgerBuilder{
    
    List<String> parts = new ArrayList<>();

    @Override
    public void addBun() {       
        parts.add("Iso Seesaami-vehnäsämpylä");
    }

    @Override
    public void addPatty() {
        parts.add("Naudanlihapihvi");
        parts.add("Naudanlihapihvi");
    }

    @Override
    public void addCheese() {
        parts.add("Cheddarsiivu");
    }

    @Override
    public void addSalad() {
        parts.add("Jäävuorisalaatti");
        parts.add("Sipuli");
        parts.add("Viipalekurkku");
    }

    @Override
    public void addSauce() {
        parts.add("Kurkkumajoneesi");
        parts.add("Ketsuppi");
        parts.add("Paprikamajoneesi");
    }

    @Override
    public void addSpecial() {
        parts.add("Grillimauste");
    }
    
    @Override
    public Object getBurger() {
        return this.parts;
    }

    @Override
    public void createBurger() {
        this.parts = new ArrayList<>();
    }

    
}
