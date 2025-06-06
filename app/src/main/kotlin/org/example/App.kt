/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example
import kotlin.math.*
import java.math.RoundingMode

const val TermA: Double = 6.00
const val TermB: Double = 12.00
const val TermC: Double = 3.00

fun main() {
    // representa si el termino A de la función cuadrática es 0 o no
    if (TermA == 0.0) {
        println("El término A es 0.")
    } else {
        println("El término A no es 0.")
    }
    // Asigna valores del -5 al 5 a la variable x con paso de una unidad
    for (i in -5..5) {
        val x = i.toDouble()
        println("x = $x")
        println("f(x) = ${calcularF(TermA, TermB, TermC, x)}")
    }
    println("${TermA}x² + ${TermB}x + ${TermC}")

    val (root1, root2) = raiz(TermA, TermB, TermC)
    if (root1 != null && root2 != null) {
        println("Las raíces de la ecuación son: x1 = $root1, x2 = $root2")
    }
}
//calcularF es la función cuadrática
//calcularF recibe los términos A, B y C de la función cuadrática y el valor de x. Pueden ser decimales
fun calcularF(TermA: Double, TermB: Double, TermC: Double, x: Double): Double {
    //calcularF devuelve el resultado de la función cuadrática
    return TermA * x * x + TermB * x + TermC
}

fun raiz(TermA: Double, TermB: Double, TermC: Double): Pair<Double?, Double?> {
    //Calcular la discriminante
    //Si la discriminante es menor que 0, no hay raíces reales
    val discriminante = TermB * TermB - 4 * TermA * TermC
    if (discriminante < 0) {
        println("No hay raíces reales.")
        return Pair(null, null)
    }
    //sqrt sirve para calcular la raíz cuadrada
    //RoundingMode.HALF_UP redondea el resultado a 2 decimalesssss
    val root1 = (-TermB + Math.sqrt(discriminante)) / (2 * TermA)
    val root1redondeado = root1.toBigDecimal().setScale(2, RoundingMode.HALF_UP).toDouble()
    val root2 = (-TermB - Math.sqrt(discriminante)) / (2 * TermA)
    val root2redondeado = root2.toBigDecimal().setScale(2, RoundingMode.HALF_UP).toDouble()
    return Pair(root1redondeado, root2redondeado)
}