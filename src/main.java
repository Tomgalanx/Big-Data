import PartOne.partie1;
import PartThree.partie3;
import PartTwo.part2;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;

/**
 * The type Main.
 */
public class main {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Logger.getLogger("org").setLevel(Level.OFF);
        Logger.getLogger("akka").setLevel(Level.OFF);
        Logger.getLogger("info").setLevel(Level.OFF);


        String chemin ="document/echantillon-flows.txt";
        ConnexionClass connexion = new ConnexionClass();
        SparkSession sparkSession = connexion.getSession();


        Dataset<Row> fichier = connexion.lireFichier(chemin);

        partie1 one = new partie1(sparkSession,fichier);
        part2 two = new part2(sparkSession,fichier);
        partie3 trois = new partie3(sparkSession,fichier);

        System.out.println("############ PARTIE I ############");

        one.q1();
        one.q2();
        one.q3();
        one.q4();
        one.q5();



        System.out.println("############ PARTIE II ############");

        two.q1();
        two.q2();
        two.q3();
        two.q4();


        System.out.println("############ PARTIE III ############");
        trois.q1();

        System.out.println("############ PARTIE IV ############");

        trois.q2();



    }
}
