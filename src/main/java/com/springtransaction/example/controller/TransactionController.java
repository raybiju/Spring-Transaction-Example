package com.springtransaction.example.controller;

import com.springtransaction.example.dto.FlightBookingAcknowledgement;
import com.springtransaction.example.dto.FlightBookingRequest;
import com.springtransaction.example.service.FlightBookingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    public TransactionController(FlightBookingService service) {
        this.service = service;
    }

    private final FlightBookingService service;


    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
        return service.bookFlightTicket(request);
    }
}
