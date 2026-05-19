Java OOP Assignment
*Mini E-Commerce System*

*Project Scenario:*
You are building a small online store where:
• Products can be created
• Customers can buy products
• Discounts can be applied
• Order information can be displayed

*Rules*
You MUST use:
✅ Classes and Objects
✅ Constructors
✅ Getters and Setters
✅ Inheritance
✅ Method Overriding
✅ Abstract Class
✅ Interface
✅ Encapsulation

*Required Classes*
1. Product Class (Abstract Class)
Description
This is the parent class for all products.

Attributes:
private int productId;
private String productName;
private double price;

Constructor:
Create a constructor to initialize all attributes.

*Methods:*
abstract void displayProduct();

Getters and Setters
Create getters and setters for all attributes.

2. Electronics Class
extends Product

*Additional Attribute:*

private int warrantyMonths;

*Requirements:*
• Create constructor
• Override displayProduct()

*Example output:*
Laptop - ₦450000 - Warranty: 12 months

3. Clothing Class
extends Product

*Additional Attribute:*

private String size;

*Requirements*
Create constructor

Override displayProduct()

*Example output:*

T-Shirt - ₦15000 - Size: XL


4. Discountable Interface

*Method:*
double applyDiscount();

5. Implement the Interface
Both:
Electronics
Clothing
must implement
Discountable.

*Discount Rules:*

Electronics - 10%
Clothing - 20%

6. Customer Class

*Attributes*
private int customerId;
private String customerName;
private String email;

*Methods:*

displayCustomerInfo();
Use encapsulation properly.

7. Order Class

*Attributes:*
private Customer customer;
private Product product;

Constructor
Initialize
customer
product

*Methods:*
void displayOrder();
This should display:
Customer name
Product bought
Original price
Discounted price


Main Class
Create:

Main.java
Inside the main method:
Step 1
Create at least:
1 Electronics object
1 Clothing object

Example:
Java
Electronics laptop
Clothing shirt


*Step 2*
Create a Customer object.
Step 3
Create two Order objects.
Example:
Customer buys laptop
Customer buys shirt
Step 4
Call methods to display:
Product details
Customer details
Order details


*Expected Sample Output:*

Customer: John Doe

Product Purchased:
Laptop - ₦450000
Warranty: 12 months

Discounted Price: ₦405000