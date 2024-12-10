# Final-Java-Point-of-Sale-System
Features
Admin Panel
The admin can:
Add Products: Add new products to the inventory by specifying the product name, price, and stock.
Update Price: Modify the price of an existing product.
Update Stock: Adjust the stock quantity of an existing product.
View Product List Report: Display all available products in the inventory with details like name, price, and stock.
Customer Panel
The customer can:
View Products: Browse all available products with their prices and stock.
Add to Cart: Select a product and add it to their shopping cart in a specific quantity.
View Cart: View the items currently in their cart along with the total price.
Checkout: Complete the transaction by entering payment (kwarta) and receive change if applicable.

Classes
1. POSSystem.java
The main entry point of the program.
Responsibilities:
Initializes admin and customer objects.
Preloads products into the admin’s inventory.
Provides a main menu for switching between the Admin Panel and Customer Panel.

2. Admin.java
Manages the inventory of the store.
Responsibilities:
Handles adding, updating, and viewing products.
Maintains the list of products using an ArrayList<Product>.
Methods:
addProduct(): Adds a new product to the inventory.
updatePrice(): Updates the price of an existing product.
updateStock(): Updates the stock of an existing product.
viewProducts(): Displays all products in the inventory.
deleteProducts(). Deletes product/s in the list
getProducts(): Returns the list of products.

3. Customer.java
Manages customer interactions and shopping experience.
Responsibilities:
Allows customers to view products, add items to the cart, view the cart, and checkout.
Maintains the cart using an ArrayList<Product>.
Methods:
customerMenu(): Displays the customer menu.
addToCart(): Adds a product to the customer's cart.
viewCart(): Displays all items in the cart with the total cost.
checkout(): Handles payment and clears the cart after a successful transaction.

4. Product.java
Represents a product in the store.
Attributes:
name: The product name (e.g., "Vetsin").
price: The price of the product.
stock: The stock quantity available in the inventory.
Methods:
getName(), getPrice(), getStock(): Getters for product attributes.
setPrice(), setStock(): Setters for price and stock.
toString(): Formats product details for display.





Preloaded Products
The following products are preloaded into the inventory:
Vetsin:
Price: PHP 5
Stock: 100
Colgate na Closeup:
Price: PHP 25
Stock: 50
Tanduay Lapad:
Price: PHP 50
Stock: 30
