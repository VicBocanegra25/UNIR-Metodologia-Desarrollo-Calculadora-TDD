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

Para trabajar con este proyecto, se debe contar con el **JDK 21** instalado en el sistema (compatible con entornos WSL).

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/VicBocanegra25/UNIR-Metodologia-Desarrollo-Calculadora-TDD.git](https://github.com/VicBocanegra25/UNIR-Metodologia-Desarrollo-Calculadora-TDD.git)
    cd UNIR-Metodologia-Desarrollo-Calculadora-TDD
    ```
2.  **Ejecutar las pruebas unitarias:**
    ```bash
    ./gradlew test
    ```
3.  **Ejecutar la aplicación (Modo Interactivo):**
    ```bash
    ./gradlew run
    ```

## Uso de la Aplicación

Una vez iniciada, la calculadora funcionará en modo interactivo. Los comandos siguen el formato: `<operacion> <numero1> [numero2]`.

| Operación | Ejemplo de Comando | Descripción |
| :--- | :--- | :--- |
| **Suma** | `sumar 10 5` | Suma dos números reales. |
| **Resta** | `restar 20 8.5` | Resta el segundo del primero. |
| **Multiplicación** | `multiplicar 4 3` | Multiplica dos números reales. |
| **División** | `dividir 10 2` | Divide el primero por el segundo. |
| **Raíz Cuadrada** | `raiz 16` | Calcula la raíz aproximada (Newton-Raphson). |
| **Exponencial** | `exp 2` | Calcula $e^x$ aproximado (Serie de Taylor). |
| **Salir** | `salir` | Cierra la aplicación. |

> **Nota:** La calculadora es robusta ante espacios extra y diferencia entre mayúsculas/minúsculas. Si se ingresa una operación no soportada o una división por cero, la aplicación informará del error sin cerrarse.
---
