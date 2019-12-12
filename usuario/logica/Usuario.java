package com.ap.coreFact.entidad;

import com.ap.coreFact.util.Util;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@NamedQueries({
        @NamedQuery(name = "getUsuario", query = "SELECT u FROM Usuario u WHERE u.alias = ?1 AND u.clave = ?2")
})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column
    private String alias;
    @Basic(optional = false)
    @Column
    @Lob
    private byte[] clave;
    @Basic(optional = false)
    @Column
    private String nombres;
    @Basic(optional = false)
    @Column
    private String apellidos;
    @JoinColumn(name = Util.COL_GRUPO, referencedColumnName = Util.COL_CODIGO)
    @ManyToOne(optional = false)
    private Grupo grupo;
    @Column
    @Lob
    @Basic
    private byte[] foto;
    @Basic(optional = false)
    @Column
    private boolean activo;

    public Usuario() {
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public byte[] getClave() {
        return clave;
    }

    public void setClave(byte[] clave) {
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getUsuarioStr() {
        return nombres.concat(" ").concat(apellidos);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            return alias.equals(((Usuario) obj).alias);
        }
        return false;
    }
}
