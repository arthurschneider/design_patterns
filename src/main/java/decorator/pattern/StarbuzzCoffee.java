package decorator.pattern;

import decorator.pattern.beverages.Beverage;
import decorator.pattern.beverages.DarkRoast;
import decorator.pattern.beverages.Espresso;
import decorator.pattern.beverages.HouseBlend;
import decorator.pattern.condiments.Mocha;
import decorator.pattern.condiments.Soy;
import decorator.pattern.condiments.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        
        System.out.println(espresso.getDescription() +" €" +espresso.cost());
        
        Beverage doubleMochaWhipDR = new DarkRoast();
        doubleMochaWhipDR = new Mocha(doubleMochaWhipDR);
        doubleMochaWhipDR = new Mocha(doubleMochaWhipDR);
        doubleMochaWhipDR = new Whip(doubleMochaWhipDR);

        System.out.println(doubleMochaWhipDR.getDescription() +" €" +doubleMochaWhipDR.cost());
        
        Beverage soyMochaWhipHB = new HouseBlend();
        soyMochaWhipHB = new Soy(soyMochaWhipHB);
        soyMochaWhipHB = new Mocha(soyMochaWhipHB);
        soyMochaWhipHB = new Whip(soyMochaWhipHB);
        
        System.out.println(soyMochaWhipHB.getDescription() +" €" +soyMochaWhipHB.cost());
    }

}
