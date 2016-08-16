import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.Assert.fail
import org.junit.Test

class Exercise05 {

    /**
     * このメソッドの引数や戻り値の型を修正の上、実装してください。
     * 引数は2つ持ち、第1引数から第2引数を引いた数を返します。
     * 引数の名前や、デフォルト値の設定に関しては、下記のテストコードからヒントを得てください。
     *
     * 実装を終えたら、テストコードのコメントアウトされている行を有効にし、
     * fail()を削除（またはコメントアウト）して、テストを実行してください。
     *
     * おまけ: 単一式関数として記述してみよう！
     */
    fun sub() {
    }

    @Test
    fun 普通に呼び出すやつ() {
//        val got = sub(12, 5)
//        assertThat(got, `is`(7))
        fail()
    }

    @Test
    fun 名前で引数を指定するやつ() {
//        val got = sub(subtrahend = 8, minuend = 5)
//        assertThat(got, `is`(-3))
        fail()
    }

    @Test
    fun 第2引数のデフォルト値が0であることを期待して省略するやつ() {
//        val got = sub(sub(minuend = 123))
//        assertThat(got, `is`(123))
        fail()
    }
}