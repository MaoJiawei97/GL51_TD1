package gl51

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

@CompileStatic
class Application {
    static void main(String[] args) {
        println "Hello World!" as java.lang.Object;
        Micronaut.run(Application);
    }
}