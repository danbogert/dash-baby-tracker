# dash-baby-tracker
A simple baby tracker that uses the dash library to log a message each time the baby wakes up.

This needs to run as root for the networking to work.

To run:
- `mvn clean package`
- `sudo java -jar target/dash-baby-tracker*jar` or `sudo java -jar target/dash-baby-tracker*jar <networkInterface>`
