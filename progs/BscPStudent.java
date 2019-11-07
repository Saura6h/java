class BscPStudent{
static int num=0;//a variable to count the number of students in bscp
//as it shouldn't be re-initialized for every object and belongs to the class we should keep it static
long enrol_num;// will be different for different objects
public BscPStudent(){
	num++;
	enrol_num=1708058200+num;

}

	public static void main(String[] args) {
		//main is a static method
		BscPStudent bp1=new BscPStudent();
		System.out.println("Enrollment num:"+bp1.enrol_num+"\nnumber of student in BscP:"+num);
		BscPStudent bp2=new BscPStudent();
		System.out.println("Enrollment num:"+bp2.enrol_num+"\nnumber of student in BscP:"+num);
		BscPStudent bp3=new BscPStudent();
		System.out.println("Enrollment num:"+bp3.enrol_num+"\nnumber of student in BscP:"+num);

	}
}