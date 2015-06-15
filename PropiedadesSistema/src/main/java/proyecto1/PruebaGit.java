package proyecto1;

import java.util.Properties;

public class PruebaGit {

	public static void main(String[] args) {
		Properties propiedadesSys = System.getProperties();
		
		System.out.println("Hola Mundo GIT, propiedades del sistema");
		
		for (Object object : propiedadesSys.entrySet()) {
			System.out.println(object.toString());
		}
		
	}

}
