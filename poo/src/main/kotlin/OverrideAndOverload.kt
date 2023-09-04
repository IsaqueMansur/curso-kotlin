abstract class Vehicle(val brand: String) {
    private var velocity = 0f
    protected var engineOn = false

    open fun powerOn() {
        this.engineOn = true
        println("Motor Ligado\r\n")
    }

    open fun powerOff() {
        this.engineOn = false
        println("Motor Desligado\r\n")
    }

    fun run() {
        this.velocity++
        println("Run sem nitro. Velocidade = $velocity")
    }
    fun run(nitro: Boolean) {
        this.velocity += 3
        println("Run com nitro. Velocidade = $velocity")
    }
}

class ElectronicVehicle(brand: String) : Vehicle(brand) {
    private var batteryOn = false

    override fun powerOn() {
        this.batteryOn = true
        println("Bateria Ligada\r\n")
        super.powerOn()
    }

    override fun powerOff() {
        this.batteryOn = false
        println("Bateria Desligada\r\n")
        super.powerOff()
    }
}

fun main() {
    val electronicCar1 = ElectronicVehicle("Tesla")
    electronicCar1.powerOn()
    electronicCar1.powerOff()
    electronicCar1.run()
    electronicCar1.run(true)
}