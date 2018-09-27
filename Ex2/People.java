public class People {

     String name, nationality;
     int age;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getNationality() { return nationality; }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String toString() { return "Name: " + getName() + "\n" + "Age: " + getAge() + "\n" + "Nationality: " + getNationality() + "\n";
    }

    public People() {
        this("Unknown", 3,"Unknown");
    }

    public People(String name, int age, String nationality) {
        this.name = "Joe";
        this.age = '6';
        this.nationality = "American";
    }
}
