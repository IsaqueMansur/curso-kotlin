class Mathematica {
    companion object PrimaryValues {
        val PI = 3.14159265358979323846f
        val Euler = 2.718281828459045235360287f
    }

    object Operations {
        fun sumTwoValues(a: Int, b: Int): Int {
            return (a + b)
        }
        fun sumTwoValues(a: Float, b: Float): Float {
            return (a + b)
        }

    }
}

fun main() {
    println(Mathematica.PI)
    println(Mathematica.Euler)
    println(Mathematica.Operations.sumTwoValues(Mathematica.PI, Mathematica.Euler))
}