package challenge.metier;

import org.mongojack.Id;
import org.mongojack.ObjectId;

import java.math.BigDecimal;
import java.sql.Date;

public class Bien {
        @Id
        @ObjectId
        private String idBien;
        private TypeBien typeBien;
        private CategorieSurfaceBien categorieSurfaceBien;
        private Adresse adresse;
        private BigDecimal surfaceHabitable;
        private Integer nbrPieces;
        private String descriptionLibre;
        private String commentaireAgence;
        private Date dateCreation;
        private Date dateDerniereMaj;
        private String noAppartement;
        private Integer etage;

        public Bien() {

        }

        public Bien(String idBien, TypeBien typeBien, CategorieSurfaceBien categorieSurfaceBien, Adresse adresse, BigDecimal surfaceHabitable, Integer nbrPieces, String descriptionLibre, String commentaireAgence, Date dateCreation, Date dateDerniereMaj, String noAppartement, Integer etage) {
                this.idBien = idBien;
                this.typeBien = typeBien;
                this.categorieSurfaceBien = categorieSurfaceBien;
                this.adresse = adresse;
                this.surfaceHabitable = surfaceHabitable;
                this.nbrPieces = nbrPieces;
                this.descriptionLibre = descriptionLibre;
                this.commentaireAgence = commentaireAgence;
                this.dateCreation = dateCreation;
                this.dateDerniereMaj = dateDerniereMaj;
                this.noAppartement = noAppartement;
                this.etage = etage;
        }

        public Bien(TypeBien typeBien, CategorieSurfaceBien categorieSurfaceBien, Adresse adresse, BigDecimal surfaceHabitable, Integer nbrPieces, String descriptionLibre, String commentaireAgence, Date dateCreation, Date dateDerniereMaj, String noAppartement, Integer etage) {
                this.typeBien = typeBien;
                this.categorieSurfaceBien = categorieSurfaceBien;
                this.adresse = adresse;
                this.surfaceHabitable = surfaceHabitable;
                this.nbrPieces = nbrPieces;
                this.descriptionLibre = descriptionLibre;
                this.commentaireAgence = commentaireAgence;
                this.dateCreation = dateCreation;
                this.dateDerniereMaj = dateDerniereMaj;
                this.noAppartement = noAppartement;
                this.etage = etage;
        }

        public void setIdBien(String idBien) {
                this.idBien = idBien;
        }

        public void setTypeBien(TypeBien typeBien) {
                this.typeBien = typeBien;
        }

        public void setCategorieSurfaceBien(CategorieSurfaceBien categorieSurfaceBien) {
                this.categorieSurfaceBien = categorieSurfaceBien;
        }

        public void setAdresse(Adresse adresse) {
                this.adresse = adresse;
        }

        public void setSurfaceHabitable(BigDecimal surfaceHabitable) {
                this.surfaceHabitable = surfaceHabitable;
        }

        public void setNbrPieces(Integer nbrPieces) {
                this.nbrPieces = nbrPieces;
        }

        public void setDescriptionLibre(String descriptionLibre) {
                this.descriptionLibre = descriptionLibre;
        }

        public void setCommentaireAgence(String commentaireAgence) {
                this.commentaireAgence = commentaireAgence;
        }

        public void setDateCreation(Date dateCreation) {
                this.dateCreation = dateCreation;
        }

        public void setDateDerniereMaj(Date dateDerniereMaj) {
                this.dateDerniereMaj = dateDerniereMaj;
        }

        public void setNoAppartement(String noAppartement) {
                this.noAppartement = noAppartement;
        }

        public void setEtage(Integer etage) {
                this.etage = etage;
        }

        public String getIdBien() {
                return idBien;
        }

        public TypeBien getTypeBien() {
                return typeBien;
        }

        public CategorieSurfaceBien getCategorieSurfaceBien() {
                return categorieSurfaceBien;
        }

        public Adresse getAdresse() {
                return adresse;
        }

        public BigDecimal getSurfaceHabitable() {
                return surfaceHabitable;
        }

        public Integer getNbrPieces() {
                return nbrPieces;
        }

        public String getDescriptionLibre() {
                return descriptionLibre;
        }

        public String getCommentaireAgence() {
                return commentaireAgence;
        }

        public Date getDateCreation() {
                return dateCreation;
        }

        public Date getDateDerniereMaj() {
                return dateDerniereMaj;
        }

        public String getNoAppartement() {
                return noAppartement;
        }

        public Integer getEtage() {
                return etage;
        }

        @Override
        public String toString() {
                return "Bien{" +
                        "idBien='" + idBien + '\'' +
                        ", typeBien=" + typeBien +
                        ", categorieSurfaceBien=" + categorieSurfaceBien +
                        ", adresse=" + adresse +
                        ", surfaceHabitable=" + surfaceHabitable +
                        ", nbrPieces=" + nbrPieces +
                        ", descriptionLibre='" + descriptionLibre + '\'' +
                        ", commentaireAgence='" + commentaireAgence + '\'' +
                        ", dateCreation=" + dateCreation +
                        ", dateDerniereMaj=" + dateDerniereMaj +
                        ", noAppartement='" + noAppartement + '\'' +
                        ", etage=" + etage +
                        '}';
        }
}
