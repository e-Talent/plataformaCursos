package modelo.DAO;

import persistencia.Curso;
import persistencia.Imparticion;
import persistencia.Matricula;
import persistencia.Usuario;
import java.util.List;
import org.primefaces.model.StreamedContent;
import persistencia.Examen;

public interface InterfazDAO {

    public void persist(Object object);

    public List<Usuario> listarUsuarios();

    public List<Curso> listarCursos();

    public List<Imparticion> listarImparticiones();

    public List<Matricula> listarMatriculas();

    public Usuario login(String usuario, String password);

    public List<Imparticion> imparticionesActivas();

    public Curso buscarCursoID(int idCurso);

    public Imparticion buscarImparticionID(int idImparticion);

    public Usuario buscarUsuarioDNI(String DNI);
    
    public List<Curso> listarCursosNombre(String nombre);
    
    public List<Matricula> imparticionesAlumno (String DNI);
    
    public List<Examen> cargarExamen (String idImparticion);
    
    public StreamedContent descargarFoto(String DNI);
}
