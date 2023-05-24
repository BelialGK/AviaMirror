import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fly extends JFrame implements ActionListener {
    private JTable table;
    private DefaultTableModel model;
    private JTextField dateField;
    private JTextField destinationField;
    private JTextField ticketsField;

    public Fly() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] columns = {"Дата", "Направление", "Количество билетов"};
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);
        table.setRowHeight(30);


        JPanel addPanel = new JPanel();
        addPanel.add(new JLabel("Дата:"));
        dateField = new JTextField(10);
        addPanel.add(dateField);
        addPanel.add(new JLabel("Направление:"));
        destinationField = new JTextField(20);
        addPanel.add(destinationField);
        addPanel.add(new JLabel("Количество билетов:"));
        ticketsField = new JTextField(10);
        addPanel.add(ticketsField);
        JButton addButton1 = new JButton("Добавить рейс");
        addButton1.addActionListener(this);
        addPanel.add(addButton1);
        panel.add(addPanel, BorderLayout.SOUTH);
        //  JButton BoardButton = new JButton("Добавить рейсы из Board");
        // BoardButton.addActionListener(this);
        // addPanel.add(BoardButton);
        // add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1366, 768);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Добавить рейс")) {
            String date = dateField.getText();
            String destination = destinationField.getText();
            int tickets = Integer.parseInt(ticketsField.getText());
            Object[] row = {date, destination, tickets};
            model.addRow(row);
            dateField.setText("");
            destinationField.setText("");
            ticketsField.setText("");
        }
        //  else if(e.getActionCommand().equals("Добавить рейсы из Board")) {
        //    Board randomBoard = new Board();
        // }
    }

    public static void main(String[] args) {
        Fly boardFly = new Fly();

        ArrayList<Flight> flights = generateFlights();
        for (Flight flight : flights) {
            Object[] row = {flight.getDate(), flight.getDestination(), flight.getTickets()};
            boardFly.model.addRow(row);
        }
    }

    private static ArrayList<Flight> generateFlights() {
        ArrayList<Flight> flights = new ArrayList<>();
        return flights;
    }
}

class Flight {
    private String date;
    private String destination;
    private int tickets;

    public Flight(String date, String destination, int tickets) {
        this.date = date;
        this.destination = destination;
        this.tickets = tickets;
    }

    public String getDate() {
        return date;
    }

    public String getDestination() {
        return destination;
    }

    public int getTickets() {
        return tickets;
    }
}
