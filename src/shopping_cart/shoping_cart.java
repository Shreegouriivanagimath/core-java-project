package shopping_cart;

import java.util.Scanner;

public class shoping_cart {
	public static void main(String[] args) {
		System.out.println("welcome to Shoping Mart");
		Scanner sc = new Scanner(System.in);
		String result;

		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What is your city?");
		String city = sc.next();
		System.out.println("What is your state?");
		String state = sc.next();

		user_details c1 = new user_details(name, age, city, state);

		System.out.println("Welcome Mr/Ms." + c1.getName());
		System.out.println("type yes to see our products. else press any key\n");
		result = sc.next();
		if (result.equalsIgnoreCase("yes")) {
			System.out.println("1. Phones\n" + "2. laptops\n" + "3. watches\n" + "4. televisions\n" + "5. Tablets");
			System.out.println("Select the product you want\n");
			int type_1 = sc.nextInt();
			if (type_1 == 1) {
				System.out.println("a. OPPO\n" + "b. VIVO\n" + "c. SAMSUNG\n" + "d. REDMI\n" + "e. ONEPLUS\n");
				System.out.println("Select the option to see the details of the Phones");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					System.out.println("a. OPPO A57\n" + "b. OPPO RENO 8T\n" + "c. OPPO F21s PRO\n" + "d. OPPO A78\n");
					System.out.println("Select the option to see the features");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("OPPO A57\n" + "cost : 13999\n" + "RAM : 4GB\n" + "internal storage : 64GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println("OPPO RENO 8T\n" + "cost : 26500\n" + "RAM : 8GB\n" + "internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println("OPPO F21s PRO\n" + "cost : 25999\n" + "RAM : 8GB\n" + "internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else {
						System.out.println("OPPO A78\n" + "cost : 18999\n" + "RAM : 8GB\n" + "internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}
				} else if (result.equalsIgnoreCase("b")) {
					System.out.println("a. VIVO Y56\n" + "b. VIVO V23\n" + "c. VIVO Y22\n" + "d. VIVO U20\n");
					System.out.println("Select the option to see the details of the Phones");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("VIVO Y56\n" + "cost : 19999\n" + "RAM : 8GB\n" + "internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println("VIVO V23\n" + "cost : 28990\n" + "RAM : 8GB\n" + "internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println("VIVO Y22\n" + "cost : 16499\n" + "RAM : 6GB\n" + "internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else {
						System.out.println("VIVO U20\n" + "cost : 11990\n" + "RAM : 4GB\n" + "internal storage : 64GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}
				} else if (result.equalsIgnoreCase("c")) {
					System.out.println("a. SAMSUNG GALAXY S23\n" + "b. SAMSUNG GALAXY M33\n" + "c. SAMSUNG GALAXY S20\n"+"d. SAMSUNG GALAXY A23\n");
					System.out.println("Select the option to see the details of the Phones");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("SAMSUNG GALAXY S23\n" + "cost : 79999\n" + "RAM : 8GB\n"+"internal storage : 256GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println("SAMSUNG GALAXY M33\n" + "cost : 17999\n" + "RAM : 6GB\n"+"internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println("SAMSUNG GALAXY S20\n" + "cost : 29999\n" + "RAM : 8GB\n"+"internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else {
						System.out.println("SAMSUNG GALAXY A23\n" + "cost : 17499\n" + "RAM : 6GB\n"+"internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}
				} else if (result.equalsIgnoreCase("d")) {
					System.out.println("a. REDMI NOTE 11\n" + "b. REDMI 10A\n" + "c. REDMI NOTE 12\n" + "d. REDMI 12C\n");
					System.out.println("Select the option to see the details of the Phones");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("REDMI NOTE 11\n" + "cost : 12999\n" + "RAM : 4GB\n" + "internal storage : 64GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println("REDMI 10A\n" + "cost : 8999\n" + "RAM : 4GB\n" + "internal storage : 64GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println("REDMI NOTE 12\n" + "cost : 19999\n" + "RAM : 6GB\n" + "internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else {
						System.out.println(" REDMI 12C\n" + "cost : 9499\n" + "RAM : 4GB\n" + "internal storage : 64GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}

				} else if (result.equalsIgnoreCase("e")) {
					System.out.println("a. ONEPLUS NORD CE3 LITE\n" + "b. ONEPLUS NORD CE2 LITE\n" + "c. ONEPLUS 11R\n"+"d. ONEPLUS 10R\n");
					System.out.println("Select the option to see the details of the Phones");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("ONEPLUS NORD CE3 LITE\n" + "cost : 19999\n" + "RAM : 8GB\n"+"internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println("ONEPLUS NORD CE2 LITE\n" + "cost : 18999\n" + "RAM : 6GB\n"+"internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println(
								"ONEPLUS 11R\n" + "cost : 39999\n" + "RAM : 8GB\n" + "internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else {
						System.out.println(
								" ONEPLUS 10R\n" + "cost : 34999\n" + "RAM : 8GB\n" + "internal storage : 128GB\n");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}
				} else {
					System.out.println("Thank you");
				}

			} else if (type_1 == 2) {
				System.out.println("a. HP\n" + "b. ACER\n" + "c. DELL\n" + "d. LENOVO \n");
				System.out.println("Select an option to see the details of laptops");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					System.out.println(
							"a. HP 15s\n" + "b. HP VICTUS\n" + "c. HP Pavilion 14\n" + "d. HP Chromebook 11a\n");
					System.out.println("Select an option to see the features of laptops");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("HP 15s\n" + "Processor: Intel Core I3" + "cost : 40990\n" + "RAM : 8GB\n"
								+ "storage : 512GB SSD\n" + "Graphics: Intel UHD Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println(
								"HP VICTUS\n" + "Processor: Ryzen 7 5800H\n" + "cost : 99990\n" + "RAM : 16GB\n"
										+ "internal storage : 512GB SSD\n" + "Graphics: GeForce RTX 3060 6GB Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println(
								"HP Pavilion 14\n" + "Processor: Intel 12th Gen\n" + "cost : 66999\n" + "RAM : 16GB\n"
										+ "internal storage : 512GB SSD\n" + "Graphics: Intel Iris Xe Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else {
						System.out.println("HP Chromebook 11a\n" + "Processor: MediaTek MT8183\n" + "cost : 19990\n"
								+ "RAM : 4GB\n" + "internal storage : 64GB eMMC\n" + "Graphics: No Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}
				} else if (result.equalsIgnoreCase("b")) {
					System.out.println("a. ACER SWIFT 5\n" + "b. ACER EXTENSA 15\n" + "c. ACER ASPIRE 3\n"
							+ "d. ACER ASPIRE VERO\n");
					System.out.println("Select an option to see the features of laptops");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("ACER SWIFT 5\n" + "Processor: Intel Core I5 11th Gen\n" + "cost : 74999\n"
								+ "RAM : 8GB\n" + "internal storage : 512GB SSD\n" + "Graphics: No Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out
								.println("ACER EXTENSA 15\n" + "Processor: Intel Core I5 11th Gen\n" + "cost : 42999\n"
										+ "RAM : 8GB\n" + "internal storage : 512GB SSD\n" + "Graphics: No Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println("ACER ASPIRE 3\n" + "Processor: Intel Core I5 12th Gen\n" + "cost : 52999\n"
								+ "RAM : 8GB\n" + "internal storage : 512GB SSD\n" + "Graphics: No Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else {
						System.out.println("ACER ASPIRE VERO\n" + "Processor: Intel Core I5 11th Gen\n"
								+ "cost : 74999\n" + "RAM : 16GB\n" + "internal storage : 512GB SSD\n"
								+ "Graphics: No Graphics\n" + "Fingerprint Rreader");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}
				} else if (result.equalsIgnoreCase("c")) {
					System.out.println("a. DELL VOSTRO 3420\n" + "b. DELL INSPIRON 3520\n" + "c. DELL GAMING G15 5525\n"
							+ "d. DELL INSPIRON 3511\n");
					System.out.println("Select an option to see the features of laptops");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out
								.println("DELL VOSTRO 3420\n" + "Processor: Intel Core I3 12th Gen\n" + "cost : 42990\n"
										+ "RAM : 8GB\n" + "internal storage : 512GB SSD\n" + "Graphics: No Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out
								.println("DELL INSPIRON 3520\n" + "Processor: Intel Core3 12th Gen\n" + "cost : 42632\n"
										+ "RAM : 8GB\n" + "internal storage : 512GB SSD\n" + "Graphics: No Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}
				} else {
					System.out.println("a. LENOVO IDEAPAD 3\n" + "b. LENOVO IDEAPAD GAMING 3\n"
							+ "c. LENOVO YOGA SLIM  PRO\n" + "d. LENOVO LEGION 5\n");
					System.out.println("Select an option to see the features of laptops");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("LENOVO IDEAPAD \n" + "Processor: RYZEN 5 5500U\n" + "cost : 46548\n"
								+ "RAM : 8GB\n" + "internal storage : 512GB SSD\n" + "Graphics: No Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println("LENOVO IDEAPAD GAMING 3\n" + "Processor: RYZEN 5 5600H\n" + "cost : 66990\n"
								+ "RAM : 16GB\n" + "internal storage : 512GB SSD\n"
								+ "Graphics: NVIDIA RTX 3050 4GB Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println(
								"LENOVO YOGA SLIM 7 PRO\n" + "Processor: Intel Evo Core I5\n" + "cost : 69990\n"
										+ "RAM : 16GB\n" + "internal storage : 512GB SSD\n" + "Graphics: No Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else {
						System.out.println("LENOVO legion 5\n" + "Processor: Intel Core I7 11th Gen\n"
								+ "cost : 112990\n" + "RAM : 16GB\n" + "internal storage : 512GB SSD\n"
								+ "Graphics:  NVIDIA RTX 3050 4GB Graphics");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}
				}
			} else if (type_1 == 3) {
				System.out.println("a. FIRE BOLTT\n" + "b. NOISE\n" + "c. BOAT\n" + "d. AMAZFIT \n");
				System.out.println("Select an option to see the details of watches");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					System.out.println("a. FIRE BOLTT NINJA \n" + "b.FIRE BOLTT PHOENIX\n" + "c.FIRE BOLTT RING 3\n"
							+ "d.FIRE BOLTT GLADIATOR\n");
					System.out.println("Select an option to see features of watches");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out
								.println("FIRE BOLTT NINJA\n" + "cost : 1799\n" + "SMART WATCH WITH BLUETOOTH CALLING\n"
										+ "AI VOICE ASSISTANCE\n" + "100 SPORTS MODES IP67 RATING");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println(
								"FIRE BOLTT PHOENIX\n" + "cost : 1799\n" + "SMART WATCH WITH BLUETOOTH CALLING\n"
										+ "SPO2,HEART RATE MONITORING\n" + "120+ SPORTS MODES IP67 RATING");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println(
								"FIRE BOLTT RING 3\n" + "cost : 1499\n" + "SMART WATCH WITH BLUETOOTH CALLING\n"
										+ " VOICE ASSISTANCE\n" + "SPO2,HEART RATE MONITORING\n" + "118 SPORTS MODES");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					} else {
						System.out.println(
								"FIRE BOLTT RING 3\n" + "cost : 1499\n" + "SMART WATCH WITH BLUETOOTH CALLING\n"
										+ " VOICE ASSISTANCE\n" + "SPO2,HEART RATE MONITORING\n" + "123 SPORTS MODES");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}
				} else if (result.equalsIgnoreCase("b")) {
					System.out.println("a.NOISE COLORFIT PULSE\n" + "b.NOISE PULSE GO BUZZ\n" + "c.NOISE PULSE 2\n"
							+ "d.NOISE COLORFIT PRO 4\n");
					System.out.println("Select an option to see features of watches");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("NOISE COLORFIT PULSE\n" + "cost : 1299\n" + "150 WATCH FACES\n"
								+ "SPO2,SLEEP,STRESS,HEART RATE MONITORING\n" + "60 SPORTS MODES IP68 RATING");
						System.out.println("Do you wish to purchase our product(type yes/no)");
						String type_2 = sc.next();
						if (type_2.equalsIgnoreCase("YES") == true) {
							System.out.println("Thank you for purchasing\n" + "Visit again");
						} else {
							System.out.println("Thank you");
						}
					}
				} else if (type_1 == 3) {
					System.out.println("a. FIRE BOLTT\n" + "b. NOISE\n" + "c. BOAT\n" + "d. AMAZFIT \n");
					System.out.println("Select an option to see the details of watches");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("a. FIRE BOLTT NINJA \n" + "b.FIRE BOLTT PHOENIX\n" + "c.FIRE BOLTT RING 3\n"
								+ "d.FIRE BOLTT GLADIATOR\n");
						System.out.println("Select an option to see features of watches");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out.println(
									"FIRE BOLTT NINJA\n" + "cost : 1799\n" + "SMART WATCH WITH BLUETOOTH CALLING\n"
											+ "AI VOICE ASSISTANCE\n" + "100 SPORTS MODES IP67 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println(
									"FIRE BOLTT PHOENIX\n" + "cost : 1799\n" + "SMART WATCH WITH BLUETOOTH CALLING\n"
											+ "SPO2,HEART RATE MONITORING\n" + "120+ SPORTS MODES IP67 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println("FIRE BOLTT RING 3\n" + "cost : 1499\n"
									+ "SMART WATCH WITH BLUETOOTH CALLING\n" + " VOICE ASSISTANCE\n"
									+ "SPO2,HEART RATE MONITORING\n" + "118 SPORTS MODES");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println("FIRE BOLTT RING 3\n" + "cost : 1499\n"
									+ "SMART WATCH WITH BLUETOOTH CALLING\n" + " VOICE ASSISTANCE\n"
									+ "SPO2,HEART RATE MONITORING\n" + "123 SPORTS MODES");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println("a.NOISE COLORFIT PULSE\n" + "b.NOISE PULSE GO BUZZ\n" + "c.NOISE PULSE 2\n"
								+ "d.NOISE COLORFIT PRO 4\n");
						System.out.println("Select an option to see features of watches");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out.println("NOISE COLORFIT PULSE\n" + "cost : 1299\n" + "150 WATCH FACES\n"
									+ "SPO2,SLEEP,STRESS,HEART RATE MONITORING\n" + "60 SPORTS MODES IP68 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println(
									"NOISE PULSE GO BUZZ\n" + "cost : 1699\n" + "SMART WATCH WITH BLUETOOTH CALLING\n"
											+ "SPO2 MONITORING\n" + "100 SPORTS MODES");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println(
									"NOISE PULSE 2\n" + "cost : 1899\n" + "SMART WATCH WITH BLUETOOTH CALLING\n"
											+ "SPO2,HEART RATE MONITORING\n" + "100 SPORTS MODES IP67 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println(
									"NOISE COLORFIT PRO 4\n" + "cost : 3999\n" + "SMART WATCH WITH BLUETOOTH CALLING\n"
											+ "SPO2,HEART RATE MONITORING\n" + "100 SPORTS MODES IP67 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println("a.BOAT BLAZE\n" + "b.BOAT XTEND\n" + "c.BOAT FLASH\n" + "d.BOAT WAVE\n");
						System.out.println("Select an option to see features of watches");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out.println("BOAT BLAZE\n" + "cost : 1799\n" + "MULTIPLE WATCH FACES\n"
									+ "SPO2,HEART RATE MONITORING\n" + "MULTIPLE SPORTS MODES IP67 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println("BOAT XTEND\n" + "cost : 2299\n" + "MULTIPLE WATCH FACES\n"
									+ "SPO2,SLEEP,HEART RATE MONITORING\n" + "14 SPORTS MODES");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println("BOAT FLASH\n" + "cost : 1599\n" + "170+ WATCH FACES\n"
									+ "SPO2,SLEEP,HEART RATE MONITORING\n" + "14 SPORTS MODES IP68 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println("BOAT WAVE\n" + "cost : 1299\n" + "MULTIPLE WATCH FACES\n"
									+ "SPO2,HEART RATE MONITORING\n" + "14 SPORTS MODES IP68 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}

					} else {
						System.out.println("a.AMAZFUT BIP 3\n" + "b.AMAZFIT GTS 2\n" + "c.AMAZFIT BAND 7\n"
								+ "d.AMAZFIT T-REX2\n");
						System.out.println("Select an option to see features of watches");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out.println("AMAZFIT BIP3\n" + "cost : 2799\n" + "SPO2,SLEEP,HEART RATE MONITORING\n"
									+ "60 SPORTS MODES IP68 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println("AMAZFIT GTS 2\n" + "cost : 7999\n" + "BUILT IN GPS\n"
									+ "SPO2,SLEEP,HEART RATE MONITORING\n" + "90 SPORTS MODES IP68 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println("AMAZFIT BAND 7\n" + "cost : 3499\n"
									+ "SPO2,SLEEP,HEART RATE MONITORING\n" + "120 SPORTS MODES IP68 RATING");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println("AMZFIT T-REX 2\n" + "cost : 15999\n" + "170+ WATCH FACES\n"
									+ "SPO2,SLEEP,HEART RATE MONITORING\n" + "150 SPORTS MODES\n"
									+ "10 ATM WATER PROOF");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}
					}
				} else if (type_1 == 4) {
					System.out.println("a.Samsung\n" + "b.Sony\n" + "c.LG\n" + "d.Onepluse\n");
					System.out.println("Select an option to see the details of televisions");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println(
								"a.Samsung 32in\n" + "b.Samsung 43in\n" + "c.Samsung 55in\n" + "d.Samsung 65in\n");
						System.out.println("Select an option to see the features of televisions");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out.println(
									"Samsung 32in\n" + "SMART TV\n" + "Model:UA32T4340BKXXL\n" + "cost : 13990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println("Samsung 43in\n" + "SMART TV CRYSTAL 4K NEO\n" + "Model:UA43AUE65AKXXL\n"
									+ "cost : 29980\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println("Samsung 55in\n" + "SMART TV CRYSTAL 4K NEO\n" + "Model:UA55AUE65AKXXL\n"
									+ "cost : 46990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println("Samsung 65in\n" + "4K SMART QLED TV \n" + "Model: QA65LS03BAKLXL\n"
									+ "cost : 130990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println("a.Sony Bravia 65In\n" + "b.Sony Bravia 55In\n" + "c.Sony Bravia 43In\n"
								+ "d.Sony Bravia 32In\n");
						System.out.println("Select an option to see the features of televisions");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out.println("Sony Bravia 65In\n" + "SMART TV 4K ULTRA HD\n" + "Model:KD-65X74K\n"
									+ "cost : 72990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println("Sony Bravia 55In\n" + "SMART TV 4K ULTRA HD\n" + "Model:KD-55X74K\n"
									+ "cost : 57990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println("Sony Bravia 43In\n" + "SMART TV 4K ULTRA HD\n" + "Model:KD-43X74K\n"
									+ "cost : 42990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println("Sony Bravia 32In\n" + "SMART TV 4K ULTRA HD\n" + "Model:KD-32W820K\n"
									+ "cost : 25990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println("a.LG 65In\n" + "b.LG 55In\n" + "c.LG 48In\n" + "d.LG 32In\n");
						System.out.println("Select an option to see the features of televisions");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out.println(
									"LG 65In\n" + "SMART TV 4K ULTRA HD\n" + "Model:65UQ7500PSF\n" + "cost : 69990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println(
									"LG 55In\n" + "SMART TV 4K ULTRA HD\n" + "Model:55NANO73SQA\n" + "cost : 58990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println(
									"LG 48In\n" + "SMART TV 4K ULTRA HD\n" + "Model:48A2PSA\n" + "cost : 75990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println("LG 32In\n" + "SMART TV\n" + "Model:32LQ636BPSA\n" + "cost : 19759\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}

					} else {
						System.out.println(
								"a.ONEPULSE 32In\n" + "b.ONEPULSE 43In\n" + "c.ONEPULSE 50In\n" + "d.ONEPULSE 55In\n");
						System.out.println("Select an option to see the features of televisions");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out.println("ONEPULSE 32In\n" + "SMART TV\n" + "Model:32Y1\n" + "cost : 14990\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println("ONEPULSE 43In\n" + "SMART TV 4K ULTRA HD\n" + "Model:43Y1S PRO\n"
									+ "cost : 29999\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println("ONEPULSE 50In\n" + "SMART TV 4K ULTRA HD\n" + "Model:50YS1 PRO\n"
									+ "cost : 32999\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println("ONEPULSE 55In\n" + "SMART TV 4K ULTRA HD\n" + "Model:55YS1 PRO\n"
									+ "cost : 39999\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}
					}
				} else if (type_1 == 5) {
					System.out.println("a.Samsung\n" + "b.Lenovo\n" + "c.Realme\n" + "d.Redmi\n");
					System.out.println("Select an option to see the details of tablets");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						System.out.println("a.Samsung Galaxy Tab S7\n" + "b.Samsung Galaxy Tab S8\n"
								+ "c.Samsung Galaxy Tab A7\n" + "d.Samsung Galaxy Tab A8\n");
						System.out.println("Select an option to see the features of tablets");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out.println(
									"Samsung Galaxy Tab S7\n" + "cost : 40999\n" + "RAM : 4GB\n" + "storage : 64GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println(
									"Samsung Galaxy Tab S8\n" + "cost : 51990\n" + "RAM : 8GB\n" + "storage : 128GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println(
									"Samsung Galaxy Tab A7\n" + "cost : 11990\n" + "RAM : 3GB\n" + "storage : 32GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println(
									"Samsung Galaxy Tab A8\n" + "cost : 16999\n" + "RAM : 4GB\n" + "storage : 64GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}
					} else if (result.equalsIgnoreCase("b")) {
						System.out.println("a.Lenovo Tab P11 Plus Tablet\n" + "b.Lenovo Calling Tab M8 2nd Gen Tablet\n"
								+ "c.Lenovo M10 Fhd Plus 2Nd Gen\n" + "d.Lenovo Tab M7 3rd Gen\n");
						System.out.println("Select an option to see the features of tablets");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out.println("Lenovo Tab P11 Plus Tablet\n" + "cost : 26499\n" + "RAM : 6GB\n"
									+ "storage : 128GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println("Lenovo Calling Tab M8 2nd Gen Tablet\n" + "cost : 10490\n"
									+ "RAM : 2GB\n" + "storage : 32GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println("Lenovo M10 Fhd Plus 2Nd Gen\n" + "cost : 20999\n" + "RAM : 4GB\n"
									+ "storage : 128GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println(
									"Lenovo Tab M7 3rd Gen\n" + "cost : 6999\n" + "RAM : 2GB\n" + "storage : 32GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}
					} else if (result.equalsIgnoreCase("c")) {
						System.out.println(
								"a.Realme Pad X\n" + "b.Realme Pad \n" + "c.Realme Pad Mini\n" + "d.Realme Pad Mini\n");
						System.out.println("Select an option to see the features of tablets");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out
									.println("Realme Pad X\n" + "cost : 28459\n" + "RAM : 6GB\n" + "storage : 128GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out.println("Realme Pad\n" + "cost : 17999\n" + "RAM : 4GB\n" + "storage : 64GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println(
									"Realme Pad Mini\n" + "cost : 10000\n" + "RAM : 3GB\n" + "storage : 32GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println(
									"Realme Pad Mini\n" + "cost : 12999\n" + "RAM : 4GB\n" + "storage : 64GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}

					} else {
						System.out.println("a.Readmi Pad 1\n" + "b.Readmi Pad 2\n" + "c.Readmi Pad 5(1)\n"
								+ "d.Readmi Pad 5(2)\n");
						System.out.println("Select an option to see the features of tablets");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							System.out
									.println("Readmi Pad 1\n" + "cost : 17999\n" + "RAM : 4GB\n" + "storage : 128GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("b")) {
							System.out
									.println("Readmi Pad 2\n" + "cost : 19999\n" + "RAM : 6GB\n" + "storage : 128GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else if (result.equalsIgnoreCase("c")) {
							System.out.println(
									"Readmi Pad 5(1)\n" + "cost : 28999\n" + "RAM : 6GB\n" + "storage : 256GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						} else {
							System.out.println(
									"Readmi Pad 5(2)\n" + "cost : 26999\n" + "RAM : 6GB\n" + "storage : 128GB\n");
							System.out.println("Do you wish to purchase our product(type yes/no)");
							String type_2 = sc.next();
							if (type_2.equalsIgnoreCase("YES") == true) {
								System.out.println("Thank you for purchasing\n" + "Visit again");
							} else {
								System.out.println("Thank you");
							}
						}
					}
				}

			} else {
				System.out.println("Thank you\n" + "Visit again ");
			}
		}
	}
}
