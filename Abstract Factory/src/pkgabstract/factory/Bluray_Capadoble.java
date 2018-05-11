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
public class Bluray_Capadoble extends Bluray {

    @Override
    public String getCapacidad() {
        return "50 GB";
    }

    @Override
    public String getNombre() {
        return "Bluray capa doble";
    }

    @Override
    public String getPrecio() {
        return "30.00$";
    }
}
