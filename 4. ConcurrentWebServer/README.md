# Servidor Web Concurrente
### Junio 16 2021
## - Miguel Castellanos


# Descripción
Se realizó la implementación de un servidor web con la capacidad de atender multiples solicitudes de manera concurrente, para esto, se hizo uso de los pools de hilos que ofrece Java y el servicio ExecutorService.

# Compile and run instructions.

- **Para compilar**: mvn package
- **Para ejecutar:** java -cp "./target/classes" edu.escuelaing.ConcurrentWebServer.ConcurrentWebServer, luego ingrese a localhost:35000 en su navegador
- **Para ejecutar las pruebas:** mvn test
- **Para generar la documentación use:** mvn javadoc:javadoc

# Pruebas Realizadas con PostMan

## Licencia
- Todos los proyectos de este repositorio están bajo la Licencia GNU General Public License, para más detalles revisa el archivo [Licencia](https://github.com/macastellanossalamanca/ARSW-Labs/blob/main/License.txt)

