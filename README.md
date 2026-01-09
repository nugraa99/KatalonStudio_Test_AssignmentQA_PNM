# QA AUTOMATION TEST

# 1. DESKRIPSI
- Berisi penginputan form dengan beberapa requirement yang tersedia pada web https://demoqa.com/automation-practice-form. Meliputi penginputan nama, validasi email, nomor telfon dan lain lain.


# 2. REQUIREMENT
- Menggunakan Katalon Studio V10
- Menggunakan JAVA Version 22.0.1 (Katalon Studio bisa digunakan oleh JAVA Version 8.0  up)
- Menggunakan JDK 22.0.1
- Menggunakan Google Chrome sebagai tampilan default web ketika me-running automation web


# 3. CARA MENJALANKAN TEST 

## RUNNING TEST CASE 
- Buka Katalon Studio
- Open Project C:\Users\khila\Katalon Studio\Test_AssignmentQA_PNM
- Pilih Test Case yang ingin dijalankan
- Klik tombol run > pilih google chrome sebagai default 
- Cek Log viewer untuk tracking action step yang sedang dilakukan (berfungsi mengetahui jika TC mengalami failed)

## RUNNING TEST SUITE
- Buka menu test suites
- Pilih Test Suite (contoh : practiceform)
- Klik tombol run > pilih google chrome sebagai default 
- Hasil running tersimpan di folder local

## GENERATE PDF
- Buka file project di local
- Masuk kedalam file Katalon Studio
- Masuk kedalam folder report sampai ketemu file HTML
- Klik file HTML tersebut dan tekan CTRL+P > Save as PDF > Simpan

## GENERATE XML
- Buka file project di local
- Masuk kedalam file Katalon Studio
- Masuk kedalam folder report sampai ketemu file JUnit_Report.xml
- Klik file tersebut, maka XML report akan muncul
