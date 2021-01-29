package PartOne;

import org.apache.spark.sql.Column;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import scala.collection.JavaConverters;
import scala.collection.Seq;

import java.util.ArrayList;

import static org.apache.spark.sql.functions.*;

/**
 * The type Partie 1.
 */
public class partie1 {


    private SparkSession sparkSession;
    private Dataset<Row> chemin;

    /**
     * Instantiates a new Partie 1.
     *
     * @param sparkSession the spark session
     * @param chemin       the chemin
     */
    public partie1(SparkSession sparkSession, Dataset<Row> chemin){

        this.sparkSession = sparkSession;
        this.chemin = chemin;
    }


    /**
     * Q 1.
     */
    public void q1(){

        // On affiche juste le resultat de la lecture
        System.out.println("Q1. Lire de flux");

        chemin.show();


    }

    /**
     * Q 2.
     */
    public void q2(){

        System.out.println("Q2. Calculer le nombre d'occurence des strings");


        //Dataset<Row> Filter = chemin.withColumn("(ordinateur_source, ordinateur_destination)", concat(chemin.col("ordinateur_source"), lit(",   "), chemin.col("ordinateur_destination")));

        // On compte les occurences pour chaque colonne de string
        chemin.groupBy("ordinateur_source").count().show(10,false);
        chemin.groupBy("ordinateur_destination").count().show(10,false);
        chemin.groupBy("port_source").count().show(10,false);
        chemin.groupBy("port_destination").count().show(10,false);
        chemin.groupBy("protocole").count().show(10,false);

    }


    /**
     * Q 3.
     */
    public void q3(){

        System.out.println("Q3. Calculer les moyennes, max, min et somme");
        chemin.groupBy("duree").agg(mean("duree"),max("duree"),min("duree"),sum("duree"))
                .show(10,false);

        chemin.groupBy("nombre_paquet").agg(mean("nombre_paquet"),max("nombre_paquet"),min("nombre_paquet"),sum("nombre_paquet"))
                .show(10,false);

        chemin.groupBy("nombre_octet").agg(mean("nombre_octet"),max("nombre_octet"),min("nombre_octet"),sum("nombre_octet"))
                .show(10,false);
    }


    /**
     * Q 4.
     */
    public void q4(){


        System.out.println("Q5. Aggrégations avec ordinateur_source");

        chemin.sqlContext().sql("SELECT max(duree),min(duree),mean(duree),sum(duree), ordinateur_source from tab group by ordinateur_source").show(10,false);
        
        chemin.sqlContext().sql("SELECT max(nombre_octet),min(nombre_octet),mean(nombre_octet),sum(nombre_octet), ordinateur_source from tab group by ordinateur_source").show(10,false);

        chemin.sqlContext().sql("SELECT max(nombre_paquet),min(nombre_paquet),mean(nombre_paquet),sum(nombre_paquet), ordinateur_source from tab group by ordinateur_source").show(10,false);

    }


    /**
     * Q 5.
     */
    public void q5() {

        System.out.println("Q6. Aggrégations avec ordinateur_source");

        chemin.sqlContext().sql("SELECT ordinateur_source,count(port_source),count(ordinateur_destination),count(port_destination),count(protocole) from tab group by ordinateur_source").show(10,false);

    }
}
