package dip.lab2.student.solution1;

import java.text.DecimalFormat;

/**
 *
 * @author Machi
 */
interface TippingStrategy {
    
    public static DecimalFormat fTip = new DecimalFormat("#,##0.00");
    
    public static final double GOOD_RATE = 0.20;
    public static final double FAIR_RATE = 0.15;
    public static final double POOR_RATE = 0.10;
    
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
      
    public abstract double getTipForService();
    
}
