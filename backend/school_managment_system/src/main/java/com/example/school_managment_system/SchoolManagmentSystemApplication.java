package com.example.school_managment_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagmentSystemApplication.class, args);
		}
}

/*

ssm/
├── src/
│   ├── main/
│   │   ├── java/com/tuempresa/ssm/
│   │   │   ├── domain/                 # Modelos y entidades del sistema
│   │   │   │   ├── models/           
│   │   │   │   │   ├── MainUser.java       # Clase base de usuario
│   │   │   │   │   ├── Admin.java         # Extiende Usuario
│   │   │   │   │   ├── Profesor.java      # Extiende Usuario
│   │   │   │   │   ├── Estudiante.java    # Extiende Usuario
│   │   │   │   │   ├── UsuarioConPermisos.java  # Relación 1:N con Permisos
│   │   │   │   │   ├── Permiso.java       # Permisos individuales
│   │   │   │   │   ├── Curso.java         # Modelo de Curso
│   │   │   │   │   ├── Grado.java         # Modelo de Grado
│   │   │   │   │   ├── Materia.java       # Modelo de Materia
│   │   │   │   │   ├── Nota.java          # Modelo de Nota
│   │   │   │   │   └── Reporte.java       # Modelo de Reporte
│   │   │   │   ├── repositories/         # Interfaces de acceso a datos (repositorios)
│   │   │   │   │   ├── UsuarioRepository.java
│   │   │   │   │   ├── CursoRepository.java
│   │   │   │   │   ├── NotaRepository.java
│   │   │   │   │   └── ReporteRepository.java
│   │   │   │   ├── services/             # Lógica de negocio esencial
│   │   │   │       ├── UsuarioService.java
│   │   │   │       └── CursoService.java
│   │   │   │    
│   │   │   ├── application/  # Casos de uso que coordinan flujos de acciones
│   │   │   │   ├── usecases/
│   │   │   │   │   ├── CrearUsuarioUseCase.java
│   │   │   │   │   ├── ActualizarEstadoUsuarioUseCase.java
│   │   │   │   │   ├── CrearCursoUseCase.java
│   │   │   │   │   ├── AsignarProfesorMateriaUseCase.java
│   │   │   │   │   ├── GestionarNotasUseCase.java
│   │   │   │   │   └── GestionarReportesUseCase.java
│   │   │   │   └── dto/                  # DTOs para transporte de datos
│   │   │   │   
│   │   │   ├── infrastructure/           # Implementación de detalles técnicos y conexión a sistemas
│   │   │   │   ├── persistence/          # Implementación de repositorios (JPA/Hibernate)
│   │   │   │   │   ├── JpaUsuarioRepository.java
│   │   │   │   │   ├── JpaCursoRepository.java
│   │   │   │   │   ├── JpaNotaRepository.java
│   │   │   │   │   └── JpaReporteRepository.java
│   │   │   │   ├── security/             # Configuración de seguridad (Spring Security)
│   │   │   │   │   ├── SecurityConfig.java
│   │   │   │   │   └── CustomUserDetailsService.java
│   │   │   │   ├── controllers/          # Controladores REST
│   │   │   │   │   ├── UsuarioController.java
│   │   │   │   │   ├── CursoController.java
│   │   │   │   │   ├── NotaController.java
│   │   │   │   │   └── ReporteController.java
│   │   │   │   └── config/               # Configuraciones generales del backend
│   │   │   │       ├── ApplicationConfig.java # Clase de configuración general de la aplicación. Aquí se definen las configuraciones globales
│   │   │   │       ├── SwaggerConfig.java  # Para la documentación de API (Swagger)
│   │   │   │       └── DatabaseConfig.java  # Configuración de la base de datos
│   │   │   │   
│   │   │   └── presentation/             # No se usará por ahora (ya que el frontend es independiente)
│   │   └── resources/                    # Configuraciones (application.properties, logback.xml, etc.)
|   |
|   |
|   |
│   ├── test/
│   │   ├── java/com/tuempresa/ssm/
│   │   │   ├── domain/                 # Pruebas unitarias de las entidades del sistema
│   │   │   │   ├── models/           
│   │   │   │   │   ├── UsuarioTest.java      # Pruebas sobre la clase Usuario
│   │   │   │   │   ├── CursoTest.java        # Pruebas sobre la clase Curso
│   │   │   │   │   └── NotaTest.java         # Pruebas sobre la clase Nota
│   │   │   │   ├── repositories/         # Pruebas unitarias para repositorios
│   │   │   │   │   ├── UsuarioRepositoryTest.java
│   │   │   │   │   ├── CursoRepositoryTest.java
│   │   │   │   ├── services/             # Pruebas unitarias sobre los servicios
│   │   │   │   │   ├── UsuarioServiceTest.java
│   │   │   │   │   └── CursoServiceTest.java
│   │   │   │   ├── application/          # Pruebas unitarias para los casos de uso
│   │   │   │   │   ├── CrearUsuarioUseCaseTest.java
│   │   │   │   │   ├── GestionarNotasUseCaseTest.java
│   │   │   │   ├── infrastructure/       # Pruebas de integración, especialmente de controladores
│   │   │   │   │   ├── UsuarioControllerTest.java
│   │   │   │   │   ├── CursoControllerTest.java
│   │   │   │   │   └── SecurityConfigTest.java  # Pruebas para la configuración de seguridad
│   │   │   │   └── config/               # Pruebas de integración para la configuración general
│   │   │   │       ├── ApplicationConfigTest.java
│   │   │   │       └── DatabaseConfigTest.java
|   |   |   |
|   |   |   |
├── pom.xml or build.gradle              # Archivo de construcción (Maven o Gradle)
|── public/                              # Archivos públicos estáticos para el frontend (si se incluyen)
|   └── index.html                       # Página HTML base
|
|
|				
|
|
|
├── frontend/                           // Proyecto React separado
│   ├── node_modules/                   // Dependencias de Node.js
│   ├── public/                         // Archivos estáticos (HTML, favicon, etc.)
│   │   └── index.html
│   ├── src/                            // Código fuente de React
│   │   ├── components/                 // Componentes reutilizables (formulario de login, tabla de usuarios, etc.)
│   │   ├── services/                   // Lógica de comunicación con la API del backend (axios, fetch, etc.)
│   │   ├── pages/                      // Vistas de las diferentes secciones (Dashboard, Login, Cursos, etc.)
│   │   ├── App.js                      // Componente raíz que orquesta la app
│   │   └── index.js                    // Punto de entrada de la aplicación
│   ├── .env                            // Variables de entorno (por ejemplo, URL del backend)
│   ├── package.json                    // Configuración y dependencias de React
│   ├── package-lock.json               // Bloqueo de versiones de dependencias
└── README.md                           // Descripción del proyecto, instalación, uso, etc.

*/