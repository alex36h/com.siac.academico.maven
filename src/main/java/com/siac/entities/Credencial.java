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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "credencial")
@NamedQueries({
    @NamedQuery(name = "Credencial.findAll", query = "SELECT c FROM Credencial c"),
    @NamedQuery(name = "Credencial.findByCodigo", query = "SELECT c FROM Credencial c WHERE c.credencialPK.codigo = :codigo"),
    @NamedQuery(name = "Credencial.findByUsuario", query = "SELECT c FROM Credencial c WHERE c.credencialPK.usuario = :usuario"),
    @NamedQuery(name = "Credencial.getFormularios", query = "SELECT c FROM Credencial c WHERE c.credencialPK.usuario = :usuario"),
    @NamedQuery(name = "Credencial.findByClave", query = "SELECT c FROM Credencial c WHERE c.clave = :clave"),
    @NamedQuery(name = "Credencial.findByPregunta", query = "SELECT c FROM Credencial c WHERE c.pregunta = :pregunta"),
    @NamedQuery(name = "Credencial.findByRespuesta", query = "SELECT c FROM Credencial c WHERE c.respuesta = :respuesta"),
    @NamedQuery(name = "Credencial.findBySesion", query = "SELECT c FROM Credencial c WHERE c.sesion = :sesion"),
    @NamedQuery(name = "Credencial.findByCredenciales", query = "SELECT c FROM Credencial c WHERE c.credencialPK.usuario = :usr AND c.clave =:pass"),
    @NamedQuery(name = "Credencial.findByActivo", query = "SELECT c FROM Credencial c WHERE c.activo = :activo")})
public class Credencial implements Serializable {

    @OneToMany(mappedBy = "credencial")
    private List<Rolcredencial> rolcredencialList;

    @JoinTable(name = "rolcredencial", joinColumns = {
        @JoinColumn(name = "Credencial", referencedColumnName = "Codigo"),
        @JoinColumn(name = "Usuario", referencedColumnName = "Usuario")}, inverseJoinColumns = {
        @JoinColumn(name = "Rol", referencedColumnName = "Id")})
    @ManyToMany
    private List<Rol> rolList;

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CredencialPK credencialPK;
    @Basic(optional = false)
    @Column(name = "Clave")
    private String clave;
    @Basic(optional = false)
    @Column(name = "Pregunta")
    private int pregunta;
    @Basic(optional = false)
    @Column(name = "Respuesta")
    private String respuesta;
    @Column(name = "Sesion")
    private String sesion;
    @Basic(optional = false)
    @Column(name = "Activo")
    private boolean activo;
    @JoinColumn(name = "Grupo", referencedColumnName = "codigo")
    @ManyToOne(optional = false)
    private Grupo grupo;
    @JoinColumn(name = "Codigo", referencedColumnName = "Codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Persona persona;

    public Credencial() {
    }

    public Credencial(CredencialPK credencialPK) {
        this.credencialPK = credencialPK;
    }

    public Credencial(CredencialPK credencialPK, String clave, int pregunta, String respuesta, boolean activo) {
        this.credencialPK = credencialPK;
        this.clave = clave;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.activo = activo;
    }

    public Credencial(long codigo, String usuario) {
        this.credencialPK = new CredencialPK(codigo, usuario);
    }

    public CredencialPK getCredencialPK() {
        return credencialPK;
    }

    public void setCredencialPK(CredencialPK credencialPK) {
        this.credencialPK = credencialPK;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getSesion() {
        return sesion;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (credencialPK != null ? credencialPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Credencial)) {
            return false;
        }
        Credencial other = (Credencial) object;
        if ((this.credencialPK == null && other.credencialPK != null) || (this.credencialPK != null && !this.credencialPK.equals(other.credencialPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.Credencial[ credencialPK=" + credencialPK + " ]";
    }

    public List<Rol> getRolList() {
        return rolList;
    }

    public void setRolList(List<Rol> rolList) {
        this.rolList = rolList;
    }

    public List<Rolcredencial> getRolcredencialList() {
        return rolcredencialList;
    }

    public void setRolcredencialList(List<Rolcredencial> rolcredencialList) {
        this.rolcredencialList = rolcredencialList;
    }
    
}
