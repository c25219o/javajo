import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.experimental.theories.DataPoints
import org.junit.experimental.theories.Theories
import org.junit.experimental.theories.Theory
import org.junit.runner.RunWith

@RunWith(Theories::class)
class Exercise01 {

    /**
     * 引数を2乗した数を返します。
     */
    fun square(n: Int): Int {
        TODO()
    }

    @Theory
    fun test(fixture: Fixture) {
        assertThat(square(fixture.n), `is`(fixture.expected))
    }

    companion object {
        @DataPoints
        @JvmField
        val FIXTURES = arrayOf(
                Fixture(0, 0),
                Fixture(1, 1),
                Fixture(2, 4),
                Fixture(10, 100),
                Fixture(123, 15129),
                Fixture(-99, 9801)
        )
    }

    data class Fixture(val n: Int,
                       val expected: Int)
}