package com.ap.coreFact.persistencia;


import com.ap.coreFact.entidad.Grupo;
import com.ap.coreFact.entidad.Permiso;
import com.ap.coreFact.entidad.Rol;

import java.util.List;

public class GrupoPermiso extends ApPersistence<com.ap.coreFact.entidad.GrupoPermiso> {

    public GrupoPermiso() {
        super(com.ap.coreFact.entidad.GrupoPermiso.class);
    }

    public List<Rol> getRoles(Grupo grupo) {
        try {
            return execNamedQueryList("getRoles",
                    true, grupo.getCodigo());
        } catch (Exception e) {
            return null;
        }
    }

    public List<com.ap.coreFact.entidad.GrupoPermiso> getPermisos(Grupo grupo, Rol rol) {
        try {
            return execNamedQueryList("getPermisos",
                    true, grupo.getCodigo(), rol.getCodigo());
        } catch (Exception e) {
            return null;
        }
    }

    public List<com.ap.coreFact.entidad.GrupoPermiso> getSubPermisos(Grupo grupo, Rol rol, Permiso permiso) {
        try {
            return execNamedQueryList("getSubPermisos",
                    true, grupo.getCodigo(), rol.getCodigo(), permiso);
        } catch (Exception e) {
            return null;
        }
    }
}
