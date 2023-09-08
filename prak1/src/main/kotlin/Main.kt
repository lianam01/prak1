fun main(args: Array<String>) {

    //1
        val exercises:Int=13
        var exercisesSolved:Int=0
        exercisesSolved+=1
        //
    //2
        val myAge:Int=18
        exercisesSolved+=1
        //
    //3
        var srAge:Double=18.0
        srAge=(srAge+30)/2
        exercisesSolved+=1
        //
    //4
        val testNumber:Int=20
        val  evenOdd:Int=testNumber%2
        exercisesSolved+=1
        //
    //5
        var answer:Int=0
        answer=(((answer+1)+10)*10)shr 3
        exercisesSolved+=1
        println(answer)
        //ответ13
    //6
        var age:Int=16
        print(age)
        age=30
        print(age)
        exercisesSolved+=1
        //
    //8
        (5*3)-((4/2)*2)
        exercisesSolved+=1
        //
    //9
        val a:Double=6.0
        val b:Double=4.0
        val average:Double=(a+b)/2
        exercisesSolved+=1
        //
    // 10
        println()
        val fahrenheit:Double=560.0
        val celcius:Double=(fahrenheit-32)/1.8
        println(celcius)
        exercisesSolved+=1
        //
    //12
        val degrees:Int=90
        val radians:Double=degrees/(180/Math.PI)
        exercisesSolved+=1
        //
    // 13
        val x1:Double=1.0
        val x2:Double=3.0
        val y1:Double=1.0
        val y2:Double=3.0
        val distance:Double=Math.sqrt(Math.pow((x2-x1),2.0)+Math.pow((y2-y1),2.0))
        exercisesSolved+=1
        println(exercisesSolved)
        //

    }

