package com.example.school_managment_system.domain.model;
import com.example.school_managment_system.domain.model.Roles.Roles;

public class UserMain {
    private Roles roleUsuario;
    private Double idUser;
    private String documentoIdentidad;
    private String nombreCompletoUsuario;
    private String emailUsuario;
    private String telefonoUsuario;
    private String direccionUsuario;
    private String fechaCreacion;
    private String contrasenaUsuario;

    public UserMain (Double idUser, String documentoIdentidad, String nombreCompletoUsuario, String emailUsuario, String telefonoUsuario, String direccionUsuario, String fechaCreacion, String contrasenaUsuario) {
      this.idUser = idUser;
      this.documentoIdentidad = documentoIdentidad;
      this.nombreCompletoUsuario = nombreCompletoUsuario;
      this.emailUsuario = emailUsuario;
      this.telefonoUsuario = telefonoUsuario;
      this.direccionUsuario = direccionUsuario;
      this.fechaCreacion = fechaCreacion;
      this.contrasenaUsuario = contrasenaUsuario;
    }

    public void mostrarInformacion() {
      System.out.println("ID del usuario: " + this.idUser);
      System.out.println("Documento de identidad: " + this.documentoIdentidad);
      System.out.println("Nombre completo: " + this.nombreCompletoUsuario);
      System.out.println("Email: " + this.emailUsuario);
      System.out.println("Telefono: " + this.telefonoUsuario);
      System.out.println("Dirección: " + this.direccionUsuario);
      System.out.println("Fecha de creación: " + this.fechaCreacion);
    }
}


