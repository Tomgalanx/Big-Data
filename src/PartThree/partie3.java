package PartThree;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import java.util.Arrays;
import java.util.List;

import static org.apache.spark.sql.functions.*;

/**
 * The type Partie 3.
 */
public class partie3 {

    private SparkSession sparkSession;
    private Dataset<Row> chemin;
    /**
     * The Debut.
     */
    long debut;

    /**
     * Instantiates a new Partie 3.
     *
     * @param sparkSession the spark session
     * @param chemin       the chemin
     */
    public partie3(SparkSession sparkSession, Dataset<Row> chemin){

        this.sparkSession = sparkSession;
        this.chemin = chemin;
    }


    /**
     * Q 1.
     */
    public void q1(){

        // Dataset a affiche
        Dataset<Row> resultat;

        // On prepare la boucle
        int length=chemin.schema().length();
        String[] column=chemin.columns();
        // On assigne les columns en String
        String[] typeString = {"ordinateur_source","ordinateur_destination","port_source","port_destination","protocole"};
        List<String> res = Arrays.asList(typeString);

        // On fait la boucle
        for(int j=2;j<length;j++) {
            for(int k=j+1;k<length;k++) {
                if(k!=j) {
                    // Si c'est un string, on genere la paire et on l'affiche
                    if(res.contains(column[j]) && res.contains(column[k])) {
                        resultat = creationPaire(chemin, column[j], column[k], column[j] + " And " + column[k]);
                        resultat.show();
                    }
                }
            }
        }
    }


    /**
     * Creation paire dataset.
     *
     * @param df          the df
     * @param col1        the col 1
     * @param col2        the col 2
     * @param nomresultat the nomresultat
     * @return the dataset
     */
// méthode pour créer les paires
    public Dataset<Row> creationPaire(Dataset<Row> df, String col1, String col2, String nomresultat){

        Dataset<Row> resultat;

        // On génére les bonnes columns de col1 et col2 avec le nom : nomreseultat et le count
        resultat = df.withColumn(nomresultat, concat(df.col(col1), lit(", "), df.col(col2))).groupBy(nomresultat).count();
        return resultat;
    }


    /**
     * Q 2.
     */
    public void q2() {

        // Dataset a affiche
        Dataset<Row> resultat;

        // On prepare la boucle
        int length = chemin.schema().length();
        String[] column = chemin.columns();
        // On assigne les columns en String
        String[] typeString = {"ordinateur_source", "ordinateur_destination", "port_source", "port_destination", "protocole"};
        List<String> res = Arrays.asList(typeString);

        debut = System.currentTimeMillis() / 1000l;

        while ((System.currentTimeMillis() / 1000l) - debut <= 60) {
            //System.out.println((System.currentTimeMillis() / 1000l) - debut);
            // On fait la boucle
            for (int j = 2; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (k != j) {

                        if((System.currentTimeMillis() / 1000l) - debut > 60)
                            return;
                        // Si c'est un string, on genere la paire et on l'affiche
                        if (res.contains(column[j]) && res.contains(column[k])) {
                            resultat = creationPaire(chemin, column[j], column[k], column[j] + " And " + column[k]);
                            resultat.show();
                        }
                    }
                }
            }

        }
    }

}
