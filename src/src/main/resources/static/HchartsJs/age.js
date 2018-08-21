var chart = Highcharts.chart('age', {
	chart: {
		type: 'pie',
		options3d: {
			enabled: false,
			alpha: 45
		}
	},
	title: {
		// text: '游客年龄段统计'
	},
	subtitle: {
		// text: 'Highcharts 中的3D环形图'
	},
	plotOptions: {
		pie: {
			innerSize: 100,
			depth: 45
		}
	},
	series: [{
		name: '人数占比：',
		data: [
			{name:'12岁一下',
			 y:2,
			 drilldown: 'a'},
			{name:'12-18岁',
			 y:5,
			 drilldown: 'b'},
			{name:'18-30岁',
			 y:8,
			 drilldown: 'c'},
			{name:'30-60岁',
			 y:7,
			 drilldown: 'd'},
			{name:'60岁以上',
			 y:10,
			 drilldown: 'f'}
		]
	}],
	drilldown: {
		series: [{
			type: 'pie',
			id: 'a',
			data: [
				['男性', 4],
				['女性', 5]
			]
		}, {
			type: 'pie',
			id: 'b',
			data:  [
				['男性', 4],
				['女性', 5]
			]
		}, {
			type: 'pie',
			id: 'c',
			data:  [
				['男性', 4],
				['女性', 5]
			]
		}, {
			type: 'pie',
			id: 'd',
			data:  [
				['男性', 4],
				['女性', 5]
			]
		},{
			pie:'pie',
			id: 'f',
			data:  [
				['男性', 4],
				['女性', 5]
			]
		}]
	}
});