class overload{  //creating class overload
	double length,radius,breadth,area,height;
	overload(double l,double b){  //constructor for area of ractangle
        this.length=l;
        this.breadth=b;
        area=length*breadth;
        System.out.println("The area of rectangle is :"+area);
	}
	overload(double l){ //constructro for area  of Square
		this.length=l;
		area=length*length;
		System.out.println("The srea of square is :"+area);
	}
	overload(double r,double h,double pi){ //constructor for area of cylinder
        this.radius=r;
        this.height=h;
        area=2*pi*radius*radius*height;
        System.out.println("The area of cylinder is :"+area);
	}
}
class area{ //class area _main_ class
	public static void main(String args[]){
		overload rectangle,square,cylinder; //declaring objects for rectangle,square,cylinder.
		cylinder=new overload(10,20,3.145); //calling cylinder constructor
		square=new overload(10); //calling square constructor
		rectangle=new overload(100,59);//calling rectangle constructor
	}
}