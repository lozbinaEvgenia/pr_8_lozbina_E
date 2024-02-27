import kotlin.concurrent.timer

class Train
{
    var number:Int= 0
    var pointO:String=""
    var pointN:String=""
    var date:String=""
    var time:String=""
    var timeP:String=""

    fun Constructor(number: Int, pointO : String, pointN : String, date : String, time : String, timeP : String)
    {
        this.number = number
        this.pointO = pointO
        this.pointN = pointN
        this.date = date
        this.time = time
        this.timeP = timeP
    }

    fun GetInfo():String
    {
        var message ="Номер:$number\nПункт отправления:$pointO\nПункт назначения:$pointN\nДата отправления:$date\nВремя отправления:$time\nВремя в пути:$timeP\nВаш поезд:${Poezdka()}"
        return message
    }

    fun SetInfo()
    {
        try{
        println("Введите номер поезда до 30")
        var number= readLine()!!.toInt()
            if(number<0||number>30)
            {
                println("Поезда с таким номером не существует")
            }
            else
            {
                this.number=number
            }


        println("Введите пункт отправления")
        var pointO= readLine()!!.toString()
        this.pointO=pointO

        println("Введите пункт назначения")
        var pointN= readLine()!!.toString()
        this.pointN=pointN

        println("Введите дату")
        var date= readLine()!!.toString()
        this.date=date

        println("Введите время")
        var time= readLine()!!.toString()
        this.time=time

        println("Введите время в пути")
        var timeP= readLine()!!.toString()
        this.timeP=timeP
        }
        catch(e:Exception)
        {
            println("Ошибка")
        }
    }
    fun Poezdka():String
    {
        var a=""

        if(this.number<15)
        {
            a="отправляется вечером"
        }
        else if(this.number>=15&&this.number<=30)
        {
            a="отправляется утром"
        }
        return a
    }

}