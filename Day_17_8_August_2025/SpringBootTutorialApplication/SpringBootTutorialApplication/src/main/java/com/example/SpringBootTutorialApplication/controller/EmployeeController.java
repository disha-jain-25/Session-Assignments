/*
Annotated Controllers:

    - Spring MVC provides an annotation-based programming model where @Controller and @RestController
      components use annotations to express request mappings, request input, exception handling and more.
    - The @RestController annotation is a shorthand for @Controller and @ResponseBody, meaning all methods in the controller
      will return JSON/XML directly to the response body.

    - Request Mappings:
        - You can use the @RequestMapping annotation in map requests to controller methods.
        - It has various attributes to match the URL, HTTP method, request parameters, headers & media types.
        - There are also HTTP method specific shortcut variants of @RequestMapping:
            1) @GetMapping
            2) @PostMapping
            3) @PutMapping
            4) @DeleteMapping
            5) @PatchMapping

    - Dynamic URL Paths:
        - @PathVariable: /employee/123
            - Use path variable when the parameter is an essential part of the URL path that identifies a resource.

        - @RequestParam: /employee?id=123
            - Use query parameters when the parameter is optional and used for filtering, sorting or other modifications
              to the request.

     - @RequestBody:
        - It is used to bind the HTTP request body to a java object.
        - When a client sends the data in the body of a request(e.g., JSON or XML)
          @RequestBody maps this data to a java objects.
 */
package com.example.SpringBootTutorialApplication.controller;

import com.example.SpringBootTutorialApplication.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    String getMySuperSecretMessage(){
//        return "Secret Message : disha123";
//    }

    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployee(@PathVariable(name = "employeeId") Long id){
        return new EmployeeDTO(id,"Disha","disha@gmail.com",25, LocalDate.of(2024,1,2),true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) Integer age){
        return "Hi Age : " + age;
    }

    @PostMapping
    public String createEmployee(){
        return "Hello From POST";
    }

    @PutMapping
    public String updateEmployee(){
        return "Hello From PUT";
    }
}
