import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;

public class BaseTest {
    public @Rule
    TestName nombre = new TestName();
    
    @BeforeClass
    public static void setUpClass(){
        System.out.println("Iniciando pruebas");
    }
    
    @Before
    public void setUp(){
        System.out.println("*****************************");
        System.out.println("Ejecutado   "+nombre.getMethodName());
    }
    
    @After
    public void tearDown(){
        System.out.println("*****************************");
        System.out.println("Terminado   "+nombre.getMethodName());
    }
    
    @AfterClass
    public static void tearDownClass(){
        System.out.println("Pruebas terminadas");
    }
}
