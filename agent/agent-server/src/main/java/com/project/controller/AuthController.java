package com.project.controller;

import com.project.model.json.AuthenticationRequest;
import com.project.ws.LodgingService;
import com.project.ws.LodgingServicePort;
import com.project.ws.SetCompletedLodgingRequest;
import com.project.ws.SetCompletedLodgingResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ivan V. on 30-May-18
 */
@RestController
public class AuthController {

    @RequestMapping(method = RequestMethod.POST,
            value = "login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AuthenticationRequest> authenticationRequest(@RequestBody AuthenticationRequest authenticationRequest) {
        System.out.println(authenticationRequest.getUsername());
        System.out.println(authenticationRequest.getPassword());

        LodgingService objMethod = new LodgingService();
        LodgingServicePort objPort = objMethod.getLodgingServicePortSoap11();
        SetCompletedLodgingRequest request = new SetCompletedLodgingRequest();
        request.setReservation(1L);
        SetCompletedLodgingResponse response = objPort.setCompletedLodging(request);
        System.out.println(response);
        return new ResponseEntity<>(authenticationRequest,HttpStatus.OK);
    }
}