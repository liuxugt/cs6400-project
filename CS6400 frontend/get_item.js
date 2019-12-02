var all_data_movie;
var gender={
	0:"unknown",
	1:"female",
	2:"male"
}


function copy (obj) {
   let newObj = {};
     for (let item in obj ){
         newObj[item] = obj[item];
     }
     return newObj;
}
//movie basic
function movie_title(){
	return "<td>"+all_data_movie['title']+"</td></br>";
}

function movie_language(){
	return "<td>"+all_data_movie['language']+"</td></br>";
}

function movie_average_rating(){
	return "<td>"+all_data_movie['average_rating']+"</td></br>";
}

function movie_country(){
	return "<td>"+all_data_movie['country']+"</td></br>";
}

function movie_collection_name(){
	return "<td>"+all_data_movie['collection_name']+"</td></br>";
}

function movie_release_data(){
	return "<td>"+all_data_movie['release_date']+"</td></br>";
}

function movie_status(){
	return "<td>"+all_data_movie['status']+"</td></br>";
}

//company_basic
function comp_name(){
	return "<td>"+all_data_movie['name']+"</td></br>";
}

function comp_revenue(){
	return "<td>"+all_data_movie['revenue']+"</td></br>";
}

function comp_movie_count(){
	return "<td>"+all_data_movie['movie_count']+"</td></br>";
}

// movie_related
function movie_company()
{
	var string="";
	for(let item in all_data_movie['companies'])
	{
        console.log("item is " + item);
        string+="<td>"+all_data_movie['companies'][item]['name']+" (revenue: "+all_data_movie['companies'][item]['revenue']+")"+"</td></br>";
	}
	return string;
}

function movie_cast()
{
	var string="";
	for(let item in all_data_movie['casts'])
	{
        string+="<td>"+all_data_movie['casts'][item]['name']+" ("+gender[all_data_movie['casts'][item]['gender']]+", "+all_data_movie['casts'][item]['characters']+")"+"</td></br>";
	}
	return string;
}

function movie_director()
{
	var string="";
	for(let item in all_data_movie['directors'])
	{
		string+="<td>"+all_data_movie['directors'][item]['name']+" ("+gender[all_data_movie['directors'][item]['gender']]+", "+all_data_movie['directors'][item]['department']+")"+"</td></br>";
	}
	return string;
}

function movie_writer()
{
	var string="";
	for(let item in all_data_movie['writers'])
	{
		string+="<td>"+all_data_movie['writers'][item]['name']+" ("+gender[all_data_movie['writers'][item]['gender']]+", "+all_data_movie['writers'][item]['department']+")"+"</td></br>";
	}
	return string;
}

function movie_genre()
{
	var string="";
	for(let item in all_data_movie['genres'])
	{
		var movieid=all_data_movie['id'];
		//var contentid=0;
		var genreid=all_data_movie['genres'][item]['id'];
		string+='<a href="javascript:void(0);" onclick="draw_chart(movieid, ' + item + ')">';
		string+="<td>"+all_data_movie['genres'][item]['name']+" (average rating: "+all_data_movie['genres'][item]['average_rating']+", movie_number: "+all_data_movie['genres'][item]['movie_count']+")"+"</td></br>";
		string+='</a>';
	}
	return string;
}

function movie_movie()
{
	var string="";
	for(let item in all_data_movie['movies'])
	{
		string+="<td>"+all_data_movie['movies'][item]['title']+" (date: "+all_data_movie['movies'][item]['release_date']+", order rating: "+all_data_movie['movies'][item]['order_rating']+", average rating: "+all_data_movie['movies'][item]['average_rating']+", reason: "+item['reason']+")"+"</td></br>";
	}
	return string;
}

//company-ralated
function comp_cast()
{
	var string="";
	for(let item in all_data_movie['casts'])
	{
		string+="<td>"+all_data_movie['casts'][item]['name']+" (order rating: "+all_data_movie['casts'][item]['order_rating']+", movie_number: "+all_data_movie['casts'][item]['movie_count']+", average rating: "+all_data_movie['casts'][item]['average_rating']+")"+"</td></br>";
	}
	return string;
}

function comp_director(){
    var string = "";
    for(let item in all_data_movie['directors']){
        string += "<td>"+all_data_movie['directors'][item]['name']+" ("+gender[all_data_movie['directors'][item]['gender']]+", "+all_data_movie['directors'][item]['job']+ ", order rating: "+all_data_movie['directors'][item]['order_rating']+", movie count:"+all_data_movie['directors'][item]['movie_count']+", average rating:"+all_data_movie['directors'][item]['average_rating']+")"+"</td></br>";
    }
    return string;
}
function comp_writer(){
    var string = ""
    for(let item in all_data_movie['writers']){
        string += "<td>"+all_data_movie['writers'][item]['name']+" ("+gender[all_data_movie['writers'][item]['gender']]+", "+all_data_movie['writers'][item]['job']+ ", order rating: "+all_data_movie['writers'][item]['order_rating']+", movie count:"+all_data_movie['writers'][item]['movie_count']+", average rating:"+all_data_movie['writers'][item]['average_rating']+")"+"</td></br>";
    }
    return string;
}
//
//function comp_crew()
//{
//    var string="";
//    for(let item in all_data_movie['crews'])
//    {
//        string+="<td>"+all_data_movie['crews'][item]['name']+" ("+gender[all_data_movie['crews'][item]['gender']]+", "+all_data_movie['crews'][item]['job']+ ", order rating: "+all_data_movie['crews'][item]['order_rating']+", movie count:"+all_data_movie['crews'][item]['movie_count']+", average rating:"+all_data_movie['crews'][item]['average_rating']+")"+"</td></br>";
//    }
//    return string;
//}

function comp_genre()
{
	var string="";
	for(let item in all_data_movie['genres'])
	{
		string+="<td>"+all_data_movie['genres'][item]['name']+" (average rating: "+all_data_movie['genres'][item]['average_rating']+", movie_number: "+all_data_movie['genres'][item]['movie_count']+")"+"</td></br>";
	}
	return string;
}

function comp_movie()
{
	var string="";
	for(let item in all_data_movie['movies'])
	{
		string+="<td>"+all_data_movie['movies'][item]['title']+" (date: "+all_data_movie['movies'][item]['release_date']+", popularity: "+all_data_movie['movies'][item]['popularity']+", average rating: "+all_data_movie['movies'][item]['average_rating']+")"+"</td></br>";
	}
	return string;
}

function comp_company()
{
	var string="";
	for(let item in all_data_movie['companies'])
	{
        string+="<td>"+ all_data_movie['companies'][item]['name']+" (revenue: "+ all_data_movie['companies'][item]['revenue']+", movie number"+ all_data_movie['companies'][item]['movie_count']+", reason: "+ all_data_movie['companies'][item]['reason']+")"+"</td></br>";
	}
	return string;
}
