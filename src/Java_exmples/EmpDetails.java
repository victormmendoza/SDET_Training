package Java_exmples;

public class EmpDetails {
	public void input() {
		Encapsulation oo=new Encapsulation();
		oo.setEmpid("test");
		oo.setName("test2");
		oo.setContactno("test3");
		System.out.println(oo.getEmpid());
		System.out.println(oo.getName());
		System.out.println(oo.getContactno());
	}
	public static void main (String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.input();
	}
}
