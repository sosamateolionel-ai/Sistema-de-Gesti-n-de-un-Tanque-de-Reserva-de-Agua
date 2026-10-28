# Sistema de Gestión de un Tanque de Reserva de Agua

## Descripción

Este proyecto implementa una clase `TanqueReserva` que permite controlar el nivel de agua de un tanque según su capacidad máxima. El sistema admite el ingreso y el consumo de agua, valida las cantidades ingresadas y evita que el nivel supere la capacidad del tanque o sea inferior a cero.

## Funcionamiento

El programa realiza las siguientes operaciones:

1. Crea un tanque con una capacidad máxima de 1000 litros y un nivel inicial de cero.
2. Agrega 600 litros de agua.
3. Intenta agregar otros 700 litros; el nivel supera la capacidad, por lo que el tanque queda en 1000 litros y el excedente se descarta.
4. Rechaza un intento de llenado de -20 litros.
5. Consume 300 litros, dejando 700 litros.
6. Intenta consumir 2000 litros; como la cantidad supera el contenido disponible, el tanque queda vacío.
7. Rechaza un intento de consumo de 0 litros.
8. Muestra el nivel final del tanque.

## Clases principales

### Clase `TanqueReserva`

Representa un tanque de agua y controla su capacidad y nivel actual.

**Atributos:**

* `capacidadMaxima`: cantidad máxima de litros que puede almacenar el tanque.
* `nivelActual`: cantidad de litros de agua disponibles en el tanque.

**Métodos principales:**

* `TanqueReserva(double capacidadMaxima)`: inicializa la capacidad máxima y establece el nivel actual en cero.
* `getCapacidadMaxima()`: devuelve la capacidad máxima del tanque.
* `getNivelActual()`: devuelve la cantidad actual de agua.
* `llenar(double litros)`: agrega agua si la cantidad es mayor que cero. Si se supera la capacidad máxima, limita el nivel al máximo permitido.
* `consumir(double litros)`: resta agua si la cantidad es mayor que cero. Si el consumo supera el nivel disponible, deja el tanque vacío.

### Clase `Main`

Contiene el método `main()` y permite probar las operaciones de llenado y consumo, incluyendo casos válidos y situaciones que superan los límites del tanque.

## Conceptos de programación utilizados

* **Encapsulamiento:** los atributos son `private` para impedir modificaciones directas desde otras clases.
* **Constructores:** permiten establecer la capacidad inicial del tanque.
* **Métodos de acceso (getters):** permiten consultar la capacidad máxima y el nivel actual.
* **Validación de datos:** se rechazan cantidades de agua menores o iguales a cero.
* **Control de límites:** el nivel no puede superar la capacidad máxima ni quedar por debajo de cero.
* **Condicionales:** permiten determinar cómo actuar ante cada operación.
* **Modificación controlada del estado:** el nivel solo cambia mediante los métodos `llenar()` y `consumir()`.

## Tecnologías utilizadas

* Java.
* IntelliJ IDEA.
* Programación orientada a objetos (POO).

## Ejecución

<img width="642" height="437" alt="image" src="https://github.com/user-attachments/assets/932dc462-7e9f-46cb-8bfd-9b3f648c37d9" />

## Resultado esperado

El nivel inicial es de 0 litros. Después de los llenados, el tanque alcanza su capacidad máxima de 1000 litros y descarta el excedente. El consumo de 300 litros deja 700 litros disponibles. El intento de consumir 2000 litros vacía el tanque, y el consumo de cero litros se rechaza.

El nivel final esperado es:

**Nivel final: 0.0 L**

## Objetivo del ejercicio

Aplicar encapsulamiento, validación de datos y control de límites para administrar el nivel de agua de un tanque, evitando cantidades inválidas y garantizando que el nivel se mantenga dentro del rango permitido.

## Estructura del proyecto

```text
GestionTanqueReserva/
├── src/
│   ├── TanqueReserva.java
│   └── Main.java
└── README.md
```
