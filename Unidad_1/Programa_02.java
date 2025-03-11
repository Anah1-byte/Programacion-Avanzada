package Act_JSON;
import org.json.simple.JSONArray;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.io.FileWriter;
import java.awt.Window.Type;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Programa_02{

	public static void main(String[] args) {
		List <Producto>lista=new ArrayList<Producto>();
		List <Tickey> lista2=new ArrayList<Tickets>();
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		
		String json="";
		Producto producto=new Producto();
		producto.setIdproducto("1");
		producto.setProducto("Producto");
		producto.setDescripcion("Descripcion");
		producto.setCantidad("10");
		producto.setPrecio("100");
		producto.setIdcategoria("1");
		lista.add(producto1);
		Producto2 producto2=new Producto("002","Producto2","Descripcion2","200");
		lista.add(producto2);
		
		Ticket ticket1,ticket2;
		ticket1=new Ticket();
		ticket1.setIdTicket("001");
		ticket1.setProductos(lista);
		
		lista2.add(ticket1);
		
		
		json=gson.toJson(lista2);
		System.out.println(json);
		try {
			FileWriter file=new FileWriter("Producto2.json");
		file.write(jsonArray.toString());
			file.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			String json=new String(Files.readAllByte(Paths.get("producto2.json"));
			JsonArray readArray=new JSONArray(json);
			
			
			for(int i=0;1<readArray.lenght();i++) {
			JsonObject jsonObject =readArray.getAsJSONObject(i);
				Producto producto=new Producto(); 
					
					producto.setIdproducto(jsonObject.get("idproducto"));
					producto.setProducto(jsonObject.get("producto"));
					producto.setDescripcion(jsonObject.get("descripcion"));
					producto.setCantidad(jsonObject.get("cantidad"));
					producto.setPrecio(jsonObject.get("precio"));
					producto.setIdcategoria(jsonObject.get("idcategoria"));
					System.out.println(producto.getIdproducto());
					System.out.println(producto.getProducto());
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		
	}
	}
	