package dip.lab2.student.solution1;

// An useful import if you need it.

import java.text.DecimalFormat;

//// Another useful import if you need it.
//import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @Maciej
 */
public class Startup {
    
    public static DecimalFormat fTip = new DecimalFormat("#,##0.00");
    
    public static void main(String[] args) {
        
//        TippingStrategy calc = new BaggageServiceTipCalculator(
//                BaggageServiceTipCalculator.ServiceQuality.POOR,5);
	
	
//	System.out.println("The tip ammount is: $" + service.getTipForService());
	
	
	TippingStrategy calc = new FoodServiceTipCalculator(
                FoodServiceTipCalculator.ServiceQuality.GOOD,10);
	
	TippingService tipService = new TippingService(calc);
	
	System.out.println("The tip ammount is: $" + fTip.format(tipService.getTip()));
	
    }

}
