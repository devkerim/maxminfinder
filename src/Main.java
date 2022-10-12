import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	int sayi,max=0,min=0,t;
	System.out.println("Kaç tane sayı gireceksiniz: ");
	sayi = intscanner.nextInt();
	if(sayi<=0){System.out.println("Hatalı bir değer girdiniz.");}
	else{

	for(int i=1;i<=sayi;i++){

	    System.out.println(i+". sayıyı giriniz: ");
	    t = intscanner.nextInt();
	    if(i==1){max=t;min=t;}
	    if(t<=min){min=t;}
	    if(t>=max){max=t;}

    }
	System.out.println("En büyük sayı: "+max);
	System.out.println("En küçük sayı: "+min);}
    }
}
