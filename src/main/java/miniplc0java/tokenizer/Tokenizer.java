package miniplc0java.tokenizer;
import miniplc0java.error.*;
import  miniplc0java.util.Pos;
import java.util.regex.*;

public class Tokenizer {
    private StringIter it;
    public Tokenizer(StringIter it){ this.it = it;}

    /**
     * 获取下一个 Token
     *
     * @return
     * //@throws TokenizeError 如果解析有异常则抛出
     */
    public Token nextToken() throws TokenizeError 
        // 跳过之前的所有空白字符
        if(it.isEOF()){
            return new Token(TokenType.EOF,"",it.currentPos(),it.currentPos());
        }
        char peek = it.peekChar();
    }
}
