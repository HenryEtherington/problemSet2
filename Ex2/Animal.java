
public class Animal {


  String  type, continents;
  double weight;
  int age;

//Accessor methods

    public String getType(){ return type;}
    public String getContinents(){return continents;}
    public double getWeight(){return weight;}
    public int getAge(){return age;}

//Muatator methods

    public void setType(String type) {this.type = type;}
    public void setContinents(String continents) {this.continents = continents;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setAge(int age) {this.age = age;}

//Constructor methods

    public Animal() { this("NoTypeSpeciafied", "null",0.0,0); }

    public Animal(String type, String continents, double weight, int age)
    { this.type = "Monkey";
      this.continents = "Southern France";
      this.weight = '9';
      this.age = '5';}

    public String AnimaltoString() {
        return "Type" + type + "\nContinents" + continents + "\nWeight" + weight + "\nAge" + age; }
  }

