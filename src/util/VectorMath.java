/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author michel and modified by Anna Vilanova
 * 
 * Basic vector functionality used in the other elements
 * 
 * NO IMPLEMENTATION NEEDED FOR THE BASIC ASSIGNMENTME 
 */
public class VectorMath {

    // assign coefficients c0..c2 to vector v
    public static void setVector(double[] v, double c0, double c1, double c2) {
        v[0] = c0;
        v[1] = c1;
        v[2] = c2;
    }

    // compute dotproduct of vectors v and w
    public static double dotproduct(double[] v, double[] w) {
        double r = 0;
        for (int i=0; i<3; i++) {
            r += v[i] * w[i];
        }
        return r;
    }

    // compute distance between vectors v and w
    public static double distance(double[] v, double[] w) {
        double[] tmp = new double[3];
        VectorMath.setVector(tmp, v[0]-w[0], v[1]-w[1], v[2]-w[2]);
        return Math.sqrt(VectorMath.dotproduct(tmp, tmp));
    }

    // compute dotproduct of v and w
    public static double[] crossproduct(double[] v, double[] w, double[] r) {
        r[0] = v[1] * w[2] - v[2] * w[1];
        r[1] = v[2] * w[0] - v[0] * w[2];
        r[2] = v[0] * w[1] - v[1] * w[0];
        return r;
    }
    
    // compute length of vector v
    public static double length(double[] v) {
        return Math.sqrt(v[0]*v[0] + v[1]*v[1] + v[2]*v[2]);
    }
    
    //Navin
    // compute multiply of vectors v and scalar s
    public static double[] multiply(double[] v, double s) {
        double[]  r = new double [3];
        for (int i=0; i<3; i++) {
            r[i] = v[i] * s;
        }
        return r;
    }
    
    // compute dotproduct of vectors v and w
    public static double[] subtract(double[] v, double[] w) {
        double[] r = new double [3];
        for (int i=0; i<3; i++) {
            r[i] = v[i] - w[i];
        }
        return r;
    }
    
    //Get Vector Midpoint
    public static double[] getVectorsMid(double[] vec1, double[] vec2){
       double[] mid = new double[3];
       for(int i = 0 ; i < 3 ; i++){
           mid[i] = vec1[i]/2 + vec2[i]/2;
       }
       return mid;
   }
    
     //Check Vector Equality
    public static boolean isVectorEqual(double[] vec1, double[] vec2){
       
       boolean result = true; 
       double[] mid = new double[3];
       for(int i = 0 ; i < 3 ; i++){
           if (vec1[i] != vec2[i]) {
               result = false;
               break;
           }
       }
       return result;
   }
}
