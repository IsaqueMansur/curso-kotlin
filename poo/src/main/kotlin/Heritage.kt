enum class Voltage {
    V110, V220
}

abstract class HardwareElectronic(val brand: String, val voltage: Voltage) {
    private var hardwareOn = false
    fun powerOn() {
        hardwareOn = true
        println("\r\nDispositivo ligado");
    }

    fun powerOff() {
        hardwareOn = false
        println("\r\nDispositivo desligado")
    }
}

class Computer(
    brand: String,
    voltage: Voltage,
    private val keyBoard: String
) :
    HardwareElectronic(brand, voltage) {
    fun getComputerInfos(): String {
        return "Marca: $brand\r\nVoltagem: $voltage\r\nTeclado: $keyBoard"
    }
}

fun main() {
    val computerDellTop = Computer("Dell", Voltage.V110, "Logitec KeyboardPro")
    computerDellTop.powerOn()
    println(computerDellTop.getComputerInfos())
    computerDellTop.powerOff()
}