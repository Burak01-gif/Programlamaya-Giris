import java.util.Scanner;

public class GunSayısı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yılı girin : ");
        int yıl = input.nextInt();
        int gün=0;
        System.out.println("1 den 12. aya kadar günler : ");

        while (gün<=12){
            if ((gün==2)&& (yıl%4==0)) {
                System.out.println("GunSayısı : " + 29);
            }else if (gün==2){
                System.out.println("GunSayısı : " + 28);
            }else if (gün==1||gün==3||gün==5||gün==7||gün==9||gün==11){
                System.out.println("GunSayısı : " + 31);
            }else if (gün==4||gün==6||gün==8||gün==10||gün==12){
                System.out.println("GunSayısı : " + 30);
            }
            gün++;
        }

    }
}
