import java.util.Scanner;
public class Stage3 {
    public static void main(String[] args)
    {   System.out.println("������� ����� ��� �������� �� ������� ���������� � ������� Enter:");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        System.out.println("Name: " + name + "_lenght_" + name.length());
        System.out.println("Age: " + age);
    }
}