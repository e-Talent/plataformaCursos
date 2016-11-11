/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import modelo.DAO.InterfazDAO;
import persistencia.Matricula;

@ManagedBean
@RequestScoped
public class MatricularAlumno {

    @ManagedProperty("#{cDAO}")
    private InterfazDAO iDAO;
    private int idImparticion;
    private String DNI;

    public MatricularAlumno() {
    }

    public int getIdImparticion() {
        return idImparticion;
    }

    public void setIdImparticion(int idImparticion) {
        this.idImparticion = idImparticion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public InterfazDAO getiDAO() {
        return iDAO;
    }

    public void setiDAO(InterfazDAO iDAO) {
        this.iDAO = iDAO;
    }

    public String matricular () {
    Matricula m = new Matricula();
    m.setDni(iDAO.buscarUsuarioDNI(DNI));
    m.setIdImparticion(iDAO.buscarImparticionID(idImparticion));
    iDAO.persist(m);
    return "menuAdmin";
    }
    
}