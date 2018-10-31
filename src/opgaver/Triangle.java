/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rodsur
 */
public class Triangle {
    
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        
        ArrayList<Double> triangle = new ArrayList<>();
        triangle.add(side1);
        triangle.add(side2);
        triangle.add(side3);
        Collections.sort(triangle);
        
        if ((triangle.get(0) + triangle.get(1)) < triangle.get(2)) {
            throw new IllegalTriangleException("One side is too long");
        }
    }
}
