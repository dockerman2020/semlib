package gina.absi.test

class SizeFilters {
    Integer limit

    boolean sizeUpTo(String value) {
        return value.size() <= limit
    }
}

SizeFilters filter6 = new SizeFilters(limit:6)
SizeFilters filter5 = new SizeFilters(limit:5)

Closure sizeUpTo6 = filter6.&sizeUpTo

def words = ['log string', 'medium', 'short', 'tiny']

assert 'medium' == words.find (sizeUpTo6)
assert 'short' == words.find (filter5.&sizeUpTo)
