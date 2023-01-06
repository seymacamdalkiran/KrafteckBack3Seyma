package day_40_Summary;

import java.util.Random;

public class KraftBank {
    private int customerId;
    private String customerFullName;
    private boolean isSms;
    private double customerAccount;
    private String customerToken;

    public static String staticDegisken="Emre Bey";//static olanlar italik yazıyor :)

    public String normalDegisken;
    public static int musteriSayisi;


    public KraftBank(int customerId,String customerFullName,boolean isSms){
        this.customerId=customerId;
        this.customerFullName=customerFullName;
        this.isSms=isSms;
        this.customerToken=this.tokenUret();

    }
    // id görüntülensin ama değiştirelemesin istiyorsak get metodu oluştur.
    public int getCustomerId(){
        return this.customerId;
    }
    public double getCustomerAccount(String token){
       if(this.customerToken.equals(token)){
        return this.customerAccount;}
       return -1;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public boolean getIsSms() {
        return isSms;
    }

    public void setSms(boolean sms) {
        isSms = sms;
    }

    private String tokenUret(){
        Random rd=new Random();
        int sayi=rd.nextInt(1000,9999);
        return this.customerId+this.customerFullName.substring(0,2)+sayi;
    }
    public String getTokenUret(){
        return tokenUret();
    }

    public void addMoney(double money){
        this.customerAccount+=money;  }


    public KraftBank(int customerId, String customerFullName, boolean isSms, double customerAccount) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;
        this.customerAccount = customerAccount;
        this.customerToken=this.tokenUret();

    }
}
class main{
    public static void main(String[] args) {

    KraftBank musteri_1=new KraftBank(2023,"seyma",false);
   //     System.out.println("musteri_1.customerToken = " + musteri_1.customerToken);
        // private yazdığımız için customerToken ı göstermedi

        System.out.println(musteri_1.getCustomerId());  //customerId göremiyoruz private olduğu için. oyüzden get metodu ile çağırdık.

        System.out.println(musteri_1.getTokenUret());

        System.out.println(musteri_1.staticDegisken);   //kullanabilirsin ama önerilmez.

        //static metot olması çağırmada kolaylık sağlar

    }
}