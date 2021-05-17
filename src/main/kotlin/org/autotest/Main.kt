package org.autotest

fun main() {

    while (true){

        println("Введите название вашей карты, если она VK Pay, то просто нажмите Enter")
        var inputCard = readLine()
        println("Введите сумму предыдущих переводов в этом месяце")
        var inputOldTransfer = readLine()

        println("Введите сумму нового перевода")
        var inputNewTransfer = Integer.parseInt(readLine())

        commission(inputCard, inputOldTransfer, inputNewTransfer)


    }


}


fun commission(inputCard: String?, inputOldTransfer: String?, inputNewTransfer: Int) {

    when{
        (inputCard == "Master" || inputCard == "Maestro" || inputCard == "Мир" || inputCard == "Visa" ) && (Integer.parseInt(inputOldTransfer) + inputNewTransfer > 600000) -> {
            println("Общий размер суммы перевода за месяц превышает 600 000 рублей.").toString()

        }
        (inputCard == "Master" || inputCard == "Maestro") && (75000 < Integer.parseInt(inputOldTransfer) + inputNewTransfer &&  Integer.parseInt(inputOldTransfer) + inputNewTransfer < 600000) -> String.format("%.0f",(inputNewTransfer/100*0.6 + 20)*100).toString()
        (inputCard == "Visa" || inputCard == "Мир") && inputNewTransfer/100*0.75 < 35 -> println("Комиссия составляет " + 35*100 + " копеек").toString()
        (inputCard == "Visa" || inputCard == "Мир") && inputNewTransfer/100*0.75 > 35 -> println("Комиссия составляет " + String.format("%.0f",inputNewTransfer/100*0.75*100) + " копеек").toString()

        inputCard == "VK" && inputNewTransfer >15000 ->println("Сумму разового перевода превышает 15000 рублей. Операция отклонена!").toString()
        inputCard == "VK" && inputNewTransfer + Integer.parseInt(inputOldTransfer) > 45000 ->println("Общая сумма перевода за месяц превышает 45000 рублей. Операция отклонена!").toString()
        //else -> println("Комиссия составляет 0 копеек.")

    }
}


