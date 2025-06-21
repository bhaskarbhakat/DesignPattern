# 🔌 Adapter Design Pattern

## ✅ Category
**Structural Design Pattern**

---

## 🧠 Intent

The Adapter Pattern allows two incompatible interfaces to work together.  
It acts as a **bridge between your application and a 3rd-party API or legacy system**, so you don’t have to change existing code.

---

## 📌 When to Use

- You are integrating **3rd-party SDKs** that don’t match your internal interface.
- You want to **standardize multiple APIs** (like Stripe, Razorpay, Paypal) behind a single interface.
- You need to make existing classes work with others without modifying their source code.

---

## 💡 Key Concepts

1. **It’s a structural pattern** that focuses on class wiring and object composition.
2. Allows your application to use external or legacy systems **without depending on their interface directly**.
3. You define a **common interface** (e.g. `IPaymentGateway`) and create adapter classes for each external API.
4. Each adapter class implements that interface and **internally calls the 3rd-party methods**, converting data as needed.
5. Your business logic remains **clean, decoupled, and easily testable**.

---

## 🧱 Structure Example (Java)

```java
// Step 1: Define interface used by your application
public interface IPaymentGateway {
    String processPayment();
    String showTransactionDetail(String uanNumber);
}

// Step 2: Existing third-party SDK (external, cannot be modified)
public class PaypalSDK {
    public void payWithPaypal() { ... }
    public List<String> transactionDetailByUan(String uanNumber) { ... }
}

// Step 3: Adapter that bridges SDK and app interface
@Component
public class PaypalAdapter implements IPaymentGateway {
    private final PaypalSDK sdk;

    public PaypalAdapter(PaypalSDK sdk) {
        this.sdk = sdk;
    }

    public String processPayment() {
        sdk.payWithPaypal();
        return "Payment done via Paypal";
    }

    public String showTransactionDetail(String uanNumber) {
        return sdk.transactionDetailByUan(uanNumber).toString();
    }
}