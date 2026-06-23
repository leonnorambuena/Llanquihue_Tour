# Llanquihue_Tour
Proyecto Llanquihue Sumativa2
ESTRUCTURA DE ARCHIVOS DEL PROYECTO:
src/
├── data/
│   └── Datos.java
├── model/
│   ├── Direccion.java
│   └── Persona.java
└── main/
    └── Main.java



## Descripción del Sistema
Aplicación de consola en Java que lee registros desde un archivo de texto plano. El sistema procesa la información del archivo, aplica validaciones para evitar campos vacíos en los atributos principales y cuenta con un filtro de búsqueda por RUT.

## Paquetes y Clases
- Paquete model: Clase Persona.java y Clase Direccion.java para estructurar las entidades del sistema de forma independiente.
- Paquete data: Clase Datos.java encargada de la lectura del archivo .txt y el procesamiento de las líneas de texto.
- Paquete main: Clase Main.java que actúa como el motor principal, interactúa con el usuario y ejecuta las búsquedas.

## Instrucciones de Ejecución
Coloque el archivo datosllanquihue.txt en la raíz del proyecto.
Abra el proyecto en su IDE preferido (NetBeans, Eclipse o IntelliJ).
Diríjase al paquete main, haga clic derecho sobre Main.java y seleccione Ejecutar / Run File.
Use la consola para interactuar con el sistema de búsqueda.
