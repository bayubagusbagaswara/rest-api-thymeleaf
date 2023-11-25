package com.bayu.rest.api.thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RestController
public class ThymeleafRestController {

    private final TemplateEngine templateEngine;

    @Autowired
    public ThymeleafRestController(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

//    @GetMapping(path = "/api/html-example")
//    public ResponseEntity<String> getHtmlExample() {
//        // Create a Thymeleaf context
//        Context context = new Context();
//        context.setVariable("message", "Hello from Thymeleaf in a RESTful endpoint");
//    }

    /***
     * Jika meng-hit localhost:8080/api/displayData, maka akan ditampilkan generalData.html
     * didalam method process milik templateEngine itu kita akan tulis nama file htmlnya apa
     * @return
     */
    @GetMapping("/api/displayData")
    public String displayData() {
        Context context = new Context();
        context.setVariable("message", "This is general data.");

        return templateEngine.process("generalData", context);
    }

    @GetMapping("/api/displayDataPerson")
    public String displayDataPerson() {
        Context context = new Context();
        context.setVariable("firstName", "John");
        context.setVariable("lastName", "Doe");
        context.setVariable("age", 30);

        // DataObject adalah sebuah Object yang menggunakan beberapa field
//        DataObject dataObject = new DataObject();
//        dataObject.setFirstName("John");
//        dataObject.setLastName("Doe");
//        dataObject.setAge(30);
//
//        Context context = new Context();
//        context.setVariable("dataObject", dataObject);

        // IF RETURN USING ResponseEntity<>
//        String htmlContent = templateEngine.process("personData", context);
//
//        return ResponseEntity.ok().body(htmlContent);

        return templateEngine.process("personData", context);
    }

}
