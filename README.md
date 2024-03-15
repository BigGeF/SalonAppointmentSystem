| Client Request            | Server Response                          | Description                                          |
|------------------------   |------------------------------------      |----------------------------------------------------- |
| Book appointment, slot    | Booked slot or Slot not available        | Books an appointment if the slot is available.       |
| Cancel appointment, slot  | Appointment canceled for slot            | Cancels the booked appointment in the specified slot.|
| Check appointment, slot   | Slot [number] is available/not available | Checks the availability of the specified slot.       |
| QUIT                      | (No response, connection closed)         | Client request to end the connection.                |

This table outlines the client requests, the corresponding server responses, and a brief description of each interaction within the salon appointment system.
Class: Salon
Fields:AppointmentSlot[] slots   
Methods:
      public Salon(int size)   
      public void bookAppointment(int slotNumber)   
      public void cancelAppointment(int slotNumber)   
      public boolean isAvailable(int slotNumber)   

Class: Client
Fields:int clientId   

Methods:
   (Assumed based on context, not explicitly provided)
      public void bookAppointment(Salon salon, int slotNumber)   
      public void cancelAppointment(Salon salon, int slotNumber)   
      public void checkAppointment(Salon salon, int slotNumber)   


