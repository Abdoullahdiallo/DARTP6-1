/*
   Package service: Ce package contient l'implémentation de l'interface distante IConversionReemote.

   Classe ConversionImpl: Cette classe étend l'interface IConversionReemotePOA et fournit une implémentation de la méthode conversion.

   Méthode conversion: Cette méthode prend une valeur en mètres (mt) en paramètre, effectue une conversion en la multipliant par 3.3,
   et renvoie le résultat de la conversion.

   Remarque: Cette classe doit être déployée du côté serveur pour fournir les fonctionnalités de conversion aux clients CORBA.
*/
package service;

import CorbaConversion.IConversionReemotePOA;

public class ConversionImpl extends IConversionReemotePOA {

    /*
       Méthode conversion: Implémentation de la méthode définie dans l'interface IConversionReemote.
       @param mt: La valeur en mètres à convertir.
       @return: Le résultat de la conversion (mt * 3.3).
    */
    @Override
    public double conversion(double mt) {
        return mt * 3.3;
    }
}
