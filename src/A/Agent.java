package A;

/**
 * 代理对象：助理，是客户端对象与目标对象的对接桥梁
 */

public class Agent implements Service{

    // 类中成员变量类型设计为接口类型
    public Service taget;

    // 传入目标对象，实参类型设计为接口类型
    public Agent(Service taget){
        this.taget=taget;
    }

    // 传如不同的接口的实现对象，就可以在代理中
    @Override
    public void sing() {
        System.out.println("预定时间...");
        System.out.println("预定场地...");

        // SuperStarLiu liu = new SuperStarLiu();
        // liu.sing();
        // SuperStarZhou zhou = new SuperStarZhou();
        // zhou.sing();
        // 这样代码就写死了，耦合度很高。

        // 面向接口编程，接口指向实现类。
        taget.sing();
        // tager是目标对象类的一个实例对象，根据不同目标对象在自己类对接口sing()方法的实现，可输出不同的语句
        // 过程中只需改动目标对象类的代码，不需要改动该类的具体代码，耦合度降低

        System.out.println("结算费用...");
        System.out.println(1);
        System.out.println(1);
        System.out.println(2);
    }
}
