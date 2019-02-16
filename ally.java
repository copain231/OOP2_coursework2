  import java.util.ArrayList;
import java.util.Scanner;

public class ally {

	public static void main(String[] args) {
	 System.out.println("enter students(enter exist when down)");
ArrayList<String> name=new ArrayList<String>( );
ArrayList<String> course=new ArrayList<String>( );
ArrayList<Double> marks=new ArrayList<Double>( );

int n=1;
Double avg,sum=null;
while(true) {
	System.out.println("enter student"+n+":");
	String names=new Scanner(System.in).nextLine();
	int c=1;
	while(c<=3) {
		System.out.println("enter course"+c+":");
		String course1=new Scanner(System.in).nextLine();
		System.out.println("enter marks: ");	
	Double mark =new Scanner(System.in).nextDouble();
	sum=mark+mark+mark;
	if(names.toLowerCase().equals("exit"))
		break;
	else
	name.add(names);
	course.add(course1);
	marks.add(mark);
	c++;
	}
	System.out.println(marks);
	System.out.println("sum ="+sum);
	avg=sum/3;
	System.out.println("avg ="+avg);
	if(avg>=80 && avg<100) {
		System.out.println("GBA = 5.0");
	}else {
		if(avg>=70 && avg<85) {
			System.out.println("GBA = 4.0");
		}else {
			if(avg>=60 && avg<75){
				System.out.println("GBA = 3.0");
			}else {
				if(avg>=50 && avg<65){
					System.out.println("GBA = 2.0");
				}else {
					if(avg>=70 && avg<55){
						System.out.println("fail");
						
					}
				}
			}
		}
	}
	n++;	
		}
	}
	
}


