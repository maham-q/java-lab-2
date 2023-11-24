class Currency{
    public void convert(float a, String b) {
        double x=0;
        if(b=="USD"){
            x=(a/236);
            System.out.println(a+ " PKR is equal to " +x+ " USD");
        }
        else if(b=="POUND"){
            x=(a/236)*0.88;
            System.out.println(a+ " PKR is equal to " +x+ " Pound");

        }
        else if(b=="DIRHAM"){
            x=(a/236)*3.67;
            System.out.println(a+ " PKR is equal to " +x+ " Dirham");
        }
        else if(b=="INR"){
            x=(a/236)*79;
            System.out.println(a+ " PKR is equal to " +x+ " INR");
        }
        else if(b=="BDT"){
            x=(a/236)*104;
            System.out.println(a+ " PKR is equal to " +x+ " BDT");
        }
        else if(b=="JPY"){
            x=(a/236)*142;
            System.out.println(a+ " PKR is equal to " +x+ " JPY");
        }
        else{
            System.out.println("Invalid");
        }
    }

}
public class q2 {
    public static void main(String args[]) {
        Currency c= new Currency();
        c.convert(236, "USD");
    }
}
