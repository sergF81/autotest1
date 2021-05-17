package org.autotest

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commission() {
        val newTransfer = 15000
        val oldTransfer = "6000"
        val card = "Visa"


        val result = commission(
            inputNewTransfer = newTransfer,
            inputOldTransfer = oldTransfer,
            inputCard = card
        )

        assertEquals("Комиссия составляет 11250 копеек", result)
    }
}