package com.fordytoo._kgen.Controllers;

import com.fordytoo._kgen.Entities.Order;
import com.fordytoo._kgen.Repositories.OrderRepository;
import com.fordytoo._kgen.Services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {

    public OrderController(OrderRepository orderRepository, OrderService orderService) {
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    private final OrderRepository orderRepository;
    private final OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return (List<Order>) orderRepository.findAll();
    }

    @PostMapping("/orders")
    public Order addOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping(value = "/orders/random-originator", produces = "application/json")
    public Map<String, String> getRandomOriginator() {
        return Map.of("value", orderService.getRandomOriginator());
    }

    @GetMapping(value = "/orders/random-founding", produces = "application/json")
    public Map<String, String> getRandomFounding() {
        return Map.of("value", orderService.getRandomFounding());
    }

    @GetMapping(value = "/orders/random-flaw", produces = "application/json")
    public Map<String, String> getRandomFlaw() {
        return Map.of("value", orderService.getRandomFlaw());
    }

    @GetMapping(value = "/orders/random-demeanour", produces = "application/json")
    public Map<String, String> getRandomDemeanour() {
        return Map.of("value", orderService.getRandomDemeanour());
    }

    @GetMapping(value = "/orders/random-primary-saint", produces = "application/json")
    public Map<String, String> getRandomPrimarySaint() {
        return Map.of("value", orderService.getRandomPrimarySaint());
    }

    @GetMapping(value = "/orders/random-deeds", produces = "application/json")
    public Map<String, String> getRandomDeeds() {
        return Map.of("value", orderService.getRandomDeeds());
    }

    @GetMapping(value = "/orders/random-homeworld", produces = "application/json")
    public Map<String, String> getRandomHomeworld() {
        return Map.of("value", orderService.getRandomHomeworld());
    }

    @GetMapping(value = "/orders/random-strategy", produces = "application/json")
    public Map<String, String> getRandomStrategy() {
        return Map.of("value", orderService.getRandomStrategy());
    }

    @GetMapping(value = "/orders/random-methods", produces = "application/json")
    public Map<String, String> getRandomMethods() {
        return Map.of("value", orderService.getRandomMethods());
    }

    @GetMapping(value = "/orders/random-size", produces = "application/json")
    public Map<String, String> getRandomSize() {
        return Map.of("value", orderService.getRandomSize());
    }

    @GetMapping(value = "/orders/random-allies", produces = "application/json")
    public Map<String, String> getRandomAllies() {
        return Map.of("value", orderService.getRandomAllies());
    }

    @GetMapping(value = "/orders/random-enemies", produces = "application/json")
    public Map<String, String> getRandomEnemies() {
        return Map.of("value", orderService.getRandomEnemies());
    }
}
