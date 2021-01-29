import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.StructType;

import static org.apache.spark.sql.functions.*;

/**
 * The type Connexion class.
 */
public class ConnexionClass {

    /**
     * The constant colName.
     */
    public static final String[] colName= {"timestamp", "duree", "ordinateur_source",
            "port_source", "ordinateur_destination", "port_destination",
            "protocole","nombre_paquet","nombre_octet"};
    /**
     * The Spark session.
     */
    protected SparkSession sparkSession;

    /**
     * Instantiates a new Connexion class.
     */
    public ConnexionClass(){

        //sparkSession = SparkSession.builder().master("local[*]").appName("BigDATA").config("spark.master", "local").getOrCreate();
        sparkSession = SparkSession
                .builder()
                .config("spark.master", "local")
                .getOrCreate();
    }


    /**
     * Get session spark session.
     *
     * @return the spark session
     */
    public SparkSession getSession(){

        return sparkSession;
    }


    /**
     * Lire fichier dataset.
     *
     * @param chemin the chemin
     * @return the dataset
     */
    public Dataset<Row> lireFichier(String chemin){

        // On met les datatypes
        StructType schema = new StructType()
                .add(colName[0],"String",true)
                .add(colName[1],"Integer", true)
                .add(colName[2],"String",true)
                .add(colName[3],"String",true)
                .add(colName[4],"String",true)
                .add(colName[5],"String",true)
                .add(colName[6],"String",true)
                .add(colName[7],"Integer",true)
                .add(colName[8],"Integer",true);

        // On lit le fichier
        Dataset<Row> dataset = sparkSession.read()
                .option("header", "false")
                .option("delimiter", ",")
                .option("inferSchema", "true")
                .format("csv")
                .schema(schema)
                .load(chemin);

        dataset.createOrReplaceTempView("tab");


        return dataset;
    }


}
