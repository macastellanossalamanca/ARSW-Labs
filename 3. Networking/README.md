# NetWorking 
### Junio 11 2021
## - Miguel Castellanos


# Descripción
Este repositorio contiene diferentes ejercicios separados por paquetes, en los cuales se le va dando solución a los ejercicios del taller de Networking.

# Compile and run instructions.

- **Para compilar**: mvn package
- **Para ejecutar:** Se debe correr la clase con main en cada paquete dependiendo el punto del taller:
- **Para ejecutar las pruebas:** mvn test
- **Para generar la documentación use:** mvn javadoc:javadoc

## URLReader: 

# Ejercicio 1
Escriba una aplicacion browser que pregunte una direccion URL al usuario
y que lea datos de esa direcci´on y que los almacene en un archivo con el nombre
resultado.html.

- java -cp "./target/classes" edu.escuelaing.arsw.app.URLReader

### Ejemplo Resultado con URL http://www.google.com/
![image](https://user-images.githubusercontent.com/44925834/121762117-890e1100-caf9-11eb-8530-5696f0bd5e35.png)

# Ejercicio 2
Escriba un programa en el cual usted cree un objeto URL e imprima en
pantalla cada uno de los datos que retornan los 8 metodos de la seccion anterior:

- java -cp "./target/classes" edu.escuelaing.arsw.app.URLFile

### Ejemplo Resultado
![image](https://user-images.githubusercontent.com/44925834/121762237-531d5c80-cafa-11eb-9305-bf19a1088b88.png)


## Calculadora

# Ejercicio 3
La siguiente parte consiste en implementar el servidor. El servidor escucha
en un puerto y responde a las solicitudes de cada cliente. Escriba un servidor que reciba un numero y responda el cuadrado de este
numero.

Se debe correr el servidor y seguido el cliente, para finalmente hacer las solicitudes del cliente al servidor:

### Ejemplo Resultado
![image](https://user-images.githubusercontent.com/44925834/121762593-777a3880-cafc-11eb-970d-7fc1bd2174a2.png)

# Ejercicio 4
Escriba un servidor que pueda recibir un numero y responda con un operacion sobre este numero. Este servidor puede recibir un mensaje que empiece por
“fun:”, si recibe este mensaje cambia la operacion a las especificada. El servidor
debe responder las funciones seno, coseno y tangente. Por defecto debe empezar
calculando el coseno. Por ejemplo, si el primer numero que recibe es 0, debe
responder 1, si despues recibe π/2 debe responder 0, si luego recibe “fun:sin”
debe cambiar la operacion actual a seno, es decir a a partir de ese momento
debe calcular senos. Si enseguida recibe 0 debe responder 0.

Se debe correr el servidor y seguido el cliente, para finalmente hacer las solicitudes del cliente al servidor:

### Ejemplo Resultado
![image](https://user-images.githubusercontent.com/44925834/121762477-c83d6180-cafb-11eb-9a3e-7e1891dc86f9.png)

# Sockets
La siguiente parte consiste en implementar el servidor. El servidor escucha
en un puerto y responde a las solicitudes de cada cliente.

Se debe correr el servidor y seguido el cliente, para finalmente hacer las solicitudes del cliente al servidor:

### Ejemplo Resultado
![image](https://user-images.githubusercontent.com/44925834/121762627-c627d280-cafc-11eb-9600-1b46ffb28e7b.png)


# Servidor Web
Escriba un servidor web que soporte multiples solicitudes seguidas (no concurrentes). El servidor debe retornar todos los archivos solicitados, incluyendo
paginas html e imagenes.

Se debe correr el servidor y seguido el cliente, para finalmente hacer las solicitudes del cliente al servidor; seguido, en el navegador abrir http://localhost:35000/:

### Ejemplo Resultado
![image](https://user-images.githubusercontent.com/44925834/121762661-071fe700-cafd-11eb-80f3-760968f9464c.png)

## Licencia
- Todos los proyectos de este repositorio están bajo la Licencia GNU General Public License, para más detalles revisa el archivo [Licencia](https://github.com/macastellanossalamanca/ARSW-Labs/blob/main/License.txt)

