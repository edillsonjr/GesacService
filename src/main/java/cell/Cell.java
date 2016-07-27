/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cell;

/**
 *
 * @author murilo
 */
public class Cell {
    private final DataType t;
    private final Object value;

    public Cell(DataType t, Object value) {
        this.t = t;
        this.value = value;
    }

    public DataType getT() {return t;}

    public Object getValue() {return value;}
    
}
