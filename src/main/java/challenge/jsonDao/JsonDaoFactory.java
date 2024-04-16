package challenge.jsonDao;

import challenge.dao.DaoFactory;

public class JsonDaoFactory extends DaoFactory{
        public JsonDaoBienSingleton getDaoBien() {
            return JsonDaoBienSingleton.getInstance();
        }
}
