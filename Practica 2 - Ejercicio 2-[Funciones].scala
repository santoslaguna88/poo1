println ("Precio de piezas")
  val Num de piezas=readFloat()

if (Precio de piezas<500) {
ordenGastos1()
} 
if (Precio de piezas>500) {
ordenGastos2()
}


def ordenGastos1() {
    val Inversion propia1=(Precio de piezas/100)*55
    val Prestamo banco1=(Precio de piezas/100)*30
    val Credito fabricante=Precio de piezas-(Inversion propia+Prestamo bancario)
    val Credito total=Credito fabricante+((Credito fabricante/100)*20)
}

def ordenGastos2() {
    val Inversion propia2=(Precio de piezas/100)*70
    val Credito fabricante2=Precio de piezas-Inversion propia
    val Credito Total=Credito fabricante+((Credito fabricante/100)*20)
}