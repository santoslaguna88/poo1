println("Edad")
  val Edad=readFloat()

println("Antiguedad empleo")
  val Antiguedad empleo=readFloat()


if (Edad>=60 , Antiguedad empleo<25 + "Por Edad") {
  listaEdad()
}
if (Edad<60, Antiguedad empleo>=25 + "Por Antiguedad joven") {
  listaAntiguedadJoven()
} 
if (Edad>=60, Antiguedad empleo>=25 + "Por Antiguedad Adulta") {
  listaAntiguedadAdulta()
}


def listaEdad() {
 var PersonasEdad = new Array[Int](999999)
}
def listaAntiguedadJoven() {
 var PersonasAntiguedadJoven = new Array[Int](999999)
}
def listaAntiguedadAdulta() {
 var PersonasAntiguedadAdulta = new Array[Int](999999)
}