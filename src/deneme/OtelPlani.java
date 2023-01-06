package deneme;
import java.util.*;
public class OtelPlani {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

/*3 katlı bir motel in
1.katında resepsion, güvenlik ve hizmetli odası var.
2 katında yemekhane, dinlenme salanu ve
Room1,Room2
3.katında ise Room3,Room4,Room5,Room6 vardır. Bir
switch yapısı ile otel katlarını ve oda isimlerini girerek tanıtım
alacagınız bir program(nested switch) yazın.
Tanıtımbilgileri içinaşağıdakilerikullanabilirsiniz.
message 1 : lütfen motelimizi tanımak için 1-2-3 bir kat
numarası girin ve oda adı seçin.
message 2 :
1.kat : Resepsion-Güvenlik-Oda hizmetleri
2.kat : Yemekhane-Dinlenme salonu-Room1-Room2
3.kat : Room3-Room4-Room5-Room6
resepsion : tüm işlemleriniz için bekleriz
Güvenlik :  profosyonel bir hizmettir
Oda hizmetleri : temizlik ve taşıma hizmetleri için 101
dahili hattan ulaşabilirsiniz
Yemekhane : kahvaltı 08-11
öğle yemeği 12-15
akşam yemeği 18-21
Dinlenme salonu : 24 saat çay servisi ile hizmetinizdedir
Room1,Room2 : ekonomik oda
Room3,Room4 : standart oda
Room5,Room6 : özel oda

 */
        System.out.println("Kat numarasını girin");
        int x=scan.nextInt();
        switch(x){
            case 1:
            System.out.println("Resepsion için 1 i\nGüvenlik için 2 yi\nHizmetli odası için 3 ü tuşlayın.");
            int y=scan.nextInt();
            switch(y){
                case 1:
                    System.out.println("Tüm işlemleriniz için bekleriz");
                    break;
                case 2:
                    System.out.println("Profosyonel bir hizmettir");
                    break;
                case 3:
                    System.out.println("Temizlik ve taşıma hizmetleri için 101\n" +
                            "dahili hattan ulaşabilirsiniz");
                    break;
                default:
                    System.out.println("Hatalı tuşlama yaptınız.");
                    break;
            }break;
            case 2:
                System.out.println("Yemekhane için 1 i\nDinlenme salanu için 2 yi\nRoom1 için 3 ü\nRoom2 için 4 ü tuşlayın");
                int z=scan.nextInt();
                switch(z){
                    case 1:
                        System.out.println("kahvaltı 08⁰⁰-11⁰⁰\n" +
                                "öğle yemeği 12⁰⁰-15⁰⁰\n" +
                                "akşam yemeği 18⁰⁰-21⁰⁰\n Saatleri arasında hizmet vermektedir.");
                        break;
                    case 2:
                        System.out.println("24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case 3:
                        System.out.println("Ekonomik oda");
                        break;
                    case 4:
                        System.out.println("Ekonomik oda");
                        break;
                    default:
                        System.out.println("Hatalı tuşlama yaptınız.");
                        break;
                }break;
            case 3:
                System.out.println("Room3 için 3 i\nRoom4 için 4 yi\nRoom5 için 5 ü\nRoom6 için 6 ü tuşlayın");
                int t=scan.nextInt();
                switch(t){
                    case 3:
                        System.out.println("Standart oda");
                        break;
                    case 4:
                        System.out.println("Standart oda");
                        break;
                    case 5:
                        System.out.println("Standart oda");
                        break;
                    case 6:
                        System.out.println("Standart oda");
                        break;
                    default:
                        System.out.println("Hatalı tuşlama yaptınız");
                        break;
                }break;
            default:
                System.out.println("Hatalı tuşlama yaptınız");
                break;
        }














    }
}
