package com.learn.shoeproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/simplilearn")
public class ProjectController {

    @Autowired
    CustomerRepository repo;

     @GetMapping("customers")
    public List<Customer> getCustomers()
    {
        List<Customer> customers = (List<Customer>) repo.findAll();

        return customers;
    }


    @Autowired
    BrandRepository brandrepo;

   @GetMapping("label")
    public List<Brand> getBrands()
    {
        List<Brand> label = (List<Brand>) brandrepo.findAll();

        return label;
    }

    @Autowired
    CategoryRepository catrepo;

    @GetMapping("type")
    public List<Category> getCategory()
    {
        List<Category> type = (List<Category>) catrepo.findAll();

        return type;
    }

    @Autowired
    ShoeRepository shoerepo;

    @GetMapping("shoe")
    public List<Shoe> getShoes()
    {
        List<Shoe> shoe = (List<Shoe>) shoerepo.findAll();

        return shoe;
    }

    @Autowired
    OrderItemRepository orderitemrepo;

    @GetMapping("order")
    public List<OrderItem> getOrders()
    {
        List<OrderItem> order = (List<OrderItem>) orderitemrepo.findAll();

        return order;
    }



    @GetMapping("addlabel")
    public String addBrand(@RequestParam("brand_id") int brandId,@RequestParam("brand_name") String brandName)
    {
        Brand brand =new Brand(brandId,brandName);
        brandrepo.save(brand);
        return "Success";
    }

    @PostMapping("addlabel")
    public String addBrandPost(@RequestBody Brand brand)
    {
        brandrepo.save(brand);
        return "Success";
    }

    @PostMapping("addcategory")
    public String addCategoryPost(@RequestBody Category category)
    {
        catrepo.save(category);
        return "Success";
    }

    @GetMapping("addshoe")
    public String addShoe(@RequestParam("shoe_id") int shoeid,@RequestParam("color") String color,@RequestParam("description") String description,@RequestParam("brand_brand_id") Brand brandid,@RequestParam("category_category_id") Category categoryid)
    {
        Shoe shoe =new Shoe(shoeid,color,description,brandid,categoryid);
        shoerepo.save(shoe);
        return "Success";
    }

    @PostMapping("addshoe")
    public String postShoe(@RequestBody AddShoeRequest shoeRequest){
        Optional<Brand> brand =brandrepo.findById(shoeRequest.getBrandId());
        if (brand.isPresent()) {
            Brand brand1 = brand.get();
            Optional<Category> category = catrepo.findById(shoeRequest.getCategoryId());
            if (category.isPresent()){
                Category cat =category.get();
                Shoe shoe = new Shoe(shoeRequest.getColor(),shoeRequest.getDescription(),brand1,cat);
                shoerepo.save(shoe);
                return "Success";
            }

        }
        Shoe shoe =new Shoe();
        shoerepo.save(shoe);
        return "Success";
    }

    @PostMapping("addorderitem")
    public String postOrderItem(@RequestBody AddOrderItemRequest orderItemRequest){
        Optional<Customer> customer = repo.findById(orderItemRequest.getCustomerId());
        if (customer.isPresent()) {
            Customer customer1 = customer.get();
            Optional<Shoe> shoe = shoerepo.findById(orderItemRequest.getShoeId());
            if (shoe.isPresent()){
                Shoe boot =shoe.get();
                OrderItem orderItem = new OrderItem(orderItemRequest.getQuantity(),orderItemRequest.getTotalPrice(),orderItemRequest.getSize(),customer1,boot);
                orderitemrepo.save(orderItem);
                return "Success";
            }

        }
        OrderItem orderItem =new OrderItem();
        orderitemrepo.save(orderItem);
        return "Success";
    }

    @GetMapping("getshoe")
    public Shoe addShoe(@RequestParam("shoe_id") Shoe shoe)
    {
//        shoerepo.save(shoe);
        return shoe;
    }

    @GetMapping("getbrand")
    public Brand addShoe(@RequestParam("brand_id") Brand brand)
    {
        return brand;
    }

    @GetMapping("getcustomer")
    public Customer addCustomer(@RequestParam("customer_id") Customer customer)
    {
        return customer;
    }


    @GetMapping("getcategory")
    public Category addCategory(@RequestParam("category_id") Category category)
    {
        return category;
    }


//    @PostMapping("addcustomer")
//    public String addCustomerPost(@RequestBody Customer customer)
//    {
//        repo.save(customer);
//        return "Success";
//    }

//    @PostMapping("addcustomer")
//    public String postCustomer(@RequestBody AddCustomerRequest customerRequest){
//        Customer customer = new Customer(customerRequest.getEmail(),customerRequest.getFirstname(),customerRequest.getLastname(),customerRequest.getPassword(),customerRequest.getPhone(),customerRequest.getUsername());
//
//        repo.save(customer);
//        return "Success";
//    }

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("register")
    public String auth(@RequestBody Admin admin)
    {
        admin.setPassword(bCryptPasswordEncoder.encode(admin.getPassword()));
        adminrepo.save(admin);
        return "Success";
    }

    @Autowired
    AdminRepository adminrepo;

//    @PostMapping("login")
//    public String auth(@RequestBody LoginAdmin login)
//    {
//        customer.setPassword(bCryptPasswordEncoder.encode(customer.getPassword()));
//        return "Success";
//    }

//    @Autowired
//    private AuthenticationManager authenticationManager;
//public void authenticate(String username, String password){
//
//}


}



