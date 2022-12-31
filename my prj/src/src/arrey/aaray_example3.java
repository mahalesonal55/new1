package arrey;

public class aaray_example3 {  
	
// declaration initialization in one line
	
	int a[]=new int [100];
	static int b[]=new int [50];
	public static int []c={10,20,30,40,50};      //this is also declaration and initialization in one goal(another way)
	
	
	
		
	public static void main(String[] args) {
	
	aaray_example3 obj=new aaray_example3();
	System.out.println(obj.a.length);

	System.out.println(b.length);
	System.out.println(c.length);
	
	
	
	
	//2nd way of used for loop 
	//used for each loop -it has only two parameter
	//it is used for each and every element iterate
	
	for (int i:obj.a){
		System.out.println("value of i" + i + "=" + obj.a[i]);	
	}
	
	for (int i:b){
		System.out.println(b[i]);
	}

	
    for(int i:c){
    	System.out.println(i);
    	}
   /* for(int i=0;i<=4;i++){
    	System.out.println("value of i" + i + "=" + obj.c[i]);
    }
	*/
	
	
	
	}
}