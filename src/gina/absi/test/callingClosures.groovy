package gina.absi.test

//def adder = { x, y ->
//    return x + y
//}
//
//assert adder(4, 3) == 7
//assert adder.call(2, 6) == 8

static def benchmark(int repeat, Closure worker) {
    def start = System.nanoTime()

    repeat.times {
    worker(it)
    }

    def stop = System.nanoTime()
    return stop - start
}
def slow = benchmark(10000) { (int) it / 2}
def fast = benchmark(10000) { it.intdiv(2)}
assert fast * 2 < slow