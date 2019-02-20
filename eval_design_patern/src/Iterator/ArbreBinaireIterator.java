package Iterator;

import app.ArbreBinaire;

import java.util.Iterator;

public class ArbreBinaireIterator implements Iterator<ArbreBinaire> {

    private ArbreBinaire arbreBinaire;
    boolean moi;

    ArbreBinaireIterator FilsGaucheIterator;
    ArbreBinaireIterator FilsDroitIterator;

    public ArbreBinaireIterator(ArbreBinaire arbreBinaire) {
        moi = false;
        this.arbreBinaire = arbreBinaire;
        if(arbreBinaire.getFilsGauche()!=null) {
            this.FilsGaucheIterator = arbreBinaire.getFilsGauche().iterator();
        }
        if(arbreBinaire.getFilsDroit()!=null) {
            this.FilsDroitIterator = arbreBinaire.getFilsDroit().iterator();
        }
    }

    @Override
    public boolean hasNext() {
        if(this.FilsGaucheIterator!=null && this.FilsGaucheIterator.hasNext()) {
            return true;
        }
        else if(this.FilsDroitIterator!=null && this.FilsDroitIterator.hasNext()) {
            return true;
        }
        else if(!moi) {
            return true;
        }
        return false;
    }

    @Override
    public ArbreBinaire next() {
        if(this.FilsGaucheIterator != null && this.FilsGaucheIterator.hasNext()) {
            return FilsGaucheIterator.next();
        }
        else if(this.FilsDroitIterator!=null && this.FilsDroitIterator.hasNext()) {
            return FilsDroitIterator.next();
        }
        else if(!moi) {
            moi = true ;
            return this.arbreBinaire;
        }
        return null;
    }
}
