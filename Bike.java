
public class Bike {
	
	private String name, make;
	private double value;
		
	public Bike(){this.name = "Jeff";
	              this.value=12.50;
	              this.make="Bake";}	
	
	
	public Bike (String name , String make, double value)
		         {setName(name);}


	public void setName(String name){this.name = name;}
	public String getName(){return name;}
	public void setValue(double value){this.value = value;}
	public double getValue(){return value;}
	public void setMake(String make){this.make = make;}
	public String getMake(){return make;}

	
//	@Overide
		public String toString(){
			
			double val;

         val = value + 10  ;
   
			return "Name:" + getName() + "\n" + "Value:" + val +
				   "\n" + "Make:" + getMake();
		}	
  }