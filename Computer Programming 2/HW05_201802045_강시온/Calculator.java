import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
	// 각 모드별로 index를 부여
	final int INPUT_MODE = 0;
	final int RESULT_MODE = 1;
	final int ERROR_MODE = 2;
	int displayMode;

	boolean clearOnNextDigit; // 화면에 표시될 숫자를 지울지 말지 결정하는 녀석

	double lastNumber; // 마지막에 기억될 수
	String lastOperator; // 마지막에 누른 연산자를 기억.

	private JTextField output; // 숫자가 표시될 공간
	private JButton buttons[]; // 각 버튼을 배열로 생성할 것임.
	private JPanel masterPanel, btnPanel, ctrPanel; // 버튼과 레이블을 배치할 공간

	// GUI를 생성해보자.
	public Calculator() {

		setBackground(Color.gray); // 프레임의 배경은 회색

		masterPanel = new JPanel();

		output = new JTextField("0"); // 레이블의 초기 값은 0

		buttons = new JButton[17];

		btnPanel = new JPanel();

		// 숫자 버튼 만듦0에서9까지.
		for (int i = 0; i <= 9; i++) {
			buttons[i] = new JButton(String.valueOf(i));
		}

		// 연산 버튼 만듦.
		buttons[10] = new JButton("=");
		buttons[11] = new JButton("/");
		buttons[12] = new JButton("*");
		buttons[13] = new JButton("-");
		buttons[14] = new JButton("+");

		// 컨트롤 버튼 만듦.
		buttons[15] = new JButton("back");
		buttons[16] = new JButton("C");

		// 패널에 숫자버튼 및 연산자 버튼 배치
		btnPanel.setLayout(new GridLayout(4, 5, 2, 2));

		for (int i = 7; i <= 9; i++) {
			btnPanel.add(buttons[i]);
		}

		btnPanel.add(buttons[11]); // /

		for (int i = 4; i <= 6; i++) {
			btnPanel.add(buttons[i]);
		}

		btnPanel.add(buttons[12]); // *

		for (int i = 1; i <= 3; i++) {
			btnPanel.add(buttons[i]);
		}

		btnPanel.add(buttons[13]); // -

		btnPanel.add(buttons[0]); // 0
		btnPanel.add(buttons[15]); //back
		btnPanel.add(buttons[14]); // +
		btnPanel.add(buttons[10]); // =

		// 컨트롤 패널에 컨트롤 버튼을 배치
		ctrPanel = new JPanel();
		ctrPanel.setLayout(new GridLayout(0, 4, 4, 4));

		ctrPanel.add(buttons[16]);

		// 각 컴포넌트를 프레임에 추가
		masterPanel.setLayout(new BorderLayout());
		masterPanel.add(ctrPanel, BorderLayout.NORTH);
		masterPanel.add(btnPanel, BorderLayout.SOUTH);

		getContentPane().add(output);
		getContentPane().add(masterPanel, BorderLayout.SOUTH);
		requestFocus();

		// 버튼 ActionListener 활성
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(this);
		}

		clearAll(); // 모든 값을 초기화

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	// 마우스 입력에 대한 동작
	@Override
	public void actionPerformed(ActionEvent e) {

		double result = 0;

		for (int i = 0; i < buttons.length; i++) {
			if (e.getSource() == buttons[i]) {
				if (i < 10) {
					addToDisplay(i);
					break;
				} else {
					switch (i) {
					case 10: // =
						processEquals();
						break;
					case 11: // /
						processOperator("/");
						break;
					case 12: // *
						processOperator("*");
						break;
					case 13: // -
						processOperator("-");
						break;
					case 14: // +
						processOperator("+");
						break;
					case 15: // back
						backspace();
						break;
					case 16: // c
						clearAll();
						break;
					}
				}
			}
		}
	}

	private void clearAll() {
		setDisplayString("0");
		lastOperator = "0";
		lastNumber = 0;
		displayMode = INPUT_MODE;
		clearOnNextDigit = true;
	}

	private void backspace() {
		if (displayMode != ERROR_MODE) {
			setDisplayString(getDisplayString().substring(0, getDisplayString().length() - 1));

			if (getDisplayString().length() < 1)
				setDisplayString("0");
		}
	}

	private void processOperator(String string) {
		if (displayMode != ERROR_MODE) {
			double numberInDisplay = getNumberInDisplay();
			if (!lastOperator.equals("0")) {
				try {
					double result = processLastOperator();
					displayResult(result);
					lastNumber = result;
				} catch (Exception e) {
				}

			} else {
				lastNumber = numberInDisplay;
			}

			clearOnNextDigit = true;
			lastOperator = string;
		}
	}

	private double processLastOperator() throws Exception {
		double result = 0;
		double numberInDisplay = getNumberInDisplay();
		if (lastOperator.equals("/")) {
			if (numberInDisplay == 0)
				throw (new Exception());
			result = lastNumber / numberInDisplay;
		}

		if (lastOperator.equals("*")) {
			result = lastNumber * numberInDisplay;
		}
		if (lastOperator.equals("-")) {
			result = lastNumber - numberInDisplay;
		}
		if (lastOperator.equals("+")) {
			result = lastNumber + numberInDisplay;
		}

		return result;
	}

	private void processEquals() {
		double result = 0;
		if (displayMode != ERROR_MODE) {
			try {
				result = processLastOperator();
				displayResult(result);
			} catch (Exception e) {
				displayError("영으로 나눌 수 없습니다.");
			}
			lastOperator = "0";
		}
	}

	private void displayResult(double result) {
		setDisplayString(Double.toString(result));
		lastNumber = result;
		displayMode = RESULT_MODE;
		clearOnNextDigit = true;
	}

	private void displayError(String error) {
		setDisplayString(error);
		lastNumber = 0;
		displayMode = ERROR_MODE;
		clearOnNextDigit = true;
	}

	private double getNumberInDisplay() {
		String input = output.getText();
		return Double.parseDouble(input);
	}

	private void addToDisplay(int i) {
		if (clearOnNextDigit)
			setDisplayString("");

		String inputString = getDisplayString();

		if (inputString.indexOf("0") == 0) {
			inputString = inputString.substring(1);
		}
		if (!inputString.equals("0") || i > 0) {
			setDisplayString(inputString + i);
		}

		displayMode = INPUT_MODE;
		clearOnNextDigit = false;
	}

	private void setDisplayString(String string) {
		output.setText(string);
	}

	private String getDisplayString() {
		return output.getText();
	}

	public static void main(String args[]) {
		Calculator cal = new Calculator();
		cal.setTitle("Calculator");
		cal.setSize(300, 300);
		cal.pack();
		cal.setVisible(true);
		cal.setResizable(false);
	}

}