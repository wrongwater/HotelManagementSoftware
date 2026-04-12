import java.util.Scanner;

public static void Main(String[] args)
{
        Scanner scanner =new Scanner(System.in);
        int wybór = -1;
        do     {
                System.out.println("Main Menu");
                String newline = System.lineSeparator();
                System.out.println("1. Check-ins" + newline + "2. Check-outs" + newline + "3. Reservations" + newline +
                "4. Booking" + newline + "5. Billing" + newline + "6. Room management" + newline + "7. Housekeepinng" +
                "8. Room Service" + newline + "9. Parking" + newline + "10. Restaurant" + newline + "11. Swimming pool" +
                newline + "12. Sauna" + newline + "Wciśnij wybraną opcje:");
                try     {
                        wybór = scanner.nextInt();
                        switch (wybór)
                                {
                                case 1: System.out.println("Wybrano opcję pierwszą."); break;
                                case 2: System.out.println("Wybrano opcję drugą.");    break;
                                case 3: System.out.println("Wybrano opcje trzecią.");  break;
                                case 4: System.out.println("Wybrano opcję czwartą.");  break;
                                case 5: System.out.println("Wybrano opcję piątą.");    break;
                                case 6: System.out.println("Wybrano opcję piątą.");    break;
                                case 7: System.out.println("Wybrano opcję piątą.");    break;
                                case 8: System.out.println("Wybrano opcję piątą.");    break;
                                case 9: System.out.println("Wybrano opcję piątą.");    break;
                                case 10:System.out.println("Wybrano opcję piątą.");    break;
                                case 11:System.out.println("Wybrano opcję piątą.");break;
                                case 12:System.out.println("Wybrano opcję piątą.");break;
                                case 13:System.out.println("Wyjście z programu.");break;
                                default:System.out.println("Niewłaściwy wybór. Wybierz opcje od 1 do 13.");
                                }
                        }
                catch (InputMismatchException e)
                        {
                        while (wybór != 13) ;
                        scanner.close();
                        }
                }







        {
            Guest pierwszygosc = new Guest();
        }


enter the customers date

enter customer details


name:
        phone:
check-in:
        check-out:
        room type:
        room no.: customer id
        room info:
        restaurant:
        payment:




provide customers

        5. customers room service

payment

record of customers staying at hotel

        customers lists
        functions booking, room info, restaurant, payment, record

//example output



//wymagane
//        - 10 klas
        - 2 hierarchie dziedziczenia
        - 2 klasy abstrakcyjne
        - 2 metody abstrakcyjne
        - 3 petle
        - 3 tablice
        - upcasting
        - downcasting
        - 2 metody
        - 2 pola statyczne
        - wyjatek uzytkownika
        - obsluga wyjatkow
        - zgodny z technika hermetyzacji
        - 3 nadpisana metoda toString
        - nadpisana metoda equals
        - nadpisana metoda hashcode
        - kazda metoda nieabstrakcyjna ma miec zdefiniowana funkcjonalnosc
        - kazda metoda nieabstrakcyjna ma byc wywolana co najmniej raz
        - interfejs uzytkownika
        - sortowanie obiektow na dwa rozne sposoby z uzyciem Comparable i Comparator
            oraz wbudowanego sorwoaniaa uzywajacego tych interfejsow
        - zdefninowana metoda generyczna
        - uzyte kolekcje
        - wyswietlane komunikaty konsoli
        - utworzone obietky kazdej klasy minimum dwa razy
        - uzyty raz enum
