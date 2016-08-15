import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.experimental.theories.DataPoints
import org.junit.experimental.theories.Theories
import org.junit.experimental.theories.Theory
import org.junit.runner.RunWith

@RunWith(Theories::class)
class Exercise03 {

    /**
     * 引数として与えられた点数（`score`）に対応する結果を返します。
     * 点数と結果は下記の関係となります。
     * * 80点以上100点以下は「すごい」
     * * 60点以上80点未満は「合格」
     * * 0点以上60点未満は「失格」
     * * それ以外は「何かがおかしい」
     *
     * ヒント: Javaと同じく比較演算子だけでなく && や || が使えます。
     */
    fun result(score: Int): String {
        TODO()
    }

    @Theory
    fun test(fixture: Fixture) {
        assertThat(result(fixture.score), `is`(fixture.expected))
    }

    companion object {
        @DataPoints
        @JvmField
        val FIXTURES = arrayOf(
                Fixture(0, "失格"),
                Fixture(59, "失格"),
                Fixture(60, "合格"),
                Fixture(79, "合格"),
                Fixture(80, "すごい"),
                Fixture(100, "すごい"),
                Fixture(101, "何かがおかしい"),
                Fixture(-1, "何かがおかしい")
        )
    }

    data class Fixture(val score: Int,
                       val expected: String)
}