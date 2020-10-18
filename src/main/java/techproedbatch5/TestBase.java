package techproedbatch5;


import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.Before;

public class TestBase {

    protected RequestSpecification spec01; //cocuklarin  hepsi kullanabilsin diye
    protected RequestSpecification spec02;
    protected RequestSpecification spec03;

    @Before
    public void setUp01() {
        spec01 = new RequestSpecBuilder().
                setBaseUri("https://restful-booker.herokuapp.com").
                build();
        //Uri olusturduk ve spec01 icerisine depoladik.
        // Amacimiz kod tekrarindan kurtulma ve guncellemeleri daha hizli yapabilmek.

    }

    @Before
    public void setUp02() {
        spec02 = new RequestSpecBuilder().
                setBaseUri("http://dummy.restapiexample.com/api/v1/employees").
                build();

    }

    @Before
    public void setUp03() {
        spec03 = new RequestSpecBuilder().
                setBaseUri("https://jsonplaceholder.typicode.com/todos").
                build();
    }

}







