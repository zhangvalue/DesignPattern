/**
 * @ Author zhangsf
 * @CreateTime 2020/2/9 - 6:01 PM
 */
package FactoryPattern;

public class MAC implements PC {
    public MAC() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make MAC!");
    }
}