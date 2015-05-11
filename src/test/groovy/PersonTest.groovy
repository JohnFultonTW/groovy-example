import org.junit.Test
class PersonTest {

    @Test
    def void "hey, you can instantiate a class like this!"() {
        def person = new Person(
            firstName: "Alfred",
            lastName: "Pennyworth",
            nice: true 
        )
        assert person.firstName == "Alfred"
        assert person.lastName == "Pennyworth"
        assert person.nice == true
    }

    @Test
    def void "can you use a regular old map to do that?"() {
        def personMap = [firstName: "Bruce", lastName: "Wayne", nice: false]
        def person = new Person(personMap)
        assert person.firstName == "Bruce"
        assert person.lastName == "Wayne"
        assert person.nice == false
    }
    
}
