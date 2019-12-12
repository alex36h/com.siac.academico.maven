/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jessica Arroliga
 */
@Entity
@Table(name = "beca")
@NamedQueries({
    @NamedQuery(name = "Beca.findAll", query = "SELECT b FROM Beca b"),
    @NamedQuery(name = "Beca.findById", query = "SELECT b FROM Beca b WHERE b.id = :id"),
    @NamedQuery(name = "Beca.findByValor", query = "SELECT b FROM Beca b WHERE b.valor = :valor"),
    @NamedQuery(name = "Beca.findBySemestre", query = "SELECT b FROM Beca b WHERE b.semestre = :semestre"),
    @NamedQuery(name = "Beca.findByFlag", query = "SELECT b FROM Beca b WHERE b.flag = :flag"),
    @NamedQuery(name = "Beca.findByBecaActiva", query = "SELECT b FROM Beca b, Arancelgravado a WHERE b.estudiante.carnet = :estudiante and b.activo = :activo and a.arancel.id = :arancel and a.semestre = b.semestre"),
    @NamedQuery(name = "Beca.findByActivo", query = "SELECT b FROM Beca b WHERE b.activo = :activo")})
public class Beca implements Serializable {

    @Basic(optional = false)
    @Column(name = "Apelada")
    private boolean apelada;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Valor")
    private double valor;
    @Basic(optional = false)
    @Column(name = "Semestre")
    private String semestre;
    @Basic(optional = false)
    @Column(name = "Flag")
    private int flag;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @JoinColumn(name = "Estudiante", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Estudiante estudiante;
    @JoinColumn(name = "TipoBeca", referencedColumnName = "Id")
    @ManyToOne(optional = false)
    private Tipobeca tipoBeca;

    public Beca() {
    }

    public Beca(Integer id) {
        this.id = id;
    }

    public Beca(Integer id, double valor, String semestre, int flag, boolean activo) {
        this.id = id;
        this.valor = valor;
        this.semestre = semestre;
        this.flag = flag;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Tipobeca getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(Tipobeca tipoBeca) {
        this.tipoBeca = tipoBeca;
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
        if (!(object instanceof Beca)) {
            return false;
        }
        Beca other = (Beca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Beca[ id=" + id + " ]";
    }

    public boolean getApelada() {
        return apelada;
    }

    public void setApelada(boolean apelada) {
        this.apelada = apelada;
    }
    
}
