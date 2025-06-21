# 🎁 Decorator Design Pattern (Java)

## ✅ Purpose

The **Decorator Pattern** is used when you want to dynamically add responsibilities or features to an existing object, without modifying its code.

This pattern helps you extend functionality in a **flexible and reusable way**, adhering to the **Open-Closed Principle** (open for extension, closed for modification).

---

## 💡 Key Concepts

1. **Used when** you want to *add functionality* to a base entity without changing its structure.
2. Create **one common interface** (`Product`, `Notifier`, `Pizza`, etc.).
3. Both the **base class** and the **decorators (addons)** implement that same interface.
4. You must **override all methods** from the interface – no new public methods should be added in decorators.
5. The idea is to **chain behaviors** by wrapping objects inside decorators.

---

## 🧱 Structure

```java
interface Product {
    String getDescription();
    double getPrice();
}

class Phone implements Product {
    public String getDescription() { return "Phone"; }
    public double getPrice() { return 1000; }
}

class InsuranceDecorator implements Product {
    private Product product;
    public InsuranceDecorator(Product product) {
        this.product = product;
    }
    public String getDescription() {
        return product.getDescription() + " + Insurance";
    }
    public double getPrice() {
        return product.getPrice() + 100;
    }
}

public class GiftWrapDecorator implements Product {
    private Product product;

    public GiftWrapDecorator(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription() + " + Gift Wrap";
    }

    public double getPrice() {
        return product.getPrice() + 20;
    }
}

public class Main {
    public static void main(String[] args) {
        Product phone = new Phone();
        Product insured = new InsuranceDecorator(phone);
        Product giftWrapped = new GiftWrapDecorator(insured);

        System.out.println(giftWrapped.getDescription()); // Phone + Insurance + Gift Wrap
        System.out.println(giftWrapped.getPrice());       // 1120.0
    }
}