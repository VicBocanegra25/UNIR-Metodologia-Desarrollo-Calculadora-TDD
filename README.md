# UNIR-Metodologia-Desarrollo-Calculadora-TDD
Proyecto para la materia de Metodologías de Desarrollo de la UNIR. Se escribe una calculadora utilizando las prácticas del Test Driven Development (TDD). El propósito es describir el flujo red/green/clean realizando los commits correspondientes para cada operación. 

## Características y Requerimientos

La aplicación es una herramienta de línea de comandos capaz de realizar operaciones matemáticas con una precisión superior a $10^{-3}$.

### Operaciones Soportadas:
1.  **Operaciones Básicas:** Suma, resta, multiplicación y división de números reales.
2.  **Raíz Cuadrada:** Implementada mediante un método de cálculo aproximado (Newton-Raphson) sin el uso de funciones de la librería matemática estándar (`java.lang.Math`).
3.  **Función Exponencial ($e^x$):** Implementada mediante series de Taylor, utilizando exclusivamente las operaciones básicas previamente desarrolladas en el proyecto.

## Tecnologías Utilizadas

* **Lenguaje:** Java (JDK 21)
* **Gestor de Proyectos:** Gradle
* **Framework de Pruebas:** JUnit 5
* **Control de Versiones:** Git (siguiendo un flujo de trabajo TDD)

## Metodología TDD

El desarrollo sigue estrictamente el ciclo **Red-Green-Refactor**. La secuencia de *commits* en este repositorio refleja que cada funcionalidad fue precedida por la definición de su prueba correspondiente, asegurando que el código cumple con los requisitos desde su concepción.

1.  **Red:** Escritura de una prueba que falla para una nueva funcionalidad.
2.  **Green:** Implementación del código mínimo necesario para que la prueba pase.
3.  **Refactor:** Mejora del código garantizando que las pruebas sigan siendo exitosas.

## Estructura del Proyecto

* `src/main/java`: Contiene la lógica de negocio, incluyendo el motor matemático y el procesador de comandos.
* `src/test/java`: Contiene el conjunto de pruebas unitarias que validan la precisión y el correcto funcionamiento de cada operación.

## Instalación y Ejecución

Para trabajar con este proyecto, se debe instalar el **JDK 21**.

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/VicBocanegra25/UNIR-Metodologia-Desarrollo-Calculadora-TDD.git
    ```
2.  **Ejecutar las pruebas unitarias:**
    ```bash
    ./gradlew test
    ```
3.  **Compilar el proyecto:**
    ```bash
    ./gradlew build
    ```
4.  **Ejecutar la aplicación (CLI):**
    ```bash
    ./gradlew run
    ```

---
