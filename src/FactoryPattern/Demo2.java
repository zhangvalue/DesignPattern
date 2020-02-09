/**
 * @ Author zhangsf
 * @CreateTime 2020/2/9 - 5:59 PM
 */
package FactoryPattern;

public class Demo2 {
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();            // make xiaomi phone!
        appleFactory.makePhone();        // make iphone!
    }
}
