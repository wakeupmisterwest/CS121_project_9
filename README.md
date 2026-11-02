# CS121_project_9
## "Guesser.java" algorithm
```
1. Create new Scanner scanner and Random random
2. Create while loop to run game in
3. Print out menu
4. 0 to break loop, 1 to play human guesser, 2 to play computer guesser
5. Human guesser stores random number, turns, and user's guest. Keeps looping till user guesses the right number
6. Computer guess will store turns, highest, lowest, and mid point for guess. Keeps looping until user inputs c
7. Will return back to menu after game is finished
```
## The Computer Guesser algorithm
```
1. Guess the number 50
2. If hidden number is above 50 guess 75, if lower guess 25.
3. Contiue guessing midpoint of numbers until guess it correct
4. Formula is mid = lowest + (highest - lowest) / 2
5. Formula for too high number is high = mid - 1;
6. Formula for too low number is low = mid + 1
```