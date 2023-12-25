package gina.absi.test

def totalClinks =0
def partyPeople = 100

1.upto(partyPeople) {guestNumber ->
    clinkWithGuest = guestNumber - 1
    totalClinks += clinkWithGuest
}

assert totalClinks == (partyPeople * (partyPeople - 1)) / 2

println(totalClinks)
