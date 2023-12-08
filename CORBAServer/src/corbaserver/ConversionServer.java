
package corbaserver;

import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import service.ConversionImpl;

import javax.naming.Context;
import javax.naming.InitialContext;

public class ConversionServer {
    public static void main(String[] args) {
        try {
            // Initialisation de l'ORB
            ORB orb = ORB.init(args, null);
            // Récupération du RootPOA
            POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            // Initialisation du contexte JNDI
            Context ctx = new InitialContext();
            // Création de l'objet servant
            ConversionImpl od = new ConversionImpl();
            // Liaison de l'objet au contexte JNDI avec le nom "od"
            ctx.rebind("od", poa.servant_to_reference(od))
            // Lancement du serveur ORB
            orb.run();
        } catch (Exception e) {
            // Gestion des exceptions en cas d'erreur
            e.printStackTrace();
        }
    }
}
