import org.hamcrest.Matchers
import org.junit.Assert
import org.junit.Assert.fail
import org.junit.Test
import org.junit.experimental.theories.DataPoints
import org.junit.experimental.theories.Theories
import org.junit.experimental.theories.Theory
import org.junit.runner.RunWith

/**
 * 課題:
 * filterEvenとfilterNotNegativeのコードの重複を、
 * 高階関数や関数オブジェクトを使用して、なくしてください。
 */
@RunWith(Theories::class)
class Exercise07 {

    /**
     * 与えられたリストの要素のうち、偶数のみからなる新しいリストを返します。
     */
    fun filterEven(ns: List<Int>): List<Int> {
        val list = mutableListOf<Int>()
        for (n in ns) {
            if (n % 2 == 0) {
                list += n
            }
        }
        return list.toList()
    }

    /**
     * 与えられたリストの要素のうち、非負の数のみからなる新しいリストを返します。
     */
    fun filterNotNegative(ns: List<Int>): List<Int> {
        val list = mutableListOf<Int>()
        for (n in ns) {
            if (0 <= n) {
                list += n
            }
        }
        return list.toList()
    }

    @Test
    fun 未挑戦であることを知らせるマーク_削除すること() {
        fail()
    }

    @Theory
    fun test(fixture: FixtureForFilterEven) {
        val got = filterEven(fixture.ns)
        Assert.assertThat(got, Matchers.`is`(fixture.expected))
    }

    @Theory
    fun test(fixture: FixtureForFilterNotNegative) {
        val got = filterNotNegative(fixture.ns)
        Assert.assertThat(got, Matchers.`is`(fixture.expected))
    }

    companion object {
        @DataPoints
        @JvmField
        val FIXTURES_FOR_FILTER_EVEN = arrayOf(
                FixtureForFilterEven(listOf(), listOf()),
                FixtureForFilterEven(listOf(1, 2, 3), listOf(2)),
                FixtureForFilterEven(listOf(2, 4, 3, 9, 0), listOf(2, 4, 0))
        )

        @DataPoints
        @JvmField
        val FIXTURES_FOR_FILTER_NOT_NEGATIVE = arrayOf(
                FixtureForFilterNotNegative(listOf(), listOf()),
                FixtureForFilterNotNegative(listOf(0, 1, 2), listOf(0, 1, 2)),
                FixtureForFilterNotNegative(listOf(0, 5, -5, -2, 0), listOf(0, 5, 0))
        )
    }

    data class FixtureForFilterEven(val ns: List<Int>,
                                    val expected: List<Int>)

    data class FixtureForFilterNotNegative(val ns: List<Int>,
                                           val expected: List<Int>)
}