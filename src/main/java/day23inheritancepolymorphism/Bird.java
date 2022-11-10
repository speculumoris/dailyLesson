package day23inheritancepolymorphism;

public class Bird extends Animal{

    /*
      "final" keyword nedir?

    "final" keyword i)variable'larda kullanılabilir.
                         public final int age = 12;
                         a)Atanan değer değiştirilemez.
                         b)Değer ataması yapmak zorundasınız.
                    ii)Method'larda kullanılabilir.
                        public final int add(){
                                return a+b;
                        }
                        a)Bir method oluşturulurken "final" olarak oluşturulmuş ise
                          o method'un body'si asla değiştirilemez. Dolayısıyla o method Override edilemez.
                    iii)Class'larda kullanılabilir.
                        Bir Class'ı "final" yaparsanız o Class'ı kısırlaştırmış olursunuz.
                        Bir Class "final" ise o Class'a extend edilemez.
                        "final" Class Child olabilir.

     */
}
