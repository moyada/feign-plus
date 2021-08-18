package cn.moyada.test.example;

import io.moyada.feign.help.annotation.FallbackBuild;

/**
 * @author xueyikang
 * @since 1.0
 **/
@FallbackBuild
public class Example {

    public boolean save(String name) {
        System.out.println(name);
        return true;
    }
}
