package project2;
import java.util.Scanner;
public class SalarySlipGenerator {
	void salarySlip(String employeeName, double basicSalary) {
		System.out.println("enter employee name:"+employeeName);
		System.out.println("basic salary:"+basicSalary);
		double HRA = basicSalary * 20 / 100;
		double DA = basicSalary * 10 / 100;
		double GrossSalary = basicSalary + HRA + DA;
		System.out.println("HRA(20%):"+HRA);
		System.out.println("DA(10%):"+DA);
		System.out.println(" GrossSalary:"+GrossSalary);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SalarySlipGenerator s=new SalarySlipGenerator();
		
		System.out.println("enter employee name:");
		System.out.println("enter basic salary:");
		String employeename=sc.next();
		double basicsalary=sc.nextDouble();
		s.salarySlip(employeename,basicsalary);		// TODO Auto-generated method stub

	}

}
