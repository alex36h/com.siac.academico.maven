package com.ap.coreFact.entidad;

import com.ap.coreFact.util.Util;

import javax.persistence.*;
import javax.persistence.metamodel.SingularAttribute;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table
@NamedQueries({
        @NamedQuery(name = "getRoles", query = "SELECT DISTINCT gp.permiso.rol FROM GrupoPermiso gp " +
                "WHERE gp.inicio = ?1 AND gp.codigo.grupo = ?2 ORDER BY gp.permiso.rol.orden"),
        @NamedQuery(name = "getPermisos", query = "SELECT gp FROM GrupoPermiso gp WHERE  " +
                "gp.inicio = ?1 AND gp.grupo.codigo = ?2 AND gp.permiso.rol.codigo = ?3 " +
                "AND gp.permiso.submenu IS NULL ORDER BY gp.permiso.nombre"),
        @NamedQuery(name = "getSubPermisos", query = "SELECT gp FROM GrupoPermiso gp WHERE  " +
                "gp.inicio = ?1 AND gp.grupo.codigo = ?2 AND gp.permiso.rol.codigo = ?3 " +
                "AND gp.permiso.submenu = ?4 ORDER BY gp.permiso.nombre")
})
public class GrupoPermiso implements Serializable {

    public static volatile SingularAttribute<GrupoPermiso, Boolean> _inicio;
    public static volatile SingularAttribute<GrupoPermiso, Grupo> _grupo;

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private GrupoPermisoKey codigo;
    @Column
    @Basic(optional = false)
    @Size(min = Util.TAM_MIN, max = Util.TAM_10)
    private String modo;
    @Column
    @Basic(optional = false)
    private boolean inicio;
    @ManyToOne(optional = false)
    @JoinColumn(name = Util.COL_PERMISO, referencedColumnName = Util.COL_CODIGO,
            insertable = false, updatable = false)
    private Permiso permiso;
    @ManyToOne(optional = false)
    @JoinColumn(name = Util.COL_GRUPO, referencedColumnName = Util.COL_CODIGO,
            insertable = false, updatable = false)
    private Grupo grupo;

    public GrupoPermiso() {
    }

    public GrupoPermiso(GrupoPermisoKey codigo) {
        this.codigo = codigo;
    }

    public GrupoPermisoKey getCodigo() {
        return codigo;
    }

    public void setCodigo(GrupoPermisoKey codigo) {
        this.codigo = codigo;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public boolean isInicio() {
        return inicio;
    }

    public void setInicio(boolean inicio) {
        this.inicio = inicio;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
