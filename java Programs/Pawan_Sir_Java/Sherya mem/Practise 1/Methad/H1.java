class Geeks {
    
    Geeks(int a) {

        System.out.println("Constructor Called  " + a);
    }

    public static void main(String[] args) {
        int count = 0;
        Geeks geek = new Geeks(5);
        Geeks geek1 = new Geeks(6);
        Geeks geek2 = new Geeks(7);
        Geeks geek3 = new Geeks(8);
    }
}