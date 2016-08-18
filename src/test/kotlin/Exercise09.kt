import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.experimental.theories.DataPoints
import org.junit.experimental.theories.Theories
import org.junit.experimental.theories.Theory
import org.junit.runner.RunWith

@RunWith(Theories::class)
class Exercise09 {

    /**
     * 引数の文字列のリストを、下記のようなリストに変換してください。
     *  * すべて大文字にする。ただし、nullのものは「unknown」という文字列にすること。
     *  * 文字数が3文字以下のものは捨てる。
     *
     *  入力例: ["hi", "hello", null]
     *  出力例: ["HELLO", "unknown"]
     *
     *  おまけ: エルビス演算子（?:）を使ってみよう。
     *  「A ?: B」は「if (A != null) A else B」と同じです。
     */
    fun filterAndMap(list: List<String?>): List<String> {
        TODO()
    }

    @Theory
    fun test(fixture: Fixture) {
        assertThat(filterAndMap(fixture.list), `is`(fixture.expected))
    }

    companion object {
        @DataPoints
        @JvmField
        val FIXTURES = arrayOf(
                Fixture(listOf(), listOf()),
                Fixture(listOf("hi", "hello", null), listOf("HELLO", "unknown")),
                Fixture(listOf(null, "taro", null, "wa", "wa!"), listOf("unknown", "TARO", "unknown")),
                Fixture(listOf("unknown", null, "", "null"), listOf("UNKNOWN", "unknown", "NULL"))
        )
    }

    data class Fixture(val list: List<String?>,
                       val expected: List<String>)
}