import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.experimental.theories.DataPoints
import org.junit.experimental.theories.Theories
import org.junit.experimental.theories.Theory
import org.junit.runner.RunWith

@RunWith(Theories::class)
class Exercise02 {

    /**
     * 引数として与えられた名前に対する挨拶文を返します。
     * 例えば`name="たろう"`ならば、`"こんにちは、たろうさん！"`という文字列を返します。
     */
    fun greetingMessage(name: String): String {
        TODO()
    }

    @Theory
    fun test(fixture: Fixture) {
        assertThat(greetingMessage(fixture.name), `is`(fixture.expected))
    }

    companion object {
        @DataPoints
        @JvmField
        val FIXTURES = arrayOf(
                Fixture("", "こんにちは、さん！"),
                Fixture("たろう", "こんにちは、たろうさん！"),
                Fixture("Taro", "こんにちは、Taroさん！")
        )
    }

    data class Fixture(val name: String,
                       val expected: String)
}