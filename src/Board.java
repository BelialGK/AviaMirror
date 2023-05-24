import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JFrame {
    private JTable table;
    private DefaultTableModel model;

    public Board() {
        setTitle("Перелеты");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        String[] columns = {"Дата", "Пункт назначения", "Кол-во билетов"};
        model = new DefaultTableModel(columns, 0);


        ArrayList<Flight> flights = getFlights();
        for (Flight flight : flights) {
            Object[] rowData = {flight.getDate(), flight.getDestination(), flight.getTickets()};
            model.addRow(rowData);
        }


        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);


        Container contentPane = getContentPane();
        contentPane.add(scrollPane);


        setVisible(true);
    }

    private ArrayList<Flight> getFlights() {

        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("2023-06-01", "Париж", 5));
        flights.add(new Flight("2023-06-02", "Нью-Йорк", 3));
        flights.add(new Flight("2023-06-03", "Токио", 2));
        flights.add(new Flight("2023-06-04", "Лондон", 7));
        flights.add(new Flight("2023-06-05", "Сидней", 4));
        flights.add(new Flight("2023-06-06", "Дубай", 6));
        flights.add(new Flight("2023-06-07", "Рим", 1));
        flights.add(new Flight("2023-06-08", "Берлин", 8));
        flights.add(new Flight("2023-06-09", "Прага", 2));
        flights.add(new Flight("2023-06-10", "Москва", 5));
        return flights;
    }

    public static void main(String[] args) {
        new Board();
    }
}