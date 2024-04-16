package dao;

import metier.E_CategorieSurfaceBien;

public interface DaoCategorieSurface extends IntDao<E_CategorieSurfaceBien> {

    public E_CategorieSurfaceBien findLibCategorieSurface(String libelle);

    public E_CategorieSurfaceBien find(int id);

}
