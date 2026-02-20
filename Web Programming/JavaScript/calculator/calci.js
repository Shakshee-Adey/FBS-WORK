str=""
calcisymbol="+-*/"
inp= document.getElementById("inp")

function submitValue(value)
{
    inputstring=inp.value
    len=inputstring.length
   if(calcisymbol.includes(inputstring.charAt(len-1))&&calcisymbol.includes(value))
   {
    console.log("in ifinp str" +inputstring)
    console.log("in if"+inputstring.charAt(len-1))
    console.log("if in str"+str)
   } 
   else
    {
    console.log("in else with value"+value)
    console.log("in  else with str"+str)
    str=str+value
    inp.value=str
    }
}
function evaluate1()
{
    if(calcisymbol.includes(inp.value.charAt(inp.value.length-1)))
    {
          console.log("invalid")
    }
    else
    {
       res=eval(inp.value)
       str=res
     document.getElementById("inp").value=str
    }

   
}
function clearScreen()
{
    str=""
    inp.value=str
}