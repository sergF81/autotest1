package org.autotest

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commission() {
        val card = "Master"
        val oldTransfer = "70000"
        val newTransfer = 700000

        val result = commission(
            inputCard = card,
            inputOldTransfer = oldTransfer,
            inputNewTransfer = newTransfer
        )

        assertEquals("����� ������ ����� �������� �� ����� ��������� 600 000 ������.", result)
    }
}