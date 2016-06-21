package at.schwandter;

import javax.inject.Inject;

/**
 * Created by stefan on 21.06.16.
 */


public class ProcedureRunner {

    @Inject
    private DAO dao;

    @Inject
    private Procedure procedure;

    public void execute() {
        procedure.execute();
    }

}
