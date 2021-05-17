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

        assertEquals("ќбщий размер суммы перевода за мес€ц превышает 600 000 рублей.", result)
    }
}