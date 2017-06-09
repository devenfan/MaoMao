package ustc.maomao.patterns.support;

import ustc.maomao.patterns.decorator.SimpleFood;
import ustc.maomao.patterns.decorator.SpicyFood;
import ustc.maomao.patterns.decorator.SweetFood;
import ustc.maomao.patterns.templatemethod.PayOrder;
import ustc.maomao.patterns.visitor.FoodLevelVisitor;
import ustc.maomao.patterns.visitor.FoodTypeVisitor;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         订餐客户
 * 
 */
public class Patron {

	private PatronLevel level;// 客户等级

	private MealOrder order;// 菜品订单

	private boolean loginState;// 当前客户登录状态

	private String name;// 客户名称

	/**
	 * 订餐
	 *
	 * @return 订单
	 */
	public MealOrder orderFood() {

		order = new MealOrder(this);

		SimpleFood f1 = new SimpleFood();
		f1.setName("花生米");
		f1.order(5);
		order.addFood(f1);

		SimpleFood f2 = new SimpleFood();
		f2.setName("麻辣豆腐");
		SpicyFood spicyF2 = new SpicyFood(f2);
		spicyF2.order(2);
		spicyF2.setSpicyLevel(SpicyLevel.Dead);
		order.addFood(spicyF2);

		SimpleFood f3 = new SimpleFood();
		f3.setName("拔丝香蕉");
		SweetFood sweetF3 = new SweetFood(f3);
		sweetF3.order(5, SweetLevel.Cloying);
		order.addFood(sweetF3);

		SimpleFood f4 = new SimpleFood();
		f4.setName("皮蛋豆腐");
		f4.order(7);
		order.addFood(f4);

		return order;
	}

	/**
	 * 支付订单
	 * 
	 * @param po
	 *            支付方式
	 */
	public void pay(PayOrder po) {
		if (po.check(order)) {
			System.out.println("支付成功！");
			order.setPaid(true);
		} else {
			System.out.println("支付不成功！");
			order.setPaid(false);
		}
	}

	/**
	 * 查看订单菜品统计信息
	 */
	public void viewOrderStatis() {
		FoodTypeVisitor visitor = new FoodTypeVisitor();
		order.accept(visitor);
		visitor.displayResult();
	}

	/**
	 * 检查订单并提醒客户关于菜品的信息
	 */
	public void warningOrder() {
		FoodLevelVisitor visitor = new FoodLevelVisitor();
		order.accept(visitor);
	}

	/**
	 * @return the level
	 */
	public PatronLevel getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(PatronLevel level) {
		this.level = level;
	}

	/**
	 * @return the loginState
	 */
	public boolean isLoginState() {
		return loginState;
	}

	/**
	 * @param loginState
	 *            the loginState to set
	 */
	public void setLoginState(boolean loginState) {
		this.loginState = loginState;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
