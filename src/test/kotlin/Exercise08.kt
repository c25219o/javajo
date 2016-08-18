import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.experimental.theories.DataPoints
import org.junit.experimental.theories.Theories
import org.junit.experimental.theories.Theory
import org.junit.runner.RunWith

@RunWith(Theories::class)
class Exercise08 {

    /**
     * 引数aとbを足した結果を返します。
     * ただし、nullを少なくとも1つ含む場合は、結果もnullとなること。
     */
    fun add(a: Int?, b: Int?): Int? {
        TODO()
    }

    @Theory
    fun test(fixture: Fixture) {
        assertThat(add(fixture.a, fixture.b), `is`(fixture.expected))
    }

    companion object {
        @DataPoints
        @JvmField
        val FIXTURES = arrayOf(
                Fixture(0, 0, 0),
                Fixture(3, 6, 9),
                Fixture(12, -5, 7),
                Fixture(4, null, null),
                Fixture(null, 5, null),
                Fixture(null, null, null)
        )
    }

    data class Fixture(val a: Int?,
                       val b: Int?,
                       val expected: Int?)
}