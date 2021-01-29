# Projet Big-Data


## 1. Introduction

## 2. Spark

### 2.1. Partie I

![Alt text} (BigData_Project/screen_premiere/P1/Q1.png "OK")
### 2.2. Partie II

### 2.2. Partie III

### 2.4. Partie IV

### 2.5. Partie V

#### Cette partie a été developpé sous google colab en utilisant pyspark et comme langage de programmation python.

## Environnement de travail

#### On trouve ci-dessous les captures d'écran contenants les commandes à executer afin de mettre en place l'environnement de travail:

![alt text][logo8]

[logo8]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen8.png

![alt text][logo9]

[logo9]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen9.png

![alt text][logo10]

[logo10]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen10.png

![alt text][logo11]

[logo11]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen11.png

## Données

#### Le fichiers de données faudra le coller dans le répértoire home, comme l'exemple ci-dessous avec le fichier "echantillon-flows.txt" :

![alt text][logo7]

[logo7]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen7.png

## Code

#### Dans cette partie on trouve le programme que je vous mettrez aussi ci-joint:

![alt text][logo12]

[logo12]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen12.png

![alt text][logo13]

[logo13]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen13.png

![alt text][logo14]

[logo14]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen14.png

![alt text][logo15]

[logo15]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen15.png

![alt text][logo16]

[logo16]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen16.png

![alt text][logo17]

[logo17]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen17.png

### 2.5.1. Graphe 1
#### 1. Calculez le nombre de connexion d'un ordinateur source vers un ordinateur destination ainsi la moyenne (mean), somme ("sum"), standard déviation (stddev), minimum (min), maximum (max) des nombre de paquets.

![alt text][logo1]

[logo1]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen1.png

![alt text][logo2]

[logo2]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen2.png

#### 2. Créez un graphe de connexion entre ordinateur source et ordinateur destination. Les sommets du graphe représentent les ordinateurs et les arcs représentent le connexion entre deux machines. Les sommets n'ont aucune propriétés. Les arcs ont comme propriétés count, mean, "sum", stddev, min, max du nombre de paquets (Figure 1).

![alt text][logo3]

[logo3]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen3.png

![alt text][logo4]

[logo4]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen4.png

#### 3. Pour chaque sommet, calculez le nombre d'arcs entrant et sortant d'un sommet (inDegree et outDegree).

![alt text][logo20]

[logo20]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen20.png

#### 4. Pour chaque sommet, calculez la "sum" des paramètres de arcs entrant et sortant d'un sommet. Donc vous aurez la somme des count, mean, stddev, min, max. des nombre de paquets.
![alt text][logo21]

[logo21]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen21.png

![alt text][logo15]

[logo15]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen15.png

![alt text][logo22]

[logo22]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen22.png

### 2.5.2. Graphe 2
#### 1. A partir des données en input (Partie I, question 1), construire presque le même graphe de connexions entre ordinateur source et ordinateur destination. Les sommets n'ont aucune propriétés. Les arcs ont comme propriétés la durée, port source, port destination, nombre de paquets et d'octets et le timestamp. Indication : les sommets représentent les ordinateur source et destination (Figure 2).

![alt text][logo5]

[logo5]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen5.png

![alt text][logo6]

[logo6]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen6.png

#### 2. Pour chaque sommet, calculez le nombre d'arcs entrant et sortant d'un sommet (inDegree et outDegree).

![alt text][logo20]

[logo20]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen20.png

#### 3. Pour chaque sommet, calculez le mean, sum, min, max du nombre de paquets des arcs entrant et sortant d'un sommet.

![alt text][logo23]

[logo23]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen23.png

## Difficultés rencontrées

### IntelliJ et JAVA

#### Au début je voulais programmer en java mais j'ai rencontré un probléme de heap size que j'ai tenté de résoudre en consultant des forums et en cherchant sur internet mais sans parvenir à un résultat, apparemment mon ordinateur n'est pas assez puissant. Quand je mets le maximum du heap size cela ne change rien quand je le dépasse l'application ne démarre plus, donc j'ai remis le heap size initiale en modifiant directement dans les fichiers de config.

![alt text][logo19]

[logo19]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen19.png

#### GraphFrame

#### Comme alternative j'ai décidé de travailler sous google colab en utilisant pyspark et comme langage de programmation python. En essayant d'utiliser le package GraphFrame j'ai une erreur qui s'affiche me disant que org.graphframes.GraphFramePythonAPI est introuvable alors que je l'ai bien installé. Du coup j'arrive pas à executer une partie du programme, mais j'ai quand même essayé d'écrire du code un les connaissances assimilées durant le cours et les liens fournis ("GraphFrames User Guide" par exemple).

![alt text][logo18]

[logo18]: https://github.com/Tomgalanx/Big-Data/blob/main/BigData_Project/Screen18.png

## 3. Résultat à fournir
