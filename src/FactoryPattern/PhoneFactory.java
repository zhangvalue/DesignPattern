/**
 * @ Author zhangsf
 * @CreateTime 2020/2/9 - 5:57 PM
 */
package FactoryPattern;

public class PhoneFactory {
    public Phone makePhone(String phoneType) {
        if(phoneType.equalsIgnoreCase("MiPhone")){
            return new MiPhone();
        }
        else if(phoneType.equalsIgnoreCase("iPhone")) {
            return new IPhone();
        }
        return null;
    }
}
