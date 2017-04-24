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
public class McDonaldsChickenDoubleBaconMaker extends HamburgerBuilder{
    
    private StringBuilder osat = new StringBuilder();

    @Override
    public Object getBurger() {
        return this.osat;
    }

    @Override
    public void createBurger() {
        this.osat = new StringBuilder();
    }

    @Override
    public void addBun() {
        osat.append("Sämpylä: quarter pounder-sämpylä\n");
    }

    @Override
    public void addPatty() {
        osat.append("Pihvi: pieni kanapihvi\n");
    }

    @Override
    public void addCheese() {
        osat.append("Juusto: cheddar-sulatejuusto\n");
    }

    @Override
    public void addSalad() {
        osat.append("Salaatti: jäävuorisalaatti, sipuli\n");
    }

    @Override
    public void addSauce() {
        osat.append("Kastike: smokey bacon\n");
    }

    @Override
    public void addSpecial() {
        osat.append("Muu: pekoni (kaksi viipaletta)\n");
    }
    
    
}
