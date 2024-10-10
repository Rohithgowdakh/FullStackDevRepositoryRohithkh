let marks=[10,20,40,20,100,30]

//for-in
let sum=0;
for(let n in marks)
{
   sum+=marks[n];
}

//for-of
let summ=0;
for(let mark of marks)
{
   summ+=mark;
}
console.log("using for-of loop :"+summ);
console.log("using for-in loop :"+sum);
let avg=sum/marks.length;
console.log(`average of marks : ${avg}`);