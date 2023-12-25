package gina.absi.test

Book gina = new Book('Groovy in Action')

assert gina.getTitle() == 'Groovy in Action'
assert getTitleBackwards(gina) == 'noitcA ni yvoorG'

static String getTitleBackwards(book) {
        String title = book.getTitle()
        return title.reverse()

}

println(gina.getTitle())
println(getTitleBackwards(gina))
//final def var1 = var
//var