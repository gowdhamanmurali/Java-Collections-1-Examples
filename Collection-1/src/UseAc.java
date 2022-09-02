import java.util.ArrayList;

public class UseAc {
	public static void main (String[]args) {
		Ac ac1=new Ac("VOLTAS",35000,true);
		Ac ac2=new Ac("TATA",27000,false);
		Ac ac3=new Ac("CARRIER",39000,true);
		Ac ac4=new Ac("HITACHI",44000,false);
		Ac ac5=new Ac("O'GENERAL",55000,true);
		Ac ac6=new Ac("ONIDA",26000,false);
		Ac ac7=new Ac("LG",59000,true);
		Ac ac8=new Ac("SAMSUNG",72000,true);
		
		ArrayList<Ac>ac=new ArrayList<>();
		ac.add(ac1);
		ac.add(ac2);
		ac.add(ac3);
		ac.add(ac4);
		ac.add(ac5);
		ac.add(ac6);
		ac.add(ac7);
		ac.add(ac8);
		
			System.out.println(ac);
			
			System.out.println(" ");
		
		for(int i=0; i<ac.size(); i++) {
			System.out.println(ac.get(i));	
		}
		
		System.out.println(" ");
		
		
		for(Ac x:ac) {
			System.out.println(x);
		}
		
		System.out.println(" ");
		
		ac.forEach((x)->System.out.println(x));
		
		System.out.println(" ");
		
		ArrayList<Ac>acs=new ArrayList<>();
		
		for(Ac x:ac) {
			if(x.getIsInverted()==true) {
				acs.add(x);
			}
		}
		System.out.println(acs);
		
		System.out.println(" ");
		
		ArrayList<Ac>acs1=new ArrayList<>();
		
		ac.forEach((x)->{
			if(x.getIsInverted()==false) {
				acs1.add(x);
			}
		});
		System.out.println(acs1);
			
		
		
	}
	

}
