package MingguKelima;

public class WSIB_Week5_1_3 {
    static class Animal {
        public void makeSound() {
            System.out.println("Animal");
        }
    }
    
    static class Dog extends Animal {
        public void makeSound() {
            System.out.println("Bark");
        }
    }
    
    public class TestPolymorphism {
        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.makeSound();  // Output: "Animal"
    
            Dog dog = new Dog();
            dog.makeSound();  // Output: "Bark"
    
            Animal newAnimal = new Dog();
            newAnimal.makeSound();  // Output: "Bark" (Dynamic Method Dispatch)
    
            if (newAnimal instanceof Animal) {
                System.out.println("newAnimal is an Animal");
            }
            if (newAnimal instanceof Dog) {
                System.out.println("newAnimal is a Dog");
            }
        }
    }
}


// Ketika program ini dijalankan, outputnya adalah:

// csharp
// Copy
// Edit
// Animal
// Bark
// Bark
// newAnimal is an Animal
// newAnimal is a Dog
// Analisis Perbaris:
// Animal animal = new Animal();

// Memanggil makeSound() dari kelas Animal
// Output: "Animal"
// Dog dog = new Dog();

// Memanggil makeSound() dari kelas Dog
// Output: "Bark"
// Animal newAnimal = new Dog();

// Menggunakan Polimorfisme (Dynamic Method Dispatch)
// Metode makeSound() dari kelas Dog dipanggil, bukan dari kelas Animal
// Output: "Bark"
// if (newAnimal instanceof Animal)

// Karena newAnimal adalah objek dari kelas Dog, dan Dog adalah subclass dari Animal, maka kondisi ini true
// Output: "newAnimal is an Animal"
// if (newAnimal instanceof Dog)

// newAnimal adalah objek dari kelas Dog, sehingga kondisi ini true
// Output: "newAnimal is a Dog"
// Kesimpulan
// Polimorfisme memungkinkan referensi dari superclass (Animal) menunjuk ke subclass (Dog) dan menjalankan metode subclass.
// Dynamic Method Dispatch memastikan bahwa metode yang dipanggil berasal dari subclass, bukan superclass.
// Operator instanceof digunakan untuk mengecek tipe objek pada runtime.






