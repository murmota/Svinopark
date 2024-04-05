package com.example.Svinopark.Controllers;
import com.example.Svinopark.dal.DataAccessLayer;
import com.example.Svinopark.models.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/unauthorized")
public class MainController {
    private final DataAccessLayer dataAccessLayer;
    @Autowired
    public MainController(DataAccessLayer dataAccessLayer) {
        this.dataAccessLayer = dataAccessLayer;
    }

    @GetMapping("/hello")
    public void hello(){
        log.info("Gracias Senior Pumba");
    }
    @GetMapping("/user")
    public void user(){
        log.info("Gracias Senior user");
    }
    @GetMapping("/admin")
    public void admin(){
        log.info("Gracias Senior admin");
    }
    @GetMapping("get/animal/{id}")
    public ResponseEntity getAnimalById(@PathVariable("id") long id) {
        return ResponseEntity.ok(dataAccessLayer.getAnimal(id));
    }
    @GetMapping("get/animals/")
    public ResponseEntity getAnimals(){
        return ResponseEntity.ok(dataAccessLayer.getAnimals());
    }

    @GetMapping("get/employee/{id}")
    public ResponseEntity getEmployeeById(@PathVariable("id") long id) {
        return ResponseEntity.ok(dataAccessLayer.getEmployee(id));
    }
    @GetMapping("get/employees/")
    public ResponseEntity getEmployees(){
        return ResponseEntity.ok(dataAccessLayer.getEmployees());
    }

    @GetMapping("get/ticket/{id}")
    public ResponseEntity getTicketById(@PathVariable("id") long id) {
        return ResponseEntity.ok(dataAccessLayer.getTicket(id));
    }
    @GetMapping("get/tickets/")
    public ResponseEntity getTickets(){
        return ResponseEntity.ok(dataAccessLayer.getTickets());
    }

    @GetMapping("get/ticketCategory/{id}")
    public ResponseEntity getTicketCategoryById(@PathVariable("id") long id) {
        return ResponseEntity.ok(dataAccessLayer.getTicketCategory(id));
    }
    @GetMapping("get/ticketCategories/")
    public ResponseEntity getTicketCategories(){
        return ResponseEntity.ok(dataAccessLayer.getTicketCategories());
    }

    @GetMapping("get/position/{id}")
    public ResponseEntity getPositionById(@PathVariable("id") long id) {
        return ResponseEntity.ok(dataAccessLayer.getPosition(id));
    }
    @GetMapping("get/positions/")
    public ResponseEntity getPositions(){
        return ResponseEntity.ok(dataAccessLayer.getPositions());
    }

    @GetMapping("get/foodType/{id}")
    public ResponseEntity getFoodTypeById(@PathVariable("id") long id) {
        return ResponseEntity.ok(dataAccessLayer.getFoodType(id));
    }
    @GetMapping("get/foodTypes/")
    public ResponseEntity getFoodTypes(){
        return ResponseEntity.ok(dataAccessLayer.getFoodTypes());
    }

    @GetMapping("get/area/{id}")
    public ResponseEntity getAreaById(@PathVariable("id") long id) {
        return ResponseEntity.ok(dataAccessLayer.getArea(id));
    }
    @GetMapping("get/areas/")
    public ResponseEntity getAreas(){
        return ResponseEntity.ok(dataAccessLayer.getAreas());
    }

    @GetMapping("get/cage/{id}")
    public ResponseEntity getCageById(@PathVariable("id") long id) {
        return ResponseEntity.ok(dataAccessLayer.getCage(id));
    }
    @GetMapping("get/cages/")
    public ResponseEntity getCages(){
        return ResponseEntity.ok(dataAccessLayer.getCages());
    }

    @GetMapping("get/users/")
    public ResponseEntity getUsers(){
        return ResponseEntity.ok(dataAccessLayer.getUsers());
    }
   }
//переписывать текст с доски это тяжело...