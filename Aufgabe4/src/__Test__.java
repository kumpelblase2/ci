import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

/**
 * Created by tim on 20.05.15.
 */
public class __Test__ {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream("example.txt", "UTF-8");
        symbolLexer lexer = new symbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        symbolParser parser = new symbolParser(tokens);
        symbolParser.all_return ret = parser.all();

        CommonTree tree = (CommonTree)ret.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);

        symbolTransformWalker transformWalker = new symbolTransformWalker(nodes);
        symbolTransformWalker.all_return ret2 = transformWalker.all();
        System.out.println(((Tree) ret2.getTree()).toStringTree());
    }
}
