package decorators;

import app.Email;

public class SalutationsDecorateur extends EmailDecorateur{

    public SalutationsDecorateur(Email email) {
        super(email);
    }

    @Override
    public String envoyer() {
        return "Bonjour Madame, Monsieur, " + email.envoyer() ;
    }
}
