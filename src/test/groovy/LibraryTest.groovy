/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'john' at '9/05/15 11:10 PM' with Gradle 2.4
 *
 * @author john, @date 9/05/15 11:10 PM
 */

import org.junit.Test

class LibraryTest {
    @Test
    def void "someLibraryMethod returns true"() {
        Library lib = new Library()
        assert lib.importantMap().trueValue == true
    }
}
