package MingguKelima;

public class WSIB_Week5_1_2 {

    static class A {
        void callThis() {
            System.out.println("Inside Class A's Method");
        }
    }

    static class B extends A {
        void callThis() {
            System.out.println("Inside Class B's Method");
        }
    }

    static class C extends A {
        void callThis() {
            System.out.println("Inside Class C's Method");
        }
    }

    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;

        ref = b;
        ref.callThis(); 

        ref = c;
        ref.callThis(); 

        ref = a;
        ref.callThis(); 
    }
}

// Penjelasan Output
// Kode ini mendemonstrasikan konsep Dynamic Method Dispatch atau Polymorphism dalam Java.
// Ketika objek dari subclass (B dan C) direferensikan oleh variabel superclass (A ref;), metode callThis() yang dipanggil ditentukan berdasarkan objek yang sebenarnya (bukan tipe referensinya).
// Kesimpulan
// Dynamic Method Dispatch memungkinkan pemanggilan metode yang sesuai berdasarkan tipe objek aktual, bukan tipe referensi. Ini merupakan implementasi dari polimorfisme dalam Java, di mana metode yang dipanggil adalah metode dari subclass yang direferensikan oleh variabel superclass.
