
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class ItemStock {
    private Computadora computadora;
    private int cantidad;
    private Date ultimaFechaModificacion;
    
    ItemStock(Computadora computadora,int cantidad){
    this.computadora= computadora;
    this.cantidad= cantidad;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
    int getCantidad(){
        return cantidad;
    }
}
