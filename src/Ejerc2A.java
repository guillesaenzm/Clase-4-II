import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Ejerc2A {

	public static void main(String[] args) {
		
		class ManejoArchivos{
			String FileName, Path;
			public String getFileName() {
				return FileName;
			}
			public void setFileName (String filename) {
				FileName = filename;
			}
			public String gethPath() {
				return Path;
			}
			public void setPath(String path) {
				Path = path;
			}
			//public void ManejoArchivo() {}

			String numerosdelarchivo = new String ();
			//int i=0;
			public void LeerArchivo()
			{
				try {
					List<String> contenido = Files.readAllLines(Paths.get(Path));
					{
					System.out.println("El archivo contiene: " + contenido);	
					}
					numerosdelarchivo = String.valueOf(contenido);
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				
				
				String[] numerosSeparados = numerosdelarchivo.split(";"); 
				System.out.println(Arrays.toString(numerosSeparados));
				System.out.println(numerosSeparados.length);
				
				
				int[] numSeparados = Arrays.stream(numerosSeparados)
                        .mapToInt(Integer::parseInt)
                        .toArray();
				System.out.println(Arrays.toString(numSeparados));
				
				
				int sum = 0;
		        for (int i = 0; i < numSeparados.length; i++) {
		            sum+= numSeparados[i];
		       
		        System.out.println("Suma de los número = "+sum);
		        
		    }}
			
			
		}
			ManejoArchivos Arch = new ManejoArchivos();
			Arch.setPath("C:\\Users\\Guillermo\\Downloads\\Ejercicio2.txt");
			Arch.setFileName("DesdeJavaCode");
			Arch.LeerArchivo();

			
			
			
	}

}
