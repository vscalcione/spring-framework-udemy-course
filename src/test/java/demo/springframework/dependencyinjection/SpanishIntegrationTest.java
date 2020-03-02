package demo.springframework.dependencyinjection;

import demo.springframework.dependencyinjection.services.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/helloworld-configuration.xml", "classpath:/spring/spanish-helloworld-configuration.xml"})
public class SpanishIntegrationTest {

    @Autowired
    HelloWorldService helloWorldService;

    /**
     * Per far si che il test abbia esito negativo, mettere come argomento testuale al metodo assertEquals una stringa
     * che non corrisponda a quella effettiva (stringa che faccia andare in success il test)
     */
    @Test
    public void testHelloWorld(){
        String greeting = helloWorldService.getGreeting();
        assertEquals("Hola mundo !!!", greeting);
    }
}
