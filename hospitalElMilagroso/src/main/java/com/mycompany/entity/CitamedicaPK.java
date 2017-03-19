/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author serug
 */
@Embeddable
public class CitamedicaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idCitaMedica")
    private int idCitaMedica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Paciente_cedula")
    private int pacientecedula;

    public CitamedicaPK() {
    }

    public CitamedicaPK(int idCitaMedica, int pacientecedula) {
        this.idCitaMedica = idCitaMedica;
        this.pacientecedula = pacientecedula;
    }

    public int getIdCitaMedica() {
        return idCitaMedica;
    }

    public void setIdCitaMedica(int idCitaMedica) {
        this.idCitaMedica = idCitaMedica;
    }

    public int getPacientecedula() {
        return pacientecedula;
    }

    public void setPacientecedula(int pacientecedula) {
        this.pacientecedula = pacientecedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCitaMedica;
        hash += (int) pacientecedula;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CitamedicaPK)) {
            return false;
        }
        CitamedicaPK other = (CitamedicaPK) object;
        if (this.idCitaMedica != other.idCitaMedica) {
            return false;
        }
        if (this.pacientecedula != other.pacientecedula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.CitamedicaPK[ idCitaMedica=" + idCitaMedica + ", pacientecedula=" + pacientecedula + " ]";
    }
    
}
