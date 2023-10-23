/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raghadgymproject;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class RaghadGymProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);                                     
        int option, eval, total, coach, s;                                      //declare integer
        double  gender, weight, tall, age, actilev;                             //declare double
        String FirstName, LastName, service, p, again,res,diet;                //declare string
        long num;                                                               //declare long
        option = 0;                                                             //assign int
        total = 0;                                                              //assign int
        eval = 0;                                                               //assign string ,eval for evaluation
        s = 0;                                                                  //assign string ,s for sessions
        service = "your services are: ";                                        //assign string

        
        System.out.println("we are so glad you chose RS GYM,we just want some information to complete the reservation.");  //welcome message
        System.out.println("write your first name:");
        FirstName = x.next();                                                   // input first name
        System.out.println("--------------------");
        System.out.println("write your last name:");
        LastName = x.next();                                                    //input last name
         System.out.println("--------------------");
        System.out.println("write your phone number starting with 05");
        num = x.nextInt();                                                      //input phone numper
        do{
            System.out.println("--------------------");
            System.out.println("gender(write the number):");                       
            System.out.println("1-male");
            System.out.println("2-female");
            gender = x.nextInt();                                                   //input gender from user
            if(gender!=1&&gender!=2)
                System.out.println("you didn't choose\ntry again");
        }while(gender!=1&&gender!=2);
        System.out.println("--------------------");
        System.out.println(" weight(kg):");
        weight = x.nextInt();                                                   //input weight from user
        System.out.println("--------------------");
        System.out.println(" tall(cm):");
        tall = x.nextInt();                                                     //input tall from user
        System.out.println("--------------------");
        System.out.println(" age:");
        age = x.nextInt();                                                      //input age from user
        do{                                                                     // to check if user enter correct number
            System.out.println("--------------------");
            System.out.println(" your activity level:");
            System.out.println(" 1-sedentary");
            System.out.println(" 2-light activity(1-3 times a week)");
            System.out.println(" 3-moderately active(3-5 times a week)");
            System.out.println(" 4-very active(6-7 times a week)");
            System.out.println(" 5-extra active");
            actilev = x.nextInt();                                                  //input  activity level from user
            if(actilev!=1&&actilev!=2&&actilev!=3&&actilev!=4&&actilev!=5)                     //if user enter wrong number
                System.out.println("you didn't choose\ntry again");
        
        }while(actilev!=1&&actilev!=2&&actilev!=3&&actilev!=4&&actilev!=5);
        if (gender==1)                                                          // if (if true = male)
                System.out.println("you consume at a rate "+maleCaloCalc(weight, tall, age,actilev)+" calories a day"); //call method maleCaloCalc
        else                                                                    // if (else = female)
                System.out.println("you consume at a rate "+femaleCaloCalc(weight, tall, age, actilev)+" calories a day"); //call method femaleCaloCalc
        System.out.println("--------------------");
        Bmi(weight,tall);                                                      //call method Bmi
        System.out.println("--------------------");
        System.out.println("do you want nutritional program?,it's 269 per month");
         x.nextLine();
        diet=x.nextLine();                                                      // input if he wants nutritional program 
        diet = diet.toLowerCase();
        if (diet.equals("yes"))
            total+=269;
        
            
        while (option != 4) {                                                   // while for options
            System.out.println("--------------------");
            System.out.println("we have a small surprise for you\nif the total price is between(300SR-599SR)you will get a discount of 150SR\nand between (600SR-999SR)you will get a discount of 300SR\nand over (1000SR)you will get a discount of 500SR");
            System.out.println("please choose an option:");
            System.out.println("option1: SWIMMING POOL");
            System.out.println("option2: BOXING");
            System.out.println("option3: ZUMBA CLASSES");
            System.out.println("option4 to leave");
            option = x.nextInt();                                               //input option
            if (option == 1) {                                                  // option 1 (SWIMMING POOL)
                System.out.println("you chose SWIMMING POOL");
                System.out.println("--------------------");
                System.out.println("do you want personal trainer?");
                p = x.next();                                                   //input with trainer or not
                p = p.toLowerCase();                                            //to lower the word
                if (p.equals("yes")) {                                          // if with trainer
                    System.out.println("you chose SWIMMING POOL with trainer");
                    System.out.println("it's 130SR for 1 session(60min)");
                    System.out.println("--------------------");
                    System.out.println("how many sessions do you want in a week?");
                    System.out.println("2 sessions");
                    System.out.println("3 sessions");
                    System.out.println("4 sessions");
                    s = x.nextInt();                                            // input how many sessions
                    if (s == 2) {                                               //if 2 sessions
                        System.out.println("--------------------");
                        System.out.println("which coach do you want?(write the number)");
                        System.out.println("1-RAHAF");
                        System.out.println("2-DANA");
                        System.out.println("3-TAIF");
                        coach = x.nextInt();                                    // input which coach
                        if (coach == 1) {                                       // if coach rahaf
                            total = total + 130 * 2;
                            service = service + " " + "SWIMMING POOL with trainer for 2 sessions with coach RAHAF.\n";
                        } else {
                            if (coach == 2) {                                   // if coach dana
                                total = total + 130 * 2;
                                service = service + " " + "SWIMMING POOL with trainer for 2 sessions with coach DANA.\n";
                            } else {
                                if (coach == 3) {                               // if coach taif
                                    total = total + 130 * 2;
                                    service = service + " " + "SWIMMING POOL with trainer for 2 sessions with coach TAIF.\n";
                                } else {
                                    System.out.println("you didn't choose a coach");
                                }
                            }
                        }
                    } else {
                        if (s == 3) {                                           //if 3 sessions
                            System.out.println("--------------------");
                            System.out.println("which coach do you want?(write the number)");
                            System.out.println("1-RAHAF");
                            System.out.println("2-DANA");
                            System.out.println("3-TAIF");
                            coach = x.nextInt();                                // input which coach
                            if (coach == 1) {                                   // if coach rahaf
                                total = total + 130 * 3;
                                service = service + " " + "SWIMMING POOL with trainer for 3 sessions with coach RAHAF.\n";
                            } else {
                                if (coach == 2) {                               // if coach dana
                                    total = total + 130 * 3;
                                    service = service + " " + "SWIMMING POOL with trainer for 3 sessions with coach DANA.\n";
                                } else {
                                    if (coach == 3) {                           // if coach taif
                                        total = total + 130 * 3;
                                        service = service + " " + "SWIMMING POOL with trainer for 3 sessions with coach TAIF.\n";
                                    } else {
                                        System.out.println("you didn't choose a coach");
                                    }
                                }
                            }
                        } else {
                            if (s == 4) {                                       //if 4 sessions
                                System.out.println("--------------------");
                                System.out.println("which coach do you want?(write the number)");
                                System.out.println("1-RAHAF");
                                System.out.println("2-DANA");
                                System.out.println("3-TAIF");
                                coach = x.nextInt();                            // input which coach
                                if (coach == 1) {                               // if coach rahaf
                                    total = total + 130 * 4;
                                    service = service + " " + "SWIMMING POOL with trainer for 4 sessions with coach RAHAF.\n";
                                } else {
                                    if (coach == 2) {                           // if coach dana
                                        total = total + 130 * 4;
                                        service = service + " " + "SWIMMING POOL with trainer for 4 sessions with coach DANA.\n";
                                    } else {
                                        if (coach == 3) {                       // if coach taif
                                            total = total + 130 * 4;
                                            service = service + " " + "SWIMMING POOL with trainer for 4 sessions with coach TAIF.\n";
                                        } else {
                                            System.out.println("you didn't choose a coach");
                                        }
                                    }
                                }
                            } else {
                                System.out.println("you didn't choose a session");
                            }
                        }
                    }
                } else {                                                        // option 1 if false(without trainer)
                    System.out.println("--------------------");
                    System.out.println("you chose SWIMMING POOL");
                    System.out.println("it's 100SR for 1 session(60min)");
                    System.out.println("--------------------");
                    System.out.println("how many sessions do you want in a week?");
                    System.out.println("2 sessions");
                    System.out.println("3 sessions");
                    System.out.println("4 sessions");
                    s = x.nextInt();                                            // input how many sessions
                    if (s == 2) {                                               //if 2 session
                        total = total + 100 * 2;
                        service = service + " " + "SWIMMING POOL for 2 sessions\n";
                    } else {
                        if (s == 3) {                                           //if 3 sessions
                            total = total + 100 * 3;
                            service = service + " " + "SWIMMING POOL for 3 sessions\n";
                        } else {
                            if (s == 4) {                                       //if 4 sessions
                                total = total + 100 * 4;
                                service = service + " " + "SWIMMING POOL for 4 sessions\n";
                            } else {
                                System.out.println("you didn't choose a session");
                            }
                        }
                    }
                }
            } else {                                                            // if option 1 false
                if (option == 2) {                                              // if option 2(BOXING)
                    System.out.println("--------------------");
                    System.out.println("you chose BOXING");
                    System.out.println("--------------------");
                    System.out.println("do you want personal trainer?");
                    p = x.next();                                               //input with trainer or not
                    p = p.toLowerCase();                                        //to lower the word 
                    if (p.equals("yes")) {                                      // if with trainer
                        
                        System.out.println("you chose BOXING with trainer");
                        System.out.println("it's 150SR for 1 session(60min)");
                        System.out.println("--------------------");
                        System.out.println("how many sessions do you want in a week?");
                        System.out.println("2 sessions");
                        System.out.println("3 sessions");
                        System.out.println("4 sessions");
                        s = x.nextInt();                                        // input how many sessions
                        if (s == 2) {                                           //if 2 sessions
                            System.out.println("--------------------");
                            System.out.println("which coach do you want?(write the number)");
                            System.out.println("1-RAHAF");
                            System.out.println("2-DANA");
                            System.out.println("3-TAIF");
                            coach = x.nextInt();                                // input which coach
                            if (coach == 1) {                                   // if coach rahaf
                                total = total + 150 * 2;
                                service = service + " " + "BOXING with trainer for 2 sessions with coach RAHAF.\n";
                            } else {
                                if (coach == 2) {                               // if coach dana
                                    total = total + 150 * 2;
                                    service = service + " " + "BOXING with trainer for 2 sessions with coach DANA.\n";
                                } else {
                                    if (coach == 3) {                           // if coach taif
                                        total = total + 150 * 2;
                                        service = service + " " + "BOXING with trainer for 2 sessions with coach TAIF.\n";
                                    } else {
                                        System.out.println("you didn't choose a coach");
                                    }
                                }
                            }
                        } else {
                            if (s == 3) {                                       // if 3 sessions
                                System.out.println("--------------------");
                                System.out.println("which coach do you want?(write the number)");
                                System.out.println("1-RAHAF");
                                System.out.println("2-DANA");
                                System.out.println("3-TAIF");
                                coach = x.nextInt();                            // input which coach
                                if (coach == 1) {                               //if coach rahaf
                                    total = total + 150 * 3;
                                    service = service + " " + "BOXING with trainer for 3 sessions with coach RAHAF.\n";
                                } else {
                                    if (coach == 2) {                           //if coach dana
                                        total = total + 150 * 3;
                                        service = service + " " + "BOXING with trainer for 3 sessions with coach DANA.\n";
                                    } else {
                                        if (coach == 3) {                       //if coach taif
                                            total = total + 150 * 3;
                                            service = service + " " + "BOXING with trainer for 3 sessions with coach TAIF.\n";
                                        } else {
                                            System.out.println("you didn't choose a coach");
                                        }
                                    }
                                }
                            } else {
                                if (s == 4) {                                   // input how many sessions
                                   System.out.println("--------------------");
                                    System.out.println("which coach do you want?(write the number)");
                                    System.out.println("1-RAHAF");
                                    System.out.println("2-DANA");
                                    System.out.println("3-TAIF");
                                    coach = x.nextInt();                        // input which coach
                                    if (coach == 1) {                           //if coach rahaf
                                        total = total + 150 * 4;
                                        service = service + " " + "BOXING with trainer for 4 sessions with coach RAHAF.\n";
                                    } else {
                                        if (coach == 2) {                       //if coach dana
                                            total = total + 150 * 4;
                                            service = service + " " + "BOXING with trainer for 4 sessions with coach DANA.\n";
                                        } else {
                                            if (coach == 3) {                   //if coach taif
                                                total = total + 150 * 4;
                                                service = service + " " + "BOXING with trainer for 4 sessions with coach TAIF.\n";
                                            } else {
                                                System.out.println("you didn't choose a coach");
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("you didn't choose a session");
                                }
                            }
                        }
                    } else {                                                    // option 2 if false(without trainer)
                        System.out.println("you chose BOXING");
                        System.out.println("it's 120SR for 1 session(60min)");
                        System.out.println("--------------------");
                        System.out.println("how many sessions do you want in a week?");
                        System.out.println("2 sessions");
                        System.out.println("3 sessions");
                        System.out.println("4 sessions");
                        s = x.nextInt();
                        if (s == 2) {                                           // if 2 sessions 
                            total = total + 120 * 2;
                            service = service + " " + "BOXING for 2 sessions\n";
                        } else {
                            if (s == 3) {                                       // if 3 sessions
                                total = total + 120 * 3;
                                service = service + " " + "BOXING for 3 sessions\n";
                            } else {
                                if (s == 4) {                                   //if 4 sessions
                                    total = total + 120 * 4;
                                    service = service + " " + "BOXING for 4 sessions\n";
                                } else {
                                    System.out.println("you didn't choose a session");
                                }
                            }
                        }
                    }
                } else {                                                        // if option 1 and 2 false
                    if (option == 3) {                                          // if option 3 (zumba classes)
                        System.out.println("you chose ZUMBA CLASSES");
                        System.out.println("it's 200SR for 1 session(60min)");
                        System.out.println("--------------------");
                        System.out.println("how many sessions do you want in a week?");
                        System.out.println("2 session");
                        System.out.println("3 session");
                        System.out.println("4 session");
                        s = x.nextInt();                                        // input how many sessions
                        if (s == 2) {                                           // if 2 sessions 
                            total = total + 200 * 2;
                            service = service + " " + "ZUMBA CLASSES for 2 sessions\n";
                        } else {
                            if (s == 3) {                                       //if 3 sessions
                                total = total + 200 * 3;
                                service = service + " " + "ZUMBA CLASSES for 3 sessions\n";
                            } else {
                                if (s == 4) {                                   //if 4 sessions
                                    total = total + 200 * 4;
                                    service = service + " " + "ZUMBA CLASSES for 4 sessions\n";
                                } else {
                                    System.out.println("you didn't choose a session");
                                }
                            }
                        }
                    } else {                                                    // if option 1 and 2 and 3 false 
                        if (option == 4) {
                            System.out.println("thanks");
                        } else {
                            System.out.println("you didn't choose anything!");
                        }
                    }
                }
            }
            System.out.println("do you want something else?");
            again = x.next();                                                   // input if he wants somthing else 
            again = again.toLowerCase();                                        // to lower the word
            if (again.equals("yes")) {                                          // if yes will start from the beginning
                option = 1;
            } else {                                                            // if no will end 
                option = 4;
            }

        }

        // print the receipt
        System.out.println("--------------------");
        System.out.println("your name is: " + FirstName + " " + LastName);
        System.out.println("--------------------");
        System.out.println("your number is: 0" + num);
        System.out.println("--------------------");
        System.out.println("the total is: " + disco(total) + "SR");
        System.out.println("--------------------");
        System.out.println(service);
        System.out.println("--------------------");
        
        do{                                                                     //to check if the user entered wrong number
           System.out.println("we will be so happy to know your evaluation, please share it with us to improve our content:"); //ask the customer to evaluate
           System.out.println("1=strongly unsatisfied x_x");
           System.out.println("2=unsatisfied ~_~");
           System.out.println("3=satisfied -_-");
           System.out.println("4=strongly satisfied ^_^");
           System.out.println("5=outstanding :)");
           eval = x.nextInt();                                                     //input the evaluation from user

            switch (eval) {                                                         // switch loop for evaluation
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("--------------------");
                    System.out.println("please tell us your feedback:");
                    x.nextLine();
                    res = x.nextLine();                                             //input the reason from user
                    System.out.println("thanks!,we will do our best to be better");
                    break;
                case 5:
                    System.out.println("thanks for choosing us\nwe wish you joy and good health");
                    break;
                default:
                    System.out.println("you didn't choose\ntry again");
                    eval=6;
            }
        }while(eval==6);
        }
        
   

    
    public static int disco(int total) {                                        //method to calculate the discount

        if (total >= 300 && total < 600) {           
            total = (total - 150);
        } else if (total >= 600 && total < 1000) {
            total = total - 300;
        } else if (total >= 1000) {
            total = total - 500;
        } else {
            total = total;
        }
        return total;

    }

    public static double maleCaloCalc(double weight, double tall, double age, double actilev) { //method to calculate calorie for male

        double maleCalo;

        maleCalo =5+(weight * 10) + (6.25 * tall) - (5 * age);
        
            if (actilev == 1) 
                 maleCalo = maleCalo * 1.25;
            else if (actilev==2)
                 maleCalo=maleCalo*1.375;
            else if (actilev==3)
                 maleCalo=maleCalo*1.550;
            else if (actilev==4)
                 maleCalo=maleCalo*1.725;
            else if (actilev==5)
                maleCalo=maleCalo*1.9;
            else
                System.out.println("you didn't choose");
           return maleCalo;
       
    }

    public static double femaleCaloCalc(double weight, double tall, double age, double actilev) { //method to calculate  calorie for female

        double femaleCalo;
        femaleCalo =(weight * 10) + (6.25 * tall) - (5 * age)-161;
        if (actilev == 1) 
            femaleCalo = femaleCalo * 1.25;
        else if (actilev==2)
                 femaleCalo=femaleCalo*1.375;
        else if (actilev==3)
                 femaleCalo=femaleCalo*1.550;
         else if (actilev==4)
                 femaleCalo=femaleCalo*1.725;
         else if (actilev==5)
                 femaleCalo=femaleCalo*1.9;
         else
                 System.out.println("you didn't choose");
         
        return femaleCalo;
        }
   
    public static void Bmi(double weight, double tall){                       //method to calculate body mass index
        double Bmi;
         Bmi=(weight/((tall*tall)))*10000;
        
        if (Bmi < 18.5)
            System.out.println("your body mass is:under weight");
        else if (Bmi>=18.5&&Bmi<=24.9)
            System.out.println("your body mass is:normal weight");
        else if (Bmi>=25&&Bmi<=29.9)
            System.out.println("your body mass is:over weight");
         else if (Bmi>=30&&Bmi<=34.9)
            System.out.println("your body mass is:obese class |");
         else if (Bmi>=35&&Bmi<=39.9)
            System.out.println("your body mass is:obese class ||");
         else
                 System.out.println("your body mass is:obese class |||");
               }
        
    }
