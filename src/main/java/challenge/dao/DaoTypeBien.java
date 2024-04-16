package challenge.dao;

import challenge.metier.E_TypeBien;

public interface DaoTypeBien extends IntDao<E_TypeBien> {

    public E_TypeBien findLibTypeBien(String libelle);

    public E_TypeBien find(int id);

}
