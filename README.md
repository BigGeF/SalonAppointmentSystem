
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
