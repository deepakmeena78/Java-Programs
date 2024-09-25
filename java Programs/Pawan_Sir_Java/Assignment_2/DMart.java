import java.util.Scanner;

class DMart {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name");
		String name = sc.next();

		System.out.println("Enter Gender");
		String gender = sc.next();

		System.out.println("Today Date");
		String date = sc.next();

		System.out.println("Item Name");
		String item1 = sc.next();

		System.out.println("Enter Quantity");
		double q1 = sc.nextInt();

		System.out.println("Enter Price");
		double p1 = sc.nextInt();

		System.out.println("Item Name");
		String item2 = sc.next();

		System.out.println("Enter Quantity");
		double q2 = sc.nextInt();

		System.out.println("Enter Price");
		double p2 = sc.nextInt();

		System.out.println("Item Name");
		String item3 = sc.next();

		System.out.println("Enter Quantity");
		double q3 = sc.nextInt();

		System.out.println("Enter Price");
		double p3 = sc.nextInt();

		System.out.println("Item Name");
		String item4 = sc.next();

		System.out.println("Enter Quantity");
		double q4 = sc.nextInt();

		System.out.println("Enter Price");
		double p4 = sc.nextInt();

		System.out.println("Item Name");
		String item5 = sc.next();

		System.out.println("Enter Quantity");
		double q5 = sc.nextInt();

		System.out.println("Enter Price");
		double p5 = sc.nextInt();

		System.out.println("Item Name");
		String item6 = sc.next();

		System.out.println("Enter Quantity");
		double q6 = sc.nextInt();

		System.out.println("Enter Price");
		double p6 = sc.nextInt();

		System.out.println("Item Name");
		String item7 = sc.next();

		System.out.println("Enter Quantity");
		double q7 = sc.nextInt();

		System.out.println("Enter Price");
		double p7 = sc.nextInt();

		System.out.println("Item Name");
		String item8 = sc.next();

		System.out.println("Enter Quantity");
		double q8 = sc.nextInt();

		System.out.println("Enter Price");
		double p8 = sc.nextInt();

		System.out.println("Item Name");
		String item9 = sc.next();

		System.out.println("Enter Quantity");
		double q9 = sc.nextInt();

		System.out.println("Enter Price");
		double p9 = sc.nextInt();

		System.out.println("Item Name");
		String item10 = sc.next();

		System.out.println("Enter Quantity");
		double q10 = sc.nextInt();

		System.out.println("Enter Price");
		double p10 = sc.nextInt();

		System.out.println("Carry Bag y , n");
		char bag = sc.next().charAt(0);

		double finaldiscount = 0, discount1 = 0, total2 = 0, disecond = 0, discount1equal = 0;
		double quantity = (q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9 + q10);
		double total = (q1 * p1) + (q2 * p2) + (q3 * p3) + (q4 * p4) + (q5 * p5) + (q6 * p6) + (q7 * p7) + (q8 * p8)
				+ (q9 * p9) + (q10 * p10);
		double gst = (total * 10) / 100;

