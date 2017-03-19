/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.session;

import com.mycompany.entity.Citamedica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author serug
 */
@Local
public interface CitamedicaFacadeLocal {

    void create(Citamedica citamedica);

    void edit(Citamedica citamedica);

    void remove(Citamedica citamedica);

    Citamedica find(Object id);

    List<Citamedica> findAll();

    List<Citamedica> findRange(int[] range);

    int count();
    
}
