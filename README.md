<p align="left">
   <img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">
   </p>

<h1>Foro Hub</h1>
API Rest desarrollada para un foro en Spring Boot

<h2>Tecnologia utilizadas</h2>

![Badge java](https://img.shields.io/badge/java-21-red)
![Badge en Desarollo](https://img.shields.io/badge/maven-3.8-blue)
![Badge en Desarollo](https://img.shields.io/badge/Spring%20Boot-3.4.1-green)

![GitHub Org's stars](https://img.shields.io/github/stars/PWilX51?style=social)

<h2>Cómo Usarlo</h2>

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/forohub-api.git
2. Navega al directorio del proyecto:
cd forohub
3. Configura la base de datos en el archivo application.properties:

   spring.datasource.url=jdbc:mysql://localhost:3306/forohub
   spring.datasource.username=miusuario_baseDeDatos spring.datasource.password=miclave             
   spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl spring.jpa.show-sql=true 
   spring.jpa.properties.hibernate.format_sql=true server.error.include-stacktrace=never api.security.secret=${JWT_SECRET:ContraseñaSecreta}

5. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run

<h2>Autor</h2>

Wilfred Cárdenas
