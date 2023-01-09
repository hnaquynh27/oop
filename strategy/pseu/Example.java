package strategy.pseu;

import strategy.pseu.ConcreteStrategyAdd;
import strategy.pseu.ConcreteStrategyMultiply;
import strategy.pseu.ConcreteStrategySubtract;
import strategy.pseu.Context;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        String c = in.next();
        in.close();

        switch (c) {
            case "+" -> context.setStrategy(new ConcreteStrategyAdd());
            case "-" -> context.setStrategy(new ConcreteStrategySubtract());
            case "*" -> context.setStrategy(new ConcreteStrategyMultiply());
        }
        int result = context.executeStrategy(a, b);
        System.out.println(result);
    }
}
