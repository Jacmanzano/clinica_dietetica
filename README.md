# 🩺 Gestor de Clínica Dietética en Java

¡Hola! 👋 Soy **Carlos Manzano Regalado**, estudiante de 1º DAM.

Este es uno de mis primeros proyectos en **Java** aplicando los conceptos de **Programación Orientada a Objetos (POO)**.

He creado un programa de consola que gestiona pacientes para una clínica dietética. El programa pide los datos de varios pacientes, calcula su IMC y estado nutricional, y finalmente muestra un resumen estadístico de todo el grupo.

El proyecto me ha servido para entender la base de la POO: **clases, objetos, métodos y la separación de responsabilidades** 💻✨

---

## 📘 Descripción

Este programa simula la gestión de pacientes de una clínica. Toda la interacción se realiza mediante ventanas emergentes (`JOptionPane`).

El programa permite:

- ✅ Pedir al usuario el **número total de pacientes** (`num_pacientes`) a registrar.
- ✅ Para cada paciente, solicitar sus datos (`obtenDatos`): nombre, edad, peso y estatura.
- ✅ Calcular el **IMC** y el **estado nutricional** (ej. "NORMAL", "S GRADO 1") con el método `calculaDatos()`.
- ✅ Mostrar un **resumen individual** por cada paciente, indicando su número (`muestraDatos(x)`).
- ✅ Al finalizar, mostrar un **resumen estadístico** de todos los pacientes:
    - Edad máxima y mínima.
    - Peso medio.
    - Estatura media.

---

## 💡 Aprendiendo Programación Orientada a Objetos (POO)

El objetivo principal de este proyecto era entender cómo funciona la POO. Esto es lo que he aplicado:

* **Clases:** He separado el código en dos clases:
    * `Paciente.java`: Es la **plantilla** (el "molde") que define los atributos (`nombre`, `imc`, `estado_nutricional`...) y métodos de un paciente.
    * `clinicaDietetica.java`: Es la clase principal (con el `main`) que actúa como "jefe" u orquestador.

* **Objetos:** El error `NullPointerException` es común al principio. La solución fue crear correctamente cada objeto (`pac_clinica[x] = new Paciente();`) *dentro* del bucle `for` antes de usarlo.

* **Arrays de Objetos:** He usado un array (`Paciente[] pac_clinica`) para almacenar y gestionar una colección de todos los objetos `Paciente`.

* **Separación de Responsabilidades:** Este ha sido el concepto clave:
    * **`Paciente`:** Es responsable de sus *propios* datos (sabe cómo *obtener* sus datos, *calcular* su propio IMC y *mostrar* su estado).
    * **`main`:** Es responsable de la *lógica colectiva* (crear el array, gestionar los bucles y calcular las *estadísticas de grupo*, como las medias o la edad máxima).

---

## 📈 Futuras Mejoras

Actualmente, los pacientes solo existen mientras el programa se ejecuta. A medida que siga aprendiendo, me gustaría mejorar este proyecto:

* Guardar los pacientes en un archivo `.txt` para que los datos sean permanentes.
* Crear un menú más complejo (ej. "Añadir paciente", "Ver estadísticas", "Buscar paciente").
* Rehacer el proyecto con una interfaz gráfica (Swing o JavaFX) en lugar de `JOptionPane`.
