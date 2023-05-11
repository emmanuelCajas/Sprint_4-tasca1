# Sprint_4-tasca1
Introduction to Spring

Este ejercicio te introducirá en el framework SPRING.
Empezarás a utilizar el protocolo HTTP, a usar Postman, y a descubrir cómo gestionar dependencias con Maven y Gradle.

Nivel 1
- Ejercicio Spring y Maven

Este ejercicio es un primer contacto con Spring y Maven.
Accede a la página ->https://start.spring.io/, y genera un proyecto Spring boot con las siguientes características:
PROJECT: (gestor de dependencias): Maven.
LANGUAGE: Java.Mínim versió 11 
SPRING BOOT: La última versión estable.
PROJECT METADATA: 
Group: cat.itacademy.barcelonactiva.apellidos.nom.s04.t01.n02
Artifacto: S04T01N01GognomosNom
Name: S04T01N01 ApellidosNom
Description: S04T01N01GognomosNom
Package name: cat.itacademy.barcelonactiva.apellidos.nom.s04.t01.n01
PACKAGIN: Jar
JAVA Dependencias: Spring Boot DevTools, Spring Web

En el archivo application.properties, configura la variable server.port con el valor 9000.

Convertiremos esta aplicación en una API REST:

Dependiendo del package principal, crea otro subpackage llamado Controllers, y dentro de él, añade la clase HelloWorldController.

Deberá tener dos métodos:
String saluda
String saluda2

Estos dos métodos recibirán un parámetro String llamado nombre, y devolverán la frase:
"Hola, " + nombre + ". Estás ejecutando un proyecto Maven".

El primer método responderá a una petición GET, y deberá ser configurado para recibir el parámetro como un RequestParam. El parámetro "nombre" tendrá el valor por defecto "UNKNOWN".
Deberá responder a:
http://localhost:9000/HelloWorld
http://localhost:9000/HelloWorld?nom=El mi nombre
 
El segundo método responderá a una petición GET, y deberá ser configurado para recibir el parámetro como una PathVariable. El parámetro "nombre" será opcional.
Deberá responder a:
http://localhost:9000/HelloWorld2
http://localhost:9000/HelloWorld2/el mi nombre
Nivel 2
- Ejercicio Spring y Gradle
Verás que este nivel es casi idéntico al nivel 1, pero usando a Gradle como Gestor de dependencias.
PROJECT: (gestor de dependencias): Gradle.
LANGUAGE: Java.Mínim versió 11 
SPRING BOOT: La última versión estable.
PROJECT METADATA: 
Group: cat.itacademy.barcelonactiva.apellidos.nom.s04.t01.n02
Artifacto: S04T01N02GognomosNom
Name: S04T01N02 ApellidosNom
Description: S04T01N02GognomosNom
Package name: cat.itacademy.barcelonactiva.apellidos.nom.s04.t01.n02
PACKAGIN: Jar
JAVA Dependencias: Spring Boot DevTools, Spring Web

Importalo a Eclipse con la opción File > Import > Existing Gradle Project.
En el archivo application.properties, configura la variable server.port con el valor 9001.
Convertiremos esta aplicación en una API REST:

Dependiendo del package principal, crea otro subpackage llamado Controllers, y dentro de él, añade la clase HelloWorldController.
Deberá tener dos métodos:
String saluda
String saluda2
Estos dos métodos recibirán un parámetro String llamado "nombre" y devolverán la frase:
"Hola, " + nombre + ". Estás ejecutando un proyecto Gradle".
El primer método responderá a una petición GET, y deberá ser configurado para recibir el parámetro como un RequestParam. El parámetro "nombre" tendrá el valor por defecto "UNKNOWN".
Deberá responder a:
http://localhost:9001/HelloWorld
http://localhost:9001/HelloWorld?nom=El mi nombre
 
El segundo método responderá a una petición GET, y deberá ser configurado para recibir el parámetro como una PathVariable. El parámetro "nombre" será opcional.
Deberá responder a:
http://localhost:9001/HelloWorld2
http://localhost:9001/HelloWorld2/el mi nombre


 Muy Importante
Además del enlace a Git de la tarea resuelta, deberás incluir al menos dos enlaces diferentes de los recursos que te hemos proporcionado en el campus, que te hayan servido o lo hubieran podido hacer, para resolver la totalidad de la tarea o algunas partes.

Nivel 3
- Ejercicio Postman
Se trata de probar los anteriores proyectos desde Postman.
Crea dos entornos:
-          Proyecto Maven
-          Proyecto Gradle
 
Ambos entornos tendrán dos variables:
-          Servidor, que en ambos casos tendrá el valor http://localhost
- Port, que en el caso del proyecto Maven tendrá el valor 9000, y en el caso del proyecto Gradle, 9001.
 
¿Que tienes que entregar? (4 archivos):
-          Los dos entornos exportados.
-          Una captura de pantalla por cada entorno, donde se vea la ejecución desde Postman usando el entorno y las variables definidas en ellos.
-          Puedes probar el URL: http://localhost:xxxx/HelloWorld/elmeunom, o cualquier otra de las que admiten los dos proyectos. (recuerda que para que la ejecución funcione correctamente, deberás tener en ejecución los dos proyectos en Eclipse).
Ejecuta desde Eclipse los proyectos creados en los dos niveles anteriores, y muestra el retorno obtenido en cada proyecto, cuando llamas a algunas de las peticiones disponibles, utilizando los entornos creados y sus variables.
Tendrás que entregar dos capturas de pantalla, una para la ejecución de cada entorno, y dos archivos con formato JSON, con los entornos exportados.

