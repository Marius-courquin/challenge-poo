package metier;


public class Adresse {
    private String typeVoie;
    private String nomVoie;
    private String numeroVoie;
    private String codePostal;
    private String ville;

    public Adresse() {
    }

    public Adresse(String typeVoie, String nomVoie, String numeroVoie, String codePostal, String ville) {
        this.typeVoie = typeVoie;
        this.nomVoie = nomVoie;
        this.numeroVoie = numeroVoie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public void setTypeVoie(String typeVoie) {
        this.typeVoie = typeVoie;
    }

    public void setNomVoie(String nomVoie) {
        this.nomVoie = nomVoie;
    }

    public void setNumeroVoie(String numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTypeVoie() {
        return typeVoie;
    }

    public String getNomVoie() {
        return nomVoie;
    }

    public String getNumeroVoie() {
        return numeroVoie;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "typeVoie='" + typeVoie + '\'' +
                ", nomVoie='" + nomVoie + '\'' +
                ", numeroVoie='" + numeroVoie + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
