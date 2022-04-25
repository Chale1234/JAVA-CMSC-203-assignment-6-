public class Alcohol extends Beverage{
        private boolean isWeekend;
        private final double WEEKEND_FEE = .6;
        
        /** Constructors */
        public Alcohol(String n, Size s, boolean iw) {
                super(n, Type.ALCOHOL, s);
                isWeekend = iw;
        }
        
        /** Utility */
        public String toString() {
                String s = getBevName() +", " +getSIZE();
                
                if (isWeekend) {
                        s += " Weekend";
                }
                
                s += ", $" +calcPrice();
                
                return s;
        }
        public boolean equals(Alcohol a) {
                if (super.equals(a) && isWeekend == a.getIsWeekend()) {
                        return true;
                }
                else {
                        return false;
                }
        }
        public double calcPrice() {
                double price = super.getBasePrice();
                
                if (super.getSIZE() == Size.Medium) {
                        price += super.getSizePrice();
                }
                else if (super.getSIZE() == Size.Large) {
                        price += 2 * super.getSizePrice();
                }
                
                if (isWeekend) {
                        price += WEEKEND_FEE;
                }
                
                return price; 
        }
        
        /** Accessors */
        public boolean getIsWeekend() {
                return isWeekend;
        }
        public double getWeekendFee() {
                return WEEKEND_FEE;
        }
        
        /** Mutators */ 
        public void setIsWeekend(boolean is) {
                isWeekend = is;
        }
}
