package gina.absi.test

def List = [12, 34, 88, 90, 234]

//List.each { item ->
//    println item
//}

List.stream().forEach ({ println it})

def List1 = ['dsfad', 'hfdaddf', 'rqehher']

List1.each ({
    println it
})
//List1.stream().forEach { myparms ->
//    println myparms
//}