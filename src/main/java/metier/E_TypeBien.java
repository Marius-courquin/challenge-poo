package metier;

import jakarta.persistence.*;
import org.mongojack.ObjectId;

@Entity
@Table(name = "TYPE_BIEN" )
public class E_TypeBien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TYPE_BIEN")
    @org.mongojack.Id
    @ObjectId
    private int idTypeBien;
    @Column(name = "LIB_TYPE_BIEN")
    private String libTypeBien;

    public int getIdTypeBien() {
        return idTypeBien;
    }

    public void setIdTypeBien(int idTypeBien) {
        this.idTypeBien = idTypeBien;
    }

    public String getLibTypeBien() {
        return libTypeBien;
    }

    public void setLibTypeBien(String libTypeBien) {
        this.libTypeBien = libTypeBien;
    }

    @Override
    public String toString() {
        return "E_TypeBien{" +
                "idTypeBien=" + idTypeBien +
                ", libTypeBien='" + libTypeBien + '\'' +
                '}';
    }
}
