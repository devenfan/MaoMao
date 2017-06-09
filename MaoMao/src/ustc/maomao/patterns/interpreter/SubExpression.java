package ustc.maomao.patterns.interpreter;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         减法表达式
 *      
 */
public class SubExpression extends NonterminalExpression {

	/**
	 * @param lexp
	 * @param rexp
	 */
	public SubExpression(ValueExpression lexp, ValueExpression rexp) {
		super(lexp, rexp);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.interpreter.ValueExpression#interpret(ustc.maomao.patterns.interpreter.ValueContext)
	 */
	@Override
	public int interpret(ValueContext con) {
		// TODO Auto-generated method stub
		return left.interpret(con)-right.interpret(con);
	}

}
