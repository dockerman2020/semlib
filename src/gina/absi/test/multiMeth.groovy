package gina.absi.test

class MultiMethodSamples {
    static int mysteryMethod (String value) {
        return value.length()
    }

    static int mysteryMethod (List list) {
        return list.size()
    }

    static int mysteryMethod (int x, int y) {
        return x+y
    }
}

MultiMethodSamples instance = new MultiMethodSamples()
Closure multi = instance.&mysteryMethod

//Different implementations are called based on argument type
assert 3 == multi (['list', 'of', 'values'])
assert 10 == multi ('string arg')
assert 14 == multi (6, 8)
