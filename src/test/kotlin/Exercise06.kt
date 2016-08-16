import org.hamcrest.Matchers
import org.junit.Assert
import org.junit.experimental.theories.DataPoints
import org.junit.experimental.theories.Theories
import org.junit.experimental.theories.Theory
import org.junit.runner.RunWith

@RunWith(Theories::class)
class Exercise06 {

    /**
     * 「Intを引数として取り、その倍の数を返すような関数」を返します。
     *
     * ヒント: この関数はあくまで、関数を返すだけで、実際の倍にするような計算は行いません。
     * ヒント: 別途、独自に関数を定義してもかまいません。
     */
    fun getDouble(): (Int) -> Int {
        TODO()
    }

    @Theory
    fun test(fixture: Fixture) {
        val double = getDouble()
        val got = double(fixture.num)
        Assert.assertThat(got, Matchers.`is`(fixture.expected))
    }

    companion object {
        @DataPoints
        @JvmField
        val FIXTURES = arrayOf(
                Fixture(0, 0),
                Fixture(1, 2),
                Fixture(-2, -4),
                Fixture(123, 246)
        )
    }

    data class Fixture(val num: Int,
                       val expected: Int)
}