package pruebasCarga;

import uniandes.gload.core.LoadGenerator;
import uniandes.gload.core.Task;
import uniandes.gload.examples.clientserver.generator.ClientServerTask;

public class Generator {
	
	private LoadGenerator generator;
	
	
	public Generator()
	{
		Task work = createTask();
		int numberOfTasks = 400;
		int gapBetweenTasks = 20;
		generator = new LoadGenerator("Pruebas de carga servidores", numberOfTasks, work, gapBetweenTasks);
		generator.generate();
				
	}
	
	private Task createTask()
	{
		return new ClienteServerTask();
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Generator gen = new Generator();
	}
}
