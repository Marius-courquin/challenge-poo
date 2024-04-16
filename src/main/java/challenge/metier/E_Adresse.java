package challenge.metier;

import jakarta.persistence.*;
import org.mongojack.ObjectId;

@Entity
@Table(name = "ADRESSE")
public class E_Adresse {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ADRESSE")
    @org.mongojack.Id
    @ObjectId
    private int idAdresse;
    @Column(name = "type_voie")
    private String typeVoie;
    @Column(name = "nom_voie")
    private String nomVoie;
    @Column(name = "numero_voie")
    private String numeroVoie;
    @Column(name = "code_postal")
    private String codePostal;
    @Column(name = "ville")
    private String ville;

    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(int idAdresse) {
        this.idAdresse = idAdresse;
    }

    public String getTypeVoie() {
        return typeVoie;
    }

    public void setTypeVoie(String typeVoie) {
        this.typeVoie = typeVoie;
    }

    public String getNomVoie() {
        return nomVoie;
    }

    public void setNomVoie(String nomVoie) {
        this.nomVoie = nomVoie;
    }

    public String getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(String numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "E_Adresse{" +
                "idAdresse=" + idAdresse +
                ", typeVoie='" + typeVoie + '\'' +
                ", nomVoie='" + nomVoie + '\'' +
                ", numeroVoie='" + numeroVoie + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
