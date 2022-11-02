import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal_2019E094 {
    private JPanel mainPanel;
    private JTextField display;
    private JButton sum;
    private JButton one;
    private JButton three;
    private JButton two;
    private JButton sub;
    private JButton four;
    private JButton five;
    private JButton mul;
    private JButton seven;
    private JButton eight;
    private JButton six;
    private JButton nine;
    private JButton divide;
    private JButton dot;
    private JButton zero;
    private JButton cancel;
    private JButton powerButton;
    private JButton sqrtbutton;
    private JButton button3;
    private JButton button4;
    private JButton enter;

   public  char[] MyAction = new char[100];


    public Cal_2019E094() {


        MyAction[0] = 0;


        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (display.getText().isEmpty() ) {
                    display.setText("Enter the values");
                } else {

                    String[] values = display.getText().split(" ");

                    if (values.length == 3){
                        double num1 = Double.parseDouble(values[0]);
                        double num2 = Double.parseDouble(values[2]);
                        char operator = values[1].charAt(0);
                        double result = 0;

                        switch (operator) {
                            case '+':
                                result = num1 + num2;
                                break;
                            case '-':
                                result = num1 - num2;
                                break;
                            case '*':
                                result = num1 * num2;
                                break;
                            case '/':
                                result = num1 / num2;
                                break;

                            case '^':
                                result = Math.pow(num1,num2);
                                break;

                            case '√':
                                result = Math.sqrt(num1);
                                break;

                                case '!':
                                result = 1;
                                for (int i = 1; i <= num1; i++) {
                                    result = result * i;
                                }
                                break;

                                case 'π':
                                result = Math.PI;
                                break;


                            default:
                                display.setText("Enter the values");
                                break;
                        }

                        display.setText(String.valueOf(result));
                    } else {
                        display.setText("Enter the values");
                        System.out.println("length "+values.length);

                    }



                }
            }

        });


        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText =display.getText();
                display.setText(" ");

            }
        });

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText =display.getText();
                display.setText(displayText+"1");


            }
        });


        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+"2");

            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+"3");

            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+"4");

            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+"5");
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+"6");
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+"7");
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+"8");
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+"9");
            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+"0");
            }
        });

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+".");
            }
        });

//action buttons
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+" + ");

            }
        });

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+" - ");
            }
        });

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+" * ");
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+" / ");
            }
        });

        powerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+" ^ ");
            }
        });

        sqrtbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+" √ ");
            }
        });


        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+" π ");
            }
        });





        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String displayText=display.getText();
                display.setText(displayText+" ! ");
            }
        });

    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Cal_2019E094().mainPanel);
        frame.setVisible(true);
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

    }


}

