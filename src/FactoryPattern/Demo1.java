/**
 * @ Author zhangsf
 * @CreateTime 2020/2/9 - 5:57 PM
 */
package FactoryPattern;

public class Demo1 {
    public static void main(String[] arg) {
        PhoneFactory factory = new PhoneFactory();
        Phone miPhone = factory.makePhone("MiPhone");            // make xiaomi phone!
        IPhone iPhone = (IPhone)factory.makePhone("iPhone");    // make iphone!
    }
}