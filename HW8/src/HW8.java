public class HW9 {

    /*Question 13.4
        Answer:
        Number numberRef = new Integer(0);
        Double doubleRef = Double.valueOf(numberRef.doubleValue());

      Question 13.5
        Answer:
        Number[] numberArray = new Number[2];
        numberArray[0] = new Double(1.5);

      Question 13.7
        Answer:
        Integer x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));

      Question 13.8
        Answer:
        Number x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(((Integer)x).compareTo(new Integer(4)));

      Question 13.16
        Answer:
        interface A {
            void m1();
        }

        class B implements A {
            public void m1() {
                System.out.println("m1");
            }
        }

      Question 13.19
        Answer:
        Integer n1 = new Integer(3);
        Object n2 = new Integer(4);
        System.out.println(n1.compareTo((Integer)n2));

       Question 13.21
         Answer:
         public class Test {
            public static void main(String[] args) {
                Person[] persons = {new Person(3), new Person(4), new Person(1)};
                java.util.Arrays.sort(persons);
            }
        }
        class Person implements Comparable<Person> {
            private int id;

            Person(int id) {
               this.id = id;
            }

            public int getId() {
               return id;
             }

             @Override
             public int compareTo(Person other) {
               return Integer.compare(this.id, other.id);
             }
        }

        Question 13.26
        Answer:
        public class Test {
            public static void main(String[] args) {
                GeometricObject x = new Circle(3);
                GeometricObject y = x.clone();
                System.out.println(x == y);
            }
        }
        class GeometricObject implements Cloneable {
            @Override
            public GeometricObject clone() {
                return (GeometricObject) super.clone();
            }
        }



     */

}
