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
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String error) {
        System.out.println(error);
    }
}
