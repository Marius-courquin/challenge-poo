package metier;

public class CategorieSurfaceBien {
    private String libCategorieSurfaceBien;

    public CategorieSurfaceBien() {
    }

    public CategorieSurfaceBien(String libCategorieSurfaceBien) {
        this.libCategorieSurfaceBien = libCategorieSurfaceBien;
    }

    public void setLibCategorieSurfaceBien(String libCategorieSurfaceBien) {
        this.libCategorieSurfaceBien = libCategorieSurfaceBien;
    }

    public String getLibCategorieSurfaceBien() {
        return libCategorieSurfaceBien;
    }

    @Override
    public String toString() {
        return "CategorieSurfaceBien{" +
                "libCategorieSurfaceBien='" + libCategorieSurfaceBien + '\'' +
                '}';
    }
}
