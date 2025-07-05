# 🏭 Practical Factory Pattern

---

## ✅ What is it?

A pattern where a factory class **creates objects based on input (like enums or strings)** using conditional logic.

---

## 📌 When to Use

- You want to create objects **based on some runtime condition or config**.
- You want to **avoid writing `if-else` or `switch`** logic in every client.
- Object creation logic might **evolve or get more complex** later.

---

## ⚠️ Drawbacks

- ❌ **Violates Open-Closed Principle (OCP)**: Adding new types means modifying the factory.
- ❌ **Tightly coupled to concrete classes**.
- ❌ **Not scalable**: Too many `if-else` blocks can make it hard to maintain.

---

## 💡 Why Still Use It?

- ✅ **Centralizes creation logic**.
- ✅ Makes **clients cleaner and DRY**.
- ✅ Easy to understand and use in **small to mid-sized codebases**.

---

## 🧠 Real-World Analogy

> Like a vending machine that gives you a snack based on the code you enter — but someone must maintain the code-to-snack mapping manually.

---

## ✅ Code Example (Java)

```java
public class BirdFactory {
    public Bird getBirdObject(BirdType birdType) {
        if (birdType == BirdType.PEACOCK) return new Peacock();
        if (birdType == BirdType.DUCK) return new Duck();
        if (birdType == BirdType.SPARROW) return new Sparrow();
        if (birdType == BirdType.PARROT) return new Parrot();
        throw new IllegalArgumentException("Unknown bird type");
    }
}
