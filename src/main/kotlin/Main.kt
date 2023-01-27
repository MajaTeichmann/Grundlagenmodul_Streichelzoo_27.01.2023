fun main() {
    var besucherFranz = Besucher("Franz", 35)

    println("\nAufgabe 2:")
    besucherFranz.vorstellen()

    println("\nAufgabe 3:")
    var tierHelga = Tier("Helga", 35.3, 12, "weiblich")

    println("Hallo, mein Name ist ${tierHelga.name}. Ich bin ${tierHelga.alter} Jahre alt, ${tierHelga.geschlecht} und wiege aktuell ${tierHelga.gewicht}kg.")

    println("\nAufgabe 4:")
    tierHelga.bewegen()
    tierHelga.geraeusch()
    tierHelga.streicheln(besucherFranz.name)
    tierHelga.fuettern(besucherFranz.name)

    println("\nAufgabe 5:")
    var schafShawn = Schaf("Shawn", 23.4, 5, "weiblich")
    schafShawn.geraeusch()

    println("\nAufgabe 6:")
    var huhnKikeri = Huhn("Kikeri", 2.5, 2, "männlich", 2)
    huhnKikeri.geraeusch()
    println("${huhnKikeri.name} legt täglich ${huhnKikeri.eierProTag} Eier")

    println("\nAufgabe 7:")
    var kuhBerta = Kuh("Berta", 525.0, 7, "weiblich")
    kuhBerta.melken(besucherFranz)

    println("\nAufgabe 8:")
    var ponyGustav = Pony("Gustav", 315.0, 3, "männlich", 30.5)
    var besucherSissi = Besucher("Sissi", 4)

    ponyGustav.reiten(besucherFranz)
    ponyGustav.reiten(besucherSissi)

    println("\nAufgabe 9.1 & 9.2:")
    var streichelzoo = Streichelzoo()
    streichelzoo.streichelZooBetreten(besucherFranz)

    println("\nAufgabe 9.3:")
    var pony1 = Pony("Thorben", 564.3, 4,"männlich",87.9)
    var pony2 = Pony("Manni", 578.9, 5,"männlich",87.8)
    streichelzoo.ponyRennen(pony1,pony2)
}