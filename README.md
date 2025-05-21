# ⚙️ Proyecto Java – Operadores, Cadenas y Condicionales

Este proyecto está dividido en tres partes y tiene como objetivo introducir el uso de operadores relacionales, comparación de cadenas y estructuras condicionales múltiples (`switch`) en Java. Cada parte se enfoca en un concepto específico y lo ejemplifica con una implementación práctica.

---

## 🔽 Cómo clonar o descargar este proyecto

Puedes obtener este proyecto de dos formas:

### 🔗 Clonar con Git

Si tenés Git instalado, podés clonar el repositorio ejecutando:

```bash
git clone https://github.com/davidvicari/JavaProgEstructurada.git
```

> Reemplazá la URL con la dirección real de tu repositorio en GitHub.

### 📦 Descargar como ZIP

1. Andá al repositorio en GitHub.
2. Hacé clic en el botón verde **Code**.
3. Seleccioná **Download ZIP**.
4. Extraé el contenido en tu computadora.

---

## 📚 Tabla de Contenidos

1. [Operadores Relacionales](#-parte-1-operadores-relacionales)
2. [Comparación de Cadenas](#-parte-2-comparación-de-cadenas)
3. [Calculadora con Switch](#-parte-3-calculadora-con-switch)
4. [Cómo ejecutar el programa](#-cómo-ejecutar-el-programa)
5. [Conclusión y aprendizaje](#-parte-4-conclusión-y-aprendizaje)

---

## 🧩 Parte 1: Operadores Relacionales

Esta sección demuestra el uso de operadores relacionales básicos en Java, permitiendo realizar comparaciones simples entre valores enteros.

### ✨ Objetivo

Practicar el uso de los operadores:  
`<`, `<=`, `>`, `>=`, `==`, `!=`

### 📦 Ejemplo ilustrativo

```java
int a = 5;
int b = 10;
System.out.println(a < b);   // true
System.out.println(a == b);  // false
System.out.println(a != b);  // true
```

---

## 🧩 Parte 2: Comparación de Cadenas

Se introduce el uso de métodos para comparar cadenas de texto sin distinguir entre mayúsculas y minúsculas.

### ✨ Objetivo

Comparar cadenas utilizando `equalsIgnoreCase()` para aceptar distintas formas del mismo texto.

### 📦 Ejemplo ilustrativo

```java
Scanner sc = new Scanner(System.in);
System.out.print("Adivina el nombre: ");
String entrada = sc.nextLine();

if (entrada.equalsIgnoreCase("Juan")) {
    System.out.println("¡Correcto!");
} else {
    System.out.println("Nombre incorrecto.");
}
```

---

## 🧩 Parte 3: Calculadora con Switch

Pequeña calculadora que permite realizar operaciones básicas según la opción elegida por el usuario.

### ✨ Objetivo

Aplicar `switch` para elegir entre `+`, `-`, `x`, `/`.

### 📦 Ejemplo ilustrativo

```java
switch (operador) {
    case "+":
        resultado = num1 + num2;
        break;
    case "-":
        resultado = num1 - num2;
        break;
    case "x":
        resultado = num1 * num2;
        break;
    case "/":
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            System.out.println("Error: División por cero");
        }
        break;
    default:
        System.out.println("Operación no válida.");
}
```

---

## 🖥️ ¿Cómo ejecutar el programa?

1. Asegurate de tener Java instalado (Java 8 o superior).
2. Abrí una terminal y navegá hasta la carpeta donde están tus archivos `.java`.
3. Compilá los archivos:

   ```bash
   javac NombreDelArchivo.java
   ```

4. Ejecutá el programa:

   ```bash
   java NombreDelArchivo
   ```

> 💡 Reemplazá `NombreDelArchivo` por el nombre real de tu clase con el método `main`.

---

## ✅ Parte 4: Conclusión y aprendizaje

Este proyecto refuerza los fundamentos esenciales de la programación en Java:

* Comparación de datos con operadores relacionales.
* Comparación segura de cadenas con `equalsIgnoreCase()`.
* Uso de `switch` para estructuras condicionales múltiples.
* Manejo de errores comunes como divisiones por cero o entradas no válidas.

Estas bases son fundamentales para desarrollar lógica de control y estructuras condicionales más avanzadas en programas reales.

---
