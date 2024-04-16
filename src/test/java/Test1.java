import dao.DaoAdresse;
import dao.DaoBien;
import dao.DaoCategorieSurface;
import dao.DaoTypeBien;
import jpaDAO.JpaDaoAdresse;
import jpaDAO.JpaDaoBien;
import jpaDAO.JpaDaoCategorieSurface;
import jpaDAO.JpaDaoTypeBien;
import metier.E_Adresse;
import metier.E_Bien;
import metier.E_CategorieSurfaceBien;
import metier.E_TypeBien;

import java.math.BigDecimal;

public class Test1 {
    public static void main(String[] args) {
        DaoAdresse adresseManager = new JpaDaoAdresse();
        E_Adresse chezMoi  =    adresseManager.find(5);
        E_Adresse adresse1  =    adresseManager.find(1);
        if (chezMoi != null)
            System.out.println("Chez moi : "+chezMoi.toString()+" il y a "+adresseManager.nombreBiens(chezMoi));
        else
            System.out.println("Flute, adresse non trouvée !");

        // recherche des biens à cette adresse
        System.out.println("les biens de l'adresse N°1 : "+adresseManager.biensACetteAdresse(adresse1).toString());
        System.out.println("les biens de l'adresse N°5 : "+adresseManager.biensACetteAdresse(chezMoi).toString());

        // Création d'un nouveau Bien
        DaoTypeBien typeBienManager = new JpaDaoTypeBien();
        E_TypeBien appartement = typeBienManager.findLibTypeBien("APPARTEMENT");

        DaoCategorieSurface categorieSurfaceManager = new JpaDaoCategorieSurface();
        E_CategorieSurfaceBien studio = categorieSurfaceManager.findLibCategorieSurface("STUDIO");

        E_Bien chezToi = new E_Bien();
        chezToi.setTypeBien(appartement);
        chezToi.setAdresse(chezMoi);
        chezToi.setCategorieSurfaceBien(studio);
        chezToi.setSurfaceHabitable(BigDecimal.valueOf(30));

        DaoBien BienManager = new JpaDaoBien();
        BienManager.create(chezToi);
        System.out.println(chezToi);

        DaoBien BienManager2 = new JpaDaoBien();
        E_Bien unLogement = new E_Bien();
        unLogement.setTypeBien(appartement);
        unLogement.setAdresse(chezMoi);
        unLogement.setSurfaceHabitable(BigDecimal.valueOf(100));

        BienManager.create(unLogement);
        BienManager2.create(unLogement);

        System.out.println("Nombre de  biens en base BienManager : "+BienManager.findAll(E_Bien.class).size());
        System.out.println("Nombre de  biens en base BienManager2: "+BienManager2.findAll(E_Bien.class).size());

    }
}