		System.out.println("\t\t\t\t  D-Mart");
		System.out.println(" NAME :" + name + "\t\t\t\t\t\t\tDate : " + date);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Item Name\t\tQty.\t\tPrice\t\tTotal\t\tDiscount");
		System.out
				.println(item1 + "\t\t\t" + q1 + "\t\t100" + "\t\t" + (100 * q1) + "\t\t" + (((100 * q1) * q1) / 100));
		System.out
				.println(item2 + "\t\t\t" + q2 + "\t\t200" + "\t\t" + (200 * q2) + "\t\t" + (((200 * q2) * q2) / 100));
		System.out
				.println(item3 + "\t\t\t" + q3 + "\t\t300" + "\t\t" + (300 * q3) + "\t\t" + (((300 * q3) * q3) / 100));
		System.out
				.println(item4 + "\t\t\t" + q4 + "\t\t450" + "\t\t" + (450 * q4) + "\t\t" + (((450 * q4) * q4) / 100));
		System.out
				.println(item5 + "\t\t\t" + q5 + "\t\t150" + "\t\t" + (150 * q5) + "\t\t" + (((150 * q5) * q5) / 100));
		System.out
				.println(item6 + "\t\t\t" + q6 + "\t\t100" + "\t\t" + (100 * q6) + "\t\t" + (((100 * q6) * q6) / 100));
		System.out
				.println(item7 + "\t\t\t" + q7 + "\t\t200" + "\t\t" + (200 * q7) + "\t\t" + (((200 * q7) * q7) / 100));
		System.out
				.println(item8 + "\t\t\t" + q8 + "\t\t350" + "\t\t" + (350 * q8) + "\t\t" + (((350 * q8) * q8) / 100));
		System.out
				.println(item9 + "\t\t\t" + q9 + "\t\t250" + "\t\t" + (250 * q9) + "\t\t" + (((250 * q9) * q9) / 100));
		System.out.println(
				item10 + "\t\t\t" + q10 + "\t\t100" + "\t\t" + (100 * q10) + "\t\t" + (((100 * q10) * q10) / 100));
		if (quantity >= 50) {
			discount1 = (total * 15) / 100;
			discount1equal = discount1equal + discount1;
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("item = " + 10 + "\t\t" + quantity + "\t\t2200\t\t" + total + "\t\t" + discount1);
			System.out.println("Purchase +50 Items Off 15 %");
		} else if (quantity >= 40) {
			discount1 = (total * 10) / 100;
			discount1equal = discount1equal + discount1;
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("item = " + quantity + "\t\t" + quantity + "\t\t2200\t\t" + total + "\t\t" + discount1);
			System.out.println("Purchase +40 Items Off 10 %");
		} else if (quantity >= 1) {
			discount1 = (total * 5) / 100;
			discount1equal = discount1equal + discount1;
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("item = " + quantity + "\t\t" + quantity + "\t\t2200\t\t" + total + "\t\t" + discount1);
			System.out.println("Purchase 1 To 40 Items Off 5 %");
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\tA.P.\t\t\tD.P.");
		System.out.println("\t\t\t\t\t" + total + "\t\t\t" + discount1equal);

		if (gender.equals("female")) {
			System.out.println("Free Gift Cadeberry\t\t\t0.00\t\t\t0.00");

		} else if (gender.equals("male")) {
			System.out.println("Free Gift Wallet\t\t\t0.00\t\t\t0.00");

		}
		if (bag == 'y') {
			System.out.println("Carry Bag : yes\t\t\t\t30:00\t\t\t30:00");

		} else if (bag == 'n') {
			System.out.println("Carry Bag :\t\t\t\tNo\t\t\tNo");
		}
		System.out.println("GST(10%)\t\t\t\t" + gst + "\t\t\t" + gst);
		System.out.println("-----------------------------------------------------------------------------------");

		if (bag == 'y') {
			total2 = (total + gst + 30);
			disecond = (total2 - discount1equal);
		}
		if (bag == 'n') {
			total2 = (total + gst);
			disecond = (total2 - discount1equal);
		} else if (total2 >= 10000) {
			finaldiscount = (disecond * 15) / 100;
			System.out.println("\t\t\t\t\t" + total2 + "\t\t\t" + finaldiscount + "RS.");
		}
		if (total2 < 5000) {
			finaldiscount = (disecond * 10) / 100;
			System.out.println("\t\t\t\t\t" + total2 + "\t\t\t+RS " + finaldiscount);
		} else {
			System.out.println("Invalid Choice");
		}
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("\t\t\t\t\tThank You");
		System.out.println("\t\t\t\t\t To Vist");
		System.out.println("\t\t\t\t\t D-Mart");
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("-----------------------------------------------------------------------------------");

	}
}