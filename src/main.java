/**
 * 
 */

/**
 * @author Sandi
 *
 */

import Komponente.Polje;
import Komponente.TransformatorskaStanica;
import Komponente.Prekidac;
import Komponente.Rastavljac;
import Komponente.DistantnaZastita;
import Komponente.Apu;
import Komponente.Zastita;
import Komponente.ZastitaZatajenjaPrekidaca;
public class main {

	/**
	 * @param args
	 */
	
	public boolean check(Rastavljac r_uzemljenje, Rastavljac r_dv, Rastavljac r_linijski, ZastitaZatajenjaPrekidaca z_prekidac, 
			Apu z_apu, DistantnaZastita z_distantna){
		
		if(r_uzemljenje.getNaponskaRazina()<=0)
			return false;
		if(r_dv.getNaponskaRazina()<=0)
			return false;
		if(r_linijski.getNaponskaRazina()<=0)
			return false;
		if(z_prekidac.getNaponskaRazina()<=0)
			return false;
		if(z_apu.getNaponskaRazina()<=0)
			return false;
		if(z_distantna.getNaponskaRazina()<=0)
			return false;
		
		
		return true;
	}
	public static void main(String[] args) {
		//SETTING VALUES

	}

}
