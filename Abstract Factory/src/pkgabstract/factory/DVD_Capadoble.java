/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.factory;

/**
 *
 * @author Tatiana
 */
public class DVD_Capadoble extends DVD{
    
        @Override
    public String getCapacidad() {
            return "8.55 GB";
    }
 
    @Override
    public String getNombre() {
            return "DVD Capa Doble";
    }
 
    @Override
    public String getPrecio() {
            return "10.00$";
    }
}
