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
		//Polje1
		Rastavljac r_linijski1 = new Rastavljac(1, "r_linijski1", false, false, 110);
		Rastavljac r_dv1 = new Rastavljac(2, "r_dv1", false, false, 110);
		Rastavljac r_uzemljenje1 = new Rastavljac(3, "r_uzemljenje1", true, false, 110);
		Prekidac prekidac1 = new Prekidac(4, "p1", 110, "ukljucen", false, false, false, 50, false, false,	r_linijski1, r_dv1, r_uzemljenje1);
		ZastitaZatajenjaPrekidaca z_prekidac1 = new ZastitaZatajenjaPrekidaca(5, "z_prekidaca1", 110, false, false,false, false, prekidac1);
		DistantnaZastita z_distantna1 = new DistantnaZastita(6, "z_distantna1", 110, false, false,false,false, prekidac1);
		Apu z_apu1 = new Apu(7, "z_apu1", 110, false, false,false, false, false, prekidac1);
		Polje polje1 = new Polje(true, 110, false, null,8, "polje1", r_uzemljenje1, r_dv1, r_linijski1, z_prekidac1, z_apu1, z_distantna1, prekidac1);
		//Setting blocade values
		prekidac1.setZ_apu(z_apu1);
		prekidac1.setZ_distantna(z_distantna1);
		prekidac1.setZ_prekidac(z_prekidac1);
		r_linijski1.setPrekidac(prekidac1);
		r_dv1.setPrekidac(prekidac1);
		r_uzemljenje1.setPrekidac(prekidac1);
		//Setting state again to triegger possible changes
		prekidac1.setStanje(prekidac1.getStanje());
		r_linijski1.setStanje(r_linijski1.getStanje());
		r_dv1.setStanje(r_dv1.getStanje());
		r_uzemljenje1.setStanje(r_uzemljenje1.getStanje());
		//Polje2
		Rastavljac r_linijski2 = new Rastavljac(1, "r_linijski2", false, false, 110);
		Rastavljac r_dv2 = new Rastavljac(2, "r_dv2", false, false, 110);
		Rastavljac r_uzemljenje2 = new Rastavljac(3, "r_uzemljenje2", true, false, 110);
		Prekidac prekidac2 = new Prekidac(4, "p2", 110, "ukljucen", false, false, false, 50, false, false,	r_linijski2, r_dv2, r_uzemljenje2);
		ZastitaZatajenjaPrekidaca z_prekidac2 = new ZastitaZatajenjaPrekidaca(5, "z_prekidaca2", 110, false, false,false, false, prekidac2);
		DistantnaZastita z_distantna2 = new DistantnaZastita(6, "z_distantna2", 110, false, false,false,false, prekidac2);
		Apu z_apu2 = new Apu(7, "z_apu2", 110, false, false,false, false, false, prekidac2);
		Polje polje2 = new Polje(true, 110, false, null,8, "polje2", r_uzemljenje2, r_dv2, r_linijski2, z_prekidac2, z_apu2, z_distantna2, prekidac2);
		//Setting blocade values
		prekidac2.setZ_apu(z_apu2);
		prekidac2.setZ_distantna(z_distantna2);
		prekidac2.setZ_prekidac(z_prekidac2);
		r_linijski2.setPrekidac(prekidac2);
		r_dv2.setPrekidac(prekidac2);
		r_uzemljenje2.setPrekidac(prekidac2);
		//Setting state again to triegger possible changes
		prekidac2.setStanje(prekidac2.getStanje());
		r_linijski2.setStanje(r_linijski2.getStanje());
		r_dv2.setStanje(r_dv2.getStanje());
		r_uzemljenje2.setStanje(r_uzemljenje2.getStanje());
		
		TransformatorskaStanica Tr = new TransformatorskaStanica(true, false, false, 17,"Tr", polje1, polje2);
		//CHECKING EVERYTHING
		
		//RUNNING

		prekidac1.printAll();
		System.out.println("Done.");
	}

}
