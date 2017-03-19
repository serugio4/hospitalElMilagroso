/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.session;

import com.mycompany.entity.Consultorio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author serug
 */
@Stateless
public class ConsultorioFacade extends AbstractFacade<Consultorio> implements ConsultorioFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_hospitalElMilagroso_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConsultorioFacade() {
        super(Consultorio.class);
    }
    
}
