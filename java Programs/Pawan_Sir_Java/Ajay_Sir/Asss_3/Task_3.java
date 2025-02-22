
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

/* WAP to read product details like PID,Pname,pprice and store them in Vector..Read number of 
 * products and all details from user..display all products using foreach,iterator,listiterator and enumeration.*/

class Product {
	int pid;
	String pname;
	int pprice;

	public Product() {

	}

	public Product(int pid, String pname, int pprice) {
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}

	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
}

public class Task_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of data : ");
		int size = Integer.parseInt(sc.nextLine());

		Vector<Product> vec = new Vector<Product>();

		for (int i = 1; i <= size; i++) {
			System.out.printf("Enter the product id %d ", i);
			int pid = Integer.parseInt(sc.nextLine());
			System.out.printf("Enter the product name for %d ", i);
			String pname = sc.nextLine();
			System.out.printf("Enter the product price for %d ", i);
			int pprice = Integer.parseInt(sc.nextLine());
			vec.addElement(new Product(pid, pname, pprice));
		}
		for (Product p : vec) {
			System.out.println(p);
		}
		Iterator<Product> itr = vec.iterator();
		while (itr.hasNext()) {
			Product p = itr.next();
			System.out.println(p);
		}
		ListIterator<Product> li = vec.listIterator();
		while (li.hasNext()) {
			Product p = li.next();
			System.out.println(p);
		}
		
		Enumeration<Product> em = vec.elements();
		while (em.hasMoreElements()) {
			Product p = em.nextElement();
			System.out.println(p);
		}
	}
}