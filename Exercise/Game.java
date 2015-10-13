
import javax.swing.JOptionPane;
 
public class Game
{
    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null,"欢迎来到石头——剪刀——布游戏!","石头——剪刀——布游戏",
                        JOptionPane.INFORMATION_MESSAGE);
        int man,computer;
        int player,comp;
        man = computer = 0;
        while(man != 2 && computer != 2)
        {
            String string = JOptionPane.showInputDialog(null,"请输入你的指令:石头(1),剪刀(2),布(3):"
                    ,"输入窗口",JOptionPane.QUESTION_MESSAGE);
            player = Integer.parseInt(string);
            comp = (int)(System.currentTimeMillis() % 3) + 1;
            if((player == 1 && comp == 2) || (player == 2 && comp == 3) || (player == 3 && comp == 1))
            {
                man++;
                computer = 0;
                JOptionPane.showMessageDialog(null,"你赢了!","石头——剪刀——布游戏",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else if((player == 1 && comp == 3) || (player == 2 && comp == 1) || (player == 3 && comp == 2))
            {  
                computer++;
                man = 0;
                JOptionPane.showMessageDialog(null,"你输了!","石头——剪刀——布游戏",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                man = computer = 0;
                JOptionPane.showMessageDialog(null,"这局打平!","石头——剪刀——布游戏",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(man == 2)
        {
            JOptionPane.showMessageDialog(null,"恭喜你取得人机战的胜利!","石头——剪刀——布游戏",
                        JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"很遗憾你落败了.","石头——剪刀——布游戏",
                        JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
  