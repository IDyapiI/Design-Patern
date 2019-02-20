package app;

import decorators.SalutationsDecorateur;
import decorators.SignatureDecorateur;

public class App {

    public static void main(String[] args) {
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



    }

}