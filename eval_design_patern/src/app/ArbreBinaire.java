package app;

import Iterator.ArbreBinaireIterator;

public class ArbreBinaire implements Iterable<ArbreBinaire> {
    public ArbreBinaire filsGauche;
    public ArbreBinaire filsDroit;
    public String etiquette;

    public ArbreBinaire(String etiquette){
        super();
        this.etiquette = etiquette;
    }

    @Override
    public ArbreBinaireIterator iterator() {
        // TODO Auto-generated method stub
        return new ArbreBinaireIterator(this);
    }


    public ArbreBinaire getFilsGauche() {
        return filsGauche;
    }

    public void setFilsGauche(ArbreBinaire filsGauche) {
        this.filsGauche = filsGauche;
    }

    public ArbreBinaire getFilsDroit() {
        return filsDroit;
    }

    public void setFilsDroit(ArbreBinaire filsDroit) {
        this.filsDroit = filsDroit;
    }

    public String getEtiquette() {
        return etiquette;
    }

    //autre methode que le design patern
    public void parcoursEtiquette() {
        System.out.println(etiquette);
        if(filsGauche != null)
            filsGauche.parcoursEtiquette();
        if(filsDroit != null)
            filsDroit.parcoursEtiquette();
    }
}
