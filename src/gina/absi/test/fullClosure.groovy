package gina.absi.test

Map map = ['a' :1, 'b' :2]

//Parameter sequence with commas
map.each { key, value ->
    map[key] = value * 2
}
assert map == ['a' : 2, 'b' :4]

//Assigns and then calls a closure reference
Closure doubler = { key, value ->
    map[key] = value * 2
}
map.each(doubler)
assert map == ['a':4, 'b':8]

//Refences and calls a method as a closure
def doubleMethod (entry) {
    entry.value = entry.value * 2 //Usual method declaration
}
doubler = this.&doubleMethod
map.each(doubler)
assert map == ['a':8, 'b':16]