# Java_Playground
Welcome to this Repository. Here, I push random stuff related to Java. 

Also, a Game was created 
# Flappy Bird

A Java implementation of the classic Flappy Bird game, using the **Swing** library for GUI rendering and object-oriented programming principles to manage game components.

## Features
- **Gameplay**: Navigate the bird through a series of tubes while avoiding collisions.
- **Physics**: Gravity-based mechanics with user-triggered upward movement using the spacebar.
- **Dynamic Difficulty**: The game's speed increases as you progress.
- **Score System**: Tracks current and high scores across sessions.
- **Graphics**: Includes background, bird, and tube sprites.
- **Responsive Controls**: Start and control the game using keyboard inputs.

## Prerequisites
- **Java JDK 8+**: Ensure you install the Java Development Kit.
- **Assets**: Place the following image files in the `src` directory or classpath:
  - `bird.png`: Sprite for the bird.
  - `TubeBody.png`: Sprite for the tubes.
  - `background.jpg`: Background image for the game.

## Controls
- **Enter**: Start or restart the game.
- **Spacebar**: Make the bird jump.

## How to Run
1. Compile the Java files:
   ```bash
   javac FlappyBird.java
## GamePlay Images
![image](https://github.com/user-attachments/assets/cfbab997-a345-47a6-8381-1025b5c0abd7)
![image](https://github.com/user-attachments/assets/b541d2d1-b4f7-48cc-845c-c7b400cd4a60)



## Project Structure
**Main Class:** FlappyBird initializes the game window and main game loop.
**Core Classes:**
**Game:** Manages the game state, rendering, and logic updates.
**Bird:** Represents the player-controlled bird with movement and collision logic.
**Tube and TubeColumn:** Represent obstacles with dynamic positioning and speed.
**Window:** Creates the game window and manages its properties.
**Support Classes:**
**ProxyImage and RealImage:** Use the proxy design pattern to load and manage image assets.
**Controller:** Handles user input to control the bird.


## Key Concepts Demonstrated
Object-Oriented Design: Modular code with encapsulated game logic.
Event Handling: Captures keyboard inputs for gameplay interaction.
Proxy Design Pattern: Efficient image loading and resource management.
Graphics Rendering: Custom rendering of sprites and UI components using Graphics2D.

## Customization
Modify Window.WIDTH and Window.HEIGHT in the Window class to change the screen size.
Adjust game difficulty by changing the speed and changeSpeed variables in the TubeColumn class.
License
This project is licensed under the MIT License.

## Acknowledgments
Inspired by the original Flappy Bird game developed by Dong Nguyen.
Utilizes the Swing framework for GUI and event-driven programming.
