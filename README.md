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
      
## Required Args Constructor
- Saat menggunakan @NoArgsConstructor maka akan dibuatkan constructor tanpa parameter, jika menggunakan @AllArgsConstructor maka akan dibuatkan constructor untuk semua parameter.
- Terkadang hanya ingin membuat constructor untuk parameter yang wajib saja.
- Pada kasus ini, menggunakan @RequiredArgsConstructor
- Secara otomatis Lombok hanya akan membuat constructor dengan parameter untuk field yang final.

## ToString
- Lombok juga bisa digunakan untuk membuat method toString() secara otomatis.
- Menggunakan annotation @ToString di class.
- Secara otomatis akan membuat method toString() yang bersifat informasi semua field yang ada di class tersebut.

## Exclude Field Name
- Terkadang saat membuar method toString() tidak ingin menampilkan semua field.
- Terkadang ada beberapa field yang sensitive sehingga tidak ingin menampilkannya ke dalam method toString().
- Untuk melakukan itu, bisa menggunakan method exclude() di annotation @ToString

## Equals dan HashCode
- Lombok juga bisa digunakan untuk membuat method equals dan hashCode secara otomatis.
- Kedua method ini akan selalu diimplementasikan berbarengan.
- Untuk membuat Equals dan HashCode secara otomatis, bisa menggunakan annotation @EqualsAndHashCode

## Exclude Field
- Saat membuat equals() dan hashCode() method, Lombok akan selalu menyamakan field mana yang dibandingkan.
- Secara default, Lombok akan menggunakan semua field yang ada di class tersebut.
- Jika tidak ingin menggunakan salah satu field, maka bisa menggunakan exclude() method di annotation nya.

## Super Class
- Secara default, ketika membuat equals() dan hashCode() method, Lombok tidak akan memanggil super class method nya.
- Jika ingin Lombok memanggil super class method nya, perlu mengubah method callSuper() menjadi true di annotation nya, default nya adalah false.
            
## Data
- Saat nenbuat sebuah class Data/Model/Entity, terkadang sering menggunakan annotation @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
- Lombok memiliki annotation khusus untuk mepersingkatnya, yaitu dengan menggunakan @Data

## Override Annotation
- Jika ingin menubah annotation atau menambahkan annotation setelah menggunakan Data, juga bisa dilakukan.
- Misal menambah @AllArgsConstructor atau mengubah @ToString

## Builder
- Saat membuat object yang kompleks, terkadang sedikit menyulitkan jika harus selalu membuat dibuat menggunakan constructor atau menggunakan setter method.
- Lombok memiliki fitur untuk melakukan auto generate class Builder untuk membuat object yang kompleks.
- Dengan ini, pembuatan object akan lebih mudah menggunakan class Builder nya.
- Untuk caranya cukup gunakan @Builder pada class tersebut.
- Lombok akan secara otomatis membuat static method builder() untuk membuat builder object nya, dan build() untuk membuat object nya.

## Singular
- Saat membuat builder, secara default harus menggunakan object yang diperlukan secara langsung, misalnya sebelum ada field List<String>hobbies, makan wajib menggunakan langsung object List nya.
- Lombok memiliki fitur @Singular, yang bisa digunakan sebagai helper, sehingga tidak perlu langsung membuat List nya.
- Lombok akan membuat builder method untuk menambahkan data ke Collection(List, Set atau Map) satu per satu.

## Non Null
- Sebelumnya, saat membuat constructor dengan @RequiredArgsConstructor, Lombok akan menjadi final field. Hal ini membuat field tersebut tidak bisa diubah lagi.
- Lombok memiliki annotation @NonNull
- Jika @NonNull ditempatkan di field, maka secara otomatis juga akan di generate di @RequiredArgsConstructor, sekaligus dilakukan pengecekan tidak boleh null. Selain itu semua setter method nya juga akan dilakukan pengecekan null.
- Jika @NonNull ditempatkan di parameter, maka parameter tersebut akan dilakukan pengecekan null.
- jika parameternya null, maka otomatis akan throw NullPointerException.
              
## Value
- Terkadang sering membuat sebuah class yang bersifat immutable(Tidak bisa diubah lagi ketika sudah dibuat)
- Biasanya yang dilakukannya adalah, menjadikan semua field nya final, tidak membuat setter method dan membuat constructor untuk semua field.
- Lombok memiliki fitur yang bisa digunakan untuk membuat immutable class, yaitu menggunakan annotation @Value

## With 
- Lombok memiliki fitur untuk membuat class baru dengan memodifikasi salah satu field yang sudah ada dengan menggunakan annotation @With
- Jika ditempatkan di field, maka secara otomatis akan membuat method dengan nama withXxx
- Jika ditempatkan di class, maka secara otomatis akan membuat method withXxx untuk semua field.
