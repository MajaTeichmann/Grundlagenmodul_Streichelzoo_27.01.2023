class Schaf(name: String, gewicht: Double, alter:Int, geschlecht: String): Tier(name, gewicht, alter, geschlecht) {


    override fun geraeusch(){
        println("${name} das Schaf macht määäh")
    }
}