<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	 <meta charset="utf-8">
	<title>statmap</title>
	   <link rel="stylesheet" href="https://a.amap.com/jsapi_demos/static/demo-center/css/demo-center.css" />
	 <style>
        html,
        body,
        #container {
          width: 100%;
          height: 100%;
        }
    </style>
</head>
<body>
	<div id="container"></div> 
	<script type="text/javascript" src="https://webapi.amap.com/maps?v=1.4.10&key=98567ffa2175bc728d0869eee5a2120c"></script> 
	<script type="text/javascript">
		var map = new AMap.Map('container', {
        zoom:11,//级别
        center: [116.397428, 39.90923],//中心点坐标
        viewMode:'3D'//使用3D视图
    });
	var heatmap;
    var points = ${data_json}

    map.plugin(["AMap.Heatmap"],function() {      //加载热力图插件
        heatmap = new AMap.Heatmap(map ,{
        	radius: 50,
        	opacity: [0,0.6]
        });    //在地图对象叠加热力图
        heatmap.setDataSet({data:points,max:100}); //设置热力图数据集
        //具体参数见接口文档
    });     
	</script>


</body>
</html>>