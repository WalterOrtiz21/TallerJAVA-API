package api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/producto")
public class ProductoServicio {
@POST
@Path("/agregar")
@Consumes("application/json")
		public Response agregarProducto(String json){
			ProductoControl productoControl= new  ProductoControl();
			Gson gson= new Gson();
			System.out.println(json);
			Entidad producto =gson.fromJson(json, Entidad.class);
			boolean respuesta = productoControl.agregarproducto(producto.getNombre(),producto.getProveedor(),Integer.parseInt(producto.getPrecio()));
					if(respuesta)
						return Response.status(200).entity("Se agregoo").build();
					return Response.status(407).entity("No se puedo agregar el producto").build();
			}
			
}
