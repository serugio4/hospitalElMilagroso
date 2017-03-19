/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.session;

import com.mycompany.entity.Calendarioconsultorio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author serug
 */
@Local
public interface CalendarioconsultorioFacadeLocal {

    void create(Calendarioconsultorio calendarioconsultorio);

    void edit(Calendarioconsultorio calendarioconsultorio);

    void remove(Calendarioconsultorio calendarioconsultorio);

    Calendarioconsultorio find(Object id);

    List<Calendarioconsultorio> findAll();

    List<Calendarioconsultorio> findRange(int[] range);

    int count();
    
}
