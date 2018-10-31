package api;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/operaciones")
public class Operacion {
@GET
@Path("/sumar/{param}/{param2}")
public Response sumarNumerosGet(@PathParam("param")int msg, @PathParam("param2")int msg2) {
	Integer valor= msg+msg2;
	
	return Response.status(200).entity(valor.toString()).build();

}

@POST
@Path("/sumar")
@Consumes("application/json")
@Produces("text/plain")
public String sumarNumerosJson(String json){
	Gson gson=new Gson();
	Numeros nums = gson.fromJson(json,Numeros.class);
	String responseString = "El resultado es: "
			+String.valueOf(nums.getNumero1()+nums.getNumero2());
	return responseString;
}
}

