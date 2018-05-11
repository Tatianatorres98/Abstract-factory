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
public class FabricaDisco_Capasimple implements FabricaDisco{
    
    @Override
       public Bluray crearBluRay() {
               return new Bluray_Capasimple();
       }
 
       @Override
       public DVD crearDVD() {
               return new DVD_Capasimple();
       }
    

}
