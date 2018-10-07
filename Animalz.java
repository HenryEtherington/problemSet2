
public class Animalz {
	
	private String type;
	private String[] continents;
	private int age;
	private double weight;
	
	
	public Animalz()  {
		
		this.type = "No Type Specified";
		this.continents = null;
		this.age = 0;
		this.weight = 0.0;
	}
	
	public Animalz(String type, String[] continents , int age, double weight) {setType(type);
	                                                                           setContinents(continents);
  	                                                                           setAge(age);
	                                                                           setWeight(weight);}		
	public void setType (String type){this.type(type);}
    public void setConinents (String continents){this.continents(continents);}
    public void setAge (int age){this.age(age);}
    public void setWeight (double weight) {this.weight(weight);}
    public String getType(){return type;}
    public String getContinents(){return continents;}
    public int getAge(){return age;}
    public double getWeight(){return weight;}
 
	}
