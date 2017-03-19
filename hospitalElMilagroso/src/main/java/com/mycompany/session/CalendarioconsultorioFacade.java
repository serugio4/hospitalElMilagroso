/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.session;

import com.mycompany.entity.Calendarioconsultorio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author serug
 */
@Stateless
public class CalendarioconsultorioFacade extends AbstractFacade<Calendarioconsultorio> implements CalendarioconsultorioFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_hospitalElMilagroso_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalendarioconsultorioFacade() {
        super(Calendarioconsultorio.class);
    }
    
}
