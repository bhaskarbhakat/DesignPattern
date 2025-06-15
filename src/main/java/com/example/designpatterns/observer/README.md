# Observer Pattern - Java Implementation

This project demonstrates the Observer Design Pattern using a YouTube-Subscriber analogy.

### Structure:
- `Observer` interface
- `Subject` interface
- `User` (Observer)
- `YoutubeChannel` (Subject)
- `ObserverDriverMain` (Driver to simulate upload + notifications)

### Output Sample:
```
New video is uploaded : Mr Beast Channel
>>> Notify all the subscriber
User bhaskar received message: New Video arrived
User lucky received message: New Video arrived
>>> All subscriber got notified
```