package techproedbatch5;
import Utilities.JsonUtil;
import org.junit.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.*;
public class ObjectMapperWithMap extends TestBase{
    //Java ile olusturacagimiz objeyi JsonUtil icinde olusturdugumuz convertJavaTOJson methodu ile json a cevirecegiz.
    @Test
    public void javaToJson(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Ali");
        map.put(102,"Veli");
        map.put(103,"Can");
        System.out.println(map);//{101=Ali, 102=Veli, 103=Can}
        //Map objesni Json Formatina cevirme ==>Serialization.
        String JsonFormMap= JsonUtil.convertJavaToJson(map);
        System.out.println(JsonFormMap); //{"101":"Ali","102":"Veli","103":"Can"}
    }
}