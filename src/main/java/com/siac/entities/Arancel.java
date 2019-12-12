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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "arancel")
@NamedQueries({
    @NamedQuery(name = "Arancel.findAll", query = "SELECT a FROM Arancel a"),
    @NamedQuery(name = "Arancel.findById", query = "SELECT a FROM Arancel a WHERE a.id = :id"),
    @NamedQuery(name = "Arancel.findByNombre", query = "SELECT a FROM Arancel a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Arancel.findByDescripcion", query = "SELECT a FROM Arancel a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Arancel.findByPrecio", query = "SELECT a FROM Arancel a WHERE a.precio = :precio"),
    @NamedQuery(name = "Arancel.findByActivo", query = "SELECT a FROM Arancel a WHERE a.activo = :activo")})
public class Arancel implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "arancel")
    private List<Arancelgravado> arancelgravadoList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "arancel")
    private List<Pagoestudiante> pagoestudianteList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "arancel")
    private List<Mensualidadesperiodo> mensualidadesperiodoList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "Precio")
    private double precio;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "arancel")
    private List<Reciboarancel> reciboarancelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "arancel")
    private List<Descuento> descuentoList;

    public Arancel() {
    }

    public Arancel(Long id) {
        this.id = id;
    }

    public Arancel(Long id, String nombre, double precio, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.activo = activo;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Reciboarancel> getReciboarancelList() {
        return reciboarancelList;
    }

    public void setReciboarancelList(List<Reciboarancel> reciboarancelList) {
        this.reciboarancelList = reciboarancelList;
    }

    public List<Descuento> getDescuentoList() {
        return descuentoList;
    }

    public void setDescuentoList(List<Descuento> descuentoList) {
        this.descuentoList = descuentoList;
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
        if (!(object instanceof Arancel)) {
            return false;
        }
        Arancel other = (Arancel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Arancel[ id=" + id + " ]";
    }

    public List<Mensualidadesperiodo> getMensualidadesperiodoList() {
        return mensualidadesperiodoList;
    }

    public void setMensualidadesperiodoList(List<Mensualidadesperiodo> mensualidadesperiodoList) {
        this.mensualidadesperiodoList = mensualidadesperiodoList;
    }

    public List<Pagoestudiante> getPagoestudianteList() {
        return pagoestudianteList;
    }

    public void setPagoestudianteList(List<Pagoestudiante> pagoestudianteList) {
        this.pagoestudianteList = pagoestudianteList;
    }

    public List<Arancelgravado> getArancelgravadoList() {
        return arancelgravadoList;
    }

    public void setArancelgravadoList(List<Arancelgravado> arancelgravadoList) {
        this.arancelgravadoList = arancelgravadoList;
    }
    
}
