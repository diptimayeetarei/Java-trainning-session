package Oopsconceptpart2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bmw obj=new Bmw();
		obj.start();//bmw
		obj.safety();//bmw
		//whenebver a method is common in parent class and
		//as well as in child class there preference will be given to child class method
	//when same method is present in parent class as well as in child class with same name and same number of arguments is caale as method overriding
		obj.stop();//first it will check bmw class as it is not there as it inherited from Car class it will invoke that function from Car class
		obj.refuel();
		//top casting
		Car c1=new Bmw();//Child class object can be reffered by parent class reference variable -dynamic and runtime polymorphisim
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.safety();//error
		//down casting
		Bmw c2=(Bmw) new Car();
		
	}

}
