import java.util.ArrayList;

public class Employee {
	public static void main(String[] args) {
		ArrayList<Integer> empId = new ArrayList<>();
		empId.add(534);
		empId.add(535);
		empId.add(536);
		empId.add(537);
		empId.add(538);

		// empId.set(0, 584);
		// empId.set(1, 597);
		// empId.set(4, 672);
		// empId.remove(3);
		// System.out.println(empId);
		// System.out.println(empId.get(0));
		// System.out.println(empId.get(1));
		// System.out.println(empId.get(4));
		// for loop
		/*
		 * for (int i = 0; i < empId.size(); i++) {
		 *  System.out.println(empId.get(i)); 
		 *  
		 *  }
		 * System.out.println(" ");
		 * 
		 * // Enhanced for loop
		 * 
		 * for (Integer k : empId) { System.out.println(k); }
		 * 
		 * System.out.println(" "); // fro Each lambda
		 * 
		 * empId.forEach((x) -> System.out.println(x));
		 */
		for(int i=0; i<empId.size(); i++) {
			if(empId.get(i)%2==0) {
				System.out.println(empId.get(i));
			}
		}
		
		System.out.println(" ");
		
		for(Integer k: empId) {
			if(k%2==0) {
				System.out.println(k);
			}
		}
		
		System.out.println(" ");
		
		empId.forEach((x)->{
			if(x%2==0) {
				System.out.println(x);
			}
		});
	
	}	

}
