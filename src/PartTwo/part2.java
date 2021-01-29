package PartTwo;

import org.apache.spark.sql.Column;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import static org.apache.spark.sql.functions.*;

/**
 * The type Part 2.
 */
public class part2 {


    private SparkSession sparkSession;
    private Dataset<Row> chemin;

    /**
     * Instantiates a new Part 2.
     *
     * @param sparkSession the spark session
     * @param chemin       the chemin
     */
    public part2(SparkSession sparkSession, Dataset<Row> chemin){

        this.sparkSession = sparkSession;
        this.chemin = chemin;
    }


    /**
     * Q 1.
     */
    public void q1(){

        System.out.println("Q1. Calculer le nombre de connexion entre un ordinateur source et destination");


        // On ajoute une nouvelle colonne pour la paire ordinateur_source/ordinateur_destionation
        Dataset<Row> Filter = chemin.withColumn("(ordinateur_source, ordinateur_destination)", concat(chemin.col("ordinateur_source"), lit(",   "), chemin.col("ordinateur_destination")));


        Filter.groupBy("(ordinateur_source, ordinateur_destination)").count().show(10,false);



    }


    /**
     * Q 2.
     */
    public void q2(){

        System.out.println("Q2. Calculer le nombre d'occurrence pour chaque connexion d'un ordinateur source vers destination Protocole");

        Dataset<Row> Filter = chemin.withColumn("(ordinateur_source, ordinateur_destination : protocole)", concat(chemin.col("ordinateur_source"), lit(",   "), chemin.col("ordinateur_destination"), lit(":   "),chemin.col("protocole")));

        Filter.groupBy("(ordinateur_source, ordinateur_destination : protocole)").count().show(10,false);

    }

    /**
     * Q 3.
     */
    public void q3(){

        System.out.println("Q2. Calculer le nombre d'occurrence pour chaque connexion d'un ordinateur source vers destination PORT source");

        Dataset<Row> Filter = chemin.withColumn("(ordinateur_source, ordinateur_destination : PORT SOURCE)", concat(chemin.col("ordinateur_source"), lit(",   "), chemin.col("ordinateur_destination"), lit(":   "),chemin.col("port_source")));


        Filter.groupBy("(ordinateur_source, ordinateur_destination : PORT SOURCE)").count().show(10,false);

    }

    /**
     * Q 4.
     */
    public void q4(){

        System.out.println("Q2. Calculer le nombre d'occurrence pour chaque connexion d'un ordinateur source vers destination PORT destination");

        Dataset<Row> Filter = chemin.withColumn("(ordinateur_source, ordinateur_destination : PORT DEST)", concat(chemin.col("ordinateur_source"), lit(",   "), chemin.col("ordinateur_destination"), lit(":   "),chemin.col("port_destination")));

        Filter.groupBy("(ordinateur_source, ordinateur_destination : PORT DEST)").count().show(10,false);

    }
}
