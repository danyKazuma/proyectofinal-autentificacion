package com.nttdata.proyectofinal.controller;

import javax.inject.Inject;
import javax.validation.Valid;
import com.nttdata.proyectofinal.controller.service.UserService;
import io.quarkus.security.User;
import io.vertx.core.json.Json;
import io.vertx.ext.web.RoutingContext;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    @Inject
    UserService userService;

    @GET
    @Path("/{id}")
    public void getUserById(@PathParam("id") String id, RoutingContext routingContext) {
        User user = userService.getUserById(id);
        if (user == null) {
            routingContext.response().setStatusCode(404).end();
        } else {
            routingContext.response().end(Json.encode(user));
        }
    }

    @POST
    public void createUser(@Valid User user, RoutingContext routingContext) {
        userService.createUser(user);
        routingContext.response().setStatusCode(201).end();
    }

    @PUT
    @Path("/{id}")
    public void updateUser(@PathParam("id") String id, @Valid User user, RoutingContext routingContext) {
        if (userService.updateUser(id, user)) {
            routingContext.response().end();
        } else {
            routingContext.response().setStatusCode(404).end();
        }
    }

    @DELETE
    @Path("/{id}")
    public void deleteUser(@PathParam("id") String id, RoutingContext routingContext) {
        if (userService.deleteUser(id)) {
            routingContext.response().end();
        } else {
            routingContext.response().setStatusCode(404).end();
        }
    }
}