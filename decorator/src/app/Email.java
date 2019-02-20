package app;

public class Email {
    protected String texte;

    public Email() {
        texte = "je suis le texte de mon mail";
    }

//    @Override
    public String envoyer() {
        return texte;
    }

    public String getTexte() {
        return texte;
    }

}