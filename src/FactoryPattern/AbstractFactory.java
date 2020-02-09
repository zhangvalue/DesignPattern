/**
 * @ Author zhangsf
 * @CreateTime 2020/2/9 - 5:58 PM
 */
package FactoryPattern;

public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}
