package at.schwandter;

import javax.transaction.Transactional;

@Transactional(Transactional.TxType.MANDATORY)
public class DAO {

    public void sayDao() {
        System.out.println("DAO!");
    }
}
