

# Calculator

This project is a simple calculator application developed using *Java Swing*. The calculator supports basic arithmetic operations such as addition, subtraction, multiplication, division, and modulus.

## Features

- *Basic Arithmetic Operations:* Addition, Subtraction, Multiplication, Division, and Modulus.
- *Clear Button:* Resets the display to start a new calculation.
- *Decimal Support:* Allows decimal point input for floating-point calculations.
- *User-Friendly Interface:* Responsive buttons and display area.
## video ot calculator

## Code Structure

### calculate Class

- This is the main class where the calculator's functionality is implemented. It extends JFrame and implements ActionListener.

### User Interface (UI)

- **JFrame (jf): The main window of the application.
- **JLabel (displayLabel): Acts as the display screen where the input and output are shown.
- *JButton*: Used for all the number buttons (0-9), operator buttons (+, -, *, /, %), and special buttons like "=", "C", and ".".
  

### Event Handling

- The calculator uses ActionListener to handle button clicks.
- When a button is clicked, the actionPerformed method is triggered, where the appropriate action is taken based on the button clicked.

### Arithmetic Operations

- **Addition (+)**
- **Subtraction (-)**
- **Multiplication (*)**
- **Division (/)**
- **Modulus (%)**

The operations are performed by storing the first value, then applying the operator, and finally calculating the result when the "=" button is pressed.

## How to Use

1. *Compile and Run:* To use the calculator, compile the calculate.java file and run it.
2. *Input Numbers:* Click the number buttons (0-9) to input values.
3. *Perform Operations:*
   - Click an operator button (+, -, *, /, %) to select the operation.
   - Enter the second number.
   - Click the "=" button to view the result.
4. *Clear Display:* Use the "C" button to clear the display and start a new calculation.

### Example Usage

- *Addition:* To add 5 and 3:
  1. Press "5"
  2. Press "+"
  3. Press "3"
  4. Press "="
  5. Result: 8

## Future Improvements

- Implement more advanced operations such as square root, exponentiation, etc.
- Improve the UI for a better user experience.
- Add keyboard input support.

## Conclusion

This project is a simple calculator built using Java Swing. It's a great example of how to handle user input, perform basic arithmetic operations, and update the GUI in real time.
