
package dip.lab2.student.solution1;

/**
 *
 * @author Machi
 */
public class TippingService {
    
    private TippingStrategy tipCalculator;
    

    public TippingService(TippingStrategy tipCalculator) {
	this.tipCalculator = tipCalculator;
    }
    
    public double getTip() {
	return tipCalculator.getTipForService();
    }
    
}
