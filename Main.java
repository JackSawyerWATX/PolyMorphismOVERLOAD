class Main {
    public static void main (String[] args){
        add(1,2);
        add(3,4,5);
        add(6.2, 7.4, 8.6);
    }
    public static void add(int first, int second){
        System.out.println(first+second);
    }
    //this is the method overload
    public static void add(int first, int second, int third) {
        System.out.println(first+second+third);
    }
    //more overload
    public static void add(double first, double second, double third) {
        System.out.println(first+second+third);
    }
}