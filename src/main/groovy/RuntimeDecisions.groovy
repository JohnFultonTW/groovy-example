class RuntimeDecisions {
    def overloaded(String arg) {
       println "Hey, my argument was a STRING"
       return true
    }

    def overloaded(Object arg) {
        println "Hey, my argument was an OBJECT"
        return false
    }
}
