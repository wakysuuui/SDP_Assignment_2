# Clean Code Requirements
1. **Meaningful, Intention-Revealing Names:** Use clear names such as `CleaningRobot`, `SecurityRobot`, and `HomeRobotFactory`.
2. **Single Responsibility Principle (SRP):** Separate robot behavior from robot creation by using different robot and factory classes.
3. **Small Methods, Doing One Thing:** Factory methods such as `createRobot()` only create and return the required robot.
4. **No Magic Numbers / Strings:** Robot types are represented by separate classes instead of hardcoded type values.
5. **Validated Construction:** Use clear validation and exceptions when invalid robot data is provided.
