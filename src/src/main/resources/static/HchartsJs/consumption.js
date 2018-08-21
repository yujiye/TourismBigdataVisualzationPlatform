var chart = Highcharts.chart('consumption',{
	chart: {
		type: 'column',
		margin: 75,
		options3d: {
			enabled: true,
			alpha: 10,
			beta: 25,
			depth: 70,
			viewDistance: 100,      // 视图距离，它对于计算角度影响在柱图和散列图非常重要。此值不能用于3D的饼图
			frame: {                // Frame框架，3D图包含柱的面板，我们以X ,Y，Z的坐标系来理解，X轴与 Z轴所形成
				// 的面为bottom，Y轴与Z轴所形成的面为side，X轴与Y轴所形成的面为back，bottom、
				// side、back的属性一样，其中size为感官理解的厚度，color为面板颜色
				bottom: {
					size: 10
				},
				side: {
					size: 1,
					color: 'transparent'
				},
				back: {
					size: 1,
					color: 'transparent'
				}
			}
		},
	},
	title: {
		text: '游客消费统计'
	},
	subtitle: {
		text: ''
	},
	plotOptions: {
		column: {
			depth: 25
		}
	},
	xAxis: {
		categories: ['1k', '2k', '3k', '4k', '5k', '6k', '7k', '8k', '九月', '9k', '10k', '10以上']
	},
	yAxis: {
		title: {
			text: '人数（千）'
		}
	},
	series: [{
		name: '人数(千)',
		data: [2, 3, null, 4, 0, 5, 1, 4, 6, 3,10,2],
	}]
});