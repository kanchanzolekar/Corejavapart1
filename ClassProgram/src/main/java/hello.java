
public class hello {

	public static void main(String[] args) {
	System.out.println("hello");
	System.out.println();
	
	
	
	class Emp
	{
	private int empid;
	private String name;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	}
	public class Testn {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Emp e1=new Emp();
			e1.setEmpid(121);
			e1.setName("xyz");
			System.out.println(e1.getEmpid());
			System.out.println(e1.getName());

		}

	}
	}

}
