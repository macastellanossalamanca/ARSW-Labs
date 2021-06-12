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

# Ejemplo Resultado
![LocCountApp](https://user-images.githubusercontent.com/44925834/120569617-e4465200-c3db-11eb-8b5c-87c7e3e7bc46.jpg)

## Licencia
- Todos los proyectos de este repositorio están bajo la Licencia GNU General Public License, para más detalles revisa el archivo [Licencia](https://github.com/macastellanossalamanca/ARSW-Labs/blob/main/License.txt)
