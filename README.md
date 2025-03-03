# Swingcalculator_project
This is a Swing-based Calculator built using Java's Swing GUI framework. The calculator supports basic arithmetic operations such as addition, subtraction, multiplication, and division. It provides a user-friendly interface with interactive buttons and a display area for input and results.

Features

Basic Arithmetic Operations: Addition, Subtraction, Multiplication, and Division.

Graphical User Interface (GUI): Built with Java Swing components.

Interactive Buttons: Digit buttons (0-9) and operation buttons (+, -, *, /, =, C).

Real-time Display: Shows input expressions and computed results.

Error Handling: Prevents division by zero and invalid operations.

Requirements

Java Development Kit (JDK) 8 or later

Any Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans)

Installation

Clone or download the repository: git clone https://github.com/Swingcalculator_project/swing-calculator.git cd swing-calculator 

Open the project in your preferred Java IDE.

Compile and run the Calculator.java file.

Usage

Launch the calculator.

Click digit buttons to enter numbers.

Choose an operation (+, -, *, /).

Press = to calculate the result.

Press C to clear the display and reset the calculator.

Code Structure

Calculator.java – Main file containing the Swing GUI and calculator logic.

CalculatorFrame.java – Manages the UI layout and button actions (if separate).

CalculatorLogic.java – Handles arithmetic calculations (if separated for MVC structure).

Example Code Snippet

JButton addButton = new JButton("+"); addButton.addActionListener(e -> { num1 = Double.parseDouble(display.getText()); operator = '+'; display.setText(""); }); 

Future Improvements

Add scientific functions (sin, cos, tan, log, etc.).

Implement memory functions (M+, M-, MR).

Improve UI design with custom themes.

License

This project is licensed under the MIT License.

Credits & Acknowledgments
Inspired by Java Swing and its extensive documentation.
Thanks to Oracle for providing Java Development Kit (JDK) and Java Runtime Environment (JRE).
License
Distributed under the MIT License. See LICENSE.txt for full details.

Contributing
Contributions, suggestions, and issue reports are welcome! Feel free to submit a pull request or open an issue on GitHub.

Authors:
1.Name: Okoroji John Chidiebere 
Matric number: U23MME1012 
Github username: JohnRichfield-prog

2.Name:Nnaji-Inyama Edwina
Matric number: U23MME1044
Github username: Edwinaa668

3.Name: Toluwalase Omilabu 
Matric number: U23MME1048
Github username: toluomilabu

4.Name: Paul Gabriel Ichoma
Matric number: U23MME1050
Github username: Paul Gabriel Ichoma

5.Name: Daniel Sokogbe Emmanuel 
matric number: U23MME1041
Github username: danny100107

6.Name: Oluwatayo Joshua Temi
Matric number:
U22MME1045
Github username: velly5024
