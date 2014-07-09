package com.sah.model.entities;
// Generated 11-jun-2014 0:40:44 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Ubicacion generated by hbm2java
 */
public class Ubicacion  implements java.io.Serializable {
     private int idubicacion;
     private String departamento;
     private String provincia;
     private String distrito;
     private Set cuartos = new HashSet(0);

    public Ubicacion() {
    }

    public Ubicacion(int idubicacion, String departamento, String provincia, String distrito) {
        this.idubicacion = idubicacion;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
    }
    public Ubicacion(int idubicacion, String departamento, String provincia, String distrito, Set cuartos) {
       this.idubicacion = idubicacion;
       this.departamento = departamento;
       this.provincia = provincia;
       this.distrito = distrito;
       this.cuartos = cuartos;
    }
   
    public int getIdubicacion() {
        return this.idubicacion;
    }
    
    public void setIdubicacion(int idubicacion) {
        this.idubicacion = idubicacion;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getDistrito() {
        return this.distrito;
    }
    
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public Set getCuartos() {
        return this.cuartos;
    }
    
    public void setCuartos(Set cuartos) {
        this.cuartos = cuartos;
    }
}


