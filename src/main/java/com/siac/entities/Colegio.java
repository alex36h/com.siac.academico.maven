/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
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

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "colegio")
@NamedQueries({
    @NamedQuery(name = "Colegio.findAll", query = "SELECT c FROM Colegio c"),
    @NamedQuery(name = "Colegio.findById", query = "SELECT c FROM Colegio c WHERE c.id = :id"),
    @NamedQuery(name = "Colegio.findByNombre", query = "SELECT c FROM Colegio c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Colegio.findByDireccion", query = "SELECT c FROM Colegio c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Colegio.findByTelefono", query = "SELECT c FROM Colegio c WHERE c.telefono = :telefono")})
public class Colegio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Telefono")
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colegio")
    private List<Docentetrabajoanterior> docentetrabajoanteriorList;
    @JoinColumn(name = "Ciudad", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Ciudad ciudad;
    @JoinColumn(name = "Pais", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Pais pais;
    @JoinColumn(name = "TipoColegio", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Tipocolegio tipoColegio;

    public Colegio() {
    }

    public Colegio(Long id) {
        this.id = id;
    }

    public Colegio(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Docentetrabajoanterior> getDocentetrabajoanteriorList() {
        return docentetrabajoanteriorList;
    }

    public void setDocentetrabajoanteriorList(List<Docentetrabajoanterior> docentetrabajoanteriorList) {
        this.docentetrabajoanteriorList = docentetrabajoanteriorList;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Tipocolegio getTipoColegio() {
        return tipoColegio;
    }

    public void setTipoColegio(Tipocolegio tipoColegio) {
        this.tipoColegio = tipoColegio;
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
        if (!(object instanceof Colegio)) {
            return false;
        }
        Colegio other = (Colegio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Colegio[ id=" + id + " ]";
    }
    
}
