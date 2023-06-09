# API REST de Automóviles
Esta es una API REST creada en Java utilizando el framework Spring Boot para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en automóviles. Además, se ha implementado JWT (JSON Web Token) para la autenticación de usuarios.

## Tecnologías utilizadas
* Java
* Spring Boot
* JWT (JSON Web Token)
* MySQL

## Funcionalidades
La API REST de Automóviles ofrece las siguientes funcionalidades:

* Crear automóviles con información como marca, modelo, color, precio, entre otros.
* Leer la información de los automóviles almacenados en la base de datos.
* Actualizar la información de los automóviles existentes.
* Eliminar automóviles de la base de datos.
* Autenticación de usuarios utilizando JWT. Los usuarios administradores tienen acceso a todos los métodos de la API, mientras que los usuarios normales solo pueden * acceder a los métodos de consulta.

## Despliegue
La API REST de Automóviles aún no ha sido desplegada, pero se planea hacerlo utilizando la plataforma de Heroku.

## Documentación
Se planea utilizar Swagger para documentar la API REST de Automóviles. 

## Pruebas unitarias
Se planea implementar pruebas unitarias utilizando JUnit para asegurar la funcionalidad correcta de la API.

## Instrucciones de ejecución local
Para ejecutar la API REST de Automóviles en tu entorno local, sigue los siguientes pasos:

1. Clona el repositorio.
2. Importa el proyecto en tu IDE de preferencia.
3. Configura la conexión a la base de datos MySQL en el archivo de configuración de la aplicación.
4. Ejecuta la aplicación desde tu IDE o utilizando el comando mvn spring-boot:run en la carpeta del proyecto.
5. Accede a la API REST de Automóviles en http://localhost:puerto en tu navegador o a través de herramientas como Postman.
