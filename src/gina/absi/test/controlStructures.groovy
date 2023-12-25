package gina.absi.test

//The if as one-liner
if (false) assert false

//null is false
if (null) {
    assert false
} else {
    assert true
}

//Classic while loop
def i = 0
while (i < 10) {
    i++
}
assert i == 10

//The for in range
def clinks =0
for (remainingGuests in 0..9) {
    clinks += remainingGuests
}
assert clinks == (10*9)/2

//The for in list
def list = [0, 1, 2, 3]
for (j in list) {
    assert j == list[j]
}

//The each methof with a closure
list.each { item ->
    assert item == list[item]
}

//Classifier Switch
switch(3) {
    case 1 : assert false; break
    case 2 : assert false; break
    case 3 : assert true; break
    default: assert false
}

def test = 1.plus(1)


println(test)