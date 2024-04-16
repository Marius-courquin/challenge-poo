package jsonDao;

import dao.DaoFactory;

public class JsonDaoFactory extends DaoFactory{
        public JsonDaoBienSingleton getDaoBien() {
            return JsonDaoBienSingleton.getInstance();
        }
}
