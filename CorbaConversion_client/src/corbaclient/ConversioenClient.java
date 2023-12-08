/*
   Package corbaclient: Ce package contient la classe ConversioenClient, qui est un client CORBA pour l'interface de conversion.

   Classe ConversioenClient: Cette classe représente le client CORBA qui utilise l'interface IConversionReemote pour effectuer des conversions.

   Méthode main: La méthode principale du client, elle initialise le contexte JNDI, effectue une recherche pour obtenir la référence distante ("od"),
   puis utilise le stub de l'interface IConversionReemote pour effectuer des appels distants et affiche les résultats des conversions.

   Note: Il y a une faute de frappe dans le nom de la classe (ConversioenClient), il devrait être corrigé en Conversio**n**Client.
*/
package corbaclient;

import CorbaConversion.IConversionReemote;
import CorbaConversion.IConversionReemoteHelper;
import CorbaConversion.IConversionReemoteHolder;
import CorbaConversion.IConversionReemotePOA;

import javax.naming.Context;
import javax.naming.InitialContext;

public class ConversioenClient {
    public static void main(String[] args) {
        try {
            // Initialisation du contexte JNDI
            Context ctx = new InitialContext();

            // Recherche de la référence distante "od"
            java.lang.Object ref = ctx.lookup("od");

            // Conversion de la référence en stub de l'interface IConversionReemote
            IConversionReemote stub = IConversionReemoteHelper.narrow((org.omg.CORBA.Object)ref);

            // Appels distants pour effectuer des conversions et affichage des résultats
            System.out.println(stub.conversion(70));
            System.out.println(stub.conversion(1500));

        } catch (Exception e) {
            // Gestion des exceptions en cas d'erreur
            e.printStackTrace();
        }
    }
}
