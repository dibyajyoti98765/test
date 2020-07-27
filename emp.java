class emp{
	String ename;
	long eid;
	long sal;
	String dept;
}
class comp{
	public static void main(String[] args) {
		emp e=new emp();
		e.ename="dibya";
		e.eid=123;
		e.sal=12345678;
		e.dept="manager";
		System.out.println("create 2 new object");
		System.out.println("---------------------");
		System.out.println("display 1st emp details");
		System.out.println("                   ");
		System.out.println("employee name:"+e.ename);
		System.out.println("employee id no.:"+e.eid);
		System.out.println("dibya salary:"+e.sal);
		System.out.println("dibya  dept "+e.dept);
			System.out.println("------------------------");
		System.out.println("                   ");
		emp e2=new emp();
		e2.ename="deba";
		e2.eid=1234;
		e2.sal=123456789;
		e2.dept="product";
		System.out.println("display 2nd emp details");
		System.out.println("                   ");
		System.out.println("employee name:"+e2.ename);
		System.out.println("employee id no.:"+e2.eid);
		System.out.println("deba salary:"+e2.sal);
		System.out.println("deba dept:"+e2.dept);




	}
}