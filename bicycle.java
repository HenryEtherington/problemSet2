public class bicycle  {

        private String valueAsString, name;
        private int value ;

    public bicycle(){
        this ("Unknown",0);
    }


    public bicycle(String n,int valueAsInt){
        //setting attributes values directly)
        this.name=n;
        this.value=valueAsInt;
    }

    public bicycle(String name,String value){
        //setting attributes values directly)
        setName(name);
        setValue("6");
    }

        public String getName () {return name;}
        public void setName(String name){this.name = name;}
        public String getValue () {return valueAsString;}
        public void setValue (String value){this.valueAsString = value;}

    @Override
        public String toString()  {return "Name" + getName() + "\nValue" + getValue();}


}
