class Tovar
{
    var nazv:String=""
    var sum:Int=0
    var ed:String=""
    var vid_t:String=""
    var count:Int=0
    fun Constructor(nazv: String, sum : Int, ed : String, vid_t : String, count : Int)
    {
        this.nazv= nazv
        this.sum = sum
        this.ed = ed
        this.vid_t = vid_t
        this.count = count

    }


    fun GetInfo():String{
    var message="Название товара:$nazv\nЦена товара:$sum\nЕдиницы измерения:$ed\nВид товара:$vid_t\nКоличество:$count\nОбщ стоимость:${Stoimost()}руб"
        return message
    }
    fun SetInfo()
    {
        try
        {
        println("Введите название товара")
        var nazv=readLine()!!.toString()
        this.nazv=nazv
        println("Введите цену товара")
        var sum= readLine()!!.toInt()
        this.sum=sum
        println("Введите единицы измерения")
        var ed= readLine()!!.toString()
        this.ed=ed
        println("Введите вид товара")
        var vid_t=readLine()!!.toString()
        this.vid_t=vid_t
        println("Введите количество товара")
        var count=readLine()!!.toInt()
        this.count=count
        }
        catch(e:Exception)
        {
           println("Ошибка")
        }
    }
    fun Stoimost():Int
    {
        var st=this.count*this.sum
        return st
    }

}

