# Transport Management System - Backend

Ce projet représente la partie Backend d'une application de gestion de transport, développée avec **Spring Boot** et **Maven**.

## 🚀 Fonctionnalités Implémentées
* **LigneController** : Gestion des lignes de transport (Départ, Arrivée, Nom de ligne).
* **BusController** : Gestion de la flotte des bus (Matricule, Capacité, Statut).
* **HoraireController** : Gestion des horaires des trajets.
* **Architecture Clean** : Séparation stricte entre les Controllers, les Models, et les Repositories.

## 📦 Structure du Projet
Le code suit l'architecture standard de Spring Boot :
* `src/main/java/transport/controller/` : Les points d'accès API.
* `src/main/java/transport/model/` : Les entités du projet.
* `src/main/java/transport/repository/` : La couche d'accès aux données.
* `src/main/resources/static/data.json` : Données de test locales (Mock Data).

## 🛠️ Instructions de Lancement

Pour lancer le serveur de développement, exécutez la commande suivante dans le terminal :
```bash
./mvnw spring-boot:run -DskipTests