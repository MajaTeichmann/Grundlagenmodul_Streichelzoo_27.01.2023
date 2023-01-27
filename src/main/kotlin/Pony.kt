class Pony(name:String, gewicht: Double, alter: Int, geschlecht: String, var geschwindigkeit : Double): Tier(name, gewicht, alter, geschlecht) {

    override fun geraeusch() {
        println("Das Pony ${name} macht Wiehiehie")
    }

        fun reiten(besucher: Besucher){
            if (alter >= 1 && besucher.alter >= 6)
                println("${besucher.name} darf auf dem Pony $name reiten. Viel Spaß!")
            else if (alter >= 1 && besucher.alter < 6)
                println("Tut mir leid ${besucher.name}. Du bist noch zu jung.")
            else if (alter < 1 && besucher.alter >= 6)
                println("Tut mir leid. Das Pony $name ist noch zu jung.")
        }
}