package com.example.Svinopark.dal;
import com.example.Svinopark.models.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Getter
public class DataAccessLayer {
    private final SessionFactory sessionFactory;

    @Autowired
    public DataAccessLayer(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    Session session = null;
    public void createAnimal(Animal newAnimal) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newAnimal);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void deleteAnimal(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Animal animal = session.get(Animal.class, id);
        session.remove(animal);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void updateAnimal(Long id, Animal newAnimal){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Animal animal = session.get(Animal.class, id);
        animal.setAnimalAge(newAnimal.getAnimalAge());
        animal.setAnimalName(newAnimal.getAnimalName());
        session.merge(animal);
        session.getTransaction().commit();
    }
    public Animal getAnimal(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Animal animal = session.get(Animal.class, id);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
        return animal;
    }
    public List<Animal> getAnimals(){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Animal> query = builder.createQuery(Animal.class);
        Root<Animal> root = query.from(Animal.class);
        query.select(root);
        List<Animal> resultList = session.createQuery(query).getResultList();
        return resultList;
    }
    public void createEmployee(Employee newEmployee) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newEmployee);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void deleteEmployee(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        session.remove(employee);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void updateEmployee(Long id, Employee updatedEmployee){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        employee.setEmployeeSex(updatedEmployee.getEmployeeSex());
        employee.setPassport(updatedEmployee.getPassport());
        employee.setFullName(updatedEmployee.getFullName());
        employee.setBirthDate(updatedEmployee.getBirthDate());
        session.merge(employee);
        session.getTransaction().commit();
    }
    public Employee getEmployee(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
        return employee;
    }
    public List<Employee> getEmployees(){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
        Root<Employee> root = query.from(Employee.class);
        query.select(root);
        List<Employee> resultList = session.createQuery(query).getResultList();
        return resultList;
    }
    public void createTicket(Ticket newTicket) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newTicket);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void deleteTicket(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Ticket ticket = session.get(Ticket.class, id);
        session.remove(ticket);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void updateTicket(Long id, Ticket updatedTicket){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Ticket ticket = session.get(Ticket.class, id);
        ticket.setTime(updatedTicket.getTime());
        session.merge(ticket);
        session.getTransaction().commit();
    }
    public Ticket getTicket(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Ticket ticket = session.get(Ticket.class, id);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
        return ticket;
    }
    public List<Ticket> getTickets(){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Ticket> query = builder.createQuery(Ticket.class);
        Root<Ticket> root = query.from(Ticket.class);
        query.select(root);
        List<Ticket> resultList = session.createQuery(query).getResultList();
        return resultList;
    }
    public void createTicketCategory(TicketCategory newTicketCategory) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newTicketCategory);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void deleteTicketCategory(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        TicketCategory ticketCategory = session.get(TicketCategory.class, id);
        session.remove(ticketCategory);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void updateTicketCategory(Long id, TicketCategory updatedTicketCategory){
        session = sessionFactory.openSession();
        session.beginTransaction();
        TicketCategory ticketCategory = session.get(TicketCategory.class, id);
        ticketCategory.setTicketType(updatedTicketCategory.getTicketType());
        ticketCategory.setPrice(updatedTicketCategory.getPrice());
        session.merge(ticketCategory);
        session.getTransaction().commit();
    }
    public TicketCategory getTicketCategory(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        TicketCategory ticketCategory = session.get(TicketCategory.class, id);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
        return ticketCategory;
    }
    public List<TicketCategory> getTicketCategories(){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TicketCategory> query = builder.createQuery(TicketCategory.class);
        Root<TicketCategory> root = query.from(TicketCategory.class);
        query.select(root);
        List<TicketCategory> resultList = session.createQuery(query).getResultList();
        return resultList;
    }
    public void createPosition(Position newPosition) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newPosition);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void deletePosition(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Position position = session.get(Position.class, id);
        session.remove(position);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void updatePosition(Long id, Position updatedPosition){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Position position = session.get(Position.class, id);
        position.setPositionName(updatedPosition.getPositionName());
        session.merge(position);
        session.getTransaction().commit();
    }
    public Position getPosition(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Position position = session.get(Position.class, id);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
        return position;
    }
    public List<Position> getPositions(){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Position> query = builder.createQuery(Position.class);
        Root<Position> root = query.from(Position.class);
        query.select(root);
        List<Position> resultList = session.createQuery(query).getResultList();
        return resultList;
    }
    public void createFoodType(FoodType newFoodType) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newFoodType);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void deleteFoodType(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        FoodType foodType = session.get(FoodType.class, id);
        session.remove(foodType);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void updateFoodType(Long id, FoodType updatedFoodType){
        session = sessionFactory.openSession();
        session.beginTransaction();
        FoodType foodType = session.get(FoodType.class, id);
        foodType.setFoodTypeName(updatedFoodType.getFoodTypeName());
        session.merge(foodType);
        session.getTransaction().commit();
    }
    public FoodType getFoodType(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        FoodType foodType = session.get(FoodType.class, id);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
        return foodType;
    }
    public List<FoodType> getFoodTypes(){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<FoodType> query = builder.createQuery(FoodType.class);
        Root<FoodType> root = query.from(FoodType.class);
        query.select(root);
        List<FoodType> resultList = session.createQuery(query).getResultList();
        return resultList;
    }
    public void createArea(Area newArea) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newArea);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void deleteArea(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Area area = session.get(Area.class, id);
        session.remove(area);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void updateArea(Long id, Area updatedArea){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Area area = session.get(Area.class, id);
        area.setAreaName(updatedArea.getAreaName());
        session.merge(area);
        session.getTransaction().commit();
    }
    public Area getArea(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Area area = session.get(Area.class, id);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
        return area;
    }
    public List<Area> getAreas(){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Area> query = builder.createQuery(Area.class);
        Root<Area> root = query.from(Area.class);
        query.select(root);
        List<Area> resultList = session.createQuery(query).getResultList();
        return resultList;
    }
    public void createCage(Cage newCage) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newCage);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void deleteCage(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Cage cage = session.get(Cage.class, id);
        session.remove(cage);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void updateCage(Long id, Cage updatedCage){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Cage cage = session.get(Cage.class, id);
        cage.setSize(updatedCage.getSize());
        session.merge(cage);
        session.getTransaction().commit();
    }
    public Cage getCage(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Cage cage = session.get(Cage.class, id);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
        return cage;
    }
    public List<Cage> getCages(){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Cage> query = builder.createQuery(Cage.class);
        Root<Cage> root = query.from(Cage.class);
        query.select(root);
        List<Cage> resultList = session.createQuery(query).getResultList();
        return resultList;
    }
    public void createUser(User newUser) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(newUser);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void deleteUser(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.remove(user);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
    public void updateUser(Long id, User updatedUser){
        session = sessionFactory.openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        user.setUserName(updatedUser.getUserName());
        user.setUserAge(updatedUser.getUserAge());
        session.merge(user);
        session.getTransaction().commit();
    }
    public User getUser(Long id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
        return user;
    }
    public List<User> getUsers(){
        session = sessionFactory.openSession();
        session.getTransaction().begin();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);
        Root<User> root = query.from(User.class);
        query.select(root);
        List<User> resultList = session.createQuery(query).getResultList();
        return resultList;
    }



}
