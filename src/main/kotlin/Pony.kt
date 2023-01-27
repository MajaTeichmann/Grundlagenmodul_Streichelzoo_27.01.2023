class Pony(name:String, gewicht: Double, alter: Int, geschlecht: String, var geschwindigkeit : Double): Tier(name, gewicht, alter, geschlecht) {

    override fun geraeusch() {
        println("Das Pony ${name} macht Wiehiehie")
    }

        fun reiten(besucher: Besucher){
            if (alter >= 1 && besucher.alter >= 6)
                println("${besucher.name} darf auf $name reiten")
            else
                println("${besucher.name} darf nicht auf ${name} reiten")
        }
}