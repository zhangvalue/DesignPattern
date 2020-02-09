/**
 * @ Author zhangsf
 * @CreateTime 2020/2/9 - 5:59 PM
 */
package FactoryPattern;

public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
    @Override
    public PC makePC() {
        return new MiPC();
    }

}
