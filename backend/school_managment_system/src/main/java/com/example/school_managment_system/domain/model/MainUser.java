package com.example.school_managment_system.domain.model;

import com.example.school_managment_system.domain.model.Roles.RoleClass;

public class MainUser {
    private RoleClass role;  // Rol del usuario
    private Long idUser;     // Cambiado a Long
    private String documentoIdentidad;
    private String nombreCompletoUsuario;
    private String emailUsuario;
    private String telefonoUsuario;
    private String direccionUsuario;
    private String fechaCreacion;
    private String contrasenaUsuario;

    // Constructor
    public MainUser(Long idUser, String documentoIdentidad, String nombreCompletoUsuario, String emailUsuario, String telefonoUsuario, String direccionUsuario, String fechaCreacion, String contrasenaUsuario, RoleClass role) {
        this.idUser = idUser;
        this.documentoIdentidad = documentoIdentidad;
        this.nombreCompletoUsuario = nombreCompletoUsuario;
        this.emailUsuario = emailUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.direccionUsuario = direccionUsuario;
        this.fechaCreacion = fechaCreacion;
        this.contrasenaUsuario = contrasenaUsuario;
        this.role = role;  // Inicialización del rol
    }

    // Getters y Setters
    public RoleClass getRole() {
        return role;
    }

    public void setRole(RoleClass role) {
        this.role = role;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombreCompletoUsuario() {
        return nombreCompletoUsuario;
    }

    public void setNombreCompletoUsuario(String nombreCompletoUsuario) {
        this.nombreCompletoUsuario = nombreCompletoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    // Método para mostrar información (mejorado)
    public String mostrarInformacion() {
        return String.format(
            "ID del usuario: %d\n" +
            "Role: %s\n" +
            "Documento de identidad: %s\n" +
            "Nombre completo: %s\n" +
            "Email: %s\n" +
            "Teléfono: %s\n" +
            "Dirección: %s\n" +
            "Fecha de creación: %s",
            idUser, role, documentoIdentidad, nombreCompletoUsuario, emailUsuario, telefonoUsuario, direccionUsuario, fechaCreacion
        );
    }
}