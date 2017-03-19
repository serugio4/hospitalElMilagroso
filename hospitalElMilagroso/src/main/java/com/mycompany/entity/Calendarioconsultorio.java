/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author serug
 */
@Entity
@Table(name = "calendarioconsultorio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calendarioconsultorio.findAll", query = "SELECT c FROM Calendarioconsultorio c")
    , @NamedQuery(name = "Calendarioconsultorio.findByConsultorioidConsultorio", query = "SELECT c FROM Calendarioconsultorio c WHERE c.calendarioconsultorioPK.consultorioidConsultorio = :consultorioidConsultorio")
    , @NamedQuery(name = "Calendarioconsultorio.findByFechaYHoraidFechaYHora", query = "SELECT c FROM Calendarioconsultorio c WHERE c.calendarioconsultorioPK.fechaYHoraidFechaYHora = :fechaYHoraidFechaYHora")
    , @NamedQuery(name = "Calendarioconsultorio.findByCitaMedicaidCitaMedica", query = "SELECT c FROM Calendarioconsultorio c WHERE c.calendarioconsultorioPK.citaMedicaidCitaMedica = :citaMedicaidCitaMedica")
    , @NamedQuery(name = "Calendarioconsultorio.findByCitaMedicaPacientecedula", query = "SELECT c FROM Calendarioconsultorio c WHERE c.calendarioconsultorioPK.citaMedicaPacientecedula = :citaMedicaPacientecedula")})
public class Calendarioconsultorio implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CalendarioconsultorioPK calendarioconsultorioPK;
    @JoinColumns({
        @JoinColumn(name = "CitaMedica_idCitaMedica", referencedColumnName = "idCitaMedica", insertable = false, updatable = false)
        , @JoinColumn(name = "CitaMedica_Paciente_cedula", referencedColumnName = "Paciente_cedula", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Citamedica citamedica;
    @JoinColumn(name = "Consultorio_idConsultorio", referencedColumnName = "idConsultorio", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Consultorio consultorio;
    @JoinColumn(name = "FechaYHora_idFechaYHora", referencedColumnName = "idFechaYHora", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Fechayhora fechayhora;

    public Calendarioconsultorio() {
    }

    public Calendarioconsultorio(CalendarioconsultorioPK calendarioconsultorioPK) {
        this.calendarioconsultorioPK = calendarioconsultorioPK;
    }

    public Calendarioconsultorio(int consultorioidConsultorio, int fechaYHoraidFechaYHora, int citaMedicaidCitaMedica, int citaMedicaPacientecedula) {
        this.calendarioconsultorioPK = new CalendarioconsultorioPK(consultorioidConsultorio, fechaYHoraidFechaYHora, citaMedicaidCitaMedica, citaMedicaPacientecedula);
    }

    public CalendarioconsultorioPK getCalendarioconsultorioPK() {
        return calendarioconsultorioPK;
    }

    public void setCalendarioconsultorioPK(CalendarioconsultorioPK calendarioconsultorioPK) {
        this.calendarioconsultorioPK = calendarioconsultorioPK;
    }

    public Citamedica getCitamedica() {
        return citamedica;
    }

    public void setCitamedica(Citamedica citamedica) {
        this.citamedica = citamedica;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Fechayhora getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(Fechayhora fechayhora) {
        this.fechayhora = fechayhora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calendarioconsultorioPK != null ? calendarioconsultorioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calendarioconsultorio)) {
            return false;
        }
        Calendarioconsultorio other = (Calendarioconsultorio) object;
        if ((this.calendarioconsultorioPK == null && other.calendarioconsultorioPK != null) || (this.calendarioconsultorioPK != null && !this.calendarioconsultorioPK.equals(other.calendarioconsultorioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Calendarioconsultorio[ calendarioconsultorioPK=" + calendarioconsultorioPK + " ]";
    }
    
}
