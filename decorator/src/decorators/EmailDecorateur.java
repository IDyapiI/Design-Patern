package decorators;

import app.Email;

public class EmailDecorateur extends Email{

    protected Email email;

    public EmailDecorateur(Email email) {
        super();
        this.email = email;
    }
}
