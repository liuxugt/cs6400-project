// vis 1
function bar_chart(xdata,ydata){

	var width=960
	var height=600
	var marge = {top:60,bottom:60,left:60,right:60}
	var rectPadding = 20;
	 var svg = d3.select('#director-chart')
	    .append('svg')
	    .attr('width', width)
	    .attr('height', height);
	var g = svg.append("g")
    		.attr("transform","translate("+marge.top+","+marge.left+")");


//var dataset = [10,20,30,23,13,40,27,35,20];
    	var xScale = d3.scaleBand()
    		.domain(d3.range(xdata.length))
    		.rangeRound([0,width-marge.left-marge.right]);
    	var xScale2 = d3.scaleBand()
    		.domain(xdata)
    		.rangeRound([0,width-marge.left-marge.right]);
    	var xAxis = d3.axisBottom(xScale2);
    		
    	var yScale = d3.scaleLinear()
    		.domain([0,d3.max(ydata)])
    		.range([height-marge.top-marge.bottom,0]);
    	var yAxis = d3.axisLeft(yScale);
    	
    	g.append("g")
    		.attr("transform","translate("+0+","+(height-marge.top-marge.bottom)+")")
    		.call(xAxis);
    	g.append("g")
    		.attr("transform","translate(0,0)")
    		.call(yAxis);
    		
    	
    	var gs = g.selectAll(".rect")
    		.data(ydata)
    		.enter()
    		.append("g");
    	
    	
    	
    	gs.append("rect")
    		.attr("x",function(d,i){
    			return xScale(i)+rectPadding/2;
    		})	
    		.attr("y",function(d){
    			return yScale(d);
    		})
    		.attr("width",function(){
    			return xScale.step()-rectPadding;
    		})
    		.attr("height",function(d){
    			return height-marge.top-marge.bottom-yScale(d);
    		})
    		.attr("fill","steelblue");
    	
    	gs.append("text")
    		.attr("x",function(d,i){
    			console.log(xScale(i)+rectPadding/2);
    			return xScale(i)+rectPadding/2;
    		})
    		.attr("y",function(d){
            return yScale(d);
        	})
        	.attr("dx",function(){
        		(xScale.step()-rectPadding)/2;
        	})
        	.attr("dy",20)
        	.text(function(d){
        		console.log(d)
        		return d;
        	})



}