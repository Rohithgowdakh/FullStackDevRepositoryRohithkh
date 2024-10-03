function increment()
{
    console.log("My  first on-click function");
}

let lap1=33
let lap2=22
let lap3=12
function loglaptime()
{
    alert(lap1+lap2+lap3);
}
let countEl=document.getElementById("count-el");
let saveEl=document.getElementById("save-el");

console.log(countEl)
let start=0;
function increment1()
{
    start=start+1;
    countEl.textContent=start;
    // console.log(start);
}
function save()
{
    let saveStr=start+" - "
    saveEl.textContent+=saveStr;
    console.log(start);
    countEl.textContent=0;
    start=0;
}

//string
let username="rohith";

let msg=" is  a good boy";
let total=username+msg;
console.log(username+msg+" with bad lucks");

console.log(total);