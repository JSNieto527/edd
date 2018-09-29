package arreglos;

import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;

public class NumAleatSeguros4 {
	private static short[] aleatoriosGenerados;
	
	public static void secuenciaNumeros(short longitud) {
		aleatoriosGenerados = new short[longitud];
		try {
			SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
			byte[] aleatorioBytes = new byte[128];
			sr.nextBytes(aleatorioBytes);
			int sba = 5;
			byte[] semilla = sr.generateSeed(sba);
			SecureRandom sr1 = SecureRandom.getInstance("SHA1PRNG");
			sr1.setSeed(semilla);
			for(int i=0;i<longitud;i++) {
				short n = (short)(100+sr1.nextInt(1000));
				aleatoriosGenerados[i] = n;
				//System.out.println(n); 	
			}			
		}catch(NoSuchAlgorithmException nsae) {
			System.out.println("Error en la biblioteca Numeros Aleat Seguros");
			nsae.printStackTrace();			
		}		
	}
	
	public static short[] ordenarSecuenciaNumeros() {
		short numeroTemporal;
		for(int i=0;i<aleatoriosGenerados.length;i++) {
			for(int j=i+1;j<aleatoriosGenerados.length;j++) {
				if(aleatoriosGenerados[i] > aleatoriosGenerados[j]) {
					numeroTemporal = aleatoriosGenerados[i];
					aleatoriosGenerados[i] = aleatoriosGenerados[j];
					aleatoriosGenerados[j] = numeroTemporal;
				}
			}
		}
		return aleatoriosGenerados;
	}//fin de ordenarSecuenciaNumeros
	
}
