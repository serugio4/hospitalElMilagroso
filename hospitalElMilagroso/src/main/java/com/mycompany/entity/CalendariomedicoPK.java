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
public class CalendariomedicoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaYHora_idFechaYHora")
    private int fechaYHoraidFechaYHora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Medico_idMedico")
    private int medicoidMedico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CitaMedica_idCitaMedica")
    private int citaMedicaidCitaMedica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CitaMedica_Paciente_cedula")
    private int citaMedicaPacientecedula;

    public CalendariomedicoPK() {
    }

    public CalendariomedicoPK(int fechaYHoraidFechaYHora, int medicoidMedico, int citaMedicaidCitaMedica, int citaMedicaPacientecedula) {
        this.fechaYHoraidFechaYHora = fechaYHoraidFechaYHora;
        this.medicoidMedico = medicoidMedico;
        this.citaMedicaidCitaMedica = citaMedicaidCitaMedica;
        this.citaMedicaPacientecedula = citaMedicaPacientecedula;
    }

    public int getFechaYHoraidFechaYHora() {
        return fechaYHoraidFechaYHora;
    }

    public void setFechaYHoraidFechaYHora(int fechaYHoraidFechaYHora) {
        this.fechaYHoraidFechaYHora = fechaYHoraidFechaYHora;
    }

    public int getMedicoidMedico() {
        return medicoidMedico;
    }

    public void setMedicoidMedico(int medicoidMedico) {
        this.medicoidMedico = medicoidMedico;
    }

    public int getCitaMedicaidCitaMedica() {
        return citaMedicaidCitaMedica;
    }

    public void setCitaMedicaidCitaMedica(int citaMedicaidCitaMedica) {
        this.citaMedicaidCitaMedica = citaMedicaidCitaMedica;
    }

    public int getCitaMedicaPacientecedula() {
        return citaMedicaPacientecedula;
    }

    public void setCitaMedicaPacientecedula(int citaMedicaPacientecedula) {
        this.citaMedicaPacientecedula = citaMedicaPacientecedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fechaYHoraidFechaYHora;
        hash += (int) medicoidMedico;
        hash += (int) citaMedicaidCitaMedica;
        hash += (int) citaMedicaPacientecedula;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalendariomedicoPK)) {
            return false;
        }
        CalendariomedicoPK other = (CalendariomedicoPK) object;
        if (this.fechaYHoraidFechaYHora != other.fechaYHoraidFechaYHora) {
            return false;
        }
        if (this.medicoidMedico != other.medicoidMedico) {
            return false;
        }
        if (this.citaMedicaidCitaMedica != other.citaMedicaidCitaMedica) {
            return false;
        }
        if (this.citaMedicaPacientecedula != other.citaMedicaPacientecedula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.CalendariomedicoPK[ fechaYHoraidFechaYHora=" + fechaYHoraidFechaYHora + ", medicoidMedico=" + medicoidMedico + ", citaMedicaidCitaMedica=" + citaMedicaidCitaMedica + ", citaMedicaPacientecedula=" + citaMedicaPacientecedula + " ]";
    }
    
}
