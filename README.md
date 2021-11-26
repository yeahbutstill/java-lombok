# Java Lombok

## Pengenalan Lombok
- Project Lombok adalah sebuah java library yang secara otomatis melakukan generate code Java.
- Dengan Project Lombok, tidak perlu membuat hal-hal secara manual seperti Getter Setter, Equals Method, toString dan lain-lain.
- Project Lombok akan membuat kode-kode yang biasa dibuat menjadi outomatis, tanpa harus melakukan lagi secara manual.
- https://projectlombok.org

## Getter dan Setter
- Lombok bisa digunakan untuk membuat Getter dan Setter method secara otomatis dengan menggunakan annotation @Getter dan @Setter
- jika ditempatkan pada field, secara otomatis akan membuat getter atau setter untuk field tersebut
- jika ditempatkan pada class, semua field yang tidak static akan otomatis dibuatkan getter atau setter nya.

## Access Level
- Saat menggunakan @Getter dan @Setter, secara default method getter dan setter nya akan dibuat public
- Jika ingin ubah, bisa ubah visibilty nya menggunakan method value() di @Getter dan @Setter
 
## Constructor
- Lombok juga bisa digunakan untuk membuat constructor secara otomatis.
- @NoArgsConstructor digunakan untuk membuar constructor tanpa parameter
- AllArgsConstructor digunakan untuk membuar constructor dengan semua parameter yang diambil dari field nya, urutanya sesuai dengan urutan field nya.

## Static Method
- Sebagian Class terkadang ada yang menggunakan static method untuk membuat object, contohnya Calender, biasanya digunakan Calender.getInstance()
- Lombok juga bisa digunakan untuk membuar object dengan static object, bisa gunakan annotation yang sama, namun bisa tambahkan method() statiacName pada annotation nya.
- Secara otomatis constructor akan menjadi private, sehingga dipaksa untuk menggunakan static method ketika membuat object nya.
