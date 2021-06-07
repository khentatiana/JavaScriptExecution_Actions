package Implementation;

import jdk.jfr.ContentType;
import models.User;
import models.UserDTO;
import okhttp3.Response;
import services.AuthorizationInterface;
import static io.restassured.RestAssured.given;



public class AuthozitationServiceImplementation implements AuthorizationInterface {
    public UserDTO createUser(UserDTO user){
        Response response = given()
                .contentType(ContentType.JSON)

    }
}
