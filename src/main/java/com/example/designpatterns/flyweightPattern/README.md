# 🧠 Flyweight Design Pattern (Java)

## ✅ Intent
The **Flyweight Pattern** is used to minimize memory usage by sharing common parts of object state between multiple objects instead of storing duplicates.

It separates:
- **Intrinsic state** → Shared, stored in memory once (e.g., `Bullet` type)
- **Extrinsic state** → Varies per instance (e.g., bullet position, direction)

---

## 💡 When to Use
- When you need to create **a large number of similar objects**
- When object state has a lot of **repeated/shared data**
- When memory optimization is critical (e.g., games, rendering engines)

---

## ✅ Benefits
- **Reduces memory usage** by sharing heavy common data
- Improves performance in systems with lots of objects
- Cleanly separates object’s **core data vs runtime state**

---

## 📊 Memory Calculation (10,000 Bullets)

Assume:
- `shape[] = 1 KB`
- Other Bullet fields = ~50B
- Each `FlyingBullet` = ~32B

### ❌ Without Flyweight
Each `FlyingBullet` holds its own `Bullet`:
Bullet (1KB + 50B) × 10,000 = ~10.5 MB

### ✅ With Flyweight
One shared `Bullet`, 10k `FlyingBullet` refs:
1 Bullet = ~1050B ≈ 1 KB

10,000 FlyingBullet × 32B = ~320 KB

Total ≈ 321 KB

---

## 💡 Insight

Not all object references mean Flyweight.

👉 `User → Address → BankDetails` is just **normal composition**, not Flyweight.

Most fields in `User` are unique, so it doesn't make sense to apply the Flyweight pattern — even though `User` may reference other objects like `Address` or `BankDetails`.

✅ Use Flyweight only when:
- Many objects share the **same heavy data**
- You want to **save memory**
