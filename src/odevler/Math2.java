package odevler;

public class Math2 {

    int taban;
    int us;

    public double pow(int taban, int us){
        int result=1;
        if(us>0){
        for (int i = 1; i <=us ; i++) {
            result=result*taban;
        }}
        else if(us<0){
            for (int i = 1; i <=-us ; i++) {
                result=result/taban;
            }
        }else{
            result=1;
        }
    return result;
    }
    public static double StaticPow(int taban, int us){
        int result=1;
        if(us>0){
            for (int i = 1; i <=us ; i++) {
                result=result*taban;
            }}
        else if(us<0){
            for (int i = 1; i <=-us ; i++) {
                result=result/taban;
            }
        }else{
            result=1;
        }
        return result;
    }
}
