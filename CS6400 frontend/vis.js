//vis 0
  var svg = d3.select('#visualization')
    .append('svg')
    .attr('width', 600)
    .attr('height', 6000);
    //.style("background-color","rgb(142, 137, 137)");
  var margin=[100,100,100,100]

  //var data1 = ['a','b','c','d','e','f','g']
  //var data = [820, 932, 901, 934, 1290, 1330, 1320]
  var data1 = JSON.parse(localStorage.getItem("year"));
  var data=JSON.parse(localStorage.getItem("movie_count"));
  
  var ymax = d3.max(data,function(d){console.log(d);return d})+10 
  var y=d3.scaleLinear()
    .domain([0,ymax]).range([400,0])
  var axisY = d3.axisLeft(y);
  var axisYG = svg.append('g')
    .attr('class','axisY')
    .attr('transform','translate(100,100)')
    .call(axisY);
  
  axisYG.selectAll('g.tick')
    .selectAll('line')
    .attr('x1',-5)
    .attr('x2',400)
    .attr('stroke-dasharray','5, 5');
  
  
  var x = d3.scalePoint().domain(data1).range([0,400])
  var axisX = d3.axisBottom(x)
  var axisXG = svg.append('g')
    .attr('class','axisY')
    .attr('transform','translate(100,500)')
    .call(axisX);
  
  var line = d3.line()
    .x(function(d,i) { return x(data1[i]); })
    .y(function(d) {return y(d) });
  
  svg.append('g')
    .attr('transform','translate(100,100)')
    .append('path')
    .style('fill','none') 
    .style('stroke',"rgb(51, 209, 243)")
    .style('stroke-width',3)
    .datum(data)
    .attr('d',line)

xdata=JSON.parse(localStorage.getItem("director"));
ydata=JSON.parse(localStorage.getItem("movie_count_2"));
bar_chart(xdata,ydata)


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
var format=d3.format('.2f');   
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
          .attr("dy",0)
          .text(function(d){
            console.log(d)
            return format(d);
          })
}

