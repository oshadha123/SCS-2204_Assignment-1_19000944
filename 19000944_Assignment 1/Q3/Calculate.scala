object Calculate extends App{
 def calculateCost(x:Double)=((24.95*0.6*x)+(0.75*(x-1)+3));

 println(calculateCost(60));  

}
