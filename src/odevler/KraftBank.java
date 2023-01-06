package odevler;

import java.util.Random;

public class KraftBank {
    int customerId;
    String customerFullName;
    boolean isSms;
    double customerAccount;
    String customerToken;

    public KraftBank(int customerId,String customerFullName,boolean isSms){
        this.customerId=customerId;
        this.customerFullName=customerFullName;
        this.isSms=isSms;
    }
    public String getCustomerToken( ){
        Random rd=new Random();
        int num=rd.nextInt(1000,9999);
        customerToken=String.valueOf(customerId).substring(0,2)+customerFullName.substring(0,2)+num;
        return customerToken;
    }
    public double addMoney(double add){
        this.customerAccount=customerAccount;
        customerAccount+=add;
        return customerAccount;
    }


}
