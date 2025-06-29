import java.util.Scanner;
import java.util.ArrayList;

public class EVC_PROJECT {
    public static void main(String[] args) {
        System.out.println("Name: Abdiaziz Yonis Muhidin");
            System.out.println("Class:CNS232");
            System.out.println("ID:C6230077");
        Scanner input = new Scanner(System.in);
        String XOGTA = "*777#";
        String EVC_Password = "9009";
        int haraa = 5000;

        int bankHaraa = 10000;
        String bankPassword = "0505";

        ArrayList<String> transactionHistory = new ArrayList<>();
        String lastReceiverNumber = "";
        int lastSentAmount = 0;

        System.out.println("FADLAN GALI  \n  *777#: ");
        String enteredFirst = input.nextLine();

        if (enteredFirst.equals(XOGTA)) {
            System.out.println("SOO DHAWAAW.\nGeli passwordkaada saxda : ");
            String enteredSecond = input.nextLine();

            if (enteredSecond.equals(EVC_Password)) {
                boolean mainMenu = true;

                while (mainMenu) {
                    System.out.println("\nKUSOO DHAWAAW QEYBTA ADEEG!");
                    System.out.println("1. Itus Haraaga");
                    System.out.println("2. Kaarka hadalka");
                    System.out.println("3. Bixi Biil");
                    System.out.println("4. U wareeji EVCPlus");
                    System.out.println("5. Warbixin Kooban");
                    System.out.println("6. Salaam Bank");
                    System.out.println("7. Maareynta");
                    System.out.println("8. TAAJ");
                    System.out.println("9. Bill Payment");
                    System.out.println("0. Ka bax (Exit)");

                    System.out.print("Dooro \n(0-9): ");
                    int choice = input.nextInt();
                    input.nextLine();

                    switch (choice) {
                        case 0:
                            mainMenu = false;
                            System.out.println("Mahadsanid, Nabad gelyo!");
                            break;

                        case 1:
                            System.out.println("\nYour balance is: " + haraa);
                            break;

                        // Cases 2 ...
                        case 2: 
                            // Kaarka hadalka
                            boolean inCase2 = true;
                            while (inCase2) {
                                System.out.println("\nKaarka hadalka:");
                                System.out.println("1. Ku Shubo Airtime");
                                System.out.println("2. Ugu Shub Airtime");
                                System.out.println("3. MIFI Packages");
                                System.out.println("4. Ku shubo Internet");
                                System.out.println("5. Ugu shub qof kale (MMT)");
                                System.out.println("0. Back");

                                System.out.print("\nDooro Kaarka hadalka option (0-5): ");
                                int subChoice = input.nextInt();
                                input.nextLine();

                                switch (subChoice) {
                                    case 0:
                                        inCase2 = false;  // back
                                        break;

                                    case 1: 
                                        // Ku Shubo Airtime
                                        System.out.print("Geli lacagta aad rabto inaad ku shubato: ");
                                        int amount = input.nextInt();
                                        input.nextLine();
                                        if (amount <= haraa) {
                                            haraa -= amount;
                                            System.out.println("Waa laguu shubay " + amount + " airtime.");
                                            System.out.println("Haraagaaga cusub waa: " + haraa);
                                        } else {
                                            System.out.println("Haraagaaga kuguma filna.");
                                        }
                                        break;

                                    case 2: 
                                        // Ugu Shub Airtime
                                        System.out.print("Geli numberka aad ugu shubayso airtime: ");
                                        String number = input.nextLine();
                                        System.out.print("Geli lacagta aad rabto inaad ugu shubto: ");
                                        int amount2 = input.nextInt();
                                        input.nextLine();
                                        if (amount2 <= haraa) {
                                            haraa -= amount2;
                                            System.out.println("Waa laguu shubay " + amount2 + " numberka " + number);
                                            System.out.println("Haraagaaga cusub waa: " + haraa);
                                        } else {
                                            System.out.println("Haraagaaga kuguma filna.");
                                        }
                                        break;

                                    case 3: 
                                        
                                        // MIFI Packages
                                        System.out.println("Dooro MIFI Package:");
                                        System.out.println("1. 1GB - $10");
                                        System.out.println("2. 5GB - $25");
                                        System.out.println("3. 10GB - $40");
                                        System.out.println("0. Back");

                                        System.out.print("Fadlan dooro (0-3): ");
                                        int mifiChoice = input.nextInt();
                                        input.nextLine();

                                        int mifiCost = 0;
                                        String mifiPackage = "";

                                        switch (mifiChoice) {
                                            case 0:
                                                break;
                                                // back to case 2 menu
                                            case 1:
                                                mifiCost = 10;
                                                mifiPackage = "1GB";
                                                break;
                                            case 2:
                                                mifiCost = 25;
                                                mifiPackage = "5GB";
                                                break;
                                            case 3:
                                                mifiCost = 40;
                                                mifiPackage = "10GB";
                                                break;
                                            default:
                                                System.out.println("Xulashada aad dooratay ma saxna.");
                                                continue;
                                        }

                                        if (mifiChoice != 0) {
                                            if (mifiCost <= haraa) {
                                                haraa -= mifiCost;
                                                System.out.println("Waxaad iibsatay " + mifiPackage + ". Haraagaaga cusub waa: " + haraa);
                                            } else {
                                                System.out.println("Haraagaaga kuguma filna.");
                                            }
                                        }
                                        break;

                                    case 4: 
                                        // Ku shubo Internet
                                        System.out.println("Dooro internet package:");
                                        System.out.println("1. 500MB - $5");
                                        System.out.println("2. 1GB - $10");
                                        System.out.println("3. 3GB - $25");
                                        System.out.println("0. Back");

                                        System.out.print("Fadlan dooro (0-3): ");
                                        int internetChoice = input.nextInt();
                                        input.nextLine();

                                        int internetCost = 0;
                                        String internetPackage = "";

                                        switch (internetChoice) {
                                            case 0:
                                                break; 
                                                // back to case 2 menu
                                            case 1:
                                                internetCost = 5;
                                                internetPackage = "500MB";
                                                break;
                                            case 2:
                                                internetCost = 10;
                                                internetPackage = "1GB";
                                                break;
                                            case 3:
                                                internetCost = 25;
                                                internetPackage = "3GB";
                                                break;
                                            default:
                                                System.out.println("Xulashada aad dooratay ma saxna.");
                                                continue;
                                        }

                                        if (internetChoice != 0) {
                                            if (internetCost <= haraa) {
                                                haraa -= internetCost;
                                                System.out.println("Waxaad iibsatay " + internetPackage + " internet. Haraagaaga cusub waa: " + haraa);
                                            } else {
                                                System.out.println("Haraagaaga kuguma filna.");
                                            }
                                        }
                                        break;

                                    case 5:
                                        // Ugu shub qof kale (MMT)
                                        System.out.print("Geli numberka qofka aad lacagta ugu shubayso (MMT): ");
                                        String mmtNumber = input.nextLine();
                                        System.out.print("Geli qadarka lacagta aad rabto inaad u dirto: ");
                                        int mmtAmount = input.nextInt();
                                        input.nextLine();
                                        if (mmtAmount <= haraa) {
                                            haraa -= mmtAmount;
                                            System.out.println("Lacagta " + mmtAmount + " ayaa loo diray " + mmtNumber + " via MMT.");
                                            System.out.println("Haraagaaga cusub waa: " + haraa);
                                        } else {
                                            System.out.println("Haraagaaga kuguma filna.");
                                        }
                                        break;

                                    default:
                                        System.out.println("Xulashada ma saxna.");
                                }
                            }
                            break;

                        case 3:  
                            // Bixi Biil
                            boolean inCase3 = true;
                            while (inCase3) {
                                System.out.println("\nBixi Biil - Pay Your Bills");
                                System.out.println("1. Post Paid");
                                System.out.println("2. Ku Iibso");
                                System.out.println("0. Back");

                                System.out.print("Dooro (0-2): ");
                                int bixChoice = input.nextInt();
                                input.nextLine();

                                switch (bixChoice) {
                                    case 0:
                                        inCase3 = false; 
                                        // back to main menu
                                        break;

                                    case 1:
                                        System.out.println("Post Paid");
                                        boolean inPostPaid = true;
                                        while (inPostPaid) {
                                            System.out.println("1-- Ogoow Biil");
                                            System.out.println("2-- Bixi Biil");
                                            System.out.println("3-- Ka Bixi Biil");
                                            System.out.println("0-- Back");

                                            System.out.print("Dooro (0-3): ");
                                            int postPaidChoice = input.nextInt();
                                            input.nextLine();

                                            if (postPaidChoice == 0) {
                                                inPostPaid = false;  // back to Bixi Biil menu
                                            } else if (postPaidChoice >= 1 && postPaidChoice <= 3) {
                                                System.out.println("Waxaan kuusoo diri doonaa fariin.");
                                            } else {
                                                System.out.println("Xulashada ma saxna.");
                                            }
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Ku Iibso - Waxaan kuusoo diri doonaa fariin.");
                                        break;

                                    default:
                                        System.out.println("Xulashada ma saxna.");
                                }
                            }
                            break;

                        case 4:  
                            // U wareeji EVCPlus
                            System.out.println("\nU wareeji EVCPlus - Transfer Funds");
                            System.out.print("Geli numberka aad lacag u direyso (0 to back): ");
                            String receiverNumber = input.nextLine();
                            if (receiverNumber.equals("0")) {
                                break; // back to main menu
                            }

                            System.out.print("Geli qadarka lacagta aad dirayso (0 to back): ");
                            String amountStr = input.nextLine();
                            if (amountStr.equals("0")) {
                                break; // back to main menu
                            }

                            int amountToSend;
                            try {
                                amountToSend = Integer.parseInt(amountStr);
                            } catch (NumberFormatException e) {
                                System.out.println("Fadlan geli lacag sax ah.");
                                break;
                            }

                            if (amountToSend <= haraa) {
                                haraa -= amountToSend;
                                lastReceiverNumber = receiverNumber;
                                lastSentAmount = amountToSend;
                                transactionHistory.add("Transfer: " + amountToSend + " sent to " + receiverNumber);
                                System.out.println("Lacagta " + amountToSend + " ayaa loo diray numberka " + receiverNumber);
                                System.out.println("Haraagaaga cusub waa: " + haraa);
                            } else {
                                System.out.println("Haraagaaga kuguma filna.");
                            }
                            break;

                        case 5: 
                            // Warbixin Kooban submenu
                            boolean inCase5 = true;
                            while (inCase5) {
                                System.out.println("\nWarbixin Kooban - Mini Statement");
                                System.out.println("1. Muuji 5 dhaqdhaqaaq ee u dambeysay");
                                System.out.println("2. Tus numberkii u dambeeyay ee aad lacag u dirtay");
                                System.out.println("0. Back");

                                System.out.print("Dooro (0-2): ");
                                int sub5 = input.nextInt();
                                input.nextLine();

                                switch (sub5) {
                                    case 0:
                                        inCase5 = false;
                                        break;

                                    case 1:
                                        if (transactionHistory.isEmpty()) {
                                            System.out.println("Ma jiraan wax dhaqdhaqaaqyo ah.");
                                        } else {
                                            System.out.println("Dhaqdhaqaaqyada ugu dambeeyay:");
                                            int start = Math.max(0, transactionHistory.size() - 5);
                                            for (int i = start; i < transactionHistory.size(); i++) {
                                                System.out.println("- " + transactionHistory.get(i));
                                            }
                                        }
                                        break;

                                    case 2:
                                        if (!lastReceiverNumber.isEmpty()) {
                                            System.out.println("Numberka ugu dambeeyay ee lacag loo diray waa: " + lastReceiverNumber);
                                            System.out.println("Lacagta aad dirtay: " + lastSentAmount);
                                        } else {
                                            System.out.println("Wax lacag diris ah lama helin.");
                                        }
                                        break;

                                    default:
                                        System.out.println("Xulashada ma saxna.");
                                }
                            }
                            break;
                        case 6:
                            System.out.print("Geli password-ka Salaam Bank: ");
                            String enteredBankPassword = input.nextLine();
                            System.out.print("Geli magacaada ");
                            String name= input.next();
                            if (!enteredBankPassword.equals(bankPassword)) {
                                System.out.println("Password-ka waa khaldan. Ma geli kartid Salaam Bank.");
                                break;
                            }

                            boolean inBankMenu = true;
                            while (inBankMenu) {
                                System.out.println("\nSalaam Bank - Adeegyada:");
                                System.out.println("1. Itus Haraaga");
                                System.out.println("2. Lacag dhigasho");
                                System.out.println("3. Lacag qaadasho");
                                System.out.println("4. Ka Wareeji EVCPlus");
                                System.out.println("5. Ka Wareeji Account-kaga");
                                System.out.println("6. Hubi wareejin account");
                                System.out.println("7. Maareynta Bankiga");
                                System.out.println("8. Kala Bax");
                                System.out.println("9. Back");
                                System.out.print("Dooro (1-9): ");
                                int bankOption = input.nextInt();
                                input.nextLine();

                                switch (bankOption) {
                                    case 1:
                                        System.out.println("Haraaga Salaam Bank: $" + bankHaraa);
                                        break;
                                    case 2:
                                        System.out.print("Geli lacagta aad rabto inaad dhigato: ");
                                        int deposit = input.nextInt();
                                        input.nextLine();
                                        bankHaraa += deposit;
                                        System.out.println("Waad dhigatay $" + deposit);
                                        break;
                                    case 3:
                                        System.out.print("Geli lacagta aad rabto inaad qaadato: ");
                                        int withdraw = input.nextInt();
                                        input.nextLine();
                                        if (withdraw <= bankHaraa) {
                                            bankHaraa -= withdraw;
                                            System.out.println("Waad qaaday $" + withdraw);
                                        } else {
                                            System.out.println("Haraaga kuguma filna.");
                                        }
                                        break;
                                    case 4:
                                        System.out.print("Geli lacagta aad rabto inaad ka wareejiso EVCPlus: ");
                                        int toBank = input.nextInt();
                                        input.nextLine();
                                        if (toBank <= haraa) {
                                            haraa -= toBank;
                                            bankHaraa += toBank;
                                            System.out.println("Waad wareejisay $" + toBank);
                                        } else {
                                            System.out.println("Haraaga EVCPlus kuguma filna.");
                                        }
                                        break;
                                    case 5:
                                        System.out.print("Geli lacagta aad rabto inaad ka wareejiso Salaam Bank: ");
                                        int fromBank = input.nextInt();
                                        input.nextLine();
                                        if (fromBank <= bankHaraa) {
                                            bankHaraa -= fromBank;
                                            haraa += fromBank;
                                            System.out.println("Waad wareejisay $" + fromBank);
                                        } else {
                                            System.out.println("Haraaga Salaam Bank kuguma filna.");
                                        }
                                        break;
                                    case 6:
                                        System.out.println("Fadlan"+name+ "la xiriir websaytka OTTP si aad u hubiso wareejinta.");
                                        break;

                                    case 7:
                                        System.out.print("Geli password cusub ee Salaam Bank: ");
                                        bankPassword = input.nextLine(); // assuming it's a String
                                        System.out.println("Password-ka Salaam Bank waa la cusbooneysiiyay.");
                                        break;

                                    case 8:
                                        System.out.println("Fadlan"+name+ "sug fariinta. Waxaa laguu soo diri doonaa SMS ama email.");
                                        break;
                                    case 9:
                                        inBankMenu = false;
                                        break;
                                    default:
                                        System.out.println("Xulashada ma saxna.");
                                }
                            }
                            break;

                        case 7:
                            System.out.println("------ MAAREYNTA ------");
                            System.out.println("1. Beddel PIN");
                            System.out.println("2. Beddel Luqadda");
                            System.out.println("3. Xir Lacag Khaldan");
                            System.out.println("4. Celi Lacag Khaldan");
                            System.out.println("5. Back");

                            int manageOption = input.nextInt();
                            input.nextLine(); // buffer

                            switch (manageOption) {
                                case 1:
                                    System.out.println("Geli PIN-kii hore:");
                                    String oldPIN = input.nextLine();
                                    if (oldPIN.equals(EVC_Password)) {
                                        System.out.println("Geli PIN cusub:");
                                        String newPIN = input.nextLine();
                                        EVC_Password = newPIN;
                                        System.out.println("PIN-ka si guul ah ayaa loo beddelay.");
                                    } else {
                                        System.out.println("PIN-kii hore waa khaldan yahay.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Dooro luqaddaada:");
                                    System.out.println("1. Somali");
                                    System.out.println("2. English");
                                    int langOption = input.nextInt();
                                    input.nextLine(); // buffer

                                    if (langOption == 1) {
                                        System.out.println("Luqaddaada hadda waa Somali.");
                                    } else if (langOption == 2) {
                                        System.out.println("Your language is now English.");
                                    } else {
                                        System.out.println("Doorasho khaldan.");
                                    }
                                    break;

                                case 3:
                                    System.out.println("Geli nambarka aad si qalad ah lacag ugu dirtay:");
                                    String wrongNumber = input.nextLine();

                                    System.out.println("Geli qadarka lacagta aad ku qalday:");
                                    int wrongAmount = input.nextInt();
                                    input.nextLine(); // buffer

                                    haraa += wrongAmount;
                                    System.out.println("Lacagtii khaldantay ee " + wrongAmount + " ahayd ayaa lagu daray haraagaaga.");
                                    System.out.println("Haraaga cusub waa: " + haraa);
                                    break;

                                case 4:
                                    System.out.println("Geli nambarka aad rabto inaad u celiso lacag khaldan:");
                                    String returnNumber = input.nextLine();

                                    System.out.println("Geli qadarka lacagta aad rabto inaad celiso:");
                                    int returnWrongAmount = input.nextInt();
                                    input.nextLine(); // buffer

                                    if (returnWrongAmount <= haraa) {
                                        haraa -= returnWrongAmount;
                                        System.out.println("Waxaad u celisay " + returnWrongAmount + " nambarka " + returnNumber);
                                        System.out.println("Haraagaaga cusub waa: " + haraa);
                                    } else {
                                        System.out.println("Haraagaaga kuma filna lacagta la celinayo.");
                                    }
                                    break;

                                case 5:
                                    System.out.println("Dib ayaa laguu celiyay.");
                                    break;

                                default:
                                    System.out.println("Doorasho khaldan.");
                            }
                            break;


                        case 8:
                            System.out.println("------ KALA BAX ------");
                            System.out.println("1. Kala Bax Dibadda");
                            System.out.println("2. Kala Bax Gudaha");
                            int withdrawType = input.nextInt();
                            input.nextLine(); // buffer

                            String recipientNumber = "";
                            String[] countries = {
                                    "1. Saudi Arabia (+966)",
                                    "2. Kenya (+254)",
                                    "3. Turkey (+90)",
                                    "4. UAE (+971)",
                                    "5. UK (+44)",
                                    "6. USA (+1)",
                                    "7. Canada (+1)",
                                    "8. Ethiopia (+251)",
                                    "9. Djibouti (+253)",
                                    "10. Qatar (+974)"
                            };

                            if (withdrawType == 1) {
                                System.out.println("Dooro dalka aad lacagta u dirayso:");
                                for (String country : countries) {
                                    System.out.println(country);
                                }

                                int countryChoice = input.nextInt();
                                input.nextLine();

                                String countryCode = "";
                                switch (countryChoice) {
                                    case 1: countryCode = "+966"; break;
                                    case 2: countryCode = "+254"; break;
                                    case 3: countryCode = "+90"; break;
                                    case 4: countryCode = "+971"; break;
                                    case 5: countryCode = "+44"; break;
                                    case 6: countryCode = "+1"; break;
                                    case 7: countryCode = "+1"; break;
                                    case 8: countryCode = "+251"; break;
                                    case 9: countryCode = "+253"; break;
                                    case 10: countryCode = "+974"; break;
                                    default:
                                        System.out.println("Dalka aad dooratay ma jiro.");
                                        break;
                                }

                                System.out.println("Geli nambarka la rabo in lacagta loo diro:");
                                String phone = input.nextLine();
                                recipientNumber = countryCode + phone;

                            } else if (withdrawType == 2) {
                                System.out.println("Geli nambarka gudaha ee lacagta loo dirayo:");
                                recipientNumber = input.nextLine();
                            } else {
                                System.out.println("Doorasho khaldan.");
                                break;
                            }

                            System.out.println("Geli qadarka lacagta aad kala bixi rabto:");
                            int withdrawAmount = input.nextInt();
                            input.nextLine();

                            System.out.println("Geli PIN-kaaga si aad u xaqiijiso:");
                            String enteredPIN = input.nextLine();

                            if (enteredPIN.equals(EVC_Password)) {
                                if (withdrawAmount <= haraa) {
                                    haraa -= withdrawAmount;
                                    System.out.println("Waxaad si guul ah uga baxday " + withdrawAmount + " lacag ah.");
                                    System.out.println("Lacagta waxaa loo diray: " + recipientNumber);
                                    System.out.println("Haraagaaga cusub waa: " + haraa);
                                } else {
                                    System.out.println("Haraagaaga kuma filna lacagta aad kala bixi rabto.");
                                }
                            } else {
                                System.out.println("PIN-ka aad gelisay waa khaldan yahay.");
                            }
                            break;



                        case 9:
                            System.out.println("\nBill Payment - ISKA SUG FARIINTEYNA ");
                            break;

                        default:
                            System.out.println("\nInvalid option. Please choose a number from 0 to 9.");
                    }
                }
            } else {
                System.out.println("\nPassworka aad GELISAY MA AHAN MID JIRA.");
            }
        } else {
            System.out.println("\nXOGTA GELISAY MA AHAN MID JIRA.");
        }
    }
}
