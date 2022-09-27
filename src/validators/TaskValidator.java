package validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    public static List<String> validate(Task task) {
        List<String> errors = new ArrayList<String>();

        String title_error = validateTitle(task.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = validateContent(task.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    // タイトルの必須入力チェック
    private static String validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
    }

    // メッセージの必須入力チェック
    private static String validateContent(String content) {
        if(content == null || content.equals("")) {
            return "メッセージを入力してください。";
        }

        return "";
    }
}
