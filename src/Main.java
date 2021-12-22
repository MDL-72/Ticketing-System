
import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    
	  System.out.println("Draft of Ticketing System");
      
      double PrivateTax = 4260;
      double BusinessTax = 5700;
      double RegularTax = 2500;
      
      double OptionAPrivate = 8000;
      double OptionABusiness = 12500;
      double OptionARegular = 3500;
      
      double OptionBPrivate = 9800;
      double OptionBBusiness = 12950;
      double OptionBRegular = 3900;
      
      double OptionCPrivate = 9100;
      double OptionCBusiness = 10500;
      double OptionCRegular = 3200;
      
      double OptionDPrivate = 9850;
      double OptionDBusiness = 10975;
      double OptionDRegular = 3575;
      
      double OptionEPrivate = 27450;
      double OptionEBusiness = 37390;
      double OptionERegular = 12055;
      
      double OptionFPrivate = 30890;
      double OptionFBusiness = 39650;
      double OptionFRegular = 13100;
      
      double OptionGPrivate = 40450;
      double OptionGBusiness = 45355;
      double OptionGRegular = 27800;
      
      double OptionHPrivate = 43855;
      double OptionHBusiness = 49780;
      double OptionHRegular = 29400;
      
      double OptionIPrivate = 8505;
      double OptionIBusiness = 12345;
      double OptionIRegular = 3200;
      
      double OptionJPrivate = 14300;
      double OptionJBusiness = 16320;
      double OptionJRegular = 4600;
      
      double TravelPrivate = 4500;
      double TravelBusiness = 6500;
      double TravelRegular = 950;
      
      double TransactFee = 550;
      double TransactFeeReg = 255;
      
      int TravelType = 0;
      int localdes = 0;
      int Destype = 0;
      double Total = 0;
      double TotalPrivateLocalFlight = 0;
      double TotalBusLocalFlight = 0;
      double TotalRegLocalFlight = 0;
      double sub_Total = 0;
      
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Please Enter the Number of Passenger: ");
        int Passenger = sc.nextInt();

        String[] PassengerName = new String[Passenger];
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please input the neccessary details!!!");
        int[] PassengerAge = new int[PassengerName.length];
        
        Scanner age1 = new Scanner(System.in);
        Scanner tratype = new Scanner(System.in);
        Scanner Destitype = new Scanner(System.in);
        Scanner local1 = new Scanner(System.in);
        
        String[] PrivatePassenger = new String[PassengerName.length];
        String[] BusPassenger = new String[PassengerName.length];
        String[] RegPassenger = new String[PassengerName.length];
        String[] PassengerInfo = new String[6];
        
      for(int i = 0; i < PassengerName.length; i++){
          System.out.print("\nPlease Input the Full Name of the Passenger: ");
          PassengerName[i] = sc1.nextLine();
          
          PassengerInfo[0] = PassengerName[i];
          
          System.out.print("Input Age: ");
          PassengerAge[i] = age1.nextInt();
          
          PassengerInfo[1] = Integer.toString(PassengerAge[i]);
          
          System.out.println("\nChoose your Travel Type: ");
          System.out.println("1. Private Class\t P 4,260.00 \n2. Business Class\t P 5,700.00 \n3. Regular Class\t P 2,500.00");
          System.out.print("Please choose from above (Option 1, Option 2, or Option 3): ");
          TravelType = tratype.nextInt();
          
          //PassengerInfo[2] = TravelType;
          
          if(TravelType == 1){
              PrivatePassenger[i] = PassengerName[i];
              PassengerInfo[2] = "Private Class";
            }
          else if (TravelType == 2){
              BusPassenger[i] = PassengerName[i];
              PassengerInfo[2] = "Business Class";
          }
          else if(TravelType == 3){
              PassengerInfo[2] = "Regular Class";
          }
          
          System.out.println("\nChoose your Destination: \n1.Local \n2.International");
          System.out.print("Please choose from above (1 for Local, 2 for International): ");
          Destype = Destitype.nextInt();
          

          if(Destype == 1){
              PassengerInfo[3] = "Local Flight";
          }
          else if(Destype == 2){
              PassengerInfo[3] = "International Flight";
          }
          
          
          if(Destype == 1 && TravelType == 1){
              System.out.println("\nAvailable Local Flights for Private Class:");
              System.out.println("1) Manila to Batanes\t P 8,000.00 \n2) Batanes to Manila\t P 9,800.00 \n3) Manila to Palawan\t P 9,100.00 \n4) Palawan to Manila\t P 9,850.00");
              System.out.print("Destination Option: ");
              localdes = local1.nextInt();
              
              if(localdes == 1){
                  TotalPrivateLocalFlight = 8000;
                  sub_Total = TotalPrivateLocalFlight;
                  PassengerInfo[4] = "Manila to Batanes";
              }
              else if (localdes == 2){
                  TotalPrivateLocalFlight = 9800;
                  sub_Total = TotalPrivateLocalFlight;
                  PassengerInfo[4] = "Batanes to Manila";
              }
              else if(localdes == 3){
                  TotalPrivateLocalFlight = 9100;
                  sub_Total = TotalPrivateLocalFlight;
                  PassengerInfo[4] = "Manila to Palawan";
              }
              else if(localdes == 4){
                  TotalPrivateLocalFlight = 9850;
                  sub_Total = TotalPrivateLocalFlight;
                  PassengerInfo[4] = "Palawan to Manila";
              }
          }
          else if (TravelType == 2 && Destype == 1){
              System.out.println("\nAvailable Local Flights for Business Class:");
              System.out.println("1) Manila to Batanes\t P 12,500.00 \n2) Batanes to Manila\t P 12,950.00 \n3) Manila to Palawan\t P 10,500.00 \n4) Palawan to Manila\t P 10,975.00");
              System.out.print("Destination Option: ");
              localdes = local1.nextInt();
              if(localdes == 1){
                  TotalBusLocalFlight = 12500;
                  sub_Total = TotalBusLocalFlight;
                  PassengerInfo[4] = "Manila to Batanes";
              }
              else if (localdes == 2){
                  TotalBusLocalFlight = 12950;
                  sub_Total = TotalBusLocalFlight;
                  PassengerInfo[4] = "Batanes to Manila";
              }
              else if(localdes == 3){
                  TotalBusLocalFlight = 10500;
                  sub_Total = TotalBusLocalFlight;
                  PassengerInfo[4] = "Manila to Palawan";
              }
              else if(localdes == 4){
                  TotalBusLocalFlight = 10975;
                  sub_Total = TotalBusLocalFlight;
                  PassengerInfo[4] = "Palawan to Manila";
              }
              
          }
          else if (TravelType == 3 && Destype == 1){
              System.out.println("\nAvailable Local Flights for Regular Class:");
              System.out.println("1) Manila to Batanes\t P 3,500.00 \n2) Batanes to Manila\t P 3,900.00 \n3) Manila to Palawan\t P 3,200.00 \n4) Palawan to Manila\t P 3,575.00");
              System.out.print("Destination Option: ");
              localdes = local1.nextInt();
              if(localdes == 1){
                  TotalRegLocalFlight = 3500;
                  sub_Total = TotalRegLocalFlight;
                  PassengerInfo[4] = "Manila to Batanes";
              }
              else if (localdes == 2){
                  TotalRegLocalFlight = 3900;
                  sub_Total = TotalRegLocalFlight;
                  PassengerInfo[4] = "Batanes to Manila";
              }
              else if(localdes == 3){
                  TotalRegLocalFlight = 3200;
                  sub_Total = TotalRegLocalFlight;
                  PassengerInfo[4] = "Manila to Palawan";
              }
              else if(localdes == 4){
                  TotalRegLocalFlight = 3575;
                  sub_Total = TotalRegLocalFlight;
                  PassengerInfo[4] = "Palawan to Manila";
              }
              
          }
          
          else{
              System.out.println("\nAvailable International Flights:");
          }
          if(TravelType == 1){
          //System.out.println("Private Class");
          Total = (TransactFee * PrivatePassenger.length) + PrivateTax + sub_Total;
          PassengerInfo[5] = String.valueOf(Total);
          
      }
      else if (TravelType == 2){
          //System.out.println("Business Class");
          Total = (TransactFee * PrivatePassenger.length) + BusinessTax + sub_Total;
          PassengerInfo[5] = String.valueOf(Total);
      }
      else if (TravelType == 3){
          //System.out.println("Regular Class");
          Total = (TransactFee * PrivatePassenger.length) + RegularTax + sub_Total;
          PassengerInfo[5] = String.valueOf(Total);
      }
      
      if(Destype == 1){
          //System.out.println("Local Flight");
      }
      else{
          //System.out.println("International Flight");
      }
      System.out.println("\nHello "+PassengerInfo[0]+"! "+ PassengerInfo[1] +"years old. You are on " + PassengerInfo[2] +"-"+ PassengerInfo[3] +" Destination: "+ PassengerInfo[4] + " with a total amount of "+PassengerInfo[5]);
          
          
      }
      //System.out.println(Arrays.toString(PassengerName));
      //System.out.println(Arrays.toString(PassengerAge));
      //System.out.println(Arrays.toString(PrivatePassenger));
      
     // if(TravelType == 1){
          //System.out.println("Private Class");
     //     Total = (TransactFee * PrivatePassenger.length) + PrivateTax + sub_Total;
      //    PassengerInfo[5] = String.valueOf(Total);
          
     // }
     // else if (TravelType == 2){
          //System.out.println("Business Class");
     //     Total = (TransactFee * PrivatePassenger.length) + BusinessTax + sub_Total;
      //    PassengerInfo[5] = String.valueOf(Total);
    //  }
     // else if (TravelType == 3){
          //System.out.println("Regular Class");
     //     Total = (TransactFee * PrivatePassenger.length) + RegularTax + sub_Total;
     //     PassengerInfo[5] = String.valueOf(Total);
     // }
      
     // if(Destype == 1){
          //System.out.println("Local Flight");
     // }
     // else{
          //System.out.println("International Flight");
      //}
      //System.out.println("\nHello "+PassengerInfo[0]+"! "+ PassengerInfo[1] +"years old. You are on " + PassengerInfo[2] +"-"+ PassengerInfo[3] +" Destination: "+ PassengerInfo[4] + " with a total amount of "+PassengerInfo[5]);
      
      }
	}

