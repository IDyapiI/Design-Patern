package app;

import decorators.SalutationsDecorateur;
import decorators.SignatureDecorateur;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        boolean test = false;
        //mettre test à true pour le decorator
        //mettre test à false pour l'Iterator

        if(test){
            Email e = new Email();
            System.out.println("J'envoie juste mon message :");
            System.out.println(e.envoyer());
            System.out.println("");


            e = new SignatureDecorateur(new Email());
            System.out.println("Je signe mon message :");
            System.out.println(e.envoyer());
            System.out.println("");

            e = new SalutationsDecorateur(new Email());
            System.out.println("Je dit bonjour avant mon message :");
            System.out.println(e.envoyer());
            System.out.println("");

            e = new SalutationsDecorateur(new SignatureDecorateur(new Email()));
            System.out.println("Je dit bonjour avant mon message et je signe :");
            System.out.println(e.envoyer());

        } else {

            ArbreBinaire Root = new ArbreBinaire("1");
            Root.setFilsGauche(new ArbreBinaire("2"));
            Root.setFilsDroit(new ArbreBinaire("3"));
            Root.getFilsGauche().setFilsGauche(new ArbreBinaire("4"));
            Root.getFilsGauche().setFilsDroit(new ArbreBinaire("5"));
            Root.getFilsDroit().setFilsGauche(new ArbreBinaire("6"));
            Root.getFilsDroit().setFilsDroit(new ArbreBinaire("7"));


            System.out.println("Utilisation du design patern iterator :");
            // 	résultat attendu :
            // 4 - 5 - 2 - 6 - 7 - 3 - 1
            for (Iterator<ArbreBinaire> iterator = Root.iterator(); iterator.hasNext(); ) {
                ArbreBinaire element = iterator.next();
                System.out.println(element.getEtiquette());
            }
            System.out.println("");

            System.out.println("Autre méthode pour parcourir l'arbre : ");
            //autre méthode qui fonctionne
            // 	résultat attendu :
            // 1 - 2 - 3 - 4 - 5 - 5 - 6
            Root.parcoursEtiquette();
        }

    }
}