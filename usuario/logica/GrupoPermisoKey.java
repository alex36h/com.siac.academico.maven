package com.ap.coreFact.entidad;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;

@Embeddable
public class GrupoPermisoKey implements Serializable {

    public static volatile SingularAttribute<GrupoPermisoKey, Long> _grupo;
    public static volatile SingularAttribute<GrupoPermisoKey, Long> _permiso;

    private static final long serialVersionUID = 1L;

    @Basic(optional = false)
    @Column
    private long grupo;
    @Basic(optional = false)
    @Column
    private long permiso;

    public GrupoPermisoKey() {
    }

    public GrupoPermisoKey(long grupo, long permiso) {
        this.grupo = grupo;
        this.permiso = permiso;
    }

    public long getGrupo() {
        return grupo;
    }

    public void setGrupo(long grupo) {
        this.grupo = grupo;
    }

    public long getPermiso() {
        return permiso;
    }

    public void setPermiso(long permiso) {
        this.permiso = permiso;
    }
}
