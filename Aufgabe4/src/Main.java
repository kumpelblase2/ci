import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

public class Main {
	private static final String TEMPLATE_FILE = "template.stg";

	public static void main(String[] args) throws RecognitionException,
			FileNotFoundException, IOException {
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
				"example.txt"));
		symbolLexer lexer = new symbolLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		symbolParser parser = new symbolParser(tokens);
		symbolParser.all_return result = parser.all();
		Tree t = (Tree) result.getTree();
		System.out.println("nach dem parsen");
		System.out.println(t.toStringTree());

		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);
		symbolTransformWalker normalizer = new symbolTransformWalker(nodes);
		symbolTransformWalker.all_return ast2 = normalizer.all();
		CommonTree r2 = ((CommonTree) ast2.tree);
		System.out.println("\n\nnach dem normalisieren");
		System.out.println(r2.toStringTree());


		CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(r2);
		nodes2.setTokenStream(tokens);
		symbolEmitter emitter = new symbolEmitter(nodes2);
		InputStream templateIs = new FileInputStream("template.stg");

		StringTemplateGroup templates = new StringTemplateGroup(
				new InputStreamReader(templateIs, "ISO-8859-15"),
				AngleBracketTemplateLexer.class);
		emitter.setTemplateLib(templates);
		symbolEmitter.puzzle_return puzzle_return = emitter.puzzle();
		String output = puzzle_return.getTemplate().toString();
		System.out.println("\n\nausgabe");
		System.out.println(output);
		FileOutputStream outputStream = new FileOutputStream(new File("output.java"));
		outputStream.write(output.getBytes());
		outputStream.close();


	}

}
