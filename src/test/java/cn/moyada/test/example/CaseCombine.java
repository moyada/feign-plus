package cn.moyada.test.example;

import io.moyada.feign.plus.annotation.NotBlank;
import io.moyada.feign.plus.annotation.Return;
import io.moyada.feign.plus.annotation.Throw;

/**
 * @author xueyikang
 * @since 1.0
 **/
public class CaseCombine {

    public boolean returnPrimitive(@Return("false") Product product,
                                   @Throw Counter price) {
        System.out.println("returnPrimitive");
        return true;
    }

    public Product returnObject(@Throw Person person,
                                @Return(type = CaseReturn.Item.class) @NotBlank String name,
                                @Return(type = CaseReturn.class, staticMethod = "getProduct") Capacity capacity) {
        System.out.println("returnPrimitive");
        return null;
    }
}
