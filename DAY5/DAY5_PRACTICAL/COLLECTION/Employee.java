package COLLECTION;

public class Employee {
private String eid;
private String ename;
private String desig;
private Double sal;
public Employee(String eid,String ename,String desig,Double sal)
{
	this.eid=eid;
	this.ename=ename;
	this.desig=desig;
	this.sal=sal;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public Double getSal() {
	return sal;
}
public void setSal(Double sal) {
	this.sal = sal;
}

}
