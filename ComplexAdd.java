import java.util.Scanner;

class ComplexNo{
	private int real;
	private int img;
	
	public ComplexNo(){ 
        real = img = 0;
    }
	public ComplexNo(int real, int img){
		this.real = real;
		this.img = img;
	}
	
	public void setReal(int real){this.real = real;}
	public void setImg(int img){this.img = img;}
	
	public int getReal(){return real;}
	public int getImg(){return img;}
	
	public void display(){System.out.println(real+"+"+img+"i");}
	
	public ComplexNo add(ComplexNo obj){
		int temp1 = real;
		int temp2 = img;
		temp1 += obj.real;
		temp2 += obj.img;
		return new ComplexNo(temp1, temp2);
	} 
	public ComplexNo sub(ComplexNo obj){
		int temp3 = real;
		int temp4 = img;
		temp3 = temp3 - obj.real;
		temp4 = temp4 - obj.img;
		return new ComplexNo(temp3, temp4);
	} 

}

class ComplexAdd{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Real and Imaginary value for first complex number: ");
		int real = sc.nextInt();
		int img = sc.nextInt();
		ComplexNo cn = new ComplexNo(real, img);
		cn.display();
		System.out.print("Enter Real and Imaginary value for second complex number: ");
		int real1 = sc.nextInt();
		int img1 = sc.nextInt();
		ComplexNo cn1 = new ComplexNo(real1, img1);
		cn1.display();
		ComplexNo obj1 = new ComplexNo();
		obj1 = cn.add(cn1);
		System.out.print("Result for addition of two given complex number : ");
		obj1.display();
	    ComplexNo obj2 = new ComplexNo();
		obj2 = cn.sub(cn1);
		System.out.print("Result for subtraction of two given complex number : ");
		obj2.display();				
	}
}