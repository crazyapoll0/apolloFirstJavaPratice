package chapter24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Ex14_Unit implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Ex14_Unit(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class Ex14_ObjectInputStream {

	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.bin"))) {
			Ex12_Unit unit1 = (Ex12_Unit) ois.readObject();
			System.out.println(unit1.getName());

			Ex12_Unit unit2 = (Ex12_Unit) ois.readObject();
			System.out.println(unit2.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

