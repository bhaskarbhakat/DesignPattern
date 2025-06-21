# 🔌 Adapter Design Pattern (Java)

## ✅ Purpose

The **Adapter Pattern** is used to **connect incompatible interfaces** — often when integrating with **3rd-party APIs**, SDKs, or legacy systems.

It lets your application **speak its own language**, while hiding the complexity of external systems behind a clean interface.

---

## 💡 Key Concepts

1. **Used to integrate 3rd-party APIs or legacy code** into your system.
2. Helps unify different APIs under a **common, generic interface** (e.g., `IPaymentGateway`).
3. To implement:
    - Create an interface that defines the methods your service will use. (e.g., `IPaymentGateway`, `NotificationSender`, etc.)
    - Each adapter class implements that interface. (e.g., `PayPalAdapter`)
4. Each adapter implements the interface and internally calls the 3rd-party API, converting its inputs and outputs to match what your application expects.
5. Keeps your codebase **decoupled**, **testable**, and **easy to extend** with new integrations.

---

## 🧱 Structure

```java
// Step 1: Define common interface
public interface IPaymentGateway {
    String processPayment();
    String showTransactionDetail(String uanNumber);
}

// Step 2: 3rd party SDK
public class PaypalSDK {
    public void payWithPaypal() { ... }
    public List<String> transactionDetailByUan(String uanNumber) { ... }
}

// Step 3: Adapter
@Component
public class PaypalAdapter implements IPaymentGateway {
    private final PaypalSDK sdk;

    public PaypalAdapter(PaypalSDK sdk) {
        this.sdk = sdk;
    }

    public String processPayment() {
        sdk.payWithPaypal();
        return "Payment with Paypal done: Success";
    }

    public String showTransactionDetail(String uanNumber) {
        return sdk.transactionDetailByUan(uanNumber).toString();
    }
}