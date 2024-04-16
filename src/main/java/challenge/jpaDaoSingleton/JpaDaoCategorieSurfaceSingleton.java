package challenge.jpaDaoSingleton;

import challenge.dao.DaoCategorieSurface;
import challenge.metier.E_CategorieSurfaceBien;

public class JpaDaoCategorieSurfaceSingleton extends JpaDaoSingleton<E_CategorieSurfaceBien> implements DaoCategorieSurface {

    private JpaDaoCategorieSurfaceSingleton() {
            super();
    }

    private static JpaDaoCategorieSurfaceSingleton instance;

    public static JpaDaoCategorieSurfaceSingleton getInstance() {
        if (instance == null) {
            instance = new JpaDaoCategorieSurfaceSingleton();
        }
        return instance;
    }

    public E_CategorieSurfaceBien findLibCategorieSurface(String libelle) {
        return entityManager.createQuery("SELECT c FROM E_CategorieSurfaceBien c WHERE c.libCategorieSurfaceBien = :libelle", E_CategorieSurfaceBien.class)
                .setParameter("libelle", libelle)
                .getSingleResult();
    }

    public E_CategorieSurfaceBien find(int id) {
        return entityManager.find(E_CategorieSurfaceBien.class, id);
    }
}
