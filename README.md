# Tamagotchi Duck - Android Game

A virtual pet game where you take care of a digital duck and manage its **depression meter**. Your job is to keep the duck happy by feeding it, letting it sleep, bathe, read, and more. If the duck becomes too sad... the game ends. 🥲

---

## 🐣 Game Overview

- **Genre**: Virtual Pet / Simulation  
- **Platform**: Android  
- **Engine**: Android Studio (Java/Kotlin + XML)  
- **Goal**: Keep the duck's depression meter low by attending to its needs.

---

## 📥 How to Download and Run the Game

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/your-username/Tamagotchi_Android_Game.git
   ```

2. **Open in Android Studio**
   - Open Android Studio.
   - Choose **"Open an existing project"** and select the cloned folder.
   - Let Gradle sync.

3. **Run the App**
   - Plug in your Android device or start an emulator.
   - Click **Run ▶️** to build and launch the app.

---

## 🔄 Fragment System

The game uses **Android Fragments** to manage different activities in the duck's life. Switching between fragments allows for modular management of each action that impacts the duck’s well-being and stats:

- **Happy Fragment**: Default state showing a healthy duck.
- **Reading Fragment**: Improves the duck’s knowledge and mood.
- **Sleep Fragment**: Lets the duck rest, reducing depression.
- **Eat Fragment**: Feeds the duck, improving mood and energy.
- **Bath Fragment**: Keeps the duck clean and happy.
- **End Fragment**: Triggered if the duck becomes too depressed.

---

## 🖼️ Screenshots

### Happy Fragment  
<img src="https://github.com/user-attachments/assets/50743612-71e3-4351-898e-58ab307e5a82" width="300"/>

### Reading Fragment  
<img src="https://github.com/user-attachments/assets/0250ca39-9e6d-45db-94b6-868057ff9e70" width="300"/>

### End Fragment  
<img src="https://github.com/user-attachments/assets/938e5346-428e-46dd-95ce-f43fad6bd1f6" width="300"/>

### Sleep Fragment  
<img src="https://github.com/user-attachments/assets/294808c7-0bb4-4ca6-bdc3-71d4a2d50c18" width="300"/>

### Eat Fragment  
<img src="https://github.com/user-attachments/assets/69364833-b1f7-481e-aa68-dcf422d2ca1a" width="300"/>

### Bath Fragment  
<img src="https://github.com/user-attachments/assets/81ce316f-1294-4c48-a980-1ec6a476b323" width="300"/>

---

## 🌟 Future Improvements

- **Better Animations**: Add smoother duck transitions and idle animations.
- **Feature Expansion**:
  - Mini-games to cheer up the duck.
  - Customizable duck accessories.
  - Mood-based audio/music.
- **Improved Gameplay**:
  - More intuitive UI/UX for interacting with the duck.
  - Add random events and daily challenges.
- **Replayability**:
  - Mood history tracking.
  - Unlockable ducks or environments.
  - Achievement system.

---

## 🧠 Developer Notes

This project was built as a fun and quirky take on the mental health aspects of caring for a pet. It uses basic Android architecture and is a great example of using **fragments to separate concerns**, manage states, and enhance modular development.
 
