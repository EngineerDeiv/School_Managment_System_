package com.example.school_managment_system.domain.model.Permisos;

import com.example.school_managment_system.domain.model.MainUser;

public interface Permiso {
    boolean verificarPermiso(MainUser usuario);
 
}
/*
 * 
 * Hay que hacer esto 
 * 
 * │   ├── permisos/
│   │   ├── Permiso.java        // Interfaz base con permisos generales
│   │   ├── PermisoAdmin.java   // Permisos específicos para Admin
│   │   ├── PermisoEstudiante.java // Permisos específicos para Estudiante
│   │   └── PermisoProfesor.java // Permisos específicos para Profesor

y posiblemente por cada clase....

 */