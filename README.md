[![Build Status](https://travis-ci.org/lhazuca/eis_201801c_tp_grupal.svg?branch=master)](https://travis-ci.org/lhazuca/eis_201801c_tp_grupal)
## Objetivos del TP grupal
Ejercitar la escritura de código en ambientes colaborativos utilizando una metodología de diseño guiada por pruebas ejecutanto un flujo de trabajo que facilite la integración frecuente de código.

### Lo que se espera

1. Implementar ATDD como técnica de diseño.  
2. Implementar FeatureBranch + Forking como flujo de trabajo, creando para esto un repositorio público con cualquier servicio de versionado de fuentes (Bitbucket, GitHub, etc.)
3. Cada cambio necesita ser integrado con la mayor frecuencia posiblie, utilizando para la verificación de este un servicio de CI (Continous Integration).
4. Generar el modelo tal que cumpla con las _Pruebas de Aceptación_ para el problema listado en la próxima sección (_Pacman_).
5. Completar tados de los integrantes del grupo utilizando este archivo (```README.md```)

### Feedback

- [X] (1) Ok. La prueba de aceptación "7" refiere *Maracuya* y un pacman bolando, en ninguna de las pruebas de aceptación estos términos se evidencian => el usuario va a tener dificultad para entenderlas. 
- [X] (2) **Los nombres de los branches no transmiten que feature se implementa.**
- [ ] (3) **No se puede evaluar porque no se ejecutaban las pruebas de aceptación.**
- [X] (4)
- [X] (5)

Ver [stats][1] de colabroación.

NOTA: 7.

### Integrantes

Nro |   Nombre   | Legajo  | Mail
----|------------|-------- |------
1   | Luca Hazuca  |38010  |lhazuca@gmail.com
2   | Henry Borda  |33132  |henryborda17@gmail.com
3   |Tomas Hurrell |31405  |hurrelltomas@gmail.com
4   |Brian Goldman |32565  |leonel89011@gmail.com
5   |Matias Pereira|32390  |matiasmpereira@gmail.com
    
### Entrega

16 / 05 / 2018

## Pacman

El objetivo de este ejercicio es implementar parcialmente el modelo del juego [Pacman][2] siguiendo los criterios listados en la sección Objetivos.

### Pruebas de aceptación

1. Pacman come un biscuit se vuelve más gordo (suma puntos).
2. Pacman come una fruta se vuelve más gordo (suma puntos).
3. Pacman choca contra un fantasma y muere.
4. Pacman come un pellet y los fantasmas se debilitan.
5. Pacman choca contra un fantasma debilitado y no muero. Adicionalmente la digestión es el fantasma sin cuerpo.
6. Pacman choca contra un fantasma sin cuerpo y no muere.

7. Pacman como un maracuya y vuela evitando a los fantansmas. Este efecto se prolonga el resto de la partida.

NOTA: El requerimiento (7) solo aplica para aquellos grupos de 5 integrantes.

### Metodología

Programación orientada a objetos + ATDD

### Objetivos

1. Crear un repositorio público con cualquier servicio de versionado de fuentes (Bitbucket, GitHub, etc.)
2. El desarrollo se realiza utilizando la técnica ATDD
3. A la hora de integrar los cambios de varios desarrolladores, utilizar el flujo de trabajo Feature Branch simulando un repositorio privado (branching model + fork).
4. Cada cambio necesita ser integrado con la mayor frecuencia posiblie, utilizando para la verificación de este un servicio de CI (Continous Integration).

[1]: https://travis-ci.org/
[2]: https://en.wikipedia.org/wiki/Pac-Man
