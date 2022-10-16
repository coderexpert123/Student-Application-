import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.studentapi.managemnt.Student;
import com.studentapi.managemnt.studentDao;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to CRUD Student app !");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("Press 1 to Add");
			System.out.println("Press 2 to Delete");
			System.out.println("Press 3 to Display");
			System.out.println("Press 1 to Update");
			
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add
				System.out.println("Enter Name ");
				String sname=br.readLine();
				
				System.out.println("Enter Phone ");
				String sphone=br.readLine();
				
				System.out.println("Enter City ");
				String scity=br.readLine();
				
				Student st=new Student(sname,sphone,scity);
				boolean ans=studentDao.inserttodb(st);
				if(ans) {
					System.out.println("Data Added ");
				}
				else {
					System.out.println("Some error ");
				}
				
				
			}
			else if(c==2) {
				//delete
				System.out.println("Enter User Id ");
				int uid=Integer.parseInt(br.readLine());
				
				boolean fa=studentDao.deletest(uid);
				if(fa) {
					System.out.println("Data Deleted");
				}else {
					System.out.println("Something went wrong");
				}
			 
				
			}
			else if(c==3) {
				//Display 
				 studentDao.showallstu();
				
			
			}
			else if(c==4) {
				//exit
				break;
				
			}else {
				//choice wrong here ....
			}
		}
		System.out.println("Thanks for using the appliaction !!");


	}

}
