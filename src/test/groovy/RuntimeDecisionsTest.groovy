import org.junit.Test

class RuntimeDecisionsTest {
    
    @Test
    def "Oooo, what will it do?"() {
        def rd = new RuntimeDecisions()
        Object object = "I'm a string but how would you know until runtime?"
        assert rd.overloaded(object) == false
    }

}
