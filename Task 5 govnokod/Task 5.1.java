import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Game {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Milan vs Madrid"); // Создание окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие по умолчанию
        frame.setSize(400, 75); // Размер окна
        JPanel buttons = new JPanel(); // Создание панели
        buttons.setPreferredSize(new Dimension(400, 75));

        JButton Milan = new JButton("AC Milan"); // создание кнопки Милан


        //+ Integer.toString(MilanScore) + "x" + Integer.toString(MadridScore)
        JButton Madrid = new JButton("Real Madrid"); // создание кнопки Мадрид

        buttons.add(Milan, BorderLayout.SOUTH);
        buttons.add(Madrid, BorderLayout.SOUTH);

        frame.getContentPane().add(buttons, BorderLayout.SOUTH);
        JPanel grid = new JPanel(new GridLayout(1,2,50,100));
        JLabel Result = new JLabel("Result: 0 X 0 ", JLabel.LEFT);
        JLabel LastScorer = new JLabel("Last Scorer: ", JLabel.RIGHT);
        JLabel Winner = new JLabel("Winner: ", JLabel.LEFT);

        grid.add(Result);
        grid.add(LastScorer);
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEFT));
        flow.add(grid);

        frame.add(flow, BorderLayout.NORTH);
        frame.add(Winner, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true); // Видимость окна на экране
        final int[] test = {0, 0};
        Milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test[0] +=1;
                Winner.setText(test[0]>test[1]?"Winner: AC Milan" : test[0]<test[1]?"Winner: Real Madrid":"Winner: Draw");
                Result.setText("Result: " + String.valueOf(test[0]) + " X " + String.valueOf(test[1]));
                LastScorer.setText("Last Scorer: AC Milan");
            }
        });
        Madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test[1] +=1;
                Winner.setText(test[0]>test[1]?"Winner: AC Milan" : test[0]<test[1]?"Winner: Real Madrid":"Winner: Draw");
                Result.setText("Result: " + String.valueOf(test[0]) + " X " + String.valueOf(test[1]));
                LastScorer.setText("Last Scorer: Real Madrid");
            }
        });

    }
}
