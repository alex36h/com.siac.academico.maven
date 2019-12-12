/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "cierrecaja")
@NamedQueries({
    @NamedQuery(name = "Cierrecaja.findAll", query = "SELECT c FROM Cierrecaja c"),
    @NamedQuery(name = "Cierrecaja.findById", query = "SELECT c FROM Cierrecaja c WHERE c.id = :id"),
    @NamedQuery(name = "Cierrecaja.findByFecha", query = "SELECT c FROM Cierrecaja c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Cierrecaja.findByInicio", query = "SELECT c FROM Cierrecaja c WHERE c.inicioCaja.id = :inicio"),
    @NamedQuery(name = "Cierrecaja.findByNumero", query = "SELECT c FROM Cierrecaja c WHERE c.numero = :numero")})
public class Cierrecaja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "Numero")
    private int numero;
    @JoinColumn(name = "InicioCaja", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Iniciocaja inicioCaja;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cierreCaja")
    private List<Detallecierrecaja> detallecierrecajaList;

    public Cierrecaja() {
    }

    public Cierrecaja(Long id) {
        this.id = id;
    }

    public Cierrecaja(Long id, Date fecha, int numero) {
        this.id = id;
        this.fecha = fecha;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Iniciocaja getInicioCaja() {
        return inicioCaja;
    }

    public void setInicioCaja(Iniciocaja inicioCaja) {
        this.inicioCaja = inicioCaja;
    }

    public List<Detallecierrecaja> getDetallecierrecajaList() {
        return detallecierrecajaList;
    }

    public void setDetallecierrecajaList(List<Detallecierrecaja> detallecierrecajaList) {
        this.detallecierrecajaList = detallecierrecajaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cierrecaja)) {
            return false;
        }
        Cierrecaja other = (Cierrecaja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Cierrecaja[ id=" + id + " ]";
    }
    
}
