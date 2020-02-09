/**
 * @ Author zhangsf
 * @CreateTime 2020/2/9 - 5:56 PM
 */
package FactoryPattern;

public class MiPhone implements Phone {
    public MiPhone() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make xiaomi phone!");
    }
}