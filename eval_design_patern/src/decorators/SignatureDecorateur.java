package decorators;

import app.Email;

public class SignatureDecorateur extends EmailDecorateur {

    public SignatureDecorateur(Email email) {
        super(email);
    }

    @Override
    public String envoyer() {
        return email.envoyer() + ", Signature de mail";
    }

}