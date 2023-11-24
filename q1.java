class Calculator {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void add(String a, String b) {
        System.out.println("Sum: " + (a + b));
    }

    public void add(float a, float b) {
        System.out.println("Sum: " + (a + b));
    }

    public void add(int a[], int s) {
        int sum = 0;
        for (int i = 0; i < s; i++) {
            sum += a[i];
        }
        System.out.println("Sum: " + sum);
    }

    public void add(String a[]) {
        String sum = "";
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum: " + sum);
    }
}

public class q1 {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        c.add(2, 3);
        c.add(3.3f, 4.5f);
        c.add("aman", "maham");
        int a[] = {1, 2, 3, 4};
        c.add(a, 4);
        String strArray[] = {"aman", "maham", "qadeer"};
        c.add(strArray);
    }
}
