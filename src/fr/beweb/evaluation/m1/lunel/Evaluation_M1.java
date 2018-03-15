/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.beweb.evaluation.m1.lunel;

import bwb_evaluation_algo.library.EvaluationSystem;

/**
 *
 * @author fabien
 */
public class Evaluation_M1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /* 
       
ifconfig 198.162.1.149
        
        
CoreEvaluation eval = EvaluationSystem.getEvaluation();

Tag root = new Tag("html");
Tag head = new Tag("head");
Tag body = new Tag("body");


head.addStylesheet("style.css");

head.insertInto(root);

body.insertInto(root);


/*   

String question = ""; 

listage des tags 

TagH1
TagH2
TagQR
TagQCM


** boucle lecture fichier

lecture fichier questionnaire.txt et plannififcation mise en page du resorti html

- lecture 1er caractère de chaque ligne :

intialisation String ligne et lecture des 2 1ers caractère stockés dans une variable   
char firstC= ligne.char(0);
char secondC= ligne.char(1);  
  

boucle for ayant pouru objectif de vérifier le 1er paragraphe de chaque ligne et de passer à la ligne suivante

for (int i=1;i<fichier.heigth,i++)
{
if 
  (firstC == '#' && secondC !='#')
  {
  alors le contenu rejoint TagH1
  }
  else if
  (firstC == '#' && secondC =='#')
  {
  alors le contenu rejoint TagH2
  }
  else if 
  ( firstC != '#' && firstC en  majuscules)
  {
  alors le contenu rejoint les questions qui incrémente le tableau
  }
}


savoir si une question est un QR ou un QCM 
if 
  (firstC != '#' && firstC.ligne+1 !='-")
  {
  alors la question obient le tagQR}
  }
  else if
  (firstC != '#' && firstC.ligne+1 == '-')
  {
  alors la question obient le tagQCM
  }
  
 tag QR 
  implémente la méthode

  eval.interact(string)

 tag QCM implémente la méthode

  eval.interact(string, args)



je ne vois pas ensuite comment intégrer les bonnes questions dans les bonnes divisions <div>
je ne vois pas non plus comment imbriquer les fichiers par leurs tags pour qu'ils soient affectés par les comportements
des fichiers .css, .html 


----------

réponse aux questions 

algo 
    variables
1 - à enregistrer une information qui peut être réutilisée ou modifiée
2 - 
  

 List<String> questions = new ArrayList<>() ;
*/ 
 

EvaluationSystem.getAutorun().launch("../questionnaire.txt","../index.html");
    }
    
}
