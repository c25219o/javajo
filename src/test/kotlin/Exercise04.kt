import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.experimental.theories.DataPoints
import org.junit.experimental.theories.Theories
import org.junit.experimental.theories.Theory
import org.junit.runner.RunWith

@RunWith(Theories::class)
class Exercise04 {

    /**
     * 引数として与えられた整数のリストの要素のうち、
     * 奇数のものを全て足しあわせた数を返します。
     * 例えば`[1, 2, 3]`というリストが与えられたとき、
     * 奇数でない要素は`2`のみなので、結果は`4`となります。
     */
    fun sumForOdd(nums: List<Int>): Int {
        TODO()
    }

    @Theory
    fun test(fixture: Fixture) {
        assertThat(sumForOdd(fixture.nums), `is`(fixture.expected))
    }

    companion object {
        @DataPoints
        @JvmField
        val FIXTURES = arrayOf(
                Fixture(listOf(), 0),
                Fixture(listOf(1), 1),
                Fixture(listOf(1, 2, 3), 4),
                Fixture(listOf(2, 4, 8, 16), 0),
                Fixture(listOf(1, 1, 1, 2), 3)
        )
    }

    data class Fixture(val nums: List<Int>,
                       val expected: Int)
}