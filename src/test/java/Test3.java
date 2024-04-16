import dao.DaoFactory;
import dao.PersistenceType;
import jsonDao.DaoBien;
import metier.Adresse;
import metier.Bien;
import metier.CategorieSurfaceBien;
import metier.TypeBien;

public class Test3 {
    public static void main(String[] args) {
        var factory = DaoFactory.getDaoFactory(PersistenceType.JSON);
        var daoBien = (DaoBien) factory.getDaoBien();

        Adresse adresse1 = new Adresse(
                "RUE",
                "DE LA PAIX",
                "75000",
                "Paris",
                "France"
        );

        Adresse adresse2 = new Adresse(
                "RUE",
                "DE LA LIBERTE",
                "69000",
                "Lyon",
                "France"
        );

        TypeBien typeBien1 = new TypeBien(
                "MAISON"
        );

        TypeBien typeBien2 = new TypeBien(
                "APPARTEMENT"
        );

        CategorieSurfaceBien categorieSurfaceBien1 = new CategorieSurfaceBien(
                "STUDIO"
        );

        CategorieSurfaceBien categorieSurfaceBien2 = new CategorieSurfaceBien(
                "T2"
        );

        Bien bien1 = new Bien(
                typeBien1,
                categorieSurfaceBien1,
                adresse1,
                null,
                2,
                "description",
                "commentaire",
                null,
                null,
                null,
                null
        );

        Bien bien2 = new Bien(
                typeBien2,
                categorieSurfaceBien2,
                adresse2,
                null,
                3,
                "description",
                "commentaire",
                null,
                null,
                null,
                null
        );

        daoBien.deleteAll(Bien.class);
        var allBiens = daoBien.findAll(Bien.class);
        System.out.println("Nombre de biens : " + allBiens.size());

        var bienCreated = daoBien.create(bien1);
        var bienCreated2 = daoBien.create(bien2);
        allBiens = daoBien.findAll(Bien.class);
        System.out.println("Nombre de biens : " + allBiens.size());

        Bien bienToUpdate = allBiens.get(0);
        System.out.println("Bien à mettre à jour : " + bienToUpdate);
        System.out.println("Adresse du bien à mettre à jour : " + bienToUpdate.getAdresse());
        bienToUpdate.setAdresse(adresse2);
        daoBien.update(bienToUpdate);
        var bienUpdated = daoBien.find(Bien.class, bienToUpdate.getIdBien());
        System.out.println("Bien mis à jour : " + bienUpdated);
        System.out.println("Adresse du bien mis à jour : " + bienUpdated.getAdresse());
        assert bienUpdated.getAdresse().equals(adresse2);

    }
}
