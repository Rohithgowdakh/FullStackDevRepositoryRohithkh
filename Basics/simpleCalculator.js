let num1=0
let num2=0
let operator1=''
document.getElementById("num2-el").textContent=num2
function calculate()
{
    let res=0;
    switch(operator1)
    {
        case '+': res=num1+num2
                    break

        case '-': res=num1-num2
                    break
        case '*': res=num1*num2
                    break

        case '/': res=num1/num2
                    break
        default:
            "Invalid Error"

    }
    document.getElementById("res").textContent=res
}
function operator(ope)
{
    operator1=ope
    document.getElementById("operator-el").textContent=operator1
}
function number(val)
{
    if(operator1===''){
       num1=val;
       document.getElementById("num1-el").textContent=num1
    }else{
        num2=val;
        document.getElementById("num2-el").textContent=num2
    }
}


