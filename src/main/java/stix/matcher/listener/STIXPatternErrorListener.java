/**
 * 
 */
package stix.matcher.listener;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * @author Kathy Lee Simunich, Argonne National Laboratory
 *
 * Feb 19, 2019 9:59:02 AM
 */
public class STIXPatternErrorListener extends BaseErrorListener {
	
	public static final STIXPatternErrorListener INSTANCE = new STIXPatternErrorListener();
	
	private List<String> errors = new ArrayList<>();

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) //throws ParseCancellationException
		{
		// instead of default behaviour of printing to syserr, wrap the error
		// in an exception.
		String err = "line " + line + ":" + charPositionInLine + " " + msg;
		errors.add(err);
		//throw new ParseCancellationException(err);
	}

}
