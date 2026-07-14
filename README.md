# Llanquihue_Tour
Proyecto Llanquihue Sumativa3

## ESTRUCTURA DE ARCHIVOS DEL PROYECTO

src/
├── data/
│   ├── GestorServicios.java
│   └── GestorEntidades.java      
├── model/
│   ├── ExcursionCultural.java
│   ├── GuiaTuristico.java
│   ├── Registrable.java          
│   ├── PaseoLacustre.java        
│   └── RutaGastronomica.java
|   └── ServicioTuristico.java
|   └── Vehiculo.java     
└── ui/
    └── Main.java



Descripción del Sistema
Aplicación de consola en Java que gestiona los servicios de Llanquihue Tour. El sistema permite:

Leer registros de personas desde un archivo de texto plano con validaciones de campos vacíos.

Buscar usuarios mediante un filtro por RUT.

* Administrar de forma genérica diferentes entidades de la empresa (como Vehículos y Guías Turísticos) bajo un modelo polimórfico común (Registrable).

* Generar reportes unificados identificando dinámicamente cada tipo de entidad para extraer sus datos específicos.

Paquetes y Clases
📦 Paquete model (Jerarquía y Reglas de Negocio)
Registrable.java (Interfaz): Define el comportamiento común para los recursos de la empresa que requieren un registro básico, obligando a implementar el método mostrarResumen().

GuiaTuristico.java y Vehiculo.java: Clases que implementan la interfaz Registrable. Representan los recursos físicos y humanos de la agencia.

ServicioTuristico.java: Clase base (o abstracta) que define la estructura general de un servicio ofrecido por la agencia Llanquihue Tour.

ExcursionCultural.java, PaseoLacustre.java y RutaGastronomica.java: Especializaciones de ServicioTuristico. Representan las distintas actividades turísticas que ofrece la empresa, cada una con sus propias reglas y atributos específicos.

📦 Paquete data (Controladores y Gestión de Datos)
GestorEntidades.java: Administra la colección de objetos de tipo Registrable (Vehículos y Guías). Utiliza lógica polimórfica e instanceof para procesar y listar de manera diferenciada estos recursos.

GestorServicios.java: Clase encargada de almacenar, organizar y gestionar la oferta de servicios turísticos disponibles en la plataforma.

📦 Paquete ui (Interfaz de Usuario)
Main.java: Punto de entrada de la aplicación. Se encarga de pintar el menú en la terminal, capturar las interacciones del usuario y conectar la interfaz de consola con los gestores de datos.

Registrable.java (Interfaz): Define el contrato base para cualquier elemento que deba ser incorporado en los reportes de la empresa, obligando a implementar el método mostrarResumen().
GuiaTuristico.java: Implementa Registrable. Modela a los guías de turismo, incluyendo atributos específicos como los idiomas que manejan.
Vehiculo.java: Implementa Registrable. Modela la flota de transporte de la empresa, almacenando su patente y capacidad de pasajeros.


## Instrucciones de Ejecución

Coloque el archivo datosllanquihue.txt en la raíz del proyecto.

Abra el proyecto en su IDE Netbeans.
Diríjase al paquete main, haga clic derecho sobre Main.java y seleccione Ejecutar / Run File.
Use el menú de la interfaz para interactuar con el sistema de búsqueda o para generar el reporte general de entidades de la empresa.
