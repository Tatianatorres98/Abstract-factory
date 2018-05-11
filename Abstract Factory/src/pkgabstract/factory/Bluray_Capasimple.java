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
public class Bluray_Capasimple extends Bluray {

    @Override
    public String getCapacidad() {
        return "25 GB";
    }

    @Override
    public String getNombre() {
        return "Bluray capa simple";
    }

    @Override
    public String getPrecio() {
        return "15.00$";
    }
}
