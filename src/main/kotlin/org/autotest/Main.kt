package org.autotest

fun main() {

    while (true){

        println("������� �������� ����� �����, ���� ��� VK Pay, �� ������ ������� Enter")
        var inputCard = readLine()
        println("������� ����� ���������� ��������� � ���� ������")
        var inputOldTransfer = readLine()

        println("������� ����� ������ ��������")
        var inputNewTransfer = Integer.parseInt(readLine())

        commission(inputCard, inputOldTransfer, inputNewTransfer)


    }


}


fun commission(inputCard: String?, inputOldTransfer: String?, inputNewTransfer: Int) {

    when{
        (inputCard == "Master" || inputCard == "Maestro" || inputCard == "���" || inputCard == "Visa" ) && (Integer.parseInt(inputOldTransfer) + inputNewTransfer > 600000) -> {
            println("����� ������ ����� �������� �� ����� ��������� 600 000 ������.").toString()

        }
        (inputCard == "Master" || inputCard == "Maestro") && (75000 < Integer.parseInt(inputOldTransfer) + inputNewTransfer &&  Integer.parseInt(inputOldTransfer) + inputNewTransfer < 600000) -> String.format("%.0f",(inputNewTransfer/100*0.6 + 20)*100).toString()
        (inputCard == "Visa" || inputCard == "���") && inputNewTransfer/100*0.75 < 35 -> println("�������� ���������� " + 35*100 + " ������").toString()
        (inputCard == "Visa" || inputCard == "���") && inputNewTransfer/100*0.75 > 35 -> println("�������� ���������� " + String.format("%.0f",inputNewTransfer/100*0.75*100) + " ������").toString()

        inputCard == "VK" && inputNewTransfer >15000 ->println("����� �������� �������� ��������� 15000 ������. �������� ���������!").toString()
        inputCard == "VK" && inputNewTransfer + Integer.parseInt(inputOldTransfer) > 45000 ->println("����� ����� �������� �� ����� ��������� 45000 ������. �������� ���������!").toString()
        //else -> println("�������� ���������� 0 ������.")

    }
}


