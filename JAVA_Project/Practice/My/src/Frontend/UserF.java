package Frontend;

import Backend.User;

public class UserF {

    public static void main(String[] args) {

        User obj = new User(1, "a", 123, "new", 48);
        User obj1 = new User(1, "v", 100, "new", 48);
        User obj2 = new User(1, "s", 130, "new", 48);
        User obj3 = new User(1, "ss", 30, "new", 48);
        User obj4 = new User(1, "e", 200, "new", 48);
        User obj5 = new User(1, "y", 11, "new", 48);

        User arr[] = new User[6];
        arr[0] = obj;
        arr[1] = obj1;
        arr[2] = obj2;
        arr[3] = obj3;
        arr[4] = obj4;
        arr[5] = obj5;

//        for (UserF x : arr) {
//            if (x.getPrice() >= 100) {
//                System.out.println(x.getPrice());
//            }
//        }
        
//        for (UserF x : arr) {
//            String temp = x.getProduct();
//            String temp2 = temp.charAt(0)
//            temp.equalsIgnoreCase("s")
//        }
        for(User x : arr){
            char str = x.getProduct().charAt(0);
            if(str == 's'){
                System.out.println(x.getProduct());
            }
        }
    }
}
