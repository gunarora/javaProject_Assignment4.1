package javaProject_Assignment4; //Package declaration is mandatory

//Assignment is for  Method Overloading and Method Overriding.
/*Write a program to demonstrate the use of method overloading and method overriding.*/

//Class started
public class MethodOverloadingOverriding {

	//Declaring method - with 2 parameters
	public void Add(int a,int b)
	{
		//print the sum
		System.out.println(a+b);
	}
	
	//Declaring method - with 3 parameters
	public void Add(int a,int b, int c)
	{
		//print the sum
		System.out.println(a+b+c);
	}
	
	//Declaring method - with different parameters type
	public void Add(int a,double b)
	{
		//print the sum
		System.out.println(a+b);
	}
	
	//Main method started
	public static void main(String[] args) {
		//Object creation of class to call methods
		MethodOverloadingOverriding obj = new MethodOverloadingOverriding();
		//Calling method - with 2 parameters and sum values
		obj.Add(2,3);
		//Calling method - with 3 parameters and sum values
		obj.Add(2,3,5);
		//Calling method - with different parameters type and sum values
		obj.Add(7, 2.4);
		
		//Creating obj of base class - Vehicle reference and object
		Vehical v = new Vehical();
		Vehical c = new Car(); //Vehicle reference but car object
		v.Wheels(); // runs the method in Vehicle class
		c.Wheels(); // runs the method in Car class

	}

}

//Base class to show Method overriding concepts
 class Vehical{
	 //method
	public void Wheels()
	{
		System.out.println("Vehicals can have two wheels or four wheels.");
	}
}
 
 //Derived class inheriting Base Class (Vehicle)
 class Car extends Vehical{
	 //Overriding of base class method and implement with new definition
	 public void Wheels()
		{
			System.out.println("Car have four wheels.");
		}
 }
