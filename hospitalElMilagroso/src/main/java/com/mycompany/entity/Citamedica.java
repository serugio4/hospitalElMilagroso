/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author serug
 */
@Entity
@Table(name = "citamedica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Citamedica.findAll", query = "SELECT c FROM Citamedica c")
    , @NamedQuery(name = "Citamedica.findByIdCitaMedica", query = "SELECT c FROM Citamedica c WHERE c.citamedicaPK.idCitaMedica = :idCitaMedica")
    , @NamedQuery(name = "Citamedica.findByPacientecedula", query = "SELECT c FROM Citamedica c WHERE c.citamedicaPK.pacientecedula = :pacientecedula")})
public class Citamedica implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CitamedicaPK citamedicaPK;
    @JoinColumn(name = "Paciente_cedula", referencedColumnName = "cedula", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Paciente paciente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "citamedica")
    private Collection<Calendariomedico> calendariomedicoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "citamedica")
    private Collection<Calendarioconsultorio> calendarioconsultorioCollection;

    public Citamedica() {
    }

    public Citamedica(CitamedicaPK citamedicaPK) {
        this.citamedicaPK = citamedicaPK;
    }

    public Citamedica(int idCitaMedica, int pacientecedula) {
        this.citamedicaPK = new CitamedicaPK(idCitaMedica, pacientecedula);
    }

    public CitamedicaPK getCitamedicaPK() {
        return citamedicaPK;
    }

    public void setCitamedicaPK(CitamedicaPK citamedicaPK) {
        this.citamedicaPK = citamedicaPK;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @XmlTransient
    public Collection<Calendariomedico> getCalendariomedicoCollection() {
        return calendariomedicoCollection;
    }

    public void setCalendariomedicoCollection(Collection<Calendariomedico> calendariomedicoCollection) {
        this.calendariomedicoCollection = calendariomedicoCollection;
    }

    @XmlTransient
    public Collection<Calendarioconsultorio> getCalendarioconsultorioCollection() {
        return calendarioconsultorioCollection;
    }

    public void setCalendarioconsultorioCollection(Collection<Calendarioconsultorio> calendarioconsultorioCollection) {
        this.calendarioconsultorioCollection = calendarioconsultorioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (citamedicaPK != null ? citamedicaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Citamedica)) {
            return false;
        }
        Citamedica other = (Citamedica) object;
        if ((this.citamedicaPK == null && other.citamedicaPK != null) || (this.citamedicaPK != null && !this.citamedicaPK.equals(other.citamedicaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Citamedica[ citamedicaPK=" + citamedicaPK + " ]";
    }
    
}
