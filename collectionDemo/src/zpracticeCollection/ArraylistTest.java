package zpracticeCollection;

import java.util.ArrayList;


public class ArraylistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		StudentTest st = new StudentTest(1, "manoj", 10, 90, "karaimedu");
		StudentTest st1 = new StudentTest(2, "raja", 10, 95, "chidambaram");
		StudentTest st2 = new StudentTest(3, "alagan", 10, 50, "cudallore");
		
		ArrayList<StudentTest> s = new ArrayList<>();
		
		s.add(st);
		s.add(st2);
		s.add(st1);
		s.add(0, st2);

		System.out.println(s);
		
		for (StudentTest fe : s) {
			System.out.println("id is "+ fe.id +","+ "name is " + fe.name +","+ "standard is " + fe.standard +","+  "mark is " + fe.mark +","+  "location is " + fe.location);
		}
		

		
		
		

	}

}
