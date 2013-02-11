package dip.lab2.student.solution1;


/**
 *
 * @author Machi
 */
interface TippingStrategy {
    
       
    public static final double GOOD_RATE = 0.20;
    public static final double FAIR_RATE = 0.15;
    public static final double POOR_RATE = 0.10;
    
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
      
    public abstract double getTipForService();
    
}
