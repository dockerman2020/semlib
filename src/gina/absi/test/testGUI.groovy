package gina.absi.test

//import groovy.swing.SwingBuilder
//import javax.swing.JFrame
//
//// Create a basic GUI with a button
//new SwingBuilder().edt {
//    frame(title: 'Groovy GUI', size: [300, 200], show: true) {
//        vbox {
//            label(text: 'Click the button!')
//            button(text: 'Click Me', actionPerformed: {
//                println 'Button clicked!'
//            })
//        }
//    }
//}

//import groovy.swing.SwingBuilder
//import javax.swing.JFrame
//
//// Handling user input through a text field
//new SwingBuilder().edt {
//    frame(title: 'Input Example', defaultCloseOperation: JFrame.EXIT_ON_CLOSE, size: [300, 200], show: true) {
//        vbox {
//            label(text: 'Enter your name:')
//            textField(columns: 20, actionPerformed: { e ->
//                println "Hello, ${e.source.text}!"
//            })
//        }
//    }
//}

import groovy.swing.SwingBuilder
import javax.swing.BoxLayout
import java.awt.Component

// Creating a GUI with a BoxLayout
new SwingBuilder().edt {
    frame(title: 'Complex Layout', defaultCloseOperation: JFrame.EXIT_ON_CLOSE, size: [300, 300], show: true) {
        boxLayout(axis: BoxLayout.Y_AXIS)
        panel(alignmentX: Component.CENTER_ALIGNMENT) {
            label(text: 'Top Component')
        }
        panel(alignmentX: Component.CENTER_ALIGNMENT) {
            button(text: 'Button 1')
            button(text: 'Button 2')
        }
        panel(alignmentX: Component.CENTER_ALIGNMENT) {
            label(text: 'Bottom Component')
        }
    }
}