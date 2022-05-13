import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;

        Scanner input = new Scanner(System.in);
        System.out.print("Kacinci Ayda Dogdugunuzu Giriniz: ");
        ay = input.nextInt();
        System.out.print("Ayin Kacinci Gunu Dogdugunuzu Giriniz: ");
        gun = input.nextInt();

        if ((ay==1) && (gun<=21)) {
            System.out.print("Oglak Burcusunuz!");
        } else if ((ay==1) && (gun>=22)) {
            System.out.print("Kova Burcusunuz!");
        } else if ((ay==2) && (gun<=19)) {
            System.out.print("Kova Burcusunuz!");
        } else if ((ay==2) && (gun>=20)) {
            System.out.print("Balik Burcusunuz!");
        } else if ((ay==3) && (gun<=20)) {
            System.out.print("Balik Burcusunuz!");
        } else if ((ay==3) && (gun>20)) {
            System.out.print("Koc Burcusunuz!");
        } else if ((ay==4) && (gun<=20)) {
            System.out.print("Koc Burcusunuz!");
        } else if ((ay==4) && (gun>20)) {
            System.out.print("Boga Burcusunuz!");
        } else if ((ay==5) && (gun<=21)) {
            System.out.print("Boga Burcusunuz!");
        } else if ((ay==5) && (gun>21)) {
            System.out.print("Ikizler Burcusunuz!");
        } else if ((ay==6) && (gun<=22)) {
            System.out.print("Ikizler Burcusunuz!");
        } else if ((ay==6) && (gun>22)) {
            System.out.print("Yengec Burcusunuz!");
        } else if ((ay==7) && (gun<=22)) {
            System.out.print("Yengec Burcusunuz!");
        } else if ((ay==7) && (gun>22)) {
            System.out.print("Aslan Burcusunuz!");
        } else if ((ay==8) && (gun<=22)) {
            System.out.print("Aslan Burcusunuz!");
        } else if ((ay==8) && (gun>22)) {
            System.out.print("Basak Burcusunuz!");
        } else if ((ay==9) && (gun<=22)) {
            System.out.print("Basak Burcusunuz!");
        } else if ((ay==9) && (gun>22)) {
            System.out.print("Terazi Burcusunuz!");
        } else if ((ay==10) && (gun<=22)) {
            System.out.print("Terazi Burcusunuz!");
        } else if ((ay==10) && (gun>22)) {
            System.out.print("Akrep Burcusunuz!");
        } else if ((ay==11) && (gun<=21)) {
            System.out.print("Akrep Burcusunuz!");
        } else if ((ay==11) && (gun>21)) {
            System.out.print("Yay Burcusunuz!");
        } else if ((ay==12) && (gun<=21)) {
            System.out.print("Yay Burcusunuz!");
        } else if ((ay==12) && (gun>21)) {
            System.out.print("Oglak Burcusunuz!");
        }
    }
}
