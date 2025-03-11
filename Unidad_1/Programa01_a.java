package Act_JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.awt.Window.Type;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programa01_a {

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
			FileWriter file=new FileWriter("ticket.json");
			file.write(json);
			file.flush();
			file.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader file=new FileReader("ticket.son");
			Type listType=new TypeToken<ArrayList<Ticket>>() {}.getType();
			List<Type> lista3=gson.fromJson(file, listType);
			for(Ticket ticket:lista3) {
				System.out.println("Ticket No.",ticket.getIdTicket());
				for(Producto producto:ticket.getIdproducto()) { 
					System.out.println("Producto:");
					System.out.println(producto.getIdproductos());
					System.out.println(producto.getProducto());
					System.out.println(producto.getDescripcion());
					System.out.println(producto.getCantidad());
					System.out.println(producto.getPrecio());
					System.out.println(producto.getidcategoria());
				}
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		
	}
	

}
