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
@RequestMapping("/authorized")
public class AdminController {

    private final DataAccessLayer dataAccessLayer;
    @Autowired
    public AdminController(DataAccessLayer dataAccessLayer) {
        this.dataAccessLayer = dataAccessLayer;
    }
    @PostMapping("create/animal/")
    public ResponseEntity<String> createAnimal(@RequestBody Animal animal) {
        dataAccessLayer.createAnimal(animal);
        return ResponseEntity.ok("PABEDA!");
    }

    @DeleteMapping("delete/animal/{id}")
    public ResponseEntity deleteAnimalById(@PathVariable("id") long id) {
        dataAccessLayer.deleteAnimal(id);
        return ResponseEntity.ok("свина больше нет увы");
    }

    @PostMapping("update/animal/{id}")
    public ResponseEntity updateAnimalById(@PathVariable("id") long id, @RequestBody Animal newAnimal) {
        dataAccessLayer.updateAnimal(id, newAnimal);
        return ResponseEntity.ok("у свиньи рестайлинг");
    }
    @PostMapping("create/employee/")
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
        dataAccessLayer.createEmployee(employee);
        return ResponseEntity.ok("PABEDA!");
    }
    @DeleteMapping("delete/employee/{id}")
    public ResponseEntity deleteEmployeeById(@PathVariable("id") long id) {
        dataAccessLayer.deleteEmployee(id);
        return ResponseEntity.ok("свина-работник номер "+ id + " больше не работает");
    }
    @PostMapping("update/employee/{id}")
    public ResponseEntity updateEmployeeById(@PathVariable("id") long id, @RequestBody Employee updatedEmployee) {
        dataAccessLayer.updateEmployee(id, updatedEmployee);
        return ResponseEntity.ok("у свиньи рестайлинг");
    }
    @PostMapping("create/ticket/")
    public ResponseEntity<String> createTicket(@RequestBody Ticket ticket) {
        dataAccessLayer.createTicket(ticket);
        return ResponseEntity.ok("PABEDA!");
    }
    @DeleteMapping("delete/ticket/{id}")
    public ResponseEntity deleteTicketById(@PathVariable("id") long id) {
        dataAccessLayer.deleteTicket(id);
        return ResponseEntity.ok("тикет номер "+ id + " больше не Hru");
    }
    @PostMapping("update/ticket/{id}")
    public ResponseEntity updateTicketById(@PathVariable("id") long id, @RequestBody Ticket updatedTicket) {
        dataAccessLayer.updateTicket(id, updatedTicket);
        return ResponseEntity.ok("");
    }
    @PostMapping("create/ticketCategory/")
    public ResponseEntity<String> createticketCategoty(@RequestBody TicketCategory ticketCategory) {
        dataAccessLayer.createTicketCategory(ticketCategory);
        return ResponseEntity.ok("PABEDA!");
    }
    @DeleteMapping("delete/ticketCategory/{id}")
    public ResponseEntity deleteTicketCategoryById(@PathVariable("id") long id) {
        dataAccessLayer.deleteTicketCategory(id);
        return ResponseEntity.ok("тикет category номер "+ id + " больше не Hru");
    }
    @PostMapping("update/ticketCategory/{id}")
    public ResponseEntity updateTicketCategoryById(@PathVariable("id") long id, @RequestBody TicketCategory updatedTicketCategory) {
        dataAccessLayer.updateTicketCategory(id, updatedTicketCategory);
        return ResponseEntity.ok("");
    }
    @PostMapping("create/position/")
    public ResponseEntity<String> createPosition(@RequestBody Position position) {
        dataAccessLayer.createPosition(position);
        return ResponseEntity.ok("PABEDA!");
    }
    @DeleteMapping("delete/position/{id}")
    public ResponseEntity deletePositionById(@PathVariable("id") long id) {
        dataAccessLayer.deletePosition(id);
        return ResponseEntity.ok("Position номер "+ id + " больше не Hru");
    }
    @PostMapping("update/position/{id}")
    public ResponseEntity updatePositionById(@PathVariable("id") long id, @RequestBody Position updatedPosition) {
        dataAccessLayer.updatePosition(id, updatedPosition);
        return ResponseEntity.ok("");
    }
    @PostMapping("create/foodType/")
    public ResponseEntity<String> createFoodType(@RequestBody FoodType foodType) {
        dataAccessLayer.createFoodType(foodType);
        return ResponseEntity.ok("PABEDA!");
    }
    @DeleteMapping("delete/foodType/{id}")
    public ResponseEntity deleteFoodTypeById(@PathVariable("id") long id) {
        dataAccessLayer.deleteFoodType(id);
        return ResponseEntity.ok("FoodType номер "+ id + " больше не Hru");
    }
    @PostMapping("update/foodType/{id}")
    public ResponseEntity updateFoodTypeById(@PathVariable("id") long id, @RequestBody FoodType updatedFoodType) {
        dataAccessLayer.updateFoodType(id, updatedFoodType);
        return ResponseEntity.ok("");
    }
    @PostMapping("create/area/")
    public ResponseEntity<String> createArea(@RequestBody Area area) {
        dataAccessLayer.createArea(area);
        return ResponseEntity.ok("PABEDA!");
    }
    @DeleteMapping("delete/area/{id}")
    public ResponseEntity deleteAreaById(@PathVariable("id") long id) {
        dataAccessLayer.deleteArea(id);
        return ResponseEntity.ok("Area номер " + id + " больше не Hru");
    }
    @PostMapping("update/area/{id}")
    public ResponseEntity updateAreaById(@PathVariable("id") long id, @RequestBody Area updatedArea) {
        dataAccessLayer.updateArea(id, updatedArea);
        return ResponseEntity.ok("");
    }
    @PostMapping("create/cage/")
    public ResponseEntity<String> createCage(@RequestBody Cage cage) {
        dataAccessLayer.createCage(cage);
        return ResponseEntity.ok("PABEDA!");
    }
    @DeleteMapping("delete/cage/{id}")
    public ResponseEntity deleteCageById(@PathVariable("id") long id) {
        dataAccessLayer.deleteCage(id);
        return ResponseEntity.ok("Cage номер " + id + " больше не Hru");
    }
    @PostMapping("update/cage/{id}")
    public ResponseEntity updateCageById(@PathVariable("id") long id, @RequestBody Cage updatedCage) {
        dataAccessLayer.updateCage(id, updatedCage);
        return ResponseEntity.ok("");
    }
    @PostMapping("create/user/")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        dataAccessLayer.createUser(user);
        return ResponseEntity.ok("PABEDA!");
    }
    @DeleteMapping("delete/user/{id}")
    public ResponseEntity deleteUserById(@PathVariable("id") long id) {
        dataAccessLayer.deleteUser(id);
        return ResponseEntity.ok("User номер " + id + " больше не Hru");
    }
    @PostMapping("update/user/{id}")
    public ResponseEntity updateUserById(@PathVariable("id") long id, @RequestBody User updatedUser) {
        dataAccessLayer.updateUser(id, updatedUser);
        return ResponseEntity.ok("");
    }
    @GetMapping("get/user/{id}")
    public ResponseEntity getUserById(@PathVariable("id") long id) {
        return ResponseEntity.ok(dataAccessLayer.getUser(id));
    }
}