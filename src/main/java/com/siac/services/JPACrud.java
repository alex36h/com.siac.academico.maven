package com.siac.services;

import com.gekoware.util.Cast;
import com.siac.entities.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class JPACrud {

    public JPACrud() {
    }

    private static final String PERSISTENCE_UNIT_NAME = "com.siac.academico";
    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    EntityManager em = factory.createEntityManager();

    private List<Mensualidadesperiodo> mensualidadesperiodo;
    private Pagoestudiante pagoestudiante;
    private static Credencial credencial;

    public static Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        JPACrud.credencial = credencial;
    }
   
    private static final DateTimeFormatter formatter
            = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");

    public void save(Object entidad) throws Exception {
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Object entidad) {
        em.getTransaction().begin();
        em.merge(entidad);
        em.getTransaction().commit();
        em.close();
    }

    public <T extends Object> List<T> buscarTodo(Class<T> clase) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        Root r = cq.from(clase);
        cq.select(r);
        return em.createQuery(cq).getResultList();
    }

    public Moneda getMonedasById(int id) {
        try {
            Query query = em.createNamedQuery(("Moneda.findById"));
            query.setParameter("id", id);
            return (Moneda) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getMonedasById: " + e);
            return null;
        }
    }

    public Banco getBancoById(int id) {
        try {
            Query query = em.createNamedQuery(("Banco.findById"));
            query.setParameter("id", id);
            return (Banco) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getBancoById: " + e);
            return null;
        }
    }

    public Alergia getAlergias(int id) {
        try {
            Query query = em.createNamedQuery(("Alergia.findById"));
            query.setParameter("id", id);
            return (Alergia) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getAlergias: " + e);
            return null;
        }
    }

    public Estudiante getEstudiantes() {
        try {
            Query query = em.createNamedQuery(("Estudiante.findAll"));
            return (Estudiante) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getEstudiantes: " + e);
            return null;
        }
    }

    public List<String> getEstudiantesList() {
        try {
            Query query = em.createNamedQuery(("Estudiante.find"));
            return  query.getResultList();
        } catch (Exception e) {
            System.out.println("getEstudiantesList: " + e);
            return null;
        }
    }
    
    public Descuento getDescuentos(Arancel arancel, String estudiante) {
        try {
            Query query = em.createNamedQuery(("Descuento.findByEstudianteArancel"));
            query.setParameter("arancel", arancel.getId());
            query.setParameter("estudiante", estudiante);
            return (Descuento) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getDescuentos: " + e);
            return null;
        }
    }

    private Date agregarDias(Date fecha, int dias) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.DATE, dias);
        return cal.getTime();
    }

    public double getAbonoArancel(Arancel arancel, String estudiante) {
        try {
            Query query = em.createNamedQuery("Reciboarancel.findByEstudiante");
            query.setParameter("arancel", arancel.getId());
            query.setParameter("estudiante", estudiante);
            query.setParameter("anulado", false);
            return (double) query.getSingleResult();
        } catch (Exception e) {
            return 0;
        }
    }

    private Tipocambio getCambio(int base, int cambio, Date fecha) {
        try {
            Query query = em.createNamedQuery("Tipocambio.find");
            String f = Cast.Format.LOCAL_DATE.getValue();
            Date tmp = Cast.String2Date(Cast.Date2String(fecha, f), f);
            query.setParameter("fecha1", agregarDias(tmp, -1));
            query.setParameter("fecha2", agregarDias(tmp, 1));
            query.setParameter("base", base);
            query.setParameter("mcambio", cambio);
            return (Tipocambio) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public float getCambio() {
        try {
            return (float) getCambio(1, 2, new Date()).getCambio();
        } catch (Exception e) {
            return 0;
        }
    }

    public Estudiante getEstudianteById(int id) {
        try {
            Query query = em.createNamedQuery(("Estudiante.findById"));
            query.setParameter("id", id);
            return (Estudiante) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getEstudianteById: " + e);
            return null;
        }
    }

    public Enfermedad getEnfermedadById(int id) {
        try {
            Query query = em.createNamedQuery(("Enfermedad.findById"));
            query.setParameter("id", id);
            return (Enfermedad) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getEnfermedadById: " + e);
            return null;
        }
    }

    public Estudiante getEstudianteByCarnet(String carnet) {
        try {
            Query query = em.createNamedQuery(("Estudiante.findByCarnet"));
            query.setParameter("carnet", carnet);
            return (Estudiante) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getEstudianteByCarnet: " + e);
            return null;
        }
    }

    public Moneda getMonedasByName(String name) {
        try {
            Query query = em.createNamedQuery(("Moneda.findByNombre"));
            query.setParameter("nombre", name);
            return (Moneda) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getMonedas: " + e);
            return null;
        }
    }

    public Cargo getCargosEmpleado(int id) {
        try {
            Query query = em.createNamedQuery(("Cargosempleado.findById"));
            query.setParameter("id", id);
            return (Cargo) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getMonedas: " + e);
            return null;
        }
    }

    public Cargo getCargo(int id) {
        try {
            Query query = em.createNamedQuery(("Cargo.findById"));
            query.setParameter("id", id);
            return (Cargo) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("Cargo: " + e);
            return null;
        }
    }

    public Persona getColaborador(int id) {
        try {
            Query query = em.createNamedQuery(("Persona.findByCodigo"));
            query.setParameter("codigo", id);
            return (Persona) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getMonedas: " + e);
            return null;
        }
    }

    public Persona getColaboradorByNombre(String nombre, String apellido) {
        try {
            Query query = em.createNamedQuery(("Persona.findByNombreCompleto"));
            query.setParameter("nombre", nombre);
            query.setParameter("apellido", apellido);
            return (Persona) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getColaboradorByNombre: " + e);
            return null;
        }
    }

    public Colegio getColegioById(int id) {
        try {
            Query query = em.createNamedQuery(("Colegio.findById"));
            query.setParameter("id", id);
            return (Colegio) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getMonedas: " + e);
            return null;
        }
    }

    public Colegio getColegioByNombre(String nombre) {
        try {
            Query query = em.createNamedQuery(("Colegio.findByNombre"));
            query.setParameter("nombre", nombre);
            return (Colegio) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getColegioByNombre: " + e);
            return null;
        }
    }

    public Tipocolegio getTipoColegioByNombre(String nombre) {
        try {
            Query query = em.createNamedQuery(("Tipocolegio.findByNombre"));
            query.setParameter("nombre", nombre);
            return (Tipocolegio) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getTipoColegioByNombre: " + e);
            return null;
        }
    }

    public Tipocolegio getTipoColegioById(int id) {
        try {
            Query query = em.createNamedQuery(("Tipocolegio.findById"));
            query.setParameter("id", id);
            return (Tipocolegio) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getTipoColegioById: " + e);
            return null;
        }
    }

    public Arancel getArancelById(int id) {
        try {
            Query query = em.createNamedQuery(("Arancel.findById"));
            query.setParameter("id", id);
            return (Arancel) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getMonedas: " + e);
            return null;
        }
    }

    public Docente getDocenteById(int id) {
        try {
            Query query = em.createNamedQuery(("Docente.findById"));
            query.setParameter("id", id);
            return (Docente) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getDocenteById: " + e);
            return null;
        }
    }

    public Periodolectivo getPeriodoLectivoById(int id) {
        try {
            Query query = em.createNamedQuery(("Periodolectivo.findById"));
            query.setParameter("id", id);
            return (Periodolectivo) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getPeriodoLectivoById: " + e);
            return null;
        }
    }

    public Planestudios getPlanestudiosById(int id) {
        try {
            Query query = em.createNamedQuery(("Planestudios.findById"));
            query.setParameter("id", id);
            return (Planestudios) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getPlanestudiosById: " + e);
            return null;
        }
    }

    public Asignaturas getAsignaturasById(int id) {
        try {
            Query query = em.createNamedQuery(("Asignaturas.findById"));
            query.setParameter("id", id);
            return (Asignaturas) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getAsignaturasById: " + e);
            return null;
        }
    }

    public Aniolectivo getAñioLectivoById(int id) {
        try {
            Query query = em.createNamedQuery(("Aniolectivo.findById"));
            query.setParameter("id", id);
            return (Aniolectivo) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getAñioLectivoById: " + e);
            return null;
        }
    }

    public Pais getPaisById(int id) {
        try {
            Query query = em.createNamedQuery(("Pais.findById"));
            query.setParameter("id", id);
            return (Pais) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getMonedas: " + e);
            return null;
        }
    }

    public Pais getPaisByNombre(String nombre) {
        try {
            Query query = em.createNamedQuery(("Pais.findByNombre"));
            query.setParameter("nombre", nombre);
            return (Pais) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getPaisByNombre: " + e);
            return null;
        }
    }

    public Ciudad getCiudad(int id) {
        try {
            Query query = em.createNamedQuery(("Ciudad.findById"));
            query.setParameter("id", id);
            return (Ciudad) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getMonedas: " + e);
            return null;
        }
    }

    public Cursoinscripcion getLastInsc(String est) {
        try {
            Query query = em.createNamedQuery(("Cursoinscripcion.findLastByEst"));
            query.setParameter("est", est);
            query.setMaxResults(1);
            return (Cursoinscripcion) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getLastInsc: " + e);
            return null;
        }
    }

    public Boolean getAproboSemestre(Cursos obj, String est) {
        try {
            Cursoinscripcion ci;
            Query query = em.createNamedQuery(("Cursoinscripcion.findAprobadoByEst"));
            query.setParameter("estudiante", est);
            query.setParameter("anioLectivo", obj.getAñoLectivo().getId());
            query.setParameter("aprobado", false);;
            ci = (Cursoinscripcion) query.getSingleResult();
            if (ci.getId() != null) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("getMonedas: " + e);
            return true;
        }
    }

    public Ciudad getCiudadByNombre(String nombre) {
        try {
            Query query = em.createNamedQuery(("Ciudad.findByNombre"));
            query.setParameter("nombre", nombre);
            return (Ciudad) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getCiudadByNombre: " + e);
            return null;
        }
    }

    public Profesion getProfesionById(int id) {
        try {
            Query query = em.createNamedQuery(("Profesion.findById"));
            query.setParameter("id", id);
            return (Profesion) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getProfesionById: " + e);
            return null;
        }
    }

    public Profesion getProfesionByNombre(String nombre) {
        try {
            Query query = em.createNamedQuery(("Profesion.findByNombre"));
            query.setParameter("nombre", nombre);
            return (Profesion) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getProfesionByNombre: " + e);
            return null;
        }
    }

    public int getNumROC(Serierecibo serie) {
        int recibo = 3000;
        if (serie != null) {
            Query select = em.createNativeQuery("SELECT max(numero) numero FROM recibo where serie = ?;");
            select.setParameter(1, serie.getId());
            Object obj = select.getSingleResult();
            if (obj != null) {
                recibo = Integer.parseInt(obj.toString());
            }
        }
        return recibo;
    }

    public String getCarnet() {
        String carnet = "";
        int consecutivo = 0;
        Query select = em.createNativeQuery("SELECT carnet FROM estudiante WHERE id = (SELECT MAX(id) FROM estudiante);");
        Object obj = select.getSingleResult();
        if (obj != null) {
            consecutivo = Integer.parseInt(obj.toString().substring(obj.toString().indexOf("-") + 1, obj.toString().length())) + 1;
        }
        if (consecutivo < 10)//2019-0000
        {
            carnet = "" + Util.getYear() + "-000" + consecutivo;
        } else if (consecutivo > 9 && consecutivo < 100) {
            carnet = "" + Util.getYear() + "-00" + consecutivo;
        } else if (consecutivo > 99 && consecutivo < 999) {
            carnet = "" + Util.getYear() + "-0" + consecutivo;
        }

        return carnet;
    }

    public int getNumROCInscripcion(String est, String arancel) {
        try {
            int recibo = 0;
            if (est != null && arancel != null) {
                Query query = em.createNamedQuery(("Reciboarancel.findByEstudianteInscripcion"));
                query.setParameter("arancel", "%" + arancel.toUpperCase() + "%");
                query.setParameter("est", est);
                query.setMaxResults(1);
                Object obj = query.getSingleResult();
//            obj = (Recibo) query.getSingleResult();
                if (obj != null) {
                    recibo = Integer.parseInt(obj.toString());
                }
            }
            return recibo;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public Recibo getLastROCByUsr(Credencial credencial, Serierecibo serie, int numero, String estudiante) {
        try {
            Query query = em.createNamedQuery("Recibo.findByEstCred");
            query.setParameter("usuario", credencial.getCredencialPK().getUsuario());
            query.setParameter("serie", serie.getId());
            query.setParameter("numero", numero);
            query.setParameter("estudiante", estudiante);
            return (Recibo) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public Formapago getFormaPago() {
        int flag = 0;
        try {
            Query query = em.createNamedQuery("Formapago.findById");
            query.setParameter("id", 2);
            return (Formapago) query.getSingleResult();

        } catch (Exception e) {
            return null;
        }
    }

    public List<Formapago> getFormaPagosApertura() {
        int flag = 0;
        try {
            Query query = em.createNamedQuery("Formapago.findAllForApertura");
            query.setParameter("nombre", "%EFEC%");
            return query.getResultList();

        } catch (Exception e) {
            return null;
        }
    }

    public Formapago getFormaPagoById(int id) {
        try {
            Query query = em.createNamedQuery(("Formapago.findById"));
            query.setParameter("id", id);
            return (Formapago) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getFormaPagoById: " + e);
            return null;
        }
    }

    public Serierecibo getSeriereciboById(int id) {
        try {
            Query query = em.createNamedQuery(("Serierecibo.findById"));
            query.setParameter("id", id);
            return (Serierecibo) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getSeriereciboById: " + e);
            return null;
        }
    }

    public Iniciocaja getInicioCajaBySerie(Serierecibo serie) {
        try {
            Query query = em.createNamedQuery("Iniciocaja.find2");
            query.setParameter("serie", serie.getId());
            query.setParameter("cerrado", false);
            return (Iniciocaja) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public Iniciocaja getInicioCajaByCredSerie(Credencial credencial, Serierecibo serie) {
        try {
            Query query = em.createNamedQuery("Iniciocaja.findBYCredencialSerie");
            query.setParameter("usuario", credencial.getCredencialPK().getUsuario());
            query.setParameter("serie", serie.getId());
            query.setParameter("cerrado", false);
            return (Iniciocaja) query.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

    public Iniciocaja getInicioCaja(Credencial credencial) {
        try {
            Query query = em.createNamedQuery("Iniciocaja.findByCredendial");
            query.setParameter("usuario", credencial.getCredencialPK().getUsuario());
            query.setParameter("cerrado", false);
            return (Iniciocaja) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public Aniolectivo getAñoLectivoByNombre(String nombre) {
        try {
            Query query = em.createNamedQuery(("Aniolectivo.findByNombre"));
            query.setParameter("nombre", nombre);
            return (Aniolectivo) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getAñoLectivoByNombre: " + e);
            return null;
        }
    }

    public List<Cursos> getCursosPeriodoActivoRI(Cursos obj, boolean aprobo) {
        try {
            Query query = em.createNamedQuery(("Cursos.findByPLActual"));
            query.setParameter("activo", true);
            if (aprobo == false) {
                query.setParameter("anio", obj.getAnio());
            } else {
                query.setParameter("anio", obj.getAnio() + 1);
            }
            query.setParameter("cupo", 0);
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getCursosPeriodoActivo: " + e);
            return null;
        }
    }

    public List<Cursos> getCursosPeriodoActivoNI() {
        try {
            Query query = em.createNamedQuery(("Cursos.findByPLActual"));
            query.setParameter("activo", true);
            query.setParameter("anio", 1);
            query.setParameter("cupo", 0);
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getCursosPeriodoActivoNI: " + e);
            return null;
        }
    }

    public List<Cursos> getCursoInscripcion(String carnet) {
        try {
            Query query = em.createNamedQuery(("Cursoinscripcion.findByEstudiante"));
            query.setParameter("carnet", carnet);
            query.setParameter("anio", "%" + Util.getYear() + "%");
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getCursoInscripcion: " + e);
            return null;
        }
    }

    public Aulas getAulasById(int id) {
        try {
            Query query = em.createNamedQuery(("Aulas.findById"));
            query.setParameter("id", id);
            return (Aulas) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getAulasById: " + e);
            return null;
        }
    }

    public List<Mensualidadesperiodo> getMensualidadesPeriodo() {
        try {
            Query query = em.createNamedQuery(("Mensualidadesperiodo.findByAnio"));
            query.setParameter("anio", 2019);
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getMensualidadesPeriodo " + e);
            return null;
        }
    }

    public List<Long> getMensualidadesPeriodoII() {
        try {
            Query query = em.createNamedQuery(("Mensualidadesperiodo.findByAnioII"));
            query.setParameter("anio", 2019);
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getMensualidadesPeriodoII " + e);
            return null;
        }
    }

    public void generarMensualidades(Estudiante Estudiante) {
        try {
            mensualidadesperiodo = getMensualidadesPeriodo();
            Pagoestudiante pe = getPagoEstudianteByEstudiante(Estudiante);

            if (pe == null) {
                if (mensualidadesperiodo != null) {
                    for (Mensualidadesperiodo obj : mensualidadesperiodo) {
                        JPACrud x = new JPACrud();
                        pagoestudiante = new Pagoestudiante();
                        pagoestudiante.setEstudiante(Estudiante);
                        pagoestudiante.setArancel(obj.getArancel());
                        pagoestudiante.setAnio(2019);
                        pagoestudiante.setMes(obj.getMes());
                        x.save(pagoestudiante);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("generarMensualidades " + e);
        }
    }

    public Pagoestudiante getMensualidadPagar(String estudiante) {
        try {
            Query query = em.createNamedQuery(("Pagoestudiante.findByEstudiante"));
            query.setParameter("estudiante", estudiante);
            query.setMaxResults(1);
            return (Pagoestudiante) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getMensualidadPagar " + e);
            return null;
        }
    }

    public Pagoestudiante getPagoEstudiante(Pagoestudiante pagoestudiante) {
        try {
            Query query = em.createNamedQuery(("Pagoestudiante.findById"));
            query.setParameter("id", pagoestudiante.getId());
            return (Pagoestudiante) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getPagoEstudiante " + e);
            return null;
        }
    }

    public Pagoestudiante getPagoEstudianteByEstudiante(Estudiante estudiante) {
        try {
            Query query = em.createNamedQuery(("Pagoestudiante.findByEstudiante"));
            query.setParameter("estudiante", estudiante.getCarnet());
            query.setParameter("anio", Util.getYear());
            return (Pagoestudiante) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getPagoEstudianteByEstudiante " + e);
            return null;
        }
    }

    public double getSaldoArancel(Pagoestudiante pagoestudiante) {
        try {
            Query query = em.createNamedQuery(("Reciboarancel.findByArancelEstudiante"));
            query.setParameter("estudiante", pagoestudiante.getEstudiante().getCarnet());
            query.setParameter("arancel", pagoestudiante.getArancel().getId());
            return (double) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getSaldoArancel " + e);
            return 290491;
        }
    }

    public double getDebeMensualidades(Pagoestudiante pagoestudiante) {
        double saldo = 0;

        try {
            switch (pagoestudiante.getMes()) {

                case 1:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 2:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 3:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 4:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 5:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 6:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 7:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 8:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 9:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 10:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 11:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

                case 12:
                    if (pagoestudiante.getPagado()) {
                        return saldo = 0;
                    } else {
                        if (getSaldoArancel(pagoestudiante) == 290491) {
                            return saldo = pagoestudiante.getArancel().getPrecio();
                        } else {
                            return saldo = getSaldoArancel(pagoestudiante);
                        }
                    }

            }
        } catch (Exception e) {
            System.out.println("getPagoEstudiante " + e);
            return saldo = pagoestudiante.getArancel().getPrecio();
        }
        return saldo = 290491;
    }

    public List<Pagoestudiante> getDistinctPagoEstudiante() {
        try {
            Query query = em.createNamedQuery(("Pagoestudiante.findEstudianteByDistinct"));
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getDistinctPagoEstudiante " + e);
            return null;
        }
    }

    public Cursos getEstudioISEM(String estudiante) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = format.format(new Date());
            Date date1 = format.parse("2019-01-01");
            Date date2 = format.parse("2019-12-30");

            Query query = em.createNamedQuery(("Cursoinscripcion.findByISEM"));
            query.setParameter("estudiante", estudiante);
            query.setParameter("finicio", date1);
            query.setParameter("ffin", date2);
            query.setMaxResults(1);
            return (Cursos) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getEstudioISEM " + e);
            return null;
        }
    }

    public Cursos getCursosById(int id) {
        try {
            Query query = em.createNamedQuery(("Cursos.findById"));
            query.setParameter("id", id);
            return (Cursos) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getCursosById: " + e);
            return null;
        }
    }

    public Serierecibo getSerieByNombre(String nombre) {
        try {
            Query query = em.createNamedQuery(("Serierecibo.findByNombre"));
            query.setParameter("nombre", nombre.toUpperCase());
            return (Serierecibo) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getSerieByNombre: " + e);
            return null;
        }
    }

    public Mensualidadesperiodo getMensualidadesPeriodoByAnioMes() {
        try {
            Query query = em.createNamedQuery(("Mensualidadesperiodo.findByMesAnio"));
            query.setParameter("mes1", 1);
            query.setParameter("mes2", 1);
            query.setParameter("anio", 2019);
            query.setMaxResults(1);
            return (Mensualidadesperiodo) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getMensualidadesPeriodoByAnioMes() " + e);
            return null;
        }
    }

    public double getExoneracionesPeriodo() {
        try {

            List<Long> mensualidades = getMensualidadesPeriodoII();

            Query query = em.createNamedQuery(("Descuento.findByMesPeriodo"));
            query.setParameter("ids", mensualidades);
            return (double) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getExoneracionesPeriodo() " + e);
            return 0;
        }
    }

    public double getPagoEstudianteByEstado(int mes, int anio, boolean pagado)//para calcular los meses pagados en la cartera
    {
        try {
            Query query = em.createNamedQuery(("Pagoestudiante.findByEstado"));
            query.setParameter("mes", mes);
            query.setParameter("anio", 2019);
            query.setParameter("pagado", pagado);
            long dato = (long) query.getSingleResult();

            return dato;

        } catch (Exception e) {
            System.out.println("getPagoEstudianteByEstado() " + e);
            return 0;
        }
    }

    public Cierrecaja getCierreCaja(Iniciocaja iniciocaja) {
        try {
            Query query = em.createNamedQuery("Cierrecaja.findByInicio");
            query.setParameter("inicio", iniciocaja.getId());
            return (Cierrecaja) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public List<Recibo> getRecibosHoy(Iniciocaja inicioCaja) {
        Query query = em.createNamedQuery("Recibo.findByHoySerie");
        query.setParameter("fecha", inicioCaja.getFecha());
        query.setParameter("serie", inicioCaja.getSerie().getId());
        query.setParameter("usuario", inicioCaja.getCredencial().getCredencialPK().getUsuario());
        return query.getResultList();
    }

    public List<Detallerecibo> getDetalleRecibo(Recibo obj) {
        Query query = em.createNamedQuery("Detallerecibo.findByRecibo");
        query.setParameter("recibo", obj.getId());
        return query.getResultList();
    }

    public Parentesco getParentescoById(int id) {
        try {
            Query query = em.createNamedQuery(("Parentesco.findById"));
            query.setParameter("id", id);
            return (Parentesco) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getParentescoById(): " + e);
            return null;
        }
    }

    public Familiar getFamiliarById(int id) {
        try {
            Query query = em.createNamedQuery(("Familiar.findById"));
            query.setParameter("id", id);
            return (Familiar) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getFamiliarById(): " + e);
            return null;
        }
    }

    public List<Cursoinscripcion> getCursoInscripcionById(int id) {
        try {
            Query query = em.createNamedQuery(("Cursoinscripcion.findById"));
            query.setParameter("id", id);
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getCursoInscripcionById: " + e);
            return null;
        }
    }

    public Credencial getAuthUser(String usr, String pass) {
        try {
            Query query = em.createNamedQuery(("Credencial.findByCredenciales"));
            query.setParameter("usr", usr);
            query.setParameter("pass", pass);
            return (Credencial) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getAuthUser(String usr, String pass): " + e);
            return null;
        }
    }

    public List<Reciboarancel> getRecibosHoy() {
        String f = Cast.Format.LOCAL_DATE.getValue();
        Date tmp;
        try {
            tmp = Cast.String2Date(Cast.Date2String(new Date(), f), f);
        } catch (Exception e) {
            tmp = new Date();
        }
        Query query = em.createNamedQuery("Reciboarancel.findByHoy");
        query.setParameter("fecha", tmp);
        return query.getResultList();
    }

    public Recibo getROCById(int id) {
        try {
            Query query = em.createNamedQuery(("Recibo.findById"));
            query.setParameter("id", id);
            return (Recibo) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getROCById(int id): " + e);
            return null;
        }
    }

    public List<Reciboarancel> getReimpresionROC(Date fechaInicio, Date fechaFin,String idEstudiante, String arancel) {
        try {
            Query query = em.createNamedQuery(("Reciboarancel.findByEstudianteFecha"));
            query.setParameter("fechaInicio", fechaInicio);
            query.setParameter("fechaFin", fechaFin);
            query.setParameter("est", idEstudiante);
            query.setParameter("arancel", "%"+arancel.toLowerCase()+"%");
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getReimpresionROC(Date fechaInicio, Date fechaFin,String idEstudiante, String arancel) " + e);
            return null;
        }
    }
   
    public List<Pagoestudiante> getPagoEstudianteByEstudianteROC(String estudiante, int ROC) {
        try {
            Query query = em.createNamedQuery(("Pagoestudiante.findByEstudianteROC"));
            query.setParameter("carnet", estudiante);
            query.setParameter("roc", ROC);
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getPagoEstudianteByEstudianteROC(Estudiante estudiante) " + e);
            return null;
        }
    }
    
    public Tipobeca getTipoBecaById(int id) {
        try {
            Query query = em.createNamedQuery(("Tipobeca.findById"));
            query.setParameter("id", id);
            return (Tipobeca) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getTipoBecaById: " + e);
            return null;
        }
    }
    
    public Tipobeca getTipoBecaByNombre(String nombre) {
        try {
            Query query = em.createNamedQuery(("Tipobeca.findByNombre"));
            query.setParameter("nombre", nombre);
            return (Tipobeca) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getTipoBecaByNombre: " + e);
            return null;
        }
    }
    
        public Beca getBecaActiva(String estudiante, Arancel arancel) {
        try {
            Query query = em.createNamedQuery("Beca.findByBecaActiva");
            query.setParameter("estudiante", estudiante);
            query.setParameter("activo", true);
            query.setParameter("arancel", arancel.getId());
            return (Beca) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    } 
            
        public List<Rol> getRoles(Credencial usuario) {
        try {
            Query query = em.createNamedQuery("Grupopermiso.getRoles");
            query.setParameter("grupo", usuario.getGrupo());
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }
        //getSubPermisos
//        public List<Grupopermiso> getPermisos(Credencial usuario, Rol menu) {
//        try {
//            Query query = em.createNamedQuery("Grupopermiso.getPermisos");
//            query.setParameter("grupo", usuario.getGrupo());
//            query.setParameter("rolcodigo", menu.getCodigo());
//            return query.getResultList();
//        } catch (Exception e) {
//            return null;
//        }
//    }
//        
        
    public Credencial getCred(String usr) {
        try {
            Query query = em.createNamedQuery(("Credencial.findByUsuario"));
            query.setParameter("usuario", usr);
            setCredencial((Credencial) query.getSingleResult());
            return (Credencial) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("Credencial: " + e);
            return null;
        }
    }
   
     public List<Rolcredencial> getRolCredencial(Credencial usr) {
        try {
            Query query = em.createNamedQuery(("Rolcredencial.findByCredencial"));
            query.setParameter("credencial", usr.getCredencialPK().getCodigo());
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getRolCredencial: " + e);
            return null;
        }
    }
         
    public List<Gruporol> getMenu(Credencial usr) {
        try {
            Query query = em.createNamedQuery(("Rolcredencial.getMenusByCredencial"));
            query.setParameter("credencial", usr.getCredencialPK().getCodigo());
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getMenu: " + e);
            return null;
        }
    }
        
    public List<Rol> getForms(Credencial usr) {
        try {
            Query query = em.createNamedQuery(("Rolcredencial.getFormsByCredencial"));
            query.setParameter("credencial", usr.getCredencialPK().getCodigo());
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getForms: " + e);
            return null;
        }
    }
    
    public Iniciocaja getInicioCajaById(long id) {
        try {
            Query query = em.createNamedQuery("Iniciocaja.findById");
            query.setParameter("id", id);
            return (Iniciocaja) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Iniciocaja> getInicioCajaOrderById() {
        try {
            Query query = em.createNamedQuery("Iniciocaja.findAllOrderById");
            return  query.getResultList();
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Persona> getColaborador() {
        try {
            Query query = em.createNamedQuery(("Persona.findAllNotStd"));
            query.setParameter("ids", getEstudiantesList());
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getColaborador: " + e);
            return null;
        }
    }
    
    public List<Rolgrupousuario> getRolGrupoUsuario(int grupo) {
        try {
            Query query = em.createNamedQuery(("Rolgrupousuario.findByGrupo"));
            query.setParameter("grupo", grupo);
            return query.getResultList();
        } catch (Exception e) {
            System.out.println("getRolGrupoUsuario: " + e);
            return null;
        }
    }
    
    public Grupo getRolById(int grupo) {
        try {
            Query query = em.createNamedQuery(("Grupo.findByCodigo"));
            query.setParameter("codigo", grupo);
            return (Grupo) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getRolById: " + e);
            return null;
        }
    }
    
    public int getCodCredencial() {
        
            Query select = em.createNativeQuery("SELECT max(codigo)FROM credencial;");
            Object obj = select.getSingleResult();
            
            if (obj != null) {
                return Integer.parseInt(obj.toString())+1;
            }
        return 0;
    }
    
    public Rol getRolByKey(int id) {
        try {
            Query query = em.createNamedQuery(("Rol.findById"));
            query.setParameter("id", id);
            return (Rol) query.getSingleResult();
        } catch (Exception e) {
            System.out.println("getRolByKey: " + e);
            return null;
        }
    }
    
    public boolean updatePassword(String password, String user) {
        try {
            Query query = em.createQuery("UPDATE Credencial SET clave =:password WHERE usuario =:user");
            query.setParameter("password", password).executeUpdate();
            query.setParameter("user", user);
            int updateCount = query.executeUpdate();
            
            if (updateCount > 0) {
                return true;
            }
        return false;
        } catch (Exception e) {
            System.out.println("La operacin fallo con exito => "+e);
            return false;
        } 
    }
}
