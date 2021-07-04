package com.riigsoft.SpringAndReact.controller;

import com.riigsoft.SpringAndReact.model.ClientForm;
import com.riigsoft.SpringAndReact.model.Elements;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/form")
 class FormController {

    @GetMapping()
    public ResponseEntity<ClientForm> showData(){
        ClientForm client = new ClientForm(
                "1010","label1","render1",
                List.of(
                        new Elements(
                                "title1",
                                List.of(
                                        new Elements.Save (
                                                "type1",
                                                "render2",
                                                "save1",
                                                "label2",
                                                "htmlClass1",
                                                "SaveButton",
                                                new Integer[]{1,2,3}
                                        )
                                )
                        )
                )
        );
        System.out.println(client);
        return ResponseEntity.ok(client);
    }
}
