package pruebasCarga;

import uniandes.gload.core.Task;
import uniandes.gload.examples.clientserver.Client;

public class ClientServerTask extends Task {
	public static final String[] SIMETRICOS = {"DES","AES","Blowfish","RC4"};
	public static final String[] ASIMETRICOS = {"RSA"};
	public static final String[] HASH = {"HMACMD5", "HMACSHA1", "HMACSHA256", "HMACSHA384", "HMACSHA512"};
	
	public void execute()
	{
		Client client = new Client();
		client.sendMessageToServer("HOLA");
		client.waitForMessageFromServer();
		client.sendMessageToServer("ALGORITMOS:"+SIMETRICOS[(int) Math.round((Math.random()*(SIMETRICOS.length-1)+1))]
									+":"+ASIMETRICOS[(int) Math.round((Math.random()*(ASIMETRICOS.length-1)+1))]
									+":"+HASH[(int) Math.round((Math.random()*(HASH.length-1)+1))]);
		client.waitForMessageFromServer();
		client.sendMessageToServer(String.valueOf(String.valueOf((Math.random()*100000)).hashCode()));
		client.waitForMessageFromServer();
		client.sendMessageToServer(String.valueOf(String.valueOf((Math.random()*100000)).hashCode()));;
		client.waitForMessageFromServer();
		client.sendMessageToServer(String.valueOf(String.valueOf((Math.random()*100000)).hashCode()));;
		client.waitForMessageFromServer();
		
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
