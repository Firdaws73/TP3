
## Auteur
Firdawsse Ahchouche
## Introduction
L'objectif principal de cette application est de simplifier la gestion des patients dans un environnement médical en offrant une interface  sécurisée.
## projet
Patients-MVC est une application web développée avec Spring Boot et suivant le modèle de conception MVC (Model-View-Controller).
 Elle permet la gestion des patients via une interface web, en utilisant le moteur de templates Thymeleaf, et les données sont gérées dans une base de données MySQL.

## Fonctionnalités
 • Gestion des patients (ajout, modification, suppression, liste).
 • Utilisation de Thymeleaf pour les templates HTML.
 • Validation des données avec Spring Validation.
 • Utilisation de Bootstrap pour le style et la mise en page.

## Technologie utilisé
 •Spring Boot (Data JPA, Web, Security, Thymeleaf).
 •Thymeleaf Layout Dialect.
 •Bootstrap (via WebJars).
 •Base de données : MySQL
 •Langage de programmation : Java (version 21).



## Structure su projet

Le projet est organisé comme suite

```
src/
├── main/
│   ├── java/
│   │   └── ma/
│   │       └── enset/
│   │           └── patientsmvc/
│   │               ├── entities/
│   │               │   └── Patient.java
│   │               ├── repositories/
│   │               │   └── PatientRepository.java
│   │               ├── web/
│   │               │   ├── patientController.java
│   │               │   └── PatientsMvcApplication.java
│   └── resources/
│       ├── static/
│       └── templates/
│           ├── editPatient.html
│           ├── formPatients.html
│           ├── patients.html
│           └── template1.html
│       └── application.properties
└── test/
    └── java/
1. src/main/java/ma/enset/patientsmvc/
entities/
Patient.java
Représente l'entité "Patient", qui est utilisée pour modéliser les patients dans la base de données. Elle contient les attributs comme le nom, la date de naissance, etc.
repositories/
PatientRepository.java
Interface qui fournit des méthodes pour interagir avec la base de données, comme l'ajout, la modification, la suppression et la récupération des patients.
web/
patientController.java
Contrôleur responsable pour gère les requêtes HTTP liées à la gestion des patients. Par exemple, afficher la liste des patients, ajouter, modifier ou supprimer un patient.

PatientsMvcApplication.java
Classe principale de l'application Spring Boot. Elle contient la méthode main() pour démarrer l'application.

2. src/main/resources/
static/
Dossier réservé aux fichiers statiques comme les feuilles de style CSS, les images ou les fichiers JavaScript. 

templates/
Contient les fichiers HTML qui servent de vues pour l'application. 

editPatient.html
Page HTML pour modifier les informations d'un patient existant.

formPatients.html
Page HTML pour ajouter un nouveau patient via un formulaire.

patients.html
Page principale qui affiche la liste des patients enregistrés dans la base de données.

application.properties
Fichier de configuration de l'application. Il contient des informations comme les paramètres de la base de données (URL, nom d'utilisateur, mot de passe) et d'autres réglages spécifiques à Spring Boot.

3. src/test/
java/
Dossier destiné à contenir les tests unitaires ou d'intégration pour vérifier que les fonctionnalités de l'application fonctionnent comme prévu.



