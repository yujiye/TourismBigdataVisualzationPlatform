// 随机数据
var data = [{"name":"北京","value":93},{"name":"天津","value":71},{"name":"河北","value":25},{"name":"山西","value":47},{"name":"内蒙古","value":2},{"name":"辽宁","value":72},{"name":"吉林","value":79},{"name":"黑龙江","value":66},{"name":"上海","value":63},{"name":"江苏","value":4},{"name":"浙江","value":15},{"name":"安徽","value":82},{"name":"福建","value":3},{"name":"江西","value":46},{"name":"山东","value":77},{"name":"河南","value":96},{"name":"湖北","value":19},{"name":"湖南","value":96},{"name":"广东","value":88},{"name":"广西","value":78},{"name":"海南","value":65},{"name":"重庆","value":47},{"name":"四川","value":54},{"name":"贵州","value":87},{"name":"云南","value":76},{"name":"西藏","value":59},{"name":"陕西","value":42},{"name":"甘肃","value":32},{"name":"青海","value":61},{"name":"宁夏","value":80},{"name":"新疆","value":84},{"name":"台湾","value":98},{"name":"香港","value":25},{"name":"澳门","value":85},{"name":"南海诸岛","value":78},{"name":"南海诸岛","value":63}];
// 初始化图表
var map = new Highcharts.Map('travelMap', {
    title: {
    text: null
    },
    colorAxis: {
    stops: [
        [0, '#3060cf'],
        [0.5, '#fffbbc'],
        [0.9, '#c4463a'],
        [1, '#c4463a']
    ],
    min: 0,
    max: 100,
    // minColor: 'rgb(255,255,255)',
    // maxColor: '#d94e5d'
    },
    series: [{
    data: data,
    name: '随机数据',
    mapData: Highcharts.maps['cn/china'],
    joinBy: 'name' // 根据 name 属性进行关联
    }],
    credits: {
    enabled:false
    }
});