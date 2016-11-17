package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import modelo.DAO.InterfazDAO;
import persistencia.Imparticion;

@ManagedBean
@SessionScoped
/**
 *
 */
public class ImparticionesActivas {

    @ManagedProperty("#{cDAO}")
    private List<Imparticion> lista;
    private InterfazDAO iDAO;

    public ImparticionesActivas() {
    }

    public List<Imparticion> getLista() {
        return lista;
    }

    public void setLista(List<Imparticion> lista) {
        this.lista = lista;
    }

    public InterfazDAO getiDAO() {
        return iDAO;
    }

    public void setiDAO(InterfazDAO iDAO) {
        this.iDAO = iDAO;
    }

    /**
     * Método que se encarga de llamar al método de la interfazDAO(implementado por 
     * el controladorDAO) que determina cuales son las imparticiones activas. 
     * Por último nos redigirá a la "matricularAlumnos.xhtml" para que solo se 
     * pueda matricular alumnos en las imparticiones activas.
     * @return 
     */
    public String imparticionesActivas() {
        lista = iDAO.imparticionesActivas();
        return "matricularAlumnos";
    }

    /**
     * Método que se encarga de llamar al método de la interfazDAO(implementado por 
     * el controladorDAO) que determina cuales son las imparticiones activas.
     * Por último nos redigirá a "bajaAlumno.xhtml" para que solo se pueda dar de
     * baja a los alumnos en imparticiones activas.
     * @return 
     */
    public String darBajaAlumno() {
        lista = iDAO.imparticionesActivas();
        return "bajaAlumno";
    }

}
