+-------------------------+---------------------------------+------------------------------------------------+
| Client Request          | Server Response                 | Description                                    |
+-------------------------+---------------------------------+------------------------------------------------+
| Book_appt, 12 (bID)     | find 12(bID) yes or no,         | Find this barber return if barber is           |
|                         | create a appt for bID.          | available or not.                              |
+-------------------------+---------------------------------+------------------------------------------------+
| Update_appt, 12(bID)    | Cancel_appt, make a             | Cancel the current appt,                       |
|                         | new appt.                       | reschedule a new one.                          |
+-------------------------+---------------------------------+------------------------------------------------+
| Cancel appointment      | Appointment canceled            | Client cancel canceled the                     |
| with 12(bID)            |                                 | appointment                                    |
+-------------------------+---------------------------------+------------------------------------------------+
| QUIT                    | None                            | Clint require to end the                       |
|                         |                                 | connection                                     |
+-------------------------+---------------------------------+------------------------------------------------+

Data Structures
Class Barber
Fields
int barberId
private HashSet<String> appointments; (here could be a external time management system) 

Public Methods:
boolean isAvailable(String time)
void bookAppointment(String time)
void cancelAppointment(String time)

Class Client:
Fields
Int clientId
Methods:
void bookAppointment(int barberId, String time) 
void updateAppointment(int barberId, String oldTime, String newTime) 
void cancelAppointment(int barberId, String time) 
void quit
