/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Scanner;

/**
 *
 * @author aleksandrpasharin
 */
public class Main {

    public static void main(String[] args) {
       
        HamburgerMaker maker = new HamburgerMaker();
        HesburgerKerrosHampurilainenBuilder heseBuilder = new HesburgerKerrosHampurilainenBuilder();
        McDonaldsChickenDoubleBaconMaker mcBuilder = new McDonaldsChickenDoubleBaconMaker();
        
        int kasky = 0; Scanner lukija = new Scanner(System.in);
        
        do{
            System.out.println("Paina 1 jos haluat tehdä kerroshampurilaisen");
            System.out.println("Paina 2 jos halaut tehdä tuplapekonikanahampurilaisen");
            System.out.println("Paina 3 jos haluat lopettaa");
            
            try{
                kasky = Integer.parseInt(lukija.nextLine());
                
                switch(kasky){
                    case 1: maker.setBurgerBuilder(heseBuilder); break;                          
                    case 2: maker.setBurgerBuilder(mcBuilder); break; 
                    case 3: break;
                    default: throw new NumberFormatException();
                }
                
                maker.makeBurger();
                System.out.println("\n Tulos: \n");
                System.out.println(maker.getBurger());
                System.out.println("\n");
                
            }catch(NumberFormatException e){
                System.out.println("Kelvoton syöte!");
            }
            
        }while(kasky != 3);
        
    }
    
}
