## Paso 2: Configurar la Base de Datos MySQL

```sh
  CREATE DATABASE nombreDeTuBaseDeDatos;
  USE nombreDeTuBaseDeDatos;
  ```

Configurar el acceso a la base de datos en application.properties:
```sh
  spring.datasource.url=jdbc:mysql://localhost:3306/NOMBRE-DE-BASE-DE-DATOS
  spring.datasource.username=tu_usuario
  spring.datasource.password=tu_contraseña
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true
  spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

  ```
> Asegurate de cambiar el puerto (3306) y puede variar por PC
