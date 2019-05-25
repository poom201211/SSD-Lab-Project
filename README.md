# main.Snake main.Game

## Description

- This game is your typical main.Snake game. Starting at a position you venture through the square map trying to eat apples in order to grow. There is a special feature which I have included in this game, which is the ability to return to a specific position saved.

## Instructions

- Run program in main.Main

## Patterns and UML diagrams

- Singleton design pattern: main.Game class is ensure to be uneditable in other words, this class could not be re-initialized.

![Singleton UML](https://github.com/poom201211/SSD-Lab-Project/blob/master/UML%20image/singleton.png)

- Observer design pattern: Any change would be updated, hence repaiting when ever.

![Observer UML](https://github.com/poom201211/SSD-Lab-Project/blob/master/UML%20image/observable.png)

- main.Memento design pattern: Used to save a state of snakes position and return to it when ever.

![main.Memento UML](https://github.com/poom201211/SSD-Lab-Project/blob/master/UML%20image/mememto.png)



