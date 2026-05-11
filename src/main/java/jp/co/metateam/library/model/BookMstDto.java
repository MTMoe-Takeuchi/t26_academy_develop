package jp.co.metateam.library.model;

import java.security.Timestamp;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * 書籍マスタDTO
 */
@Getter
@Setter
public class BookMstDto {
    
    private Long id; 
    
    // ここから追加します　ISBNのバリデーション（必須、13桁）
    @NotEmpty(message = "ISBNは必須です")
    @Size(max = 13, message = "ISBNは13字以下で入力してください")
    private String isbn;

    // 追加　書籍名のバリデーション（必須、255字以下）
    @NotEmpty(message = "書籍名は必須です" )
    @Size(max = 255, message = "書籍名は255字以下で入力してください")
    private String title;
    
    private Timestamp deletedAt;

    private BookMst bookMst;

    //ここまで追加しました
}
