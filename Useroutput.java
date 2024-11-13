public class Useroutput{
    public static void main(String[] args){
        //standard output 
        //continuous printing
        System.out.println("This");
        System.out.println("is");
        System.out.println("Javs\n");

        //line break after printing
        System.out.println("Next print will start from next line");
        
        //priny usong formatting
        //%f floating point. %d integral. % string(any)
        System.out.printf("The value of pi is %f\n",3.14);
        //can use multiple placeholder
        System.out.printf("The value of pi is %f and value of e is %f",30,24);
        //the arrangement of the placeholder and value given after string must match
    }
}

