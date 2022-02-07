/* Program to illustrate Variable Arguments (Varargs) in Java  */
class calc{
    void add(int... a){
        int sum = 0;
        for(int i : a){
            sum = sum + i;
        }
        System.out.println("Sum of given arguments is = "+ sum);
    }
    void multiply(int... a){
        int temp = 1;
        for(int i : a){
         temp = temp * i;
        }
        System.out.println("mutiplication of given arguments is = "+ temp);
    }
    void display(int... a){
        for(int i : a){
            System.out.println("given arguments are = "+ i);
        }
    }
    public static void main(String[] args) {
        calc k = new calc();
        k.add(2,5,6,8,9);
        k.multiply(2,5,6,8,9);
        k.display(2,5,6,8,9);
    }
}
