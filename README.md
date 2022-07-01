<div align="center">
<table>
    <theader>
        <tr>
            <th><img src="https://github.com/rescobedoulasalle/git_github/blob/main/ulasalle.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></th>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD LA SALLE</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍAS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO DE INGENIERÍA Y MATEMÁTICAS</span><br />
                <span style="font-weight:bold;">CARRERA PROFESIONAL DE INGENIERÍA DE SOFTWARE</span>
            </th>            
        </tr>
    </theader>
    
</table>
</div>

<div align="center">
<span style="font-weight:bold;">GUÍA DE LABORATORIO</span><br />
</div>

<table>
    <theader>
        <tr><th colspan="2">INFORMACIÓN BÁSICA</th></tr>
    </theader>
<tbody>

<tr><td>TÍTULO DE LA PRÁCTICA:</td><td>Patrón object pool</td></tr>
<tr><td colspan="2">RECURSOS:
    <ul>
    <li>Oscar J Blancarte Iturralde. Introducción a los patrones de diseño. Un enfoque práctico (Spanish Edition. CreateSpace Independent Publishing Platform (2016)</li>
    </ul>
</td>
</<tr>
<tr><td colspan="2">DOCENTES:
    <ul>
        <li>Richart Smith Escobedo Quispe  - r.escobedo@ulasalle.edu.pe</li>
    </ul>
</td>
</<tr>
</tdbody>
</table>

# Patrón object pool


[![GitHub][GitHub]][github-site]


#

## OBJETIVOS Y TEMAS

### OBJETIVOS
- Aprender el patrón Object Pool.

### TEMAS
-   El Patrón Object Pool.
-   Ciclo de vida de un objeto dentro del ObjectPool.
-   Estructura del patrón de diseño Object Pool.
-   Diagrama de secuencia del patrón Object Pool.
-   El Escenario.
-   La implementación.
-   La Ejecución.

## CONTENIDO DE LA GUÍA

### MARCO CONCEPTUAL

-   Patrón Object Pool
    -   Si ud. requiere trabajar con una gran cantidad de objetos, los cuales son caros compuptacionalmente. Este patrón puede ayudarlo, ya que requiere dichos objetos por un tiempo muy corto para luego ser desechados. Este progrma permite reutilizar los patrones, para evitar que se vuelvan a crear los patrones

-   Ciclo de vida de un objeto dentro del ObjectPool.
   #
   ![image](https://user-images.githubusercontent.com/103951460/176883323-996c5da9-796a-49d2-a00d-27d4175eb304.png)


    - Fuente: (Blancarte, O.) Introducción a los patrones de diseño.
#
- El ciclo de vida es el siguiente:
    
   New: se crea un nuevo objeto, debido a que el object pool no tiene objects disponibles o porque se está iniciando y necesita crear nuevas  instancias mínimas.
   Pooled: se libera un objeto para ponerlo en el ObjectPool a fin de que esté disponible para que sea utilizado por otro proceso y asi no crear uno nuevo.
   Used: un proceso ha solicitado el objeto y no estara disponible hasta que este no sea liberado 
   Releace:cuando el objeto es liberado, hay dos opciones: se coloca nuevamente en el object pool o es destruido en caso de invalidarse su uso
   Destroy: El objeto se destruye cuando un proceso lo solicita  o porque ya no sirve más
    
-   Estructura del Patrón de diseño Object Pool
#
     
     ![image](https://user-images.githubusercontent.com/103951460/176884474-bec3f156-c4fb-4614-a5e6-69d11555619b.png)


    - Fuente: (Blancarte, O.) Introducción a los patrones de diseño.
    
#    
- El object pool es el responsable de proveer los objetos, pero no sabe como crearlos.

## ESCENARIO
-imaginaremos que tenemos que desarrollar una aplicación multi hilos, esta aplicación tendrá que hacer muchas tareas de forma simultánea, sinembargo, por cuestión de rendimiento, tenemos que administrar el número máximo de procesos que se pueden ejecutar al mismo tiempo, dejando en espera el resto de procesos; los procesos esperarán hasta que otro finalice para poder ser ejecutados, si la espera pasa de un tiempo determinado, el programa negará el servicio y los procesos no serán realizados.
Por cuestión de practicidad, los procesos simplemente se ejecutarán por 10 segundos y terminarán
#
    ![image](https://user-images.githubusercontent.com/103951460/176884066-682b58cd-294a-4ddb-9dd0-86cbcbaef780.png)
    
    
    - Forma en la que se atenderan los procesos
    - Fuente: (Blancarte, O.) Introducción a los patrones de diseño.
    

## EJERCICIO RESUELTO




## EJERCICIOS PROPUESTOS

-   Se han creado estructuras complejas con objetos más pequeños.
    -   Agregue un nuevo atributo a la clase AbstractProduct para definir la tasa de impuesto que tendrá el producto, el impuesto deberá ser calculado y mostrado a nivel de paquete.
    -   Agregues otro atributo a la clase AbstractProduct para definir la cantidad, esta cantidad deberá ser calculada a la hora de mostrar el precio del paquete.
    -   Agregue productos para crear un paquete, podríamos agregar un producto de descuento con precio negativo.
-   Elabore los ejemplos y analice los resultados.


## REFERENCIAS
-   Oscar J Blancarte Iturralde. Introducción a los patrones de diseño_ Un enfoque práctico (Spanish Edition. CreateSpace Independent Publishing Platform (2016)

#

[license]: https://img.shields.io/github/license/rescobedoulasalle/git_github?label=rescobedoulasalle
[license-file]: https://github.com/rescobedoulasalle/git_github/blob/main/LICENSE

[downloads]: https://img.shields.io/github/downloads/rescobedoulasalle/git_github/total?label=Downloads
[releases]: https://github.com/rescobedoulasalle/git_github/releases/

[last-commit]: https://img.shields.io/github/last-commit/rescobedoulasalle/git_github?label=Last%20Commit

[Debian]: https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white
[debian-site]: https://www.debian.org/index.es.html

[Git]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white
[git-site]: https://git-scm.com/

[GitHub]: https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white
[github-site]: https://github.com/

[Vim]: https://img.shields.io/badge/VIM-%2311AB00.svg?style=for-the-badge&logo=vim&logoColor=white
[vim-site]: https://www.vim.org/

[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white
[java-site]: https://docs.oracle.com/javase/tutorial/


[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]
