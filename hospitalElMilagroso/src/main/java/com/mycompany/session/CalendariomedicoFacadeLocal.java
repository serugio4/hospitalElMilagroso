/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.session;

import com.mycompany.entity.Calendariomedico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author serug
 */
@Local
public interface CalendariomedicoFacadeLocal {

    void create(Calendariomedico calendariomedico);

    void edit(Calendariomedico calendariomedico);

    void remove(Calendariomedico calendariomedico);

    Calendariomedico find(Object id);

    List<Calendariomedico> findAll();

    List<Calendariomedico> findRange(int[] range);

    int count();
    
}
