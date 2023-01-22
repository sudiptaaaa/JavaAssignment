import java.util.Scanner;
class ComputeArea{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int x = sc.nextInt();
        System.out.print("Enter breadth: ");
        int y = sc.nextInt();
        System.out.println("Area of rectangle: "+ x*y);
}
}

/*
 Output:
Enter length: 15
Enter breadth: 10
Area of rectangle: 150
 */