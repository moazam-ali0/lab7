class employee{
	float sallery=10000;
	float calculatesallery(){
	return sallery;}
	
}
class manager extends employee{
	float calculatesallery(){
	return sallery+5000;}
	
}
class worker extends employee{
	float calculatesallery(){
	return  sallery+2000;}
	
	
}
class sallery{
	public static void main(String args[]){
		employee p1=new employee();
		manager p2=new manager();
		worker p3=new worker();
		
		System.out.println("manager sallery:"+ p2.calculatesallery());
		System.out.println("employee sallery:"+ p1.calculatesallery());
		System.out.println("worker sallery:"+ p3.calculatesallery());
		
		
	
	}
}