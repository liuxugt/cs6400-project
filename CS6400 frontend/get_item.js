var all_data_movie;
var gender={
	0:"unknown",
	1:"female",
	2:"male"
}


function copy (obj) {
   let newObj = {};
     for (let item in obj ){
       newObj[item] = obj
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
	return "<td>"+all_data_movie['release_data']+"</td></br>";
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
		string+="<td>"+item['name']+" ("+item['revenue']+")"+"</td></br>";
	}
	return string;
}

function movie_cast()
{
	var string="";
	for(let item in all_data_movie['casts'])
	{
		string+="<td>"+item['name']+" ("+gender[item['gender']]+", "+item['characters']+")"+"</td></br>";
	}
	return string;
}

function movie_director()
{
	var string="";
	for(let item in all_data_movie['directors'])
	{
		string+="<td>"+item['name']+" ("+gender[item['gender']]+", "+item['department']+")"+"</td></br>";
	}
	return string;
}

function movie_writer()
{
	var string="";
	for(let item in all_data_movie['writers'])
	{
		string+="<td>"+item['name']+" ("+gender[item['gender']]+", "+item['department']+")"+"</td></br>";
	}
	return string;
}

function movie_genre()
{
	var string="";
	for(let item in all_data_movie['genres'])
	{
		string+="<td>"+item['name']+" (average rating: "+item['average_rating']+", movie_number: "+item['movie_count']+")"+"</td></br>";
	}
	return string;
}

function movie_movie()
{
	var string="";
	for(let item in all_data_movie['movies'])
	{
		string+="<td>"+item['title']+" (data: "+item['release_data']+", order rating: "+item['order_rating']+", average rating: "+item['average_rating']+", reason: "+item['reason']+")"+"</td></br>";
	}
	return string;
}

//company-ralated
function comp_cast()
{
	var string="";
	for(let item in all_data_movie['casts'])
	{
		string+="<td>"+item['name']+" (order rating: "+item['order_rating']+", movie_number: "+item['movie_count']+", average rating: "+item['average_rating']+")"+"</td></br>";
	}
	return string;
}

function comp_crew()
{
	var string="";
	for(let item in all_data_movie['crews'])
	{
		string+="<td>"+item['name']+" ("+gender[item['gender']]+", "+item['job']+ ", order rating: "+item['order_rating']+", movie count:"+item['movie_count']+", average rating:"+item['average_rating']+")"+"</td></br>";
	}
	return string;
}

function comp_genre()
{
	var string="";
	for(let item in all_data_movie['genres'])
	{
		string+="<td>"+item['name']+" (average rating: "+item['average_rating']+", movie_number: "+item['movie_count']+")"+"</td></br>";
	}
	return string;
}

function comp_movie()
{
	var string="";
	for(let item in all_data_movie['movies'])
	{
		string+="<td>"+item['title']+" (data: "+item['release_data']+", popularity: "+item['popularity']+", average rating: "+item['average_rating']+")"+"</td></br>";
	}
	return string;
}

function comp_company()
{
	var string="";
	for(let item in all_data_movie['companies'])
	{
		string+="<td>"+item['name']+" (revenue: "+item['revenue']+", movie number"+item['movie_count']+", reason"+item['reason']+")"+"</td></br>";
	}
	return string;
}
