import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tickets extends JFrame implements ActionListener {
    private JLabel nameLabel, surnameLabel, phoneLabel, transportLabel, destinationLabel, dateLabel, timeLabel, quantityLabel, seatLabel;
    private JTextField nameField, surnameField, phoneField, transportField, destinationField, dateField, timeField, quantityField, seatField;
    private JButton buyButton, flyButton;

    public Tickets() {
        setTitle("Покупка билетов");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2));

        nameLabel = new JLabel("Имя:");
        panel.add(nameLabel);
        nameField = new JTextField(20);
        panel.add(nameField);

        surnameLabel = new JLabel("Фамилия:");
        panel.add(surnameLabel);
        surnameField = new JTextField(20);
        panel.add(surnameField);

        phoneLabel = new JLabel("Номер телефона:");
        panel.add(phoneLabel);
        phoneField = new JTextField(20);
        panel.add(phoneField);

        transportLabel = new JLabel("Вид транспорта:");
        panel.add(transportLabel);
        transportField = new JTextField(20);
        panel.add(transportField);

        destinationLabel = new JLabel("Пункт назначения:");
        panel.add(destinationLabel);
        destinationField = new JTextField(20);
        panel.add(destinationField);

        dateLabel = new JLabel("Дата отправления:");
        panel.add(dateLabel);
        dateField = new JTextField(20);
        panel.add(dateField);

        timeLabel = new JLabel("Время отправления:");
        panel.add(timeLabel);
        timeField = new JTextField(20);
        panel.add(timeField);

        quantityLabel = new JLabel("Количество билетов:");
        panel.add(quantityLabel);
        quantityField = new JTextField(20);
        panel.add(quantityField);

        seatLabel = new JLabel("Места:");
        panel.add(seatLabel);
        seatField = new JTextField(20);
        panel.add(seatField);

        buyButton = new JButton("Купить");
        buyButton.addActionListener(this);
        panel.add(buyButton);

        flyButton = new JButton("Расписание");
        flyButton.addActionListener(this);
        panel.add(flyButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buyButton) {

            String name = nameField.getText();
            String surname = surnameField.getText();
            String phone = phoneField.getText();
            String transport = transportField.getText();
            String destination = destinationField.getText();
            String date = dateField.getText();
            String time = timeField.getText();
            int quantity = Integer.parseInt(quantityField.getText());
            String seat = seatField.getText();
        }
        else if(e.getSource() == flyButton){
            Board randomBoard = new Board();
        }

    }


    public static void main(String[] args) {
        new Tickets();
    }
}
