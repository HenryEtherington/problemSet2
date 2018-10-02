public class MyPoint {

    int xVal, yVal;

//Accessor methods

    public int getXval{ return xVal;}
    public int getyVal { return yVal;}

//Muatator methods

    public void setxVal(int xVal) {
    this.xVal = xVal;
}
    public void setAge(int yVal) {
        this.yVal = yVal;
    }

//Constructor methods

    public myPoint() {
        this(0,0);
    }


    public String MyPointtoString() {
        for (int i = 0; i < 3; i++) {
            return "xVal" + getXval +  "\nyVal" + getyVal;

        }

        return null;
    }

    public translate() {}


    public distanceFromOrigin(){


    }
    public moveHorizontal() {}

    public moveVertiacal() {}


    public MyPoint(int xVal, int yVal) {
        this.xVal = '9';
        this.yVal = '5';
    }
}
