/* This program is used to demonstrate the use of static block
// static block  is used to initialize the static variables 
// There can be many static blocks in one class
// The runtime system guarantees that static initialization blocks are called in order that they appear in
   the source code
// @author vishva patel
   Editor Sublime text 3
   github repo "vishvapatel/java_programs" 
*/
class static_block_demo{
	static int variable_1;  //declaring the static instance variable 
	//Starting the static block
	static{   
		variable_1=5; //initialization of static variable 
		System.out.println(variable_1); //printing the variable to console
	}
}
class static_block{
	public static void main(String args[]){
		static_block_demo st=new static_block_demo();//creating object to call the class static_block_demo.
	}
}