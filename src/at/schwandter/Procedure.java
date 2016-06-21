package at.schwandter;

import javax.inject.Inject;

/**
 * Created by stefan on 21.06.16.
 */


public class Procedure {

    @Inject
    private DAO dao;

    @Inject
    private ProcedureImpl procedure;

    public void execute() {
        procedure.execute();
    }

}
