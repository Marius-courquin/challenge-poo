package challenge.metier;

import jakarta.persistence.*;
import org.mongojack.ObjectId;

@Entity
@Table(name = "CATEGORIE_SURFACE_BIEN")
public class E_CategorieSurfaceBien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_CATEGORIE_SURFACE_BIEN")
    @org.mongojack.Id
    @ObjectId
    private int idCategorieSurfaceBien;
    @Column(name = "LIB_CATEGORIE_SURFACE_BIEN")
    private String libCategorieSurfaceBien;

    public int getIdCategorieSurfaceBien() {
        return idCategorieSurfaceBien;
    }

    public void setIdCategorieSurfaceBien(int idCategorieSurfaceBien) {
        this.idCategorieSurfaceBien = idCategorieSurfaceBien;
    }

    public String getLibCategorieSurfaceBien() {
        return libCategorieSurfaceBien;
    }

    public void setLibCategorieSurfaceBien(String libCategorieSurfaceBien) {
        this.libCategorieSurfaceBien = libCategorieSurfaceBien;
    }

    @Override
    public String toString() {
        return "E_CategorieSurfaceBien{" +
                "idCategorieSurfaceBien=" + idCategorieSurfaceBien +
                ", libCategorieSurfaceBien='" + libCategorieSurfaceBien + '\'' +
                '}';
    }
}
