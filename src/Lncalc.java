/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class Lncalc extends SmartCalculator {
    public static double log10(double fir){
        // Math.log is base e, natural log, ln
        return Math.log( fir ) / Math.log( 10 );
    } 
    public static double log2(double fir){
         // Math.log is base e, natural log, ln
        return Math.log( fir ) / Math.log( 2 );
    }
    
}
