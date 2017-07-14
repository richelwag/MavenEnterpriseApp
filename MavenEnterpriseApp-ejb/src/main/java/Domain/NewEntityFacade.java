/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author am_ri
 */
@Stateless
public class NewEntityFacade extends AbstractFacade<NewEntity> implements NewEntityFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_MavenEnterpriseApp-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NewEntityFacade() {
        super(NewEntity.class);
    }
    
}
