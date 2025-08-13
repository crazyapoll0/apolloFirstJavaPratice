package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Ex12_Unit implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Ex12_Unit(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class Ex13_ObjectOuputStream {

	public static void main(String[] args) {
		Ex12_Unit unit1 = new Ex12_Unit("Marine");
		Ex12_Unit unit2 = new Ex12_Unit("Medic");
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("Object.bin")))
		{
			oos.writeObject(unit1);
			oos.writeObject(unit2);
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}

}
