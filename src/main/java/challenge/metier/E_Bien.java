package challenge.metier;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import org.mongojack.MongoCollection;
import org.mongojack.ObjectId;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "BIEN")
@MongoCollection(name = "e_bien")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class E_Bien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_BIEN")
    @org.mongojack.Id
    @ObjectId
    private int idBien;
    @ManyToOne
    @JoinColumn(name = "type_bien", referencedColumnName = "ID_TYPE_BIEN")
    private E_TypeBien typeBien;
    @ManyToOne
    @JoinColumn(name = "categorie_surface_bien", referencedColumnName = "ID_CATEGORIE_SURFACE_BIEN")
    private E_CategorieSurfaceBien categorieSurfaceBien;
    @Column(name = "surface_habitable")
    private BigDecimal surfaceHabitable;
    @Column(name = "nbr_pieces")
    private Integer nbrPieces;
    @Column(name = "description_libre")
    private String descriptionLibre;
    @Column(name = "Commentaire_agence")
    private String commentaireAgence;
    @Column(name = "date_creation")
    private Date dateCreation;
    @Column(name = "date_derniere_maj")
    private Date dateDerniereMaj;
    @ManyToOne
    @JoinColumn(name = "ID_ADRESSE", referencedColumnName = "ID_ADRESSE")
    private E_Adresse idAdresse;
    @Column(name = "NO_APPARTEMENT")
    private String noAppartement;
    @Column(name = "ETAGE")
    private Integer etage;

    public int getIdBien() {
        return idBien;
    }

    public void setIdBien(int idBien) {
        this.idBien = idBien;
    }

    public E_TypeBien getTypeBien() {
        return typeBien;
    }

    public void setTypeBien(E_TypeBien typeBien) {
        this.typeBien = typeBien;
    }

    public E_CategorieSurfaceBien getCategorieSurfaceBien() {
        return categorieSurfaceBien;
    }

    public void setCategorieSurfaceBien(E_CategorieSurfaceBien categorieSurfaceBien) {
        this.categorieSurfaceBien = categorieSurfaceBien;
    }

    public BigDecimal getSurfaceHabitable() {
        return surfaceHabitable;
    }

    public void setSurfaceHabitable(BigDecimal surfaceHabitable) {
        this.surfaceHabitable = surfaceHabitable;
    }

    public Integer getNbrPieces() {
        return nbrPieces;
    }

    public void setNbrPieces(Integer nbrPieces) {
        this.nbrPieces = nbrPieces;
    }

    public String getDescriptionLibre() {
        return descriptionLibre;
    }

    public void setDescriptionLibre(String descriptionLibre) {
        this.descriptionLibre = descriptionLibre;
    }

    public String getCommentaireAgence() {
        return commentaireAgence;
    }

    public void setCommentaireAgence(String commentaireAgence) {
        this.commentaireAgence = commentaireAgence;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateDerniereMaj() {
        return dateDerniereMaj;
    }

    public void setDateDerniereMaj(Date dateDerniereMaj) {
        this.dateDerniereMaj = dateDerniereMaj;
    }

    public E_Adresse getAdresse() {
        return idAdresse;
    }

    public void setAdresse(E_Adresse idAdresse) {
        this.idAdresse = idAdresse;
    }

    public String getNoAppartement() {
        return noAppartement;
    }

    public void setNoAppartement(String noAppartement) {
        this.noAppartement = noAppartement;
    }

    public Integer getEtage() {
        return etage;
    }

    public void setEtage(Integer etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        return "E_Bien{" +
                "\nidBien=" + idBien +
                ", \ntypeBien=" + typeBien +
                ", \ncategorieSurfaceBien=" + categorieSurfaceBien +
                ", \nsurfaceHabitable=" + surfaceHabitable +
                ", \nnbrPieces=" + nbrPieces +
                ", \ndescriptionLibre='" + descriptionLibre + '\'' +
                ", \ncommentaireAgence='" + commentaireAgence + '\'' +
                ", \ndateCreation=" + dateCreation +
                ", \ndateDerniereMaj=" + dateDerniereMaj +
                ", \nidAdresse=" + idAdresse +
                ", \nnoAppartement='" + noAppartement + '\'' +
                ", \netage=" + etage +
                '}';
    }
}
