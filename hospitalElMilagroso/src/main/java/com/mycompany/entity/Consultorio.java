/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author serug
 */
@Entity
@Table(name = "consultorio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consultorio.findAll", query = "SELECT c FROM Consultorio c")
    , @NamedQuery(name = "Consultorio.findByIdConsultorio", query = "SELECT c FROM Consultorio c WHERE c.idConsultorio = :idConsultorio")
    , @NamedQuery(name = "Consultorio.findByNumero", query = "SELECT c FROM Consultorio c WHERE c.numero = :numero")})
public class Consultorio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idConsultorio")
    private Integer idConsultorio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private int numero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consultorio")
    private Collection<Calendarioconsultorio> calendarioconsultorioCollection;

    public Consultorio() {
    }

    public Consultorio(Integer idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public Consultorio(Integer idConsultorio, int numero) {
        this.idConsultorio = idConsultorio;
        this.numero = numero;
    }

    public Integer getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(Integer idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        hash += (idConsultorio != null ? idConsultorio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consultorio)) {
            return false;
        }
        Consultorio other = (Consultorio) object;
        if ((this.idConsultorio == null && other.idConsultorio != null) || (this.idConsultorio != null && !this.idConsultorio.equals(other.idConsultorio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Consultorio[ idConsultorio=" + idConsultorio + " ]";
    }
    
}
