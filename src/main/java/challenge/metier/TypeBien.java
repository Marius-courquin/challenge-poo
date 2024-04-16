package challenge.metier;

public class TypeBien {
    private String libTypeBien;

    public TypeBien() {
    }

    public TypeBien(String libTypeBien) {
        this.libTypeBien = libTypeBien;
    }

    public void setLibTypeBien(String libTypeBien) {
        this.libTypeBien = libTypeBien;
    }

    public String getLibTypeBien() {
        return libTypeBien;
    }

    @Override
    public String toString() {
        return "TypeBien{" +
                "libTypeBien='" + libTypeBien + '\'' +
                '}';
    }
}
