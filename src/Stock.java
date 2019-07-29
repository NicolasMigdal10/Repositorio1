
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Stock {
   private ArrayList<ItemStock>items;

    
    public ArrayList<ItemStock> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemStock> items) {
        this.items = items;
    }
    
    ArrayList consultarItemsFaltantes(int cantidadMaxima){
        ArrayList resultado=new ArrayList<>();
        for(int i=0;i<items.size();i++){
            if(items.get(i).getCantidad() < cantidadMaxima ){
                resultado.add(items.get(i));
            }
        }
        return resultado;
    }
    
}
