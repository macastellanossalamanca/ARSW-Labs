# Loc Count App
## - Miguel Castellanos

# Descripción
Esta aplicación cuenta las lineas de código de un fichero, para el cual se tienen dos opciones: 
- Usar el parametro "phy", el cual nos permite conocer el número de líneas físicas que tiene el archivo.
- Usar el parametro "loc", el cual nos permite conocer el número de líneas de código que tiene el archivo.

# Compile and run instructions.

- **Para compilar**: mvn package
- **Para ejecutar con parametro "phy":** java -cp "./target/classes" edu.escuelaing.arsw.app.CountLines phy CountLines.java
- **Para ejecutar con parametro "loc":** java -cp "./target/classes" edu.escuelaing.arsw.app.CountLines loc CountLines.java
- **Para ejecutar las pruebas:** mvn test
