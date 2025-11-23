# tp-web-services

Ce dépôt regroupe l’ensemble des travaux réalisés dans le cadre des TP du module Web Services.
Les objectifs principaux sont :

- prendre en main Spring Boot
- créer des services REST
- utiliser Spring Data JPA
- configurer une base de données en mémoire (H2)
- préparer la configuration MySQL

Le projet est organisé en trois étapes : TP0, TP1, et TP1-H2.

-- TP0 – Introduction à Spring Boot => Réalisation : Un contrôleur REST simple retournant une réponse JSON.

-- TP1 – API Étudiants (Sans Base de Données) => Créeration d'une API REST permettant de gérer des étudiants en utilisant une structure en mémoire (ArrayList).
- Ajouter un étudiant
- Afficher la liste des étudiants
- Rechercher un étudiant par ID
- Supprimer un étudiant
Endpoints:
- Méthode	Endpoint	Description
- GET	/etudiants	Liste des étudiants
- GET	/etudiants/{id}	Détails d'un étudiant
- POST	/etudiants	Ajout d’un étudiant
- DELETE	/etudiants/{id}	Suppression

--TP1-H2 – API Adhérents Avec Base H2 (Spring Data JPA) =>Reprendre la logique du TP1 mais en intégrant une base de données H2 en mémoire via JPA.
- entity/Adherent.java : entité JPA
- repository/AdherentRepository.java : interface JPA
- controller/AdherentController.java : endpoints REST
- H2Application.java : point d’entrée, initialisation des données


Ce projet couvre :
-les bases du développement REST avec Spring Boot
-la gestion de données en mémoire
-l’utilisation d’une base H2 avec Spring Data JPA
-la préparation pour une migration vers MySQL
