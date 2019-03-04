/**
 * 
 */
package stix.matcher.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import stix.matcher.STIXPatternLexer;
import stix.matcher.STIXPatternParser;
import stix.matcher.STIXPatternParser.PatternContext;
import stix.matcher.listener.STIXPatternErrorListener;
import stix.matcher.listener.STIXQueryListener;

/**
 * @author Kathy Lee Simunich, Argonne National Laboratory
 *
 * Feb 19, 2019 10:00:51 AM
 */
public class TestPatterns {
	@Rule public TestName name = new TestName();
	
	@Test
	public void simpleFileHash() {
		System.out.println(name.getMethodName());
		// test the parsing for any errors

		String pattern = "[file:hashes.\'SHA-256\' = \'aec070645fe53ee3b3763059376134f058cc337247c978add178b6ccdfb0019f\']";

		STIXPatternLexer lexer = new STIXPatternLexer(CharStreams.fromString(pattern));
		lexer.removeErrorListeners();
		lexer.addErrorListener(STIXPatternErrorListener.INSTANCE);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		STIXPatternParser parser = new STIXPatternParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(STIXPatternErrorListener.INSTANCE);
		
		PatternContext tree = parser.pattern(); // pattern is the first rule name in the grammar
		STIXQueryListener listener = new STIXQueryListener();
		ParseTreeWalker walker = new ParseTreeWalker();
		
		walker.walk(listener, tree);
		
		assertThat(STIXPatternErrorListener.INSTANCE.getErrors().size(), is(0));
	}
	
	@Test
	public void badSimpleFileHash() {
		System.out.println(name.getMethodName());
		// test the parsing for any errors

		String pattern = "file:hashes.\'SHA-256\' = \'aec070645fe53ee3b3763059376134f058cc337247c978add178b6ccdfb0019f\'";

		STIXPatternLexer lexer = new STIXPatternLexer(CharStreams.fromString(pattern));
		lexer.removeErrorListeners();
		lexer.addErrorListener(STIXPatternErrorListener.INSTANCE);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		STIXPatternParser parser = new STIXPatternParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(STIXPatternErrorListener.INSTANCE);
		
		PatternContext tree = parser.pattern(); // pattern is the first rule name in the grammar
		STIXQueryListener listener = new STIXQueryListener();
		ParseTreeWalker walker = new ParseTreeWalker();
		
		walker.walk(listener, tree);
		
		assertThat(STIXPatternErrorListener.INSTANCE.getErrors().size(), is(1));
		System.out.println(STIXPatternErrorListener.INSTANCE.getErrors().get(0));
	}

}
