package com.ap.coreFact.persistencia;


import com.ap.coreFact.entidad.Auditoria;
import com.ap.coreFact.entidad.Usuario_;
import com.ap.coreFact.util.Util;

import java.util.Date;
import java.util.List;

public class Usuario extends ApPersistence {

    public Usuario() {
        super(com.ap.coreFact.entidad.Usuario.class);
    }

    public com.ap.coreFact.entidad.Usuario buscarUsuario(String alias, String clave, boolean auditoria) {
        com.ap.coreFact.entidad.Usuario u;
        try {
            u = execNamedQuery("getUsuario",
                    alias, Util.encriptar(clave));
            if (u != null && auditoria) {
                Auditoria a = new Auditoria();
                a.setEntidad(Auditoria.ENT_USUARIO);
                a.setFechaIngreso(new Date());
                a.setReferencia("Inicio de Sesion de : " + u.getAlias());
                a.setRegistro(Auditoria.LOG_LOGIN);
                a.setUsuario(u);
                insert(a);
            }
        } catch (Exception e) {
            u = null;
        }
        return u;
    }

    @Override
    public List<com.ap.coreFact.entidad.Usuario> getEntitiesActivated() {
        List<com.ap.coreFact.entidad.Usuario> list;
        try {
            list = searchAll(entityClass, new Criterio(true, Usuario_.activo));
        } catch (Exception e) {
            list = null;
        }
        return list;
    }

}
