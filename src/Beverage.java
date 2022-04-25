public abstract class Beverage {
        private String name;
        private Type type;
        private Size size;
        private final double BASE_PRICE = 2.0;
        private final double SIZE_PRICE = 1.0;
        
        /** Constructors */
        public Beverage(String n, Type t, Size s) {
                name = n;
                type = t;
                size = s;
        }
                
        /** Utility */
        public abstract double calcPrice();

        public String toString() {
                return name +", " +size;
        }
        public boolean equals(Beverage bev) {
                if (name.equals(bev.getBevName()) && type==bev.getTYPE() && size==bev.getSIZE()) {
                        return true;
                }
                else {
                        return false;
                }
        }
        
        /** Accessors */
        public String getBevName() {
                return name;
        }
        public Type getTYPE() {
                return type;
        }
        public Size getSIZE() {
                return size;
        }
        public double getBasePrice() {
                return BASE_PRICE;
        }
        public double getSizePrice() {
                return SIZE_PRICE;
        }
        
        /** Mutators */
        public void setName(String n) {
                name = n;
        }
        public void setTYPE(Type t) {
                type  = t;
        }
        public void setSIZE(Size s) {
                size = s;
        }
        
}
