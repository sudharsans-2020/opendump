import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class TrialAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        System.out.println("Hello world");
        BrowserUtil.browse("https://stackoverflow.com/questions/ask");
    }

    public static void main(String[] args){
        System.out.println("Hello world");
    }
}
