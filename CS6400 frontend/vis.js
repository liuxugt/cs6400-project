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




