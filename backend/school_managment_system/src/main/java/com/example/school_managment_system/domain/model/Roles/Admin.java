package com.example.school_managment_system.domain.model.Roles;

import com.example.school_managment_system.domain.model.MainUser; 

public class Admin extends MainUser {

    // Constructor
    public Admin(Long idUser, String documentoIdentidad, String nombreCompletoUsuario, String emailUsuario, String telefonoUsuario, String direccionUsuario, String fechaCreacion, String contrasenaUsuario, RoleClass role) {
        super(idUser, documentoIdentidad, nombreCompletoUsuario, emailUsuario, telefonoUsuario, direccionUsuario, fechaCreacion, contrasenaUsuario, role);
    }

    // Métodos específicos de Admin
    public void crearCurso(String nombreCurso) {
        System.out.println("Curso creado: " + nombreCurso);
    }

    /* 
    public void asignarProfesorACurso(Profesor profesor, Curso curso) {
        System.out.println("Profesor " + profesor.getNombreCompletoUsuario() + " asignado al curso " + curso.getNombreCurso());
    }
    */

    public void generarReporte(String tipoReporte) {
        System.out.println("Reporte generado: " + tipoReporte);
    }
}