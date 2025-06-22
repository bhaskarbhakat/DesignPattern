# 🧱 Builder Design Pattern (Java)

## ✅ Intent
The **Builder Pattern** is used to construct complex objects step-by-step.  
It helps separate the construction logic from the final object, enabling flexible and readable object creation.

---

## 💡 When to Use
- When an object has many optional parameters.
- When you want to build different versions of an object without complex constructors.
- To avoid **telescoping constructors** (multiple overloaded constructors with many parameters).

---

## ✅ Benefits
- Makes object creation **clean and readable**.
- Enforces **immutability** by removing setters from the main class.
- Supports **validation at the time of creation**.
- Keeps construction logic **separate from the model**, improving maintainability.

---

## 🛠️ Implementation Overview
- Create a static inner `Builder` class inside your main class.
- Add **fluent setters** (return `this`) for optional fields.
- Add a `build()` method to construct the object.
- Optionally, validate required fields inside `build()` before construction.

---