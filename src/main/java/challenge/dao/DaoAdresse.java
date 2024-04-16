package challenge.dao;

import challenge.metier.E_Adresse;
import challenge.metier.E_Bien;

import java.util.List;

public interface DaoAdresse extends IntDao<E_Adresse> {

    int nombreBiens(E_Adresse adresse);

    List<E_Bien> biensACetteAdresse(E_Adresse adresse);

    E_Adresse find(int id);

}
