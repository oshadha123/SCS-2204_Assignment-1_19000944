object Calculate extends App{
 def calculateCost(x:Double)=((24.95*0.6*x)+(3*50 +0.75*(x-50)));

   println(calculateCost(60));

}
