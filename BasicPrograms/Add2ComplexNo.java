// 5.Java Program to Add Two Complex numbers.

package BasicPrograms;

public class Add2ComplexNo {
	
	double real,img;
	Add2ComplexNo(double r,double i)
	{
		this.real=r;
		this.img=i;
	}
	 public static Add2ComplexNo sum(Add2ComplexNo c1, Add2ComplexNo c2) {
	   
	
		 Add2ComplexNo temp = new Add2ComplexNo(0, 0);

	        temp.real = c1.real + c2.real;
	        temp.img = c1.img + c2.img;
	        
	        return temp;
	    }
	public static void main(String[] args) {
		
		Add2ComplexNo c1 = new Add2ComplexNo(2.5, 2);
		Add2ComplexNo c2 = new Add2ComplexNo(1.5, 5.5);
		Add2ComplexNo temp = sum(c1, c2);
	        System.out.printf("val is: "+ temp.real+" + "+ temp.img +"a");
		


}

}

