import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
  {
        int dziesietna;
        int dzielenieCalkowite;
        String binarna = "";
        Scanner nowy = new Scanner(System.in);
        System.out.println("Podaj liczbę dziesiętną: ");
        dziesietna = nowy.nextInt();
    
    
      while(dziesietna > 0)
        {
          dzielenieCalkowite = dziesietna % 2;
          binarna = dzielenieCalkowite + binarna;
          dziesietna = dziesietna / 2;
        }
        System.out.println("Liczba w zapisie binarnym: "+binarna);
    }
}
