package com.example.school_managment_system.domain.model.Roles;
import java.security.Permission;
import java.util.ArrayList;
import java.util.List;

import com.example.school_managment_system.domain.model.permiso.Permiso;


public abstract class  Roles {
   protected String NombreRole;
   protected List<Permiso> permisos = new ArrayList<>();

   public Roles (String NombreRole) {
      this.NombreRole = NombreRole; 
   }
   
   // Método para asignar permisos al rol
    public abstract void assignPermissions();

    // Método común para verificar permisos
    public boolean hasPermission(Permission permission) {
        return getPermissions().contains(permission);
    }

    // Método que cada rol implementará para definir su lista de permisos
    public abstract List<Permission> getPermissions();
}
