# 🐾 Allatok Projekt

Ez a projekt az `allatok.csv` fájlban található állatfajok adataival dolgozik. A cél különféle szűrések, számítások és fájlkezelési feladatok elvégzése Java nyelven.

> **Adatformátum:** `Állatfaj;Magasság(cm);Súly(kg);Életkor(év)`  
> **Elválasztó:** pontosvessző `;`  
> **Kódolás:** UTF-8  

---

## 📂 Feladatleírások és Pontozás

### 0️⃣ Adatok beolvasása *(2 pont)*
- Olvassuk be a fájl adatait egy megfelelő adatszerkezetbe.
- Jelenítsük meg a beolvasott állatfajták számát.

---

### 1️⃣ Legmagasabb állatfajta *(1 pont)*
- Írjuk ki a legmagasabb állatfajta nevét és magasságát.

---

### 2️⃣ Átlagéletkor számítás *(1 pont)*
- Számoljuk ki a **20 kg-nál nehezebb** állatfajok **átlag életkorát**, **két tizedesjegyre kerekítve**.

---

### 3️⃣ Átlagsúlyhoz legközelebbi fajta *(2 pont)*
- Határozzuk meg az átlagos súlyhoz legközelebb eső állatfajtát és annak súlyát.

---

### 4️⃣ Dupla betűs állatfajták *(1 pont)*
- Soroljuk fel azokat az állatfajtákat, amelyek nevében **egymás után két egyforma betű** szerepel.

---

### 5️⃣ Magasság szerinti kategorizálás *(3 pont)*
- Kategorizáljuk a fajtákat **50 cm-es lépésekben** a magasságuk alapján.
- Minden kategóriát **három számjegyre (vezető nullákkal)** írjunk ki.
- Írjuk ki, hogy **mely kategóriákba hány fajta tartozik**.

---

### 6️⃣ Véletlenszerű kategória kiválasztása *(3 pont)*
- Válasszunk egy kategóriát **véletlenszerűen**.
- Soroljuk fel az oda tartozó állatfajokat, **vesszővel elválasztva (a végén nincs vessző)**.

---

### 7️⃣ Kimeneti fájl generálás *(2 pont)*
- Hozzuk létre a `kicsi.csv` fájlt.
- Ebbe írjuk ki az **1 méternél kisebb állatok** adatait.

---

## 🧪 Minta kimenet

**0)** Összesen **26** féle állatfajta adata beolvasva  
**1)** A legmagasabb állatfajta: **Zsiráf**, *500cm*  
**2)** A húsz kilónál nehezebb fajták átlagéletkora: **24,71 év**  
**3)** Az átlagsúlyhoz *(453kg)* legközelebbi fajta: **Ló** *(500kg)*  
**4)** Kettős betű van a fajta nevében:
- 🦏 Indiai orrszarvú  
- 🦍 Gorilla  
- 🐗 Vaddisznó  

**5)** Magasság kategóriák *(50cm-es bontásban)*:
- 000–049cm: **4** darab  
- 050–099cm: **8** darab  
- 100–149cm: **5** darab  
- 150–199cm: **7** darab  
- 300–349cm: **1** darab  
- 500–549cm: **1** darab  

**6)** Egy véletlenszerűen kiválasztott kategóriába *(000–049cm)* tartozó fajok:  
`Szürke róka, Lemúr, Kakadu, Süni`

---

## 🧾 `kicsi.csv` tartalma (példa)
Leopárd;60;90;15
Farkas;90;40;8
Szürke róka;40;5;7
Vörös panda;60;5;10
Koala;60;14;12
Lemúr;40;2;17
Túzok;90;15;9
Kakadu;30;1;52
Puma;70;50;12
Hiúz;80;20;21
Vaddisznó;80;100;14
Süni;20;1;7

yaml
Másolás
Szerkesztés

---

## 🚀 Futtatás és fejlesztés

1. Hozz létre egy új Java projektet `Allatok` néven.
2. Add hozzá az `allatok.csv` fájlt a projekt könyvtáradhoz.
3. Írd meg a programot, amely sorban elvégzi a megadott feladatokat.
4. Használj **osztályokat** és **metódusokat** az átlátható kód érdekében.

---

## 📌 Megjegyzés

- A fájlokat **UTF-8 kódolással** olvasd be.
- Az átlagszámításokhoz használj **két tizedesjegyet**, ügyelve a helyes kerekítésre.
- Az eredményeket **formázott módon** jelenítsd meg a konzolon.


