/**
 * 
 */
package stix.matcher.listener;

import org.antlr.v4.runtime.ParserRuleContext;

import stix.matcher.STIXPatternBaseListener;

/**
 * @author Kathy Lee Simunich, Argonne National Laboratory
 *
 * Feb 21, 2019 3:22:29 PM
 */
public class STIXQueryListener extends STIXPatternBaseListener {
	
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		System.out.println(ctx.getText());
	}

}
