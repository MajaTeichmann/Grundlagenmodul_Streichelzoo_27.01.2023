class Kuh(name:String,gewicht:Double,alter:Int,geschlecht:String):Tier(name, gewicht, alter, geschlecht) {

    constructor(name: String,gewicht: Double,alter:Int,geschlecht: String, gibtMilch: Boolean) : this(name,gewicht,alter,geschlecht)

    var gibtMilch: Boolean = false

    override fun geraeusch() {
        println("Die Kuh ${name} macht Muuuh")
    }

    fun melken(besucher: Besucher){
        if(alter >= 3 && geschlecht == "weiblich"){
            gibtMilch = true
            println("${name} gibt Milch")
        }
        else{
            println("${name} kann keine Milch geben")
        }
    }
}