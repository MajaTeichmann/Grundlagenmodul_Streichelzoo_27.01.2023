class Huhn(name:String, gewicht:Double, alter:Int, geschlecht:String, var eierProTag: Int): Tier(name, gewicht, alter, geschlecht) {


    override fun geraeusch() {
        println("${name} das Huhn macht ga-gack")
    }
}