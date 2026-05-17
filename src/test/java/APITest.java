import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest
{

    @Test
    void test1()
    {
        Response response = get("https://reqres.in/api/users?page=2");
        //Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");

        System.out.println("Response :"+response.asString());
        System.out.println("Status Code: "+response.getStatusCode());
        System.out.println("Body "+response.getBody().asString());
        System.out.println("Time taken: "+response.getTime());
        System.out.println("Header Value: "+response.getHeader("Content-Type"));
        System.out.println("Arul!!!!!");

        int StatusCode = response.getStatusCode();
        Assert.assertEquals(StatusCode, 401);
    }

    @Test
    void test2()
    {
        given()
                .get("https://reqres.in/api/users?page=2").
                then().
                statusCode(401);
    }

}
