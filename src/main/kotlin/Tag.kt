fun main(){
    var seb = Besucher("Seb",15)
    var boris = Besucher ("Boris",4)

    println("\nAufgabe 10.1:")
    seb.vorstellen()
    boris.vorstellen()

    println("\nAufgabe 10.2:")
    var streichelzoo = Streichelzoo()
    var tierAuswahl = streichelzoo.streichelZooTiere[3]
    tierAuswahl.geraeusch()

    println("\nAufgabe 10.3:")
    tierAuswahl = streichelzoo.streichelZooTiere[1]
    tierAuswahl.fuettern("Seb")

    println("\nAufgabe 10.4:")
    Pony("Phil",350.4,3,"männlich",28.9).reiten(boris)

    println("\nAufgabe 10.5:")
    streichelzoo.streichelZooTiere[2].bewegen()

    println("\nAufgabe 10.6:")
    tierAuswahl.streicheln("Seb")

    println("\nAufgabe 10.7:")
    Pony("Thorben", 564.3, 4,"männlich",87.9).reiten(seb)

    println("\nAufgabe 10.8:")
    Pony("Manni", 578.9, 5,"männlich",87.8).reiten(boris)

    println("\nAufgabe 10.9:")
    Kuh("Clarissa",567.8,4,"weiblich").melken(boris)

    println("\nAufgabe 10.10:")
    streichelzoo.tiereGeraeusche()

    println("\nAufgabe 10.11:")
    streichelzoo.fuetterung(boris)

    println("\nAufgabe 10.12:")
    streichelzoo.ponyRennen(
        Pony("Manni", 578.9, 5, "männlich", 87.8),
        Pony("Thorben", 564.3, 4, "männlich", 87.9)
    )
}