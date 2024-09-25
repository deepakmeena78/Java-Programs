interface employee{
    void getdata();
    void showdata();
}

public class Practice3 {
    public static void main(String[] args) {
        employee obj= new employee(){
            public void showdata()
            {
                System.out.println("showdata");

            }
            public void getdata(){
                System.out.println("getdata");
            }
        };
        obj.getdata();
    
        
}
}

