/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.*;


@Embeddable
public class Permisos implements Serializable {

    @JoinColumn (nullable = false)
    private Long id_permiso;
    
    @JoinColumn (nullable = false)
    private boolean escribir;
    
    @JoinColumn (nullable = false)
    private boolean leer;
    
    @JoinColumn (nullable = false)
    private boolean subirDoc;
    
    @JoinColumn (nullable = false)
    private boolean adminTienda;
    
    @JoinColumn (nullable = false)
    private boolean gestion;
    

    public Long getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(Long id_permiso) {
        this.id_permiso = id_permiso;
    }

    public boolean isEscribir() {
        return escribir;
    }

    public void setEscribir(boolean escribir) {
        this.escribir = escribir;
    }

    public boolean isLeer() {
        return leer;
    }

    public void setLeer(boolean leer) {
        this.leer = leer;
    }

    public boolean isSubirDoc() {
        return subirDoc;
    }

    public void setSubirDoc(boolean subirDoc) {
        this.subirDoc = subirDoc;
    }

    public boolean isAdminTienda() {
        return adminTienda;
    }

    public void setAdminTienda(boolean adminTienda) {
        this.adminTienda = adminTienda;
    }

    public boolean isGestion() {
        return gestion;
    }

    public void setGestion(boolean gestion) {
        this.gestion = gestion;
    }
 
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_permiso != null ? id_permiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permisos)) {
            return false;
        }
        Permisos other = (Permisos) object;
        if ((this.id_permiso == null && other.id_permiso != null) || (this.id_permiso != null && !this.id_permiso.equals(other.id_permiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tarea1.Permisos[ id=" + id_permiso + " ]";
    }
    
}
