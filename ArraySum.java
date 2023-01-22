class ArraySum{
    public static void main(String[] args){
        
        int arr[] = {10, 15, 20, 25, 30};
        int sum = 0;
        for(int i: arr){
            sum+= i;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}

//Output:
//Sum of array elements: 100