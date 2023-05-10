package rsk

import java.time.LocalDate

class Meeting {
    var Title: String = ""
    var When: LocalDate = LocalDate.MIN
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main(args: Array<String>) {
    val m = Meeting()
    m.Title = "Board Meeting"
    m.When = LocalDate.of(2017, 1, 1)
    m.Who.add("Kevin")

    with(m) {
        Title = "Board Meeting"
        When = LocalDate.of(2017, 1, 1)
        Who.add("Kevin")
    }

    m.apply {
        Title = "Board Meeting"
        When = LocalDate.of(2017, 1, 1)
        Who.add("Kevin")
    }.create()
}
