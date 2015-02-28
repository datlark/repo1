package swan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import swan.domain.User;
import swan.service.UserService;


@Path("/area")
public class AreaRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultUserInJSON() {
        UserService userService = new UserService();
        return userService.getDefaultUser();
    }
}
