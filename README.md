# QuestAPI_0219 - Aplikasi Data Siswa (Pertemuan 12)

Repository ini berisi proyek Android Aplikasi Data Siswa berbasis **Jetpack Compose** dan **Retrofit** yang terhubung ke RESTful API dengan backend PHP dan database MySQL (`tiumy`).

---

## 👤 Informasi Pengembang

- **Nama Repository**: `QuestAPI_0219`
- **Username Git**: `devano2068`
- **Email**: `devano27921@gmail.com`

---

## 🛠️ Arsitektur & Teknologi

- **UI Framework**: Jetpack Compose (Material 3)
- **Networking**: Retrofit 2 + OkHttp 4 (Logging Interceptor)
- **Serialization**: Kotlinx Serialization JSON
- **Architecture Pattern**: MVVM + Repository Pattern + Dependency Injection (`ContainerApp`)
- **Navigation**: Jetpack Navigation Compose

---

## 🗄️ Konfigurasi Backend & Database (`tiumy`)

- **Base URL**: `http://10.0.2.2/tiumy/` (untuk Emulator Android ke Localhost)
- **Nama Database**: `tiumy`

### Service API Endpoints (`ServiceApiSiswa.kt`)

1. **`GET /tiumy/bacaTeman.php`**
   - Mengambil seluruh daftar data siswa dari database.
2. **`POST /tiumy/insertTM.php`**
   - Menambahkan record siswa baru ke database.

### Model Data (`DataSiswa.kt`)

```kotlin
@Serializable
data class DataSiswa(
    val id: Int = 0,
    @SerialName("Nama")
    val nama: String,
    @SerialName("Alamat")
    val alamat: String,
    val telpon: String
)
```

---

## 📱 Fitur Utama Aplikasi

1. **Halaman Utama (Home Screen)**
   - Menampilkan daftar siswa dalam bentuk Card.
   - Status UI dinamis: `Loading`, `Success`, dan `Error` (dengan tombol *Retry*).
   - Floating Action Button (FAB) untuk navigasi ke halaman tambah siswa.

2. **Halaman Tambah Siswa (Entry Screen)**
   - Form input: `Nama Siswa`, `Alamat Siswa`, dan `Telpon Siswa`.
   - Validasi input real-time (*Submit button* aktif hanya jika seluruh field terisi).
   - Mengirim data via HTTP POST ke backend `insertTM.php`.

---

## 📸 Dokumentasi & Screenshot Operasi

### 1. Struktur Database phpMyAdmin (`tiumy`)
![Struktur Database phpMyAdmin](docs/screenshots/database_structure.png)
*Tampilan struktur database `tiumy` pada phpMyAdmin (bacaTeman.php & insertTM.php)*

### 2. Tampilan Halaman Utama (Home Screen - List Siswa)
![Halaman Utama](docs/screenshots/home_screen.png)
*Daftar data siswa yang berhasil dimuat dari server via GET bacaTeman.php*

### 3. Tampilan Form Entry Siswa (Entry Screen)
![Halaman Form Entry](docs/screenshots/entry_screen.png)
*Formulir penambahan data siswa baru*

### 4. Hasil Penambahan Data Siswa (POST Operation)
![Hasil POST Data](docs/screenshots/post_success.png)
*Data siswa baru berhasil ditambahkan ke database*

---

## 🚀 Cara Menjalankan Aplikasi

1. Pastikan server lokal (XAMPP / Laragon) aktif dengan database `tiumy`.
2. Pastikan file script `bacaTeman.php` dan `insertTM.php` berada di folder `htdocs/tiumy/`.
3. Buka proyek ini di **Android Studio**.
4. Jalankan aplikasi pada Emulator Android atau Perangkat Fisik (pastikan IP backend disesuaikan jika menggunakan perangkat fisik).

---

## 📤 Menghubungkan & Push ke Remote Repository GitHub (`QuestAPI_0219`)

```bash
# Hubungkan ke repository GitHub
git remote add origin https://github.com/devano2068/QuestAPI_0219.git

# Set branch utama ke main dan push seluruh commit
git branch -M main
git push -u origin main
```
