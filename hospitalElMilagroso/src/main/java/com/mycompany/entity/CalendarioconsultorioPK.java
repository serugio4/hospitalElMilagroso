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
public class CalendarioconsultorioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Consultorio_idConsultorio")
    private int consultorioidConsultorio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaYHora_idFechaYHora")
    private int fechaYHoraidFechaYHora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CitaMedica_idCitaMedica")
    private int citaMedicaidCitaMedica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CitaMedica_Paciente_cedula")
    private int citaMedicaPacientecedula;

    public CalendarioconsultorioPK() {
    }

    public CalendarioconsultorioPK(int consultorioidConsultorio, int fechaYHoraidFechaYHora, int citaMedicaidCitaMedica, int citaMedicaPacientecedula) {
        this.consultorioidConsultorio = consultorioidConsultorio;
        this.fechaYHoraidFechaYHora = fechaYHoraidFechaYHora;
        this.citaMedicaidCitaMedica = citaMedicaidCitaMedica;
        this.citaMedicaPacientecedula = citaMedicaPacientecedula;
    }

    public int getConsultorioidConsultorio() {
        return consultorioidConsultorio;
    }

    public void setConsultorioidConsultorio(int consultorioidConsultorio) {
        this.consultorioidConsultorio = consultorioidConsultorio;
    }

    public int getFechaYHoraidFechaYHora() {
        return fechaYHoraidFechaYHora;
    }

    public void setFechaYHoraidFechaYHora(int fechaYHoraidFechaYHora) {
        this.fechaYHoraidFechaYHora = fechaYHoraidFechaYHora;
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
        hash += (int) consultorioidConsultorio;
        hash += (int) fechaYHoraidFechaYHora;
        hash += (int) citaMedicaidCitaMedica;
        hash += (int) citaMedicaPacientecedula;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalendarioconsultorioPK)) {
            return false;
        }
        CalendarioconsultorioPK other = (CalendarioconsultorioPK) object;
        if (this.consultorioidConsultorio != other.consultorioidConsultorio) {
            return false;
        }
        if (this.fechaYHoraidFechaYHora != other.fechaYHoraidFechaYHora) {
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
        return "com.mycompany.entity.CalendarioconsultorioPK[ consultorioidConsultorio=" + consultorioidConsultorio + ", fechaYHoraidFechaYHora=" + fechaYHoraidFechaYHora + ", citaMedicaidCitaMedica=" + citaMedicaidCitaMedica + ", citaMedicaPacientecedula=" + citaMedicaPacientecedula + " ]";
    }
    
}
