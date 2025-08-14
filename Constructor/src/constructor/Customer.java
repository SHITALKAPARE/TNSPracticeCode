package constructor;

public class Customer {
	// default constructor

		public Customer()
		{
			System.out.println("Default constructor");
		}
		
		//Parameterized constructor
		
		public Customer(int id, String name, int age)
		{
			System.out.println("Parametrized constructor");
			System.out.println(id+" "+name+ " "+age);
		}
		public static void main(String[] args) {
		}

	}



