import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        JOptionPane.showMessageDialog(null,input,"ค่าที่ใส่",JOptionPane.INFORMATION_MESSAGE);
       int  ans = JOptionPane.showConfirmDialog(null,"รักหรือเปล่า","คำถาม",JOptionPane.YES_NO_OPTION);
       if(ans==JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null,"รักเเหมือนกัน");
       }else{
           JOptionPane.showMessageDialog(null,"ไม่เป็นไร");
       }
    }
}
