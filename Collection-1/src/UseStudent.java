import java.util.ArrayList;

public class UseStudent {
	public static void main (String[] args) {
		Student s1=new Student("Harish",26,true,143,true);
		Student s2=new Student("Gowdhaman",35,false,5728,true);
		Student s3=new Student("Varshini",27,true,628,false);
		Student s4=new Student("Sowmya",22,true,782,false);
		Student s5=new Student("Hari",32,true,8738,true);
		
		ArrayList<Student>stdDetails=new ArrayList<>();
		stdDetails.add(s1);
		stdDetails.add(s2);
		stdDetails.add(s3);
		stdDetails.add(s4);
		stdDetails.add(s5);
		
		System.out.println(stdDetails);
		System.out.println(" ");
		System.out.println(stdDetails.get(0).getAge());
		System.out.println(" ");
	
		int max=0;
		String name=" ";
		for(int i=0; i<stdDetails.size(); i++) {
			if(stdDetails.get(i).getAge()>max) {
				max=stdDetails.get(i).getAge();
				name=stdDetails.get(i).getName();
			}
		}
		System.out.println(name);
		System.out.println(" ");
		
		int max1=0;
		String maxFemaleName=" ";
		for(Student x:stdDetails) {
			if(x.getAge()>max1 && x.getIsMale()==false) {
				max1=x.getAge();
				maxFemaleName=x.getName();
			}
		}
		System.out.println(maxFemaleName);
		System.out.println(" ");
		
		ArrayList<Student>femaleDetails=new ArrayList<>();
		
		for(Student x:stdDetails) {
			if(x.getIsMale()==false) {
				femaleDetails.add(x);	
			}
		}
		System.out.println(femaleDetails);
	
	}

}
