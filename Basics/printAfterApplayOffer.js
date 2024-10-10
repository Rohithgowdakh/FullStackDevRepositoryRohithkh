let items=[290,300,455,900,1092]
let i=0;
for(let val of items)
{ 
    console.log(`value before offer at index ${i} = ${val}`)
    let offer=val/10
    items[i]=items[i]-offer
    console.log(`value after offer at index ${i} = ${items[i]}`)
    i++;
}