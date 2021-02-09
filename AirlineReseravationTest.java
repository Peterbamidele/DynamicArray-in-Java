package AirlineReservationwitMain;

public class AirlineReseravationTest {
    public static void main(String[] args) {
        AirlineReseravation airlineReseravation = new AirlineReseravation();// adding elements at index 0 and 1

        // adding elements at index 0 and 1
        airlineReseravation.addElement(1);
        airlineReseravation.addElement(2);
        System.out.println("Size :"+airlineReseravation.size()+
                " and Capacity :"+airlineReseravation.capacity());

        airlineReseravation.addElement(3);
        System.out.println("Size :"+airlineReseravation.size()+
                " and Capacity :"+airlineReseravation.capacity());
        airlineReseravation.printElements();


        System.out.println("Add element at index 1");


        // add element at index 1
        airlineReseravation.addElement(1,5);
        System.out.println("Size :"+airlineReseravation.size()+
                " and Capacity :"+airlineReseravation.capacity());
        airlineReseravation.printElements();


        System.out.println("Add element at index 2");

        // add element at index 2
        airlineReseravation.addElement(2,6);
        System.out.println("Size :"+airlineReseravation.size()+
                " and Capacity :"+airlineReseravation.capacity());
        airlineReseravation.printElements();


        System.out.println("Remove");

        airlineReseravation.remove(2);
        System.out.println("Size :"+airlineReseravation.size()+
                " and Capacity :"+airlineReseravation.capacity());
        airlineReseravation.printElements();

        airlineReseravation.remove(2);
        System.out.println("Size :"+airlineReseravation.size()+
                " and Capacity :"+airlineReseravation.capacity());
        airlineReseravation.printElements();



        // Trim the array
        airlineReseravation.trimToSize();
        System.out.println("Size :"+airlineReseravation.size()+
                " and Capacity :"+airlineReseravation.capacity());
        airlineReseravation.printElements();
        airlineReseravation.addElement(2);
        System.out.println("Size :"+airlineReseravation.size()+
                " and Capacity :"+airlineReseravation.capacity());
        airlineReseravation.printElements();
        airlineReseravation.addElement(3);
        System.out.println("Size :"+airlineReseravation.size()+
                " and Capacity :"+airlineReseravation.capacity());
        airlineReseravation.printElements();



    }


}
