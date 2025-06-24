userJSON Structure : Visible in edit mode.
+----------------------+
|     UserPojos        |
+----------------------+
| - id: int            |
| - name: String       |
| - email: String      |
| - department: String |
| - isPermanent: boolean|
| - salary: double     |
| - address: Address   |⟶──┐
| - projects: List<Projects>|⟶─┐
| - skills: List<String>     |  |
+----------------------+     |  |
                             |  |
        +---------------------+  |
        |       Address         |  |
        +---------------------+  |
        | - street: String      |  |
        | - city: String        |  |
        | - zipcode: String     |  |
        +---------------------+  |
                                 |
          +----------------------------+
          |         Projects           |
          +----------------------------+
          | - projectId: String        |
          | - projectName: String      |
          | - status: String           |
          +----------------------------+

1. Create JSON using POJO class, Hashmap, or pass as a String body
