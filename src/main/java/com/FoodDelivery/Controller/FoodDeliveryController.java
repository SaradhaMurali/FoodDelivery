package com.FoodDelivery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FoodDelivery.Entity.MenuItemEntity;
import com.FoodDelivery.Entity.RestaurantEntity;
import com.FoodDelivery.Entity.UserCartEntity;
import com.FoodDelivery.Entity.UserOrdersEntity;
import com.FoodDelivery.Service.FoodDeliveryService;

@RestController
public class FoodDeliveryController {
	@Autowired FoodDeliveryService foodDeliveryService;
	
	@GetMapping(path ="/loadHomePage")
	public List<RestaurantEntity> loadHomePage(String location) {
		return foodDeliveryService.loadHomePage(location);
	}
	
	@GetMapping(path ="/viewRestaurants")
	public List<RestaurantEntity> viewRestaurants(String location) {
		return foodDeliveryService.viewRestaurants(location);
	}
	
	@GetMapping(path ="/viewMenuItems")
	public List<MenuItemEntity> viewMenuItems(String restaurantName) {
		return foodDeliveryService.viewMenuItems(restaurantName);
	}
	
	@PostMapping(path ="/addToCart")
	public String addToCart(String userName,MenuItemEntity menuItem) {
		return foodDeliveryService.addItemToCart(userName, menuItem);
	}
	
	@PostMapping(path ="/ClearItemFromCart")
	public String ClearItemFromCart(String userName,MenuItemEntity menuItem) {
		return foodDeliveryService.addItemToCart(userName, menuItem);
	}
	
	@DeleteMapping(path ="/emptyCart")
	public String emptyCart(String userName) {
		return foodDeliveryService.emptyCart(userName);
	}
	
	@GetMapping(path ="/viewCart")
	public UserCartEntity viewCart(String userName) {
		return foodDeliveryService.viewCart(userName);
	}
	@PostMapping(path ="/placeYourOrder")
	public String placeYourOrder(String userName) {
		return foodDeliveryService.placeYourOrder(userName);
	}
	
	@GetMapping(path ="/viewOrder")
	public UserOrdersEntity viewOrder(String orderId) {
		return foodDeliveryService.viewOrder(orderId);
	}
	
	


}
