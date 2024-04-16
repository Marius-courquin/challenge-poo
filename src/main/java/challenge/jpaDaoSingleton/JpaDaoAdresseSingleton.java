package challenge.jpaDaoSingleton;

import challenge.dao.DaoAdresse;
import challenge.metier.E_Adresse;
import challenge.metier.E_Bien;

import java.util.List;

public class JpaDaoAdresseSingleton extends JpaDaoSingleton<E_Adresse> implements DaoAdresse {

    private JpaDaoAdresseSingleton() {
        super();
    }

    private static JpaDaoAdresseSingleton instance;

    public static JpaDaoAdresseSingleton getInstance() {
        if (instance == null) {
            instance = new JpaDaoAdresseSingleton();
        }
        return instance;
    }

    public int nombreBiens(E_Adresse adresse) {
        return entityManager.createQuery("SELECT COUNT(b) FROM E_Bien b WHERE b.idAdresse = :adresse", Long.class)
                .setParameter("adresse", adresse)
                .getSingleResult().intValue();
    }

    public List<E_Bien> biensACetteAdresse(E_Adresse adresse) {
        return entityManager.createQuery("SELECT b FROM E_Bien b WHERE b.idAdresse = :adresse", E_Bien.class)
                .setParameter("adresse", adresse)
                .getResultList();
    }

    public E_Adresse find(int id) {
        return entityManager.find(E_Adresse.class, id);
    }

}
