package at.schwandter;

import javax.inject.Inject;
import javax.transaction.Transactional;

/**
 * Created by stefan on 21.06.16.
 */
@Transactional
public class ProcedureImpl {

    @Inject
    DAO dao;

    public void execute() {
        System.out.println("Executing");
        dao.sayDao();
    }
}
