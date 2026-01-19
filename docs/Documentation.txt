vtq5nn

The purpose of this program is to display a series of words from a sonnet, prompting the user to guess the following word.
The program tracks the users progress (how many guesses were right/wrong) and stops once 3 guesses were either right or wrong.

In order to run the program:
1. Open the project in IntelliJ from the GitHub link provided.
2. Run the homework program.
3. Follow the instructions in the concole.

How the program works:
- The program splits the given sonnet into a bunch of words
- Random word index is selected
- The program prints all the previous words, with the guess word being hidden with dashes
- The user is prompted to guess the hidden word
- The program compares the guess to the actual next word
- Loop continues until there are 3 incorrect or correct guesses.

Testing was done with JUnit.
- Tested for a non-empty string array and verifies the first & last words of the sonnet.

IDE: IntelliJ IDEA
