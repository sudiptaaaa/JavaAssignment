import java.util.Scanner;
class Pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<n-i; k++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:
Enter number of rows: 3
* * * 
 * * 
  * 
 */