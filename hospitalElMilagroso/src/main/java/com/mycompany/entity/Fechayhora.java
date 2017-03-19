/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author serug
 */
@Entity
@Table(name = "fechayhora")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fechayhora.findAll", query = "SELECT f FROM Fechayhora f")
    , @NamedQuery(name = "Fechayhora.findByIdFechaYHora", query = "SELECT f FROM Fechayhora f WHERE f.idFechaYHora = :idFechaYHora")
    , @NamedQuery(name = "Fechayhora.findByFechaYHora", query = "SELECT f FROM Fechayhora f WHERE f.fechaYHora = :fechaYHora")})
public class Fechayhora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFechaYHora")
    private Integer idFechaYHora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaYHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaYHora;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fechayhora")
    private Collection<Calendariomedico> calendariomedicoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fechayhora")
    private Collection<Calendarioconsultorio> calendarioconsultorioCollection;

    public Fechayhora() {
    }

    public Fechayhora(Integer idFechaYHora) {
        this.idFechaYHora = idFechaYHora;
    }

    public Fechayhora(Integer idFechaYHora, Date fechaYHora) {
        this.idFechaYHora = idFechaYHora;
        this.fechaYHora = fechaYHora;
    }

    public Integer getIdFechaYHora() {
        return idFechaYHora;
    }

    public void setIdFechaYHora(Integer idFechaYHora) {
        this.idFechaYHora = idFechaYHora;
    }

    public Date getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(Date fechaYHora) {
        this.fechaYHora = fechaYHora;
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
        hash += (idFechaYHora != null ? idFechaYHora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fechayhora)) {
            return false;
        }
        Fechayhora other = (Fechayhora) object;
        if ((this.idFechaYHora == null && other.idFechaYHora != null) || (this.idFechaYHora != null && !this.idFechaYHora.equals(other.idFechaYHora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Fechayhora[ idFechaYHora=" + idFechaYHora + " ]";
    }
    
}
