<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<center>Abstract Factory Pattern</center>
</head>
<body>
	<article>
		<header>
			<h3>设计问题:</h3>
		</header>
		<blockquote style="border: 2px;">
			在COS客户需求中，需要实现统计数据的图表展示，图表类型有饼状图、柱状图、线状图，图表样式初始支持扁平风格和水晶风格，随着COS的升级 <b><font
				color="blue">图表类型不变，但需要添加更多的图表样式。</font></b>
		</blockquote>
	</article>
	<article>
		<header>
			<h3>设计方案:</h3>
			<h5>(为了类图的清晰简洁，图中的CrystalChartFac与Crystal样式的具体产品create关系省略)</h5>
		</header>
		<center>
			<img alt="设计类图" src="resource/abstractfac.png"
				style="height: 100%; width: 90%">
		</center>
		<blockquote>
			说明：<br>
			<br> <font size="4">ChartDrawer:客户类，选择具体的图表工厂类型绘制图表<br>
			<br> ChartFac:抽象工厂类，定义图表产品族的生产行为<br>
			<br> CrystalChartFac,FlatChartFac:具体工厂类，继承ChartFac，生产具体样式的的产品<br>
			<br> Pie,Line,Bar:抽象产品类，共同构成产品族<br>
			<br>
				CrystalBar,CrystalLine,CrystalPie,FlatBar,FlatLine,FlatPie:具体样式的产品类<br>
			</font>
		</blockquote>
	</article>
</body>
</html>