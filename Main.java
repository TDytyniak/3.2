import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("wprowadź tekst");
    String text = scanner.nextLine();
    System.out.print();
    int l=0;
    String wynik = "";
    for (int i= 0; i<text.length(); i++)
         {
      char c = text.charAt(i);
      if (Character.isUpperCase(c))
      {
        wynik += Character.toLowerCase(c);
        l++;
      }
      else if (Character.toLowerCase(c))
      {
        wynik += Character.toUpperCase(c);
        l++;
      }
       else
      {
        wynik += c;
      }
    }
    System.out.println("wynik:"+ wynik);
    System.out.println("ilość zmienionych liter"+ l);
  }
}