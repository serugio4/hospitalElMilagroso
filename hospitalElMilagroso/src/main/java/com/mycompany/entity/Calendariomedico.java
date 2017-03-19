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
@Table(name = "calendariomedico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calendariomedico.findAll", query = "SELECT c FROM Calendariomedico c")
    , @NamedQuery(name = "Calendariomedico.findByFechaYHoraidFechaYHora", query = "SELECT c FROM Calendariomedico c WHERE c.calendariomedicoPK.fechaYHoraidFechaYHora = :fechaYHoraidFechaYHora")
    , @NamedQuery(name = "Calendariomedico.findByMedicoidMedico", query = "SELECT c FROM Calendariomedico c WHERE c.calendariomedicoPK.medicoidMedico = :medicoidMedico")
    , @NamedQuery(name = "Calendariomedico.findByCitaMedicaidCitaMedica", query = "SELECT c FROM Calendariomedico c WHERE c.calendariomedicoPK.citaMedicaidCitaMedica = :citaMedicaidCitaMedica")
    , @NamedQuery(name = "Calendariomedico.findByCitaMedicaPacientecedula", query = "SELECT c FROM Calendariomedico c WHERE c.calendariomedicoPK.citaMedicaPacientecedula = :citaMedicaPacientecedula")})
public class Calendariomedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CalendariomedicoPK calendariomedicoPK;
    @JoinColumns({
        @JoinColumn(name = "CitaMedica_idCitaMedica", referencedColumnName = "idCitaMedica", insertable = false, updatable = false)
        , @JoinColumn(name = "CitaMedica_Paciente_cedula", referencedColumnName = "Paciente_cedula", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Citamedica citamedica;
    @JoinColumn(name = "FechaYHora_idFechaYHora", referencedColumnName = "idFechaYHora", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Fechayhora fechayhora;
    @JoinColumn(name = "Medico_idMedico", referencedColumnName = "idMedico", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Medico medico;

    public Calendariomedico() {
    }

    public Calendariomedico(CalendariomedicoPK calendariomedicoPK) {
        this.calendariomedicoPK = calendariomedicoPK;
    }

    public Calendariomedico(int fechaYHoraidFechaYHora, int medicoidMedico, int citaMedicaidCitaMedica, int citaMedicaPacientecedula) {
        this.calendariomedicoPK = new CalendariomedicoPK(fechaYHoraidFechaYHora, medicoidMedico, citaMedicaidCitaMedica, citaMedicaPacientecedula);
    }

    public CalendariomedicoPK getCalendariomedicoPK() {
        return calendariomedicoPK;
    }

    public void setCalendariomedicoPK(CalendariomedicoPK calendariomedicoPK) {
        this.calendariomedicoPK = calendariomedicoPK;
    }

    public Citamedica getCitamedica() {
        return citamedica;
    }

    public void setCitamedica(Citamedica citamedica) {
        this.citamedica = citamedica;
    }

    public Fechayhora getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(Fechayhora fechayhora) {
        this.fechayhora = fechayhora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calendariomedicoPK != null ? calendariomedicoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calendariomedico)) {
            return false;
        }
        Calendariomedico other = (Calendariomedico) object;
        if ((this.calendariomedicoPK == null && other.calendariomedicoPK != null) || (this.calendariomedicoPK != null && !this.calendariomedicoPK.equals(other.calendariomedicoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Calendariomedico[ calendariomedicoPK=" + calendariomedicoPK + " ]";
    }
    
}
