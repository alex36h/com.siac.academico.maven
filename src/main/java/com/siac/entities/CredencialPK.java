/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siac.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Jessica Arroliga
 */
@Embeddable
public class CredencialPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Codigo")
    private long codigo;
    @Basic(optional = false)
    @Column(name = "Usuario")
    private String usuario;

    public CredencialPK() {
    }

    public CredencialPK(long codigo, String usuario) {
        this.codigo = codigo;
        this.usuario = usuario;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigo;
        hash += (usuario != null ? usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredencialPK)) {
            return false;
        }
        CredencialPK other = (CredencialPK) object;
        if (this.codigo != other.codigo) {
            return false;
        }
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siac.entities.CredencialPK[ codigo=" + codigo + ", usuario=" + usuario + " ]";
    }
    
}
