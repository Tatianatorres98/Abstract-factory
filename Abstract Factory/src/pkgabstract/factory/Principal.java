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
public class Principal {
    
FabricaDisco fabrica = new FabricaDisco_Capasimple();
DVD dvd = fabrica.crearDVD();;
Bluray bluray = fabrica.crearBluRay();;
 


 
    
}
