public class Main {

    public static void main(String[] args) {
	// 220 - 284
        int sayi1 = 220;
        int sayi2 = 284;
        int total = 0;

        for(int i=1; i<sayi1; i++) {
            if(sayi1 % i == 0) {
                total = total + i;
            }
        }
        if(total == sayi2) {
            System.out.println("Sayılar arkadaş sayıdır.");
        } else {
            System.out.println("Sayılar arkadaş sayı değildir.");
        }
    }
}
