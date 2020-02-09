/**
 * @ Author zhangsf
 * @CreateTime 2020/2/9 - 6:00 PM
 */
package FactoryPattern;

public class MiPC implements PC {
    public MiPC() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make xiaomi PC!");
    }
}
