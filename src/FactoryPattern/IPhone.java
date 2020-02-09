/**
 * @ Author zhangsf
 * @CreateTime 2020/2/9 - 5:57 PM
 */
package FactoryPattern;

public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make iphone!");
    }
}
