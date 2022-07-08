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
  ![image](https://user-images.githubusercontent.com/103951460/176885069-d907a133-a34b-43b4-9ec7-6eff294afdc0.png)
   
    - Fuente: (Blancarte, O.) Introducción a los patrones de diseño.
    
#    
- El object pool es el responsable de proveer los objetos, pero no sabe como crearlos.

## ESCENARIO
-Imaginaremos que tenemos que desarrollar una aplicación multi hilos, esta aplicación tendrá que hacer muchas tareas de forma simultánea, sinembargo, por cuestión de rendimiento, tenemos que administrar el número máximo de procesos que se pueden ejecutar al mismo tiempo, dejando en espera el resto de procesos; los procesos esperarán hasta que otro finalice para poder ser ejecutados, si la espera pasa de un tiempo determinado, el programa negará el servicio y los procesos no serán realizados.
Por cuestión de practicidad, los procesos simplemente se ejecutarán por 10 segundos y terminarán

-Forma en la que se atenderan los procesos
#
   ![image](https://user-images.githubusercontent.com/103951460/176884726-505fd2c5-332d-4645-ab37-d042e51d7c49.png)

    
    - Fuente: (Blancarte, O.) Introducción a los patrones de diseño.

## EJERCICIO RESUELTO
- El principal problema a resolver es el desarrollo. El componente nos permite limitar la cantidad de procesos que pueden ejecutarse al mismo tiempo y los procesos solo pueden esperar una cierta cantidad de tiempo antes de darse por vencidos, por lo que crear un ObjectPool de procesos puede ser una gran estrategia.

- Una buena idea sería crear objetos que nos permitan controlar la ejecución de cada proceso y estos objetos puedan ser administrados por ObjectPool, de esa forma cada vez que la aplicación necesite iniciar un proceso deberá solicitar el tiempo de ejecución del objeto a ObjectPool, ObjectPool extraerá un objeto, pero si no hay ningún objeto disponible, se pondrá en cola hasta que el componente libere uno.

- El ObjectPool será configurable para hacer que el solicitante espere una cierta cantidad de tiempo, si no puede satisfacer la solicitud en el objeto dentro de ese tiempo, finalizará la solicitud con una excepción personalizada.

- Crearemos nuestro proyecto de ObjectPool y los paquetes que necesitaremos
#
![image](https://user-images.githubusercontent.com/103951460/176902458-49e7890a-63a5-4594-8be0-2d6f3c09e092.png)

- En la interface de IObjectPool 
-#
![image](https://user-images.githubusercontent.com/103951460/177012634-b8284e5b-6705-4d02-a607-af43dc0e5462.png)

Va a ser establecida para realizar operaciones minimas, para reutilizar y crear objectPool mas personalizados

-CLASE PoolException
Se tiene una excepcion personalizada para lanzar otro error dentro del ObjectPool, heredando la clase Exception
# 
![image](https://user-images.githubusercontent.com/103951460/177012601-1a529626-8cdf-4cfa-aa64-73efe90751df.png)

- Clase AbstractObjectPool
Contiene el fuuncionamiento basico del ObjectPool, implementando una interface ConcreteObjectPool la cual nos servirá para crear
ConcreteObjectPool. Esta es una de las clases mas importantes.
#
![image](https://user-images.githubusercontent.com/103951460/177012743-336deee9-f426-4a76-a335-f2ad09d515c6.png)

#
![image](https://user-images.githubusercontent.com/103951460/177012752-8c43bed7-aeed-4221-9a60-ba57be73f280.png)

#
![image](https://user-images.githubusercontent.com/103951460/177012775-02866fbb-11f6-4a18-9cd4-e4f0e6913c5c.png)

#
![image](https://user-images.githubusercontent.com/103951460/177012781-5148eb17-5f7e-47f1-92fc-9b020624c763.png)

#
![image](https://user-images.githubusercontent.com/103951460/177012792-6f6efce6-2337-439d-8660-5a46c2ed1a56.png)

-Clase ExecutorThreadPool
La clase se hereda del AbstractObjectPool , para tener toda la funcionalidad por default y crear un nuevo Pool, este Pool  es exclusivo para Executor Task

#
![image](https://user-images.githubusercontent.com/103951460/177012874-ce44fa65-3db9-4263-a4c0-ac82a51ad588.png)


-Interface IPoolableObject
Es la interface en la que todos los objects del Pool se implementaran, te indica los objetos que pueden ser administrados por el ObjectPool 

#
![image](https://user-images.githubusercontent.com/103951460/177990808-b164ebbf-5ed7-4f44-ba2b-3c9ba447a38a.png)


-Clase ExecutorTask:
Representa el modelo de componentes con la clase ConcretePoolableObject, las cuales finalmente administren el objectpool

#
![image](https://user-images.githubusercontent.com/103951460/177991255-5b9a3c03-ecf4-4a3a-b6f0-9bc04dfd73a3.png)

-Interface IPoolableObjectFactory:
Un factory tiene la responsabilidad de crear los objetos, por lo tanto definirá la estructura mínima que éste tendra.

#
![image](https://user-images.githubusercontent.com/103951460/177993028-fa33b092-7c20-4da6-84f4-7e853964afc4.png)


-Clase ExecutorTaskFactory:
La clase hereda de IPoolablObjectFactory y sobrescribe por ExecutorTask, donde createnew, creara los objetos

#
![image](https://user-images.githubusercontent.com/103951460/177993310-c4e54a0c-3d18-411e-b84a-1e8bbfcb549f.png)

-Clase ObjectPoolMain:
Es la clase principal en la cual se probara el patron 

#
![image](https://user-images.githubusercontent.com/103951460/177993687-caa57ea5-0958-4995-a890-676eb4a7077d.png)

-EJECUCION:
Se tiene le siguiente resultado luego de ejecutar la clase principal ObjectPoolMain

#
![image](https://user-images.githubusercontent.com/103951460/177993915-ef36d8fe-87f7-43b8-b48d-1c3c2e26f2fb.png)





## EJERCICIOS PROPUESTOS

-   Se han creado estructuras complejas con objetos más pequeños.
    -   Agregue un nuevo atributo a la clase AbstractObjectPool 
    
    



## REFERENCIAS
-   Oscar J Blancarte Iturralde. Introducción a los patrones de diseño_ Un enfoque práctico (Spanish Edition. CreateSpace Independent Publishing Platform (2016)

##ENTREGABLES

https://drive.google.com/drive/folders/1riBk-n7sW93DXMzy3l9xmjWLfyr60qYM?usp=sharing

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



[![GitHub][GitHub]][github-site]


[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]
