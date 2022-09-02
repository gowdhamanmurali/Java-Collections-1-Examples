import java.util.ArrayList;

public class UsePen {
	public static void main (String[]args) {
		Pen p1=new Pen("ABC",638,10,"black");
		Pen p2=new Pen("Gopi",59,5,"blue");
		Pen p3=new Pen("DHKE",420,8,"black");
		Pen p4=new Pen("SUR",500,15,"blue");
		Pen p5=new Pen("KLNDI",300,12,"black");
		Pen p6=new Pen("HARISH",250,6,"blue");
		Pen p7=new Pen("KWOLWO",270,20,"black");
		
		ArrayList<Pen>pen=new ArrayList<>();
		pen.add(p1);
		pen.add(p2);
		pen.add(p3);
		pen.add(p4);
		pen.add(p5);
		pen.add(p6);
		pen.add(p7);
		
		System.out.println(pen);
		System.out.println(" ");
		
		ArrayList<Pen>blackPen=new ArrayList<>();
		
		for(Pen x:pen) {
			if(x.getColor()=="black") {
				blackPen.add(x);	
			}
		}
		System.out.println(blackPen);
		System.out.println(" ");
		
		ArrayList<Pen>bluePen=new ArrayList<>();
		
		for(Pen x:pen) {
			if(x.getColor()=="blue") {
				bluePen.add(x);
			}
		}
		System.out.println(bluePen);
		System.out.println(" ");
		
		int max=0;
		String name="";
		for(Pen x:blackPen) {
			if(x.getPrice()>max) {
				max=x.getPrice();
				name=x.getBrand();
				
			}
		}
		System.out.println(name.charAt(name.length()/2));
		System.out.println(" ");
		
		int max1=0;
		String name1="";
		for(Pen x:bluePen) {
			if(x.getBrand().length()>max1) {
				max1=x.getBrand().length();
				name1=x.getBrand();
			}
			
		}
		System.out.println(name1.substring(1, name1.length()-1));
		
	}
	

}
