/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "cargosempleado")
@NamedQueries({
    @NamedQuery(name = "Cargosempleado.findAll", query = "SELECT c FROM Cargosempleado c"),
    @NamedQuery(name = "Cargosempleado.findById", query = "SELECT c FROM Cargosempleado c WHERE c.id = :id"),
    @NamedQuery(name = "Cargosempleado.findByFechaRegistro", query = "SELECT c FROM Cargosempleado c WHERE c.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Cargosempleado.findByUsuarioCreacion", query = "SELECT c FROM Cargosempleado c WHERE c.usuarioCreacion = :usuarioCreacion"),
    @NamedQuery(name = "Cargosempleado.findByAutorizado", query = "SELECT c FROM Cargosempleado c WHERE c.autorizado = :autorizado"),
    @NamedQuery(name = "Cargosempleado.findByActivo", query = "SELECT c FROM Cargosempleado c WHERE c.activo = :activo")})
public class Cargosempleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Basic(optional = false)
    @Column(name = "UsuarioCreacion")
    private int usuarioCreacion;
    @Column(name = "Autorizado")
    private Integer autorizado;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @JoinColumn(name = "Cargo", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Cargo cargo;
    @JoinColumns({
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")})
    @ManyToOne(optional = false)
    private Credencial credencial;
    @JoinColumn(name = "Colaborador", referencedColumnName = "Codigo")
    @ManyToOne(optional = false)
    private Persona colaborador;

    public Cargosempleado() {
    }

    public Cargosempleado(Long id) {
        this.id = id;
    }

    public Cargosempleado(Long id, Date fechaRegistro, int usuarioCreacion, boolean activo) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.usuarioCreacion = usuarioCreacion;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(int usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public Integer getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Integer autorizado) {
        this.autorizado = autorizado;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public Persona getColaborador() {
        return colaborador;
    }

    public void setColaborador(Persona colaborador) {
        this.colaborador = colaborador;
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
        if (!(object instanceof Cargosempleado)) {
            return false;
        }
        Cargosempleado other = (Cargosempleado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Cargosempleado[ id=" + id + " ]";
    }
    
}
