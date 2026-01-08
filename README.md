# Hundir la Flota - Proyecto Java

Este repositorio contiene una implementación en Java del clásico juego de mesa "Hundir la Flota", diseñado para ser ejecutado desde la consola. El proyecto ha sido desarrollado como una actividad de clase para practicar conceptos de Programación Orientada a Objetos (POO), manejo de arrays y lógica de control.

## Descripción del Proyecto

El juego consiste en un tablero de 8x8 donde el ordenador coloca una flota de barcos de manera aleatoria y oculta. El jugador debe introducir coordenadas (fila y columna) para intentar impactar y hundir todos los barcos enemigos antes de que se agoten sus intentos.

El sistema cuenta con gestión de perfiles de usuario para almacenar estadísticas básicas como el número de victorias y el porcentaje de éxito.

## Estructura del Proyecto

El código fuente se encuentra organizado bajo el paquete `hundirLaFlota` y se divide en las siguientes clases:

### 1. HundirLaFlota.java (Main)

Es la clase principal que contiene el método `main`. Se encarga de:

- Gestionar el menú principal del juego (Jugar, Ver estadísticas, Salir).
- Controlar el bucle de la partida.
- Instanciar el tablero y la flota de barcos.
- Gestionar la entrada de datos por teclado (Scanner).

### 2. Tablero.java

Representa el escenario de juego. Sus responsabilidades son:

- Almacenar el estado lógico de los barcos (matriz `tablero`).
- Almacenar el estado visual para el jugador (matriz `mapa`: agua o impactos).
- **Colocación Aleatoria:** Algoritmo que posiciona los barcos horizontal o verticalmente validando que no se superpongan ni salgan de los límites.
- Procesar los disparos y determinar si es "Agua" o "Impacto".

### 3. Barco.java

Clase modelo que define las propiedades de los barcos. Incluye métodos estáticos para crear los diferentes tipos de naves:

- Portaaviones (Tamaño 5)
- Acorazado (Tamaño 4)
- Crucero (Tamaño 3)
- Submarino (Tamaño 3)
- Destructor (Tamaño 2)

### 4. Account.java

Clase encargada de la persistencia de datos del jugador durante la ejecución (sesión):

- Almacena el nombre del jugador.
- Contabiliza partidas jugadas y victorias.
- Calcula el porcentaje de victorias.

## Reglas del Juego

1.  El tablero tiene unas dimensiones de 8x8 (Filas 0-7, Columnas 0-7).
2.  La flota enemiga se genera automáticamente en cada nueva partida.
3.  Los barcos se colocan únicamente en posición **Vertical** u **Horizontal** (nunca en diagonal).
4.  El jugador dispone de un número limitado de intentos (por defecto 40) para hundir toda la flota.
5.  Si el jugador acierta un disparo, no pierde intentos.
6.  El juego termina cuando se hunden todos los barcos (Victoria) o se acaban los intentos (Derrota).

## Requisitos y Ejecución

### Requisitos

- Java Development Kit (JDK) 8 o superior.
- Un entorno de desarrollo (IDE) como Visual Studio Code, IntelliJ o Eclipse.

### Cómo ejecutar en Visual Studio Code

1.  Clonar o descargar este repositorio.
2.  Abrir la carpeta del proyecto en VS Code.
3.  Asegurarse de que la estructura de carpetas respeta el paquete `hundirLaFlota`.
4.  Abrir el archivo `src/hundirLaFlota/HundirLaFlota.java`.
5.  Pulsar "Run" o ejecutar desde la terminal.

Desarrollado como actividad práctica de desarrollo de aplicaciones en Java.
