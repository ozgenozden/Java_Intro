
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager= new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		////// ValueType /////////////////
		int number1=10;
		int number2=20;
		number2=number1;
		
		
		
		number1=30;
		System.out.println("Number2 value "+number2); // number2 = 10
		/////////////////////////////////
		
		//////// ReferanceType /////////////////////
		int[] numbers1=new int[] {1,2,3};
		int[] numbers2=new int[] {4,5,6};
		
		
		numbers2=numbers1;
		
		numbers1[0]=34;
		
		System.out.println("first value of numbers2 "+ numbers2[0]);
		System.out.println();
		
		//////////////////////////////////////
		

	}

}
