function draw_table(idname,list){


	var matrix = {
		"ttable":"topic followed",
		"qtable":"questions followed",
		"mqtable":"my questions",
		"atable":"my answers",
		"totable":"All topics",
		"qotable":"The Question searched by topics",
		"kotable":"The Question searched by key words"
	}
	//list = deal(list)
	list = list.split("*");
	var data="";
	data+="<table rules=all frame=all name='table'>";
	data+="<caption align='top'>"+matrix[idname]+"</caption>";
	console.log(list)
	if(idname == "ttable"||idname=="totable")
	{
		data += " <tr >" + 
			"<td >id</td>" + 
			"<td >topic</td>" + 
			"<td >decription</td>"+
			"</tr>" ; 
	}
	else if(idname == "qtable"||idname=="mqtable"||idname=="qotable"||idname=="kotable")
	{
		data += " <tr >" + 
			"<td >id</td>" + 
			"<td >topic id</td>" + 
			"<td >topic</td>" + 
			"<td >question</td>" + 
			"<td >text</td>" + 
			"<td >time</td>" + 
			"</tr>" ; 
		//[问题 ID], [问题所属话题的 ID], [问题所属话题的标题], [问题标题], [问题正文], [问题创建日期和时间（datetime.datetime 对象）
	}
	else if(idname=="atable"){
		data += " <tr >" + 
			"<td >problem id</td>" + 
			"<td >answer id</td>" + 
			"<td >who answered</td>" + 
			"<td >answer</td>" + 
			"<td >time</td>" + 
			"<td >accepted</td>" + 
			"</tr>" ; 
	}

//[该回答所属的问题的 ID], [回答 ID], [回答提交者的 ID], [回答正文], [回答提交日期和时间（datetime.datetime 对象）], [该回答是否被提问者采纳（布尔值）]

	len = list.length;

	// slen = list[0].length;
	console.log(len)
	//console.log(slen)
	for(i=0;i<len;++i)
	{
			
		al = list[i].split(",");
		slen = al.length;
		data += "<tr >"; 
		// if(idname == "qtable"||idname=="mqtable"){
		// 	slen=slen-1;
		// }
		for(j=0;j<slen;++j)
		{
			word = al[j];
			wlen=word.length;
			if (j==0)
			{
				if (word[0]=="("||word[0]=="["){
					word = word.slice(1,wlen);
				}
				if (word[0]=="("||word[0]=="["){
					word = word.slice(1,wlen-1);
				}
			}
			if (j==slen-1)
			{
				if (word[wlen-1]==")"||word[wlen-1]=="]"){
					word = word.slice(0,wlen-1);
				}
				if (word[wlen-2]==")"||word[wlen-2]=="]"){
					word = word.slice(0,wlen-2);
				}
			}
			console.log(word)
			data += "<td>" + word + "</td>"; 
			
		}
		data += "</tr>"; 
	}
	data+="</table>"
	console.log(idname)
	document.getElementById(idname).innerHTML = data; 
}

function checkword(word){
	if(word==null||word.length==0)
	{
		alert("请输入之后提交")
		return false
	}
	else
		return true
}