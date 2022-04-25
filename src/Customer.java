public class Customer {
        private String name;
        private int age;
        
        /** Constructors */
        public Customer(String n, int a) {
                name = n;
                age = a;
        }
        public Customer(Customer c) {
                name = c.getName();
                age = c.getAge();
        }
        
        /** Utility */
        public String toString() {
                return name +", " +age +"y/o";
        }
        
        /** Accessors */
        public String getName() {
                return name;
        }
        public int getAge() {
                return age;
        }
        
        /** Mutators */
        public void setName(String n) {
                name = n;
        }
        public void setAge(int a) {
                age = a;
        }
}