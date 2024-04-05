STATIC VARIABLE

This is a property that belongs to the class
This is especially useful when creating and ID for objects everytime we create them.

```
public static int id;


public Animal(String food){
        this.food = food;
        id++//this code checks across all objects to ensure no two objects have the same ID
            //it increments the ID everytime an object is created
    }
```

STATIC METHODS
