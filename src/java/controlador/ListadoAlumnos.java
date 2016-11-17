package controlador;

import persistencia.Matricula;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import modelo.DAO.InterfazDAO;

@ManagedBean
@RequestScoped
/**
 * Clase que se encargará de recuperar una lista de alumnos
 */
public class ListadoAlumnos {

    @ManagedProperty("#{cDAO}")
    private InterfazDAO iDAO;

    private List<Matricula> listaMatriculas = null;

    public ListadoAlumnos() {
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }

    public InterfazDAO getiDAO() {
        return iDAO;
    }

    public void setiDAO(InterfazDAO iDAO) {
        this.iDAO = iDAO;
    }

    /**
     * Método 
     * @return 
     */
    
    public String listarAlumnos() {
        listaMatriculas = iDAO.listarMatriculas();
        return "listadoPrueba";
    }
}
