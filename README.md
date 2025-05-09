# 2025-calculo-cuadratica

## Datos del Alumno
- **Nombre**: Candela
- **Apellido**: De la Cruz

## Descripción del Proyecto
Este proyecto consiste en desarrollar una aplicación en Kotlin que permita calcular y mostrar los valores de una función cuadrática, así como determinar sus raíces.

## Etapas de Desarrollo

### Etapa 1: Estructura Básica y Definición de Coeficientes
**Objetivo**: Crear la estructura del proyecto y definir los coeficientes de la función.
- [ ] Configurar proyecto Kotlin con Gradle
- [ ] Crear función main() para el programa
- [ ] Definir los coeficientes a, b, c como constantes en el programa
- [ ] Validar que 'a' no sea cero
- [ ] Mostrar la función ingresada en formato ax² + bx + c

**Commit**: "feat: Estructura básica y definición de coeficientes"

### Etapa 2: Cálculo de Valores de la Función
**Objetivo**: Implementar el cálculo de valores de la función para diferentes valores de x.
- [ ] Crear función para calcular f(x) = ax² + bx + c
- [ ] Mostrar tabla de valores para un rango de x (por ejemplo, de -5 a 5)
- [ ] Formatear la salida de manera clara y legible

**Commit**: "feat: Cálculo de valores de la función"

### Etapa 3: Cálculo de Raíces
**Objetivo**: Implementar el cálculo y análisis de las raíces de la función.
- [ ] Crear función para calcular el discriminante (b² - 4ac)
- [ ] Crear función para calcular las raíces según el valor del discriminante
- [ ] Mostrar las raíces con formato decimal (2 decimales)

**Commit**: "feat: Cálculo de raíces de la función"

### Etapa 4: Mejoras y Pulido
**Objetivo**: Mejorar la presentación y agregar características adicionales.
- [ ] Mejorar el formato de presentación de resultados
- [ ] Agregar mensajes descriptivos sobre el tipo de raíces
- [ ] Agregar comentarios explicativos en el código

**Commit**: "feat: Mejoras en presentación y formato"

## Requisitos Técnicos
1. La aplicación debe ser desarrollada en Kotlin
2. Los coeficientes de la función cuadrática (a, b, c) deben estar definidos como constantes en el programa
3. La aplicación debe mostrar por consola:
   - Los valores de la función para diferentes valores de x
   - Las raíces de la función (si existen)
   - Indicar si la función tiene:
     * Dos raíces reales diferentes
     * Una raíz real doble
     * No tiene raíces reales

## Formato de Salida
La aplicación debe mostrar:
1. La función en formato ax² + bx + c
2. Los valores de la función para un rango de valores de x
3. Las raíces de la función (si existen)
4. Un mensaje indicando el tipo de raíces encontradas