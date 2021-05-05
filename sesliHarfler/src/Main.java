public class Main {

    public static void main(String[] args) {
        char harf = 'E';
        // A, I, O, U --> Kalın Sesli Harfler
        // E, İ, Ö, Ü --> İnce Sesli Harfler

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }

    }
}
