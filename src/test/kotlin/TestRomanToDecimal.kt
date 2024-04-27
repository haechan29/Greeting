import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TestRomanToDecimal: FunSpec({
    test("공백은 0으로 변환한다") {
        toDecimal("") shouldBe 0
    }

    test("문자 하나를 변환한다") {
        toDecimal("X") shouldBe 10
        toDecimal("D") shouldBe 500
    }

    context("문자 두 개를 변환한다") {
        test("덧셈만 포함하는 경우") {
            toDecimal("II") shouldBe 2
            toDecimal("MD") shouldBe 1500
        }

        test("뺄셈을 포함하는 경우") {
            toDecimal("IV") shouldBe 4
            toDecimal("XC") shouldBe 90
        }
    }

    test("문자 여러 개를 변환한다") {
        toDecimal("MMVI") shouldBe 2006
        toDecimal("MCMXLIV") shouldBe 1944
    }
})