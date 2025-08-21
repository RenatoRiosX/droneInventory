# Sistema de Control de Inventarios con Drones (droneInventory)

Proyecto académico para el curso **Programación II**, consistente en una aplicación de escritorio desarrollada en **Java** que simula la gestión de un inventario de depósito, comparando registros manuales con datos recopilados por vuelos de drones.

---

### El Desafío

El objetivo fue desarrollar un sistema para testear el uso de drones en el control de inventarios, una práctica cada vez más común para aumentar la productividad en depósitos. El sistema debía permitir registrar manualmente el estado del inventario y luego comparar esa información con datos de vuelos de drones para validar su precisión.

---

### ✨ Características Principales

El sistema fue desarrollado en Java y cuenta con las siguientes funcionalidades:

* **Gestión de Entidades (CRUD):**
    * Permite el registro, visualización y administración de **Artículos**, **Funcionarios** y **Drones** en el sistema.

* **Interfaz Visual e Interactiva del Depósito:**
    * Un panel con una grilla de 12x10 representa visualmente las áreas del depósito, permitiendo el ingreso y egreso manual de cargas de inventario de forma intuitiva.
    * La selección de un espacio en la grilla muestra su estado (ocupado/vacío) y permite realizar acciones contextuales.

* **Procesamiento de Vuelos de Dron:**
    * Carga y parseo de archivos de texto (`.txt`) que contienen los datos escaneados por un dron durante un vuelo sobre una fila del depósito.
    * Validación de la integridad del archivo para determinar si un vuelo fue "exitoso" (si contiene la cantidad correcta de registros).

* **Lógica de Comparación y Validación:**
    * El núcleo del sistema. Compara los datos del dron con el inventario manual para una fila específica y **resalta visualmente las coincidencias (verde) y las discrepancias (rojo)**.
    * Calcula y muestra el total de coincidencias y diferencias para evaluar la precisión del dron.

* **Módulo de Estadísticas y Reportes:**
    * Genera estadísticas sobre los drones, mostrando cuáles han realizado vuelos y cuáles no.
    * Permite seleccionar un dron para ver el historial detallado de todos sus vuelos, incluyendo el resultado y las métricas de precisión de cada uno.

---

### 🛠️ Stack Tecnológico

| Área | Tecnología / Práctica |
| :--- | :--- |
| **Lenguaje** | `Java`  |
| **Interfaz Gráfica (GUI)** | `Java Swing` (utilizando `GridLayout`, `JButton`, `ActionListener`)  |
| **Persistencia de Datos** | Serialización de Objetos para guardado automático del estado del sistema  |
| **Entorno de Desarrollo** | NetBeans  |
