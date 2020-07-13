import java.util.*

/*This is an ATM code */

fun main() {
    val name = "Jack"
    var money = 1000
    //var Money = money
    var password = 123
    var times = 1
    //val input = Scanner(System.`in`)
    println("****************  BestChinaATM  **********************")
    println("Please enter your password within 4 times:")
    loop2@for (i in 1..4) {
        //var input: String? = readLine()
        var inPut:Int
        var scanner = Scanner(System.`in`)
        inPut = scanner.nextInt()
            if (inPut == 123) {
                loop1@ while (1 > 0) {
                    println("***********  Welcome!  *****************")
                    println("***********  Please Select Operation Below   *****************")
                    print("1.Draw Money  2.Save Money 3.Balance Inquiry 4.Information Inquiry 5.Password Modification 6.Exit")
                    var i: String? = readLine()
                    when (i) {
                    "1" -> {
                        loop@ while (1 > 0) {
                            println("How much:1.$100 2.$200 3.$500 4.exit")
                            var i: String? = readLine()
                            if (money > 0) {
                                when (i) {
                                    "1" -> {
                                        if (money >= 100)
                                            money -= 100
                                        println("Your money:$money")
                                    }
                                    "2" -> {
                                        if (money >= 200)
                                            money -= 200
                                        println("Your money:$money")
                                    }
                                    "3" -> {
                                        if (money >= 500)
                                            money -= 500
                                        println("Your money:$money")
                                    }
                                    "4" ->{
                                        break@loop;
                                    }
                                }

                            } else {
                                println("Money is not enough")
                            }
                        }
                    }
                    "2" -> {
                        println("Please save your money:")
                        var inMoney:Int
                        var scanner = Scanner(System.`in`)
                        inMoney = scanner.nextInt()
                        money += inMoney
                        println("Your money is $money")
                    }
                    "3" -> {
                        println("Balance inquiry:$money")
                    }
                    "4" -> {
                        println("Name:$name")
                        println("..")
                    }
                    "5" -> {while(1>0) {
                        println("Please enter your original password:")
                        var inPassword: Int
                        var scanner = Scanner(System.`in`)
                        inPassword = scanner.nextInt()
                        if (inPassword == password) {
                            println("Please Enter Your New password:")
                            var newInPassword: Int
                            var scanner = Scanner(System.`in`)
                            newInPassword = scanner.nextInt()
                            password = newInPassword
                            break;
                        } else {
                            println("Try Again")
                        }
                    }
                }
                        "6" -> {
                            println("Tkae Your Card Please")
                            break@loop2
                        }
            }
        }

        }

        if(times == 4 ){
            println("Card has been locked!")
            break}
        times += 1
        if(inPut != 123){
                println("Please Enter Again,")
            }

        }
        println("****************  BestChinaATM  **********************")
    }

