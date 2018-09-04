import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       // JOptionPane.showInputDialog("ใส่ตัวเเลข 1 ตัว", "0");
       // JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,
                "iักหรือเปล่า","ถามเธอ",
                JOptionPane.YES_NO_OPTION);

        if(ans==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"รักนะจุ๊บ ๆ");
        }
        else{
            JOptionPane.showMessageDialog(null,"จำไว้้เลย");
        }
    }
}