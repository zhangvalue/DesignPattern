/**
 * @ Author zhangsf
 * @CreateTime 2020/2/9 - 5:59 PM
 */
package FactoryPattern;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
    @Override
    public PC makePC() {
        return new MAC();
    }

}