package com.example.autowiring.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AutowiringExamples {

    // Autowiring byType example
    @Autowired
    private A a;

    // Autowiring byName example
    @Autowired
    private A beanA;

    // Constructor injection example
    private A aConstructor;

    @Autowired
    public AutowiringExamples(A aConstructor) {
        this.aConstructor = aConstructor;
    }

    // Setter injection example
    private A aSetter;

    @Autowired
    public void setASetter(A aSetter) {
        this.aSetter = aSetter;
    }

    // No autowiring example (manual wiring)
    private A aNoAutowire;

    public AutowiringExamples() {
        // Manually instantiate or retrieve beanA
        this.aNoAutowire = new A();
    }

    // @Qualifier example
    private A aQualified;

    @Autowired
    @Qualifier("beanA")
    public void setAQualified(A aQualified) {
        this.aQualified = aQualified;
    }

    // @Resource example
    @Resource(name = "beanA")
    private A aResource;

    // Additional methods, if needed

    public void doSomething() {
        // Use injected dependencies
        System.out.println(a);
        System.out.println(beanA);
        System.out.println(aConstructor);
        System.out.println(aSetter);
        System.out.println(aQualified);
        System.out.println(aResource);
    }
}
