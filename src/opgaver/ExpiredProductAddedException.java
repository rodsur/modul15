/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

/**
 *
 * @author rodsur
 */
public class ExpiredProductAddedException extends Exception {
    public ExpiredProductAddedException() {
        super("Attempted to add expired product to database");
    }
}
