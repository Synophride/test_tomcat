## Initialisation d'un projet dans eclipse
-> Création d'un serveur associé
   -> ...
-> Création d'un projet associé
   -> Dynamic web project
...

## Architecture

## Déploiement
-> Se trouver dans un répertoire avec les fichiers jsp
   + META_INF contenant le fichier MANIFEST.MF
   + WEB-INF

-> Création d'une archive war



## fichier JSP : Contient du html + du java
Balises
* <%@ ... %> : Balise de configuration
* <%! ... %> : Déclaration d'attributs et de méthodes
* <%  ... %> : Instructions
* <%= ... %> : Expressions (qui seront converties en str pour apparaître dans le fichier)

Objets disponibles : 
* out permettant d'écrire dans la sortie (out.print(s) equivaudrait à echo en php).


-> Pas de constructeur dans une page jsp
-> Pas de méthode main
-> Pas de variables statiques non constantes dans le fichier