package at.schwandter;

import javax.transaction.Transactional;

/**
 * Created by stefan on 21.06.16.
 */
@Transactional(Transactional.TxType.MANDATORY)
public class DAO {

    public void sayDao() {
        System.out.println("DAO!");
    }
}
