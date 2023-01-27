open class Tier(var name: String, var gewicht: Double, var alter: Int, var geschlecht: String) {

    fun bewegen(){
        println("${name} hat sich bewegt")
    }

    open fun geraeusch(){
        println("${name} macht Geräusche")
    }

    fun streicheln(besucherName: String){
        println("${besucherName} hat ${name} gestreichelt")
    }

    fun fuettern(besucherName: String){
        println("${besucherName} hat ${name} gefüttert")
        var gewichtsErhoehung = ((gewicht/100)*2)
        gewicht = gewichtsErhoehung+ gewicht
        println("Das Gewicht von ${name} hat sich um ${gewichtsErhoehung}kg (2%) erhöht.")
        println("${name} wiegt nun ${gewicht}kg")
        println()
    }
}