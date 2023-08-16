import java.util.Scanner;
public class BankApp {
    private static final Scanner SCANNER = new Scanner (System.in);
    public static void main(String[] args) {

        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "👷 WELCOME TO SMART BANKING";
        final String CREATE_NEW_ACC = "➕ Create new account";
        final String DEPOSITS = "Deposits";
        final String WITHDRAWALS = "Withdrawals";
        final String TRANSFER = "Transfer";
        final String PRINT = "🖨 Print";
        final String DELETE_ACC = "❌ Delete account";

        String screen = DASHBOARD;

        String[] customerId = new String[0];
        String[] customerName = new String[0];

         main_Loop:
    
        do{
            final String APP_TITLE = String.format("%s%s%s",
            COLOR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.println("\t" + APP_TITLE + "\n");

            switch(screen){
                case DASHBOARD: 
                    System.out.println("\t[1]. Create New Account");
                    System.out.println("\t[2]. Deposits");
                    System.out.println("\t[3]. Withdrawals");
                    System.out.println("\t[4]. Transfer");
                    System.out.println("\t[5]. Print");
                    System.out.println("\t[6]. Delete Account");
                    System.out.println("\t[7]. Exit\n");
                    System.out.print("\tEnter an option to continue: ");
                    int option = SCANNER.nextInt();
                    SCANNER.nextLine();

                    switch (option){
                        case 1: screen = CREATE_NEW_ACC; break;
                        case 2: screen = DEPOSITS; break;
                        case 3: screen = WITHDRAWALS; break;
                        case 4: screen = TRANSFER; break;
                        case 5: screen = PRINT; break;
                        case 6: screen = DELETE_ACC; break;
                        case 7: System.out.println(CLEAR); System.exit(0);
                        default: continue;
                    }
                    break;

                    case CREATE_NEW_ACC:

                        String id = "SDB-00000";
                        String name;
                        int deposit;
                        boolean valid;

                        System.out.printf("\tNew Student ID: SDB-%05d \n", (customerName.length + 1));
                    second_loop:
                        do{
                            valid = true;
                            System.out.print("\tEnter Student Name: ");
                            name = SCANNER.nextLine().strip();
                            if (name.isBlank()){
                                System.out.printf("\t%sName can't be empty%s\n", COLOR_RED_BOLD, RESET);
                                valid = false;
                                continue;
                            }
                            for (int i = 0; i < name.length(); i++) {
                                 if (!(Character.isLetter(name.charAt(i)) || 
                                    Character.isSpaceChar(name.charAt(i))) ) {
                                    System.out.printf("\t%sInvalid Name%s\n", COLOR_RED_BOLD, RESET);
                                    valid = false;
                                    continue second_loop;
                            }
                        }
                        
                            
                        



                        }while (!valid);
                        String[] newCustomerIds = new String[customerId.length + 1];
                        String[] newCustomer = new String[customerName.length + 1];
                        for (int i = 0; i < customerName.length; i++) {
                         id = String.format("SDB-%05d", (i+1));
                        newCustomer[i] = customerName[i];
                        newCustomerIds[i] = customerId[i];
                        }
                        newCustomerIds[newCustomerIds.length-1] = id;
                        newCustomer[newCustomer.length -1] = name;
                        customerName = newCustomer;
                        customerId = newCustomerIds;


                        do{

                            System.out.print("\tEnter Initial deposit : ");
                            deposit = SCANNER.nextInt();
                            SCANNER.nextLine();
                            if (deposit < 5000){
                                System.out.printf("\t%sInsufficient amount%s\n",COLOR_RED_BOLD,RESET);
                                valid = false;
                                continue ;
                            }else valid = true;
                            
                        } while (!valid);


                        System.out.println();
                        System.out.print("\t" + name + " added sucessfully.\n\tDo you want to add new student (Y/n)? ");
                        if (SCANNER.nextLine().strip().toUpperCase().equals("Y")) continue;
                        screen = DASHBOARD;
                        break;


            




            
                    
                    
                    
                    case DEPOSITS:

                    do{
                        valid = true;


                    }while(!valid);
                
                
                
                
                
                
                
                
                
                } 

            
        
        }while (true);
    
    }
}
