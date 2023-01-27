class Streichelzoo {
    var streichelZooTiere = mutableListOf<Tier>(
        Schaf("Anna", 23.7, 5, "weiblich"),
        Schaf("Ben", 32.1, 7, "männlich"),
        Huhn("Henriette", 2.5, 2, "weiblich", 3),
        Huhn("Herbert", 3.4, 3, "männlich", 0),
        Kuh("Clarissa", 567.8, 4, "weiblich"),
        Pony("Phil", 350.4, 3, "männlich", 28.9),
        Pony("Manni", 578.9, 5, "männlich", 87.8),
        Pony("Thorben", 564.3, 4, "männlich", 87.9)
    )

    fun streichelZooBetreten(besucher: Besucher) {
        println("${besucher.name} hat den Streichelzoo betreten")

        for (i in 0..streichelZooTiere.size - 1) {
            streichelZooTiere[i].geraeusch()
            println()
            streichelZooTiere[i].fuettern(besucher.name)
            println()
        }
    }

    fun tiereGeraeusche() {
        for (i in 0..streichelZooTiere.size - 1) {
            streichelZooTiere[i].geraeusch()
        }
    }

    fun fuetterung(besucher: Besucher){
        for(i in streichelZooTiere){
            i.fuettern(besucher.name)
        }
        println("${besucher.name} hat alle Tiere gefüttert")
    }



        fun ponyRennen(pony1: Pony, pony2: Pony) {
            println("Unser heutiges Ponyrennen findet zwischen ${pony1.name} und ${pony2.name} statt")
            println("Das Ponyrennen beginnt in")
            println("3")
            Thread.sleep(1000)
            println("2")
            Thread.sleep(1000)
            println("1")
            Thread.sleep(1000)
            println("GO!")
            println("...")
            Thread.sleep(1000)
            println("...")
            Thread.sleep(1000)
            println("...")
            Thread.sleep(1000)
            if (pony1.geschwindigkeit > pony2.geschwindigkeit) {
                println("${pony1.name} hat als erstes das Ziel erreicht und ist somit unser Gewinner!")
            } else if (pony1.geschwindigkeit < pony2.geschwindigkeit) {
                println("${pony2.name} hat als erstes das Ziel erreicht und ist somit unser Gewinner!")
            } else if (pony1.geschwindigkeit == pony2.geschwindigkeit) {
                println("${pony1.name} und ${pony2.name} haben das Ziel gleichzeitig erreicht. Somit gibt es heuten Gewinner!")
            }
        }
    }