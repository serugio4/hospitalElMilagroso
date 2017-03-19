/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.session;

import com.mycompany.entity.Fechayhora;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author serug
 */
@Local
public interface FechayhoraFacadeLocal {

    void create(Fechayhora fechayhora);

    void edit(Fechayhora fechayhora);

    void remove(Fechayhora fechayhora);

    Fechayhora find(Object id);

    List<Fechayhora> findAll();

    List<Fechayhora> findRange(int[] range);

    int count();
    
}
