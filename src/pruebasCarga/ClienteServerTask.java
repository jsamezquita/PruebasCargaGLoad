package pruebasCarga;

import uniandes.gload.core.Task;
import uniandes.gload.examples.clientserver.Client;

public class ClienteServerTask extends Task {
	public static final String[] SIMETRICOS = {"DES","AES","Blowfish","RC4"};
	public static final String[] ASIMETRICOS = {"RSA"};
	public static final String[] HASH = {"HMACMD5", "HMACSHA1", "HMACSHA256", "HMACSHA384", "HMACSHA512"};
	
	public void execute()
	{
		try {
		Cliente cliente = new Cliente();
		cliente.ejecutar();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void fail()
	{
		System.out.println(Task.MENSAJE_FAIL);
	}
	
	public void success()
	{
		System.out.println(Task.OK_MESSAGE);
	}

}
