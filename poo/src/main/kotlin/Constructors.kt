class PeopleConstructor(val name: String) {
    var doc: String? = null;

    constructor(name: String, doc: String) : this(name) {
        this.doc = doc
    }

    fun sleep() {
        println("${this.name} Está dormindo (Zzzz...)")
    }

    fun getReportPeople() {
        println(
            "----------------\r\n " +
                    "Nome: ${this.name} \r\n " +
                    "Documento: ${this.doc} \r\n" +
                    "----------------"
        )
    }
}

fun main() {
    var people1 = PeopleConstructor("Isaque")
    people1.doc = "Ednaldo Pereira CPF"
    people1.getReportPeople()
}