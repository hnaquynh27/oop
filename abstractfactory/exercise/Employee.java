package abstractfactory.exercise;

class Employee {

    private double luong = 0;

    public Employee(double d) {

        luong = d;

    }

    public void tangLuong(int s) {

        luong += luong * s / 100;

    }

    public static void main(String[] args) {

        Employee original = new Employee(50000);

        Employee copy = original;

        copy.tangLuong(10);
        System.out.println(original.luong);

    }

}
