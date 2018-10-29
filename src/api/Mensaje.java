package api;

import javax.ws.rs.GET;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/mensaje")
public class Mensaje {
@GET
@Path("/{param}")
public Response imprimir(@PathParam("param")String msj){
	String salida="Bienvenido al Curso: " +msj;
	return Response.status(200).entity(salida).build();
}
}
