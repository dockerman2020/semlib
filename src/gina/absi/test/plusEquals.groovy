package gina.absi.test
import groovy.transform.Immutable

@Immutable
class Money {
    int amount
    String currency

    Money plus (Money other) {
        if (null == other) return this
        if (other.currency != currency) {
            throw new IllegalArgumentException (
                    "Cannot add $other.currency to $currency"
            )

        }
        return new Money(amount + other.amount, currency)
    }
}

Money buck = new Money(1, 'USD')
assert buck
assert buck == new Money(1, 'USD')
assert buck + buck == new Money(amount + other.amount, currency)