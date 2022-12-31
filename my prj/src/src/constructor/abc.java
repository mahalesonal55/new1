package constructor;

public class abc {
	
	
	
	public void methodoverloding(int a,int b){
		System.out.println("i am from methodoverloading");
	}
	public void methodoverloding(short c,short d){
		System.out.println("i am from method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       abc obj=new abc();
       obj.methodoverloding(45,55);
   
	}

}
