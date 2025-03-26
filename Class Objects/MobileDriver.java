class MobileDriver
{
	public static void main(String[] args)
	 {
	
	Mobile m1= new Mobile();       //iphone
	System.out.println("-----------------------------------------------------");
	System.out.println(m1);
	 m1.Brand="Apple";
     m1.Model="i-Phone 16 pro";
     m1.Ram= 16;
     m1.Rom= 1 ;
     m1.Camera= 3;
     m1.Price=150000;

	System.out.println("Brand: "+m1.Brand);
	System.out.println("Model: "+m1.Model);
	System.out.println("Ram: "+m1.Ram);
	System.out.println("Rom: "+m1.Rom);
	System.out.println("Camera: "+m1.Camera);
	System.out.println("Price: "+m1.Price);
    System.out.println("---------------------------------------------------");

    Mobile m2= new Mobile();      //Samsung
	 m2.Brand="Samsung";
     m2.Model="S250 pro";
     m2.Ram= 16;
     m2.Rom= 512;
     m2.Camera= 5;
     m2.Price=125000;

	System.out.println(m2);

	System.out.println("Brand: "+m2.Brand);
	System.out.println("Model: "+m2.Model);
	System.out.println("Ram: "+m2.Ram);
	System.out.println("Rom: "+m2.Rom);
	System.out.println("Camera: "+m2.Camera);
	System.out.println("Price: "+m2.Price);
    System.out.println("---------------------------------------------------");

	Mobile m3= new Mobile();     //Redmi
     m3.Brand="Redmi";
     m3.Model="Redmi Note 15 pro";
     m3.Ram= 8;
     m3.Rom= 250;
     m3.Camera= 3;
     m3.Price=15000;

	System.out.println(m3);

	System.out.println("Brand: "+m3.Brand);
	System.out.println("Model: "+m3.Model);
	System.out.println("Ram: "+m3.Ram);
	System.out.println("Rom: "+m3.Rom);
	System.out.println("Camera: "+m3.Camera);
	System.out.println("Price: "+m3.Price);
	System.out.println("---------------------------------------------------");

	}
}



/*                                     O/P


C:\Users\Admin\Documents\GitHub\Core-Java\Class Objects>javac MobileDriver.java

C:\Users\Admin\Documents\GitHub\Core-Java\Class Objects>java MobileDriver
-----------------------------------------------------
Mobile@7a81197d
Brand: Apple
Model: i-Phone 16 pro
Ram: 16
Rom: 1
Camera: 3
Price: 150000.0
---------------------------------------------------
Mobile@2f2c9b19
Brand: Samsung
Model: S250 pro
Ram: 16
Rom: 512
Camera: 5
Price: 125000.0
---------------------------------------------------
Mobile@31befd9f
Brand: Redmi
Model: Redmi Note 15 pro
Ram: 8
Rom: 250
Camera: 3
Price: 15000.0
---------------------------------------------------

C:\Users\Admin\Documents\GitHub\Core-Java\Class Objects>



*/