# Proyecto de Gestión de Inventarios

Este proyecto es una API REST para gestionar productos en un inventario. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los productos. La API está construida usando **Spring Boot**, con **MySQL** como base de datos y documentada con **Swagger**.

## Características

- Gestión de productos en el inventario.
- Operaciones CRUD sobre los productos.
- Integración con MySQL para el almacenamiento persistente.
- Documentación de la API generada automáticamente con Swagger.

## Tecnologías Utilizadas

- **Spring Boot 3.3.4**: Framework para la construcción de aplicaciones Java.
- **Spring Data JPA**: Manejo de persistencia con JPA (Java Persistence API).
- **MySQL**: Base de datos relacional para el almacenamiento de los productos.
- **Swagger/OpenAPI**: Documentación de la API de manera interactiva.
- **Lombok**: Simplificación del código Java con anotaciones (opcional).

## Requisitos

Para ejecutar este proyecto, necesitarás tener instalado:

- Java 17 o superior.
- MySQL (o un contenedor Docker con MySQL).
- Maven 3.8 o superior.

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/tu-usuario/gestion-inventario.git

2. Navega a la carpeta del proyecto:

   ```bash
   cd gestion-inventario
   ```

3. Configura la base de datos MySQL. Actualiza los detalles de conexión en el archivo `application.properties` si es necesario:

   ```properties
   spring.datasource.url=jdbc:mysql://<IP_O_DOMINIO>:3306/gestion_inventario
   spring.datasource.username=root
   spring.datasource.password=<TU_CONTRASEÑA>
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```

4. Ejecuta el proyecto usando Maven:

   ```bash
   mvn spring-boot:run
   ```

## Uso

La API tiene los siguientes endpoints para gestionar los productos:

### Obtener todos los productos

```http
GET /api/product
```

### Obtener un producto por ID

```http
GET /api/product/{id}
```

### Crear un nuevo producto

```http
POST /api/product
```

Cuerpo de la solicitud:

```json
{
  "name": "Laptop",
  "price": 799.99,
  "description": "Laptop con 16GB RAM y 512GB SSD"
}
```

### Actualizar un producto por ID

```http
PUT /api/product/{id}
```

Cuerpo de la solicitud:

```json
{
  "name": "Laptop Actualizada",
  "price": 899.99,
  "description": "Laptop con 32GB RAM y 1TB SSD"
}
```

### Eliminar un producto por ID

```http
DELETE /api/product/{id}
```

## Documentación de la API con Swagger

La documentación de la API está disponible en la siguiente URL cuando el proyecto está en ejecución:

```
https://app.swaggerhub.com/apis-docs/ROBINMOSQUERA13/GestionInventario/1.0.0
```

Esto te permitirá visualizar y probar los endpoints de manera interactiva.

## Base de Datos

El esquema de base de datos MySQL utilizado en este proyecto es el siguiente:

```sql
CREATE DATABASE gestion_inventario;

CREATE TABLE product (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  price DECIMAL(10,2) NOT NULL,
  description text
);
```

## Estructura del Proyecto

```
gestion-inventario/
│
├── src/
│   ├── main/
│   │   ├── java/com/GestionInventario/v1/controller/ProductController.java  # Controladores REST
│   │   ├── java/com/GestionInventario/v1/model/Product.java       # Modelos de datos
│   │   ├── java/com/GestionInventario/v1/repository/ProductRepository.java # Repository
│   │   ├── java/com/GestionInventario/v1/service/productService.java     # Servicios
│   ├── resources/
│       ├── application.properties  # Configuración de la aplicación
├── pom.xml       # Dependencias del proyecto
└── README.md     # Este archivo
```

# Autores
- [Robinson Mosquera](https://github.com/RobinsonMosqueraCubides)
- [Hernan Mendez](https://github.com/HernanMA)