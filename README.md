# 🔥 QuestFirebase — Android Firebase App

### Android Application with Kotlin, Jetpack Compose & Firebase Firestore

**QuestFirebase** adalah proyek aplikasi Android yang dikembangkan menggunakan **Kotlin** dan **Jetpack Compose**, dengan integrasi Firebase Firestore untuk mendukung pengembangan aplikasi berbasis database cloud.

Proyek ini berfokus pada pembuatan antarmuka modern, pengisian data melalui formulir, navigasi antarlayar, serta penyajian hasil input pengguna.

---

## ✨ Fitur Utama

- **Home Page** — Halaman utama sebagai titik awal penggunaan aplikasi.
- **Form Input** — Antarmuka untuk memasukkan informasi melalui formulir.
- **Hasil Input** — Tampilan hasil data yang telah dimasukkan pengguna.
- **Jetpack Compose UI** — Pembuatan antarmuka Android menggunakan pendekatan deklaratif.
- **Firebase Integration** — Konfigurasi Firebase Firestore sebagai layanan database cloud.
- **Navigation** — Penggunaan komponen navigasi untuk perpindahan antarlayar.

---

## 📱 Tampilan Aplikasi

### 1. Home Page

Halaman utama merupakan tampilan awal aplikasi yang menyediakan akses ke fitur penginputan dan pengelolaan informasi.

Melalui halaman ini, pengguna dapat memulai interaksi dengan aplikasi.

![Home Page QuestFirebase](https://github.com/user-attachments/assets/e7651e52-7f27-4dc4-b764-14fb4136ce7f)

### 2. Form Input

Halaman input digunakan untuk memasukkan data melalui formulir yang tersedia.

Tampilan ini menggambarkan implementasi komponen input pada Jetpack Compose serta proses pengumpulan informasi dari pengguna.

![Form Input QuestFirebase](https://github.com/user-attachments/assets/bc2de887-a120-40fb-9ffa-f49d82aaa267)

### 3. Hasil Input

Halaman ini menampilkan hasil data setelah pengguna menyelesaikan proses pengisian formulir.

Fitur ini memperlihatkan alur penyajian informasi dari input pengguna ke tampilan hasil aplikasi.

![Hasil Input QuestFirebase](https://github.com/user-attachments/assets/263fd9d6-aa7d-41e6-a209-a557d0aceac9)

---

## 🛠️ Teknologi yang Digunakan

| Teknologi | Kegunaan |
|---|---|
| Kotlin | Bahasa pemrograman utama |
| Android SDK | Pengembangan aplikasi Android |
| Jetpack Compose | Framework UI deklaratif |
| Material Design 3 | Komponen antarmuka |
| Firebase Firestore | Integrasi database cloud |
| Navigation Compose | Navigasi antarlayar |
| ViewModel | Pengelolaan state dan logika presentasi |
| Gradle Kotlin DSL | Konfigurasi build dan dependency |

---

## 🚀 Cara Menjalankan Project

### Persyaratan

- Android Studio
- JDK dan Android SDK yang kompatibel
- Emulator Android atau perangkat fisik
- Project Firebase jika menjalankan fitur yang membutuhkan Firestore

### 1. Clone Repository

```bash
git clone https://github.com/Kurwhy/QuestFirebase_040.git
cd QuestFirebase_040
```

### 2. Buka di Android Studio

Buka Android Studio, pilih **Open**, kemudian arahkan ke folder project.

### 3. Konfigurasi Firebase

Jika menggunakan project Firebase milik sendiri:

1. Buat project di Firebase Console.
2. Tambahkan aplikasi Android dengan package name `com.example.praktikum_pertemuan14`.
3. Unduh konfigurasi `google-services.json`.
4. Tempatkan file tersebut pada folder `app/`.
5. Siapkan database Cloud Firestore dan aturan akses sesuai kebutuhan pengujian.

Jangan mengunggah konfigurasi privat atau kredensial layanan ke repository publik.

### 4. Jalankan Aplikasi

Tunggu proses Gradle Sync hingga selesai, pilih emulator atau perangkat Android, lalu klik **Run**.

---

## 📂 Struktur Project

```text
QuestFirebase_040/
├── app/
│   └── src/
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── README.md
```

---

## 🎯 Tujuan Pengembangan

Proyek ini dibuat sebagai praktik pengembangan aplikasi Android menggunakan Kotlin dan Jetpack Compose, khususnya dalam:

- Merancang antarmuka menggunakan komponen Compose.
- Membuat formulir untuk menerima input pengguna.
- Menampilkan hasil pengisian data.
- Mempelajari navigasi antarlayar.
- Mengintegrasikan dependency Firebase Firestore.
- Memahami konfigurasi proyek Android berbasis Gradle.

---

## 📌 Catatan Pengembangan

Project ini merupakan aplikasi pembelajaran. Konfigurasi dependency Firebase Firestore sudah tersedia, tetapi keberhasilan penyimpanan dan pengambilan data pada layanan Firebase secara langsung belum diverifikasi dalam dokumentasi ini.

---

## 👨‍💻 Developer

**Kurwhy**

GitHub: [github.com/Kurwhy](https://github.com/Kurwhy)

Repository: [QuestFirebase_040](https://github.com/Kurwhy/QuestFirebase_040)

---

*Built with Kotlin, Jetpack Compose & Firebase.*
