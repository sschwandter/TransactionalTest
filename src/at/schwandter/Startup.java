package at.schwandter;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

/**
 * Created by stefan on 21.06.16.
 */
@Singleton
@TransactionAttribute(value = TransactionAttributeType.NEVER)
@TransactionManagement(TransactionManagementType.BEAN)
@javax.ejb.Startup
public class Startup {

    @Inject
    ProcedureRunner procedureRunner;

    @PostConstruct
    private void init() {
        procedureRunner.execute();
    }

}
