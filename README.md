# LAB02
## EJERCICIO DE LAS FIGURAS
### CREAR UN PROYECTO CON MAVEN
- Creando un proyecto en maven con los archetypes  
    
  Para crear un proyecto en maven seguimos la nomenclatura expresada.  
  ```  
  mvn archetype:generate -DgroupId=<grupo> -DartifactId=<Nombre> -Dpackage=<paquete>
  -DarchetypeArtifactId=maven-archetype-quickstart
  ```
  En donde el grupo es en donde se encuentra el repositorio. El id es el nombre del repositorio. El paquete es en donde se guardara la informacion del repositorio. Un ejemplo puede ser:
  ```
  mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Patterns -Dpackage=edu.eci.cvds.patterns   
  -DarchetypeArtifactId=maven-archetype-quickstart
  ```
### COMPILAR Y EJECUTAR
  Comandos en maven  
- clean  
  Limpia los archvios temporales creados por el proyecto.  
    ``` mvn clean ```
- package  
Herramienta de empaquetado de maven, genera los archivo jar o war.  
    ``` mvn package```
- test  
Ejecuta el caso d eprueba de jUnit de el directorio /src/test/java/.  
    ``` mvn test```
- install  
Compila, testea y empaqueta  el proyecto.
    ``` mvn install```
- deploy  
Publica el archivo empaquetado en una referencia remota    
    ``` mvn deploy```  

Ejecutar un proyecto  

  Para ejecutar un proyecto en mvn seguimos la siguiente nomenclatura.  
  
  ``` mvn exec:java -Dexec.mainClass=<ruta>.<clase>```  
  En donde la ruta se refiere a la direccion Path de el proyecto. 
  En caso que el usuario requiera parametros hacemos uso de -Dexec.  
  ``` mvn exec:java -Dexec.mainClass=<ruta>.<clase> -Dexec.arguments = "argumento1 argumenti2 …"```  
 

## HACER EL ESQUELETO DE LA APLICACION
### Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:
1. Sin Parámetros
2. Parámetro: qwerty
3. Parámetro: pentagon
4. Parámetro: Hexagon
### ¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

## Sin parámetros
 ### 
  
  
