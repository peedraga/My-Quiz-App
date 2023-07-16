package com.example.quizapp;

import java.util.ArrayList;
import java.util.Objects;

public class data {

    int x = 20;

    public String question(Integer n){
        ArrayList<String> ques = new ArrayList<>(x);

        ques.add("* Brass gets discoloured in air because of the presence of which of the following gases in air?");
        ques.add("* Which of the following is a non metal that remains liquid at room temperature?");
        ques.add("* Chlorophyll is a naturally occurring chelate compound in which central metal is");
        ques.add("* Which of the following is used in pencils?");
        ques.add("* Which of the following metals forms an amalgam with other metals?");
        ques.add("* Chemical formula for water is");
        ques.add("* The gas usually filled in the electric bulb is");
        ques.add("* Washing soda is the common name for");
        ques.add("* Quartz crystals normally used in quartz clocks etc. is chemically");
        ques.add("* Which of the gas is not known as green house gas?");
        ques.add("* If 20% of a = b, then b% of 20 is the same as:");
        ques.add("* The value of a machine depreciates at the rate of 10% every year. It was purchased 3 years ago. If its present value is Rs. 8748, its purchase price was:");
        ques.add("* Two goods train each 500 m long, are running in opposite directions on parallel tracks. Their speeds are 45 km/hr and 30 km/hr respectively. Find the time taken by the slower train to pass the driver of the faster one.");
        ques.add("* In a flight of 600 km, an aircraft was slowed down due to bad weather. Its average speed for the trip was reduced by 200 km/hr and the time of flight increased by 30 minutes. The duration of the flight is:");
        ques.add("* Average of five numbers is 20. If each number is multiplied by 2, what will be the new average?");
        ques.add("* How many times the hands of a clock coincide in a day?");
        ques.add("* What was the day of the week on 28th May, 2006?");
        ques.add("* What is the sum of first 35 natural numbers?");
        ques.add("* Find the number of three-digit numbers which are divisible by 6.");
        ques.add("* What is the angle between hour hand and minute hand of a clock at 3.30?");

        return (ques.get(n));
    }

    public String option1(Integer n){
        ArrayList<String> ops1 = new ArrayList<>(x);

        ops1.add("Oxygen");
        ops1.add("Helium");
        ops1.add("Calcium");
        ops1.add("Graphite");//3
        ops1.add("Lead");
        ops1.add("CaSiO3");
        ops1.add("Carbon dioxide");
        ops1.add("Sodium carbonate");//7
        ops1.add("Silicon Dioxide");//8
        ops1.add("Methane");
        ops1.add("4% of a");//10
        ops1.add("10000");
        ops1.add("12 sec");
        ops1.add("1 hour");//13
        ops1.add("30");
        ops1.add("24");
        ops1.add("Thursday");
        ops1.add("610");
        ops1.add("150");//18
        ops1.add("65°");

        return (ops1.get(n));
    }

    public String option2(Integer n){
        ArrayList<String> ops2 = new ArrayList<>(x);

        ops2.add("Nitrogen");
        ops2.add("Bromine");//1
        ops2.add("Copper");
        ops2.add("Phosphorous");
        ops2.add("Zinc");
        ops2.add("H2O");//5
        ops2.add("Carbon Dioxide");
        ops2.add("Calcium bicarbonate");
        ops2.add("Germanium oxide");
        ops2.add("Nitrous oxide");
        ops2.add("6% of a");
        ops2.add("12000");//11
        ops2.add("24 sec");//12
        ops2.add("2 hours");
        ops2.add("40");//14
        ops2.add("25");
        ops2.add("Friday");
        ops2.add("660");
        ops2.add("120");
        ops2.add("70°");

        return (ops2.get(n));
    }

    public String option3(Integer n){
        ArrayList<String> ops3 = new ArrayList<>(x);

        ops3.add("Carbon dioxide");
        ops3.add("Phosphorous");
        ops3.add("Iron");
        ops3.add("Silicon");
        ops3.add("Mercury");//4
        ops3.add("Al2O3");
        ops3.add("nitrogen");//6
        ops3.add("Sodium bicarbonate");
        ops3.add("a mixture of germanium oxide and silicon dioxide");
        ops3.add("Carbon dioxide");
        ops3.add("8% of a");
        ops3.add("14000");
        ops3.add("48 sec");
        ops3.add("3 hours");
        ops3.add("50");
        ops3.add("22");//15
        ops3.add("Saturday");
        ops3.add("645");
        ops3.add("130");
        ops3.add("75°");//19

        return (ops3.get(n));
    }

    public String option4(Integer n){
        ArrayList<String> ops4 = new ArrayList<>(x);

        ops4.add("Hydrogen sulphide");//0
        ops4.add("Chlorine");
        ops4.add("magnesium");//2
        ops4.add("Charcoal");
        ops4.add("Tin");
        ops4.add("NaAlO2");
        ops4.add("Hydrogen");
        ops4.add("Calcium carbonate");
        ops4.add("Sodium Silicate");
        ops4.add("Hydrogen");//9
        ops4.add("10% of a");
        ops4.add("16000");
        ops4.add("60 sec");
        ops4.add("4 hours");
        ops4.add("20");
        ops4.add("23");
        ops4.add("Sunday");//16
        ops4.add("630");//17
        ops4.add("110");
        ops4.add("80°");

        return (ops4.get(n));
    }

    public boolean answer(Integer n, String op){
        String[] ans = new String[x];
        ans[0] = option4(0);
        ans[1] = option2(1);
        ans[2] = option4(2);
        ans[3] = option1(3);
        ans[4] = option3(4);
        ans[5] = option2(5);
        ans[6] = option3(6);
        ans[7] = option1(7);
        ans[8] = option1(8);
        ans[9] = option4(9);
        ans[10] = option1(10);
        ans[11] = option2(11);
        ans[12] = option2(12);
        ans[13] = option1(13);
        ans[14] = option2(14);
        ans[15] = option3(15);
        ans[16] = option4(16);
        ans[17] = option4(17);
        ans[18] = option1(18);
        ans[19] = option3(19);

        return (Objects.equals(ans[n], op));
    }
}